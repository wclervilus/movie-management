package com.desjardins.movie.moviemanagement.service;

import java.time.LocalDate;
import com.desjardins.movie.moviemanagement.model.entity.Film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desjardins.movie.moviemanagement.model.dto.FilmDto;
import com.desjardins.movie.moviemanagement.model.response.LightFilm;
import com.desjardins.movie.moviemanagement.repository.FilmRepository;

@Transactional
@Service
public class FilmServiceImp implements FilmService<LightFilm> {
	private final FilmRepository repository;
	private final ProjectionFactory factory;

	@Autowired
	public FilmServiceImp(FilmRepository repository, ProjectionFactory factory) {
		this.repository = repository;
		this.factory = factory;
	}

	@Override
	public Film findById(Long filmId) {
		return repository.findById(filmId).orElseThrow(RuntimeException::new);
	}

	@Override
	public LightFilm save(FilmDto dto) {
		Film film = new Film(dto);
		film.setCreateBy(0L);
		film.setCreateDate(LocalDate.now());
		var savedEntity = repository.save(film);
		return factory.createProjection(LightFilm.class, savedEntity);
	}

	@Override
	public Object removeById(Long filmId) {
		repository.deleteById(filmId);
		return null;
	}
}
