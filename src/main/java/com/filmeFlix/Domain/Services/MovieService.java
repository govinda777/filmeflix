package com.filmeFlix.Domain.Services;

import com.filmeFlix.Domain.Entities.MovieInfo;
import com.filmeFlix.Domain.Services.Interfaces.Movie;
import com.filmeFlix.Infra.Data.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements Movie {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {

        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieInfo> findAll() {
        return movieRepository.findByOrderByLaunchedDesc();
    }

    @Override
    public boolean save(MovieInfo entity) {

        MovieInfo result = movieRepository.save(entity);

        return result != null;
    }

    @Override
    public boolean remove(MovieInfo entity) {

        movieRepository.delete(entity);

        return true;
    }

    @Override
    public boolean deleteLowScore() {

        MovieInfo movideLowScore = getLowScore();
        remove(movideLowScore);

        return true;
    }

    @Override
    public MovieInfo getLowScore() {

        return movieRepository.findTopByOrderByScoreAsc();
    }


}
