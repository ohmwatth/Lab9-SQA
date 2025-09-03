package com.sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;

import com.sqa.lab.api.MovieService;

public class MovieServiceStub implements MovieService {

	public List<String> getMovie(String username, String playlist) {
        if (playlist.equals("action")) {
            return Arrays.asList("Mad Max", "John Wick", "Die Hard");
        } else if (playlist.equals("datenight")) {
            return Arrays.asList("The Notebook", "50 First Dates", "A Walk to Remember");
        }
        return Arrays.asList();
    }

}
