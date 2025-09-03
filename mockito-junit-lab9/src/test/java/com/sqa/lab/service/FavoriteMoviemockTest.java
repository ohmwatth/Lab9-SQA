package com.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.sqa.lab.api.MovieService;

class FavoriteMoviemockTest {

	@Test
	void testFavoriteMoviesActionPlaylist_Mock() {
		MovieService service = mock(MovieService.class);

     
        when(service.getMovie("user1", "action")).thenReturn(Arrays.asList("Mad Max", "John Wick", "Die Hard"));

        FavoriteMovie fav = new FavoriteMovie(service);
        List<String> movies = fav.showMovies("user1", "action");

        assertEquals(Arrays.asList("Mad Max", "John Wick", "Die Hard"), movies);

        verify(service).getMovie("user1", "action");
    }
}
