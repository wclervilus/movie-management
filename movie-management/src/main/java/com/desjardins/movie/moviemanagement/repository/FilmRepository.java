package com.desjardins.movie.moviemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desjardins.movie.moviemanagement.model.entity.Film;

public interface FilmRepository extends JpaRepository<Film, Long>{
	
}
