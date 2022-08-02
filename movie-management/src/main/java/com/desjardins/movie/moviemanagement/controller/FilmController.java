package com.desjardins.movie.moviemanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desjardins.movie.moviemanagement.exception.FilmNotFoundException;
import com.desjardins.movie.moviemanagement.model.dto.FilmDto;
import com.desjardins.movie.moviemanagement.model.entity.Film;
import com.desjardins.movie.moviemanagement.model.response.LightFilm;
import com.desjardins.movie.moviemanagement.service.FilmService;

@RestController
@RequestMapping(value="/api/film",consumes = "application/json", produces = "application/json")
public class FilmController {
    private final FilmService<LightFilm> service;

    @Autowired
    public FilmController(FilmService service) {
        this.service = service;
    }

    @GetMapping("/{filmId}")
    public ResponseEntity<?> findById(@PathVariable("filmId") Long filmId) {
        return ResponseEntity.ok(service.findById(filmId));
    }
    @PostMapping
    public ResponseEntity<LightFilm> save(@Valid @RequestBody FilmDto dto) {
    	return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }
    @DeleteMapping("/{filmId}")
    public ResponseEntity<?> removeById(@PathVariable("filmId") Long filmId) {
        return ResponseEntity.ok(service.removeById(filmId));
    }
}
