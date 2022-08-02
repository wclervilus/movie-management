package com.desjardins.movie.moviemanagement.service;

import com.desjardins.movie.moviemanagement.model.dto.FilmDto;
import com.desjardins.movie.moviemanagement.model.entity.Film;

public interface FilmService<T> {
	public Film findById(Long filmId);
	public T save(FilmDto dto);
	public Object removeById(Long filmId);
}
