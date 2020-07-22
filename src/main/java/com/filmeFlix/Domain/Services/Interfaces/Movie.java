package com.filmeFlix.Domain.Services.Interfaces;

import com.filmeFlix.Domain.Entities.CustomerInfo;
import com.filmeFlix.Domain.Entities.MovieInfo;

import java.util.List;

public interface Movie {

    List<MovieInfo> findAll();
    MovieInfo findAtLeastScore();
    boolean save(MovieInfo entity);
    boolean remove(String id);
    MovieInfo getLowScore();
}
