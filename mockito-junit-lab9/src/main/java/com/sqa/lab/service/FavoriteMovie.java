package com.sqa.lab.service;

import java.util.ArrayList;
import java.util.List;

import com.sqa.lab.api.MovieService;

public class FavoriteMovie {
	
	private MovieService movieservice;
	
	
	public FavoriteMovie(MovieService movieservice) {
		super();
		this.movieservice = movieservice;
	}


	 public List<String> showMovies(String username, String playlist) {
	        // ดึงรายการหนังจาก Service
	        return movieservice.getMovie(username, playlist);
	    }

}
