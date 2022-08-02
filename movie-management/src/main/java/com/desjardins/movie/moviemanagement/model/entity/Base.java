package com.desjardins.movie.moviemanagement.model.entity;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Base {
	@Column(name = "CREATE_BY", nullable = false, updatable = false)
	private Long createBy;

	@Column(name = "UPDATE_BY", nullable = true)
	private Long updateBy;

	@Column(name = "UPDATE_DATE", nullable = true)
	private LocalDate updateDate;

	@Column(name = "CREATE_DATE", updatable = false, nullable = false)
	private LocalDate createDate;
}
