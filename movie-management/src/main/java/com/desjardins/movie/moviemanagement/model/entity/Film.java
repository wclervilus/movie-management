package com.desjardins.movie.moviemanagement.model.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.desjardins.movie.moviemanagement.model.dto.FilmDto;
import com.desjardins.movie.moviemanagement.utils.CustomBeanUtils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Film")
public class Film extends Base {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "titre")
	private String titre;
	@Column(name = "description")
	private String description;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Acteur> acteurs=new HashSet<Acteur>();
	
	public Film(FilmDto dto) {
	        CustomBeanUtils.copyNonNullProperties(dto, this);
	}
}
