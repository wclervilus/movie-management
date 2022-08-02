package com.desjardins.movie.moviemanagement.model.response;

import java.util.Set;

import com.desjardins.movie.moviemanagement.model.entity.Acteur;

public interface LightFilm {

    Long getId();
    
    String getTitre();

    String getDescription();
    
    Set<Acteur> getActeurs();
}
