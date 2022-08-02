package com.desjardins.movie.moviemanagement.exception;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FilmErrorResponse {
	private int status;
	private String message;
	private long timeStamp;
	
}
