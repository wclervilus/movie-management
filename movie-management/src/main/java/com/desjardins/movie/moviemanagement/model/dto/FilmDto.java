package com.desjardins.movie.moviemanagement.model.dto;

import java.util.Set;

import com.desjardins.movie.moviemanagement.model.entity.Acteur;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FilmDto {
	private String titre;
	private String description;
	private Set<Acteur> acteurs;
}
