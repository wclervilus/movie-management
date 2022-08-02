package com.desjardins.movie.moviemanagement.model.response;

import lombok.Data;

@Data
public class AppResponse <T> {
  public boolean crash;
  public String message;
  public T data;
  /*public AppResponse(boolean crash, String message, T data) {
		super();
		this.crash = crash;
		this.message = message;
		this.data = data;
  }*/
  
}
