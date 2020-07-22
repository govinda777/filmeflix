package com.filmeFlix.Api;

import com.filmeFlix.Domain.Entities.MovieInfo;
import com.filmeFlix.Domain.Services.Interfaces.Movie;
//import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieController {
    private final Movie movie;

    @Autowired
    public MovieController(Movie movie) {
        this.movie = movie;
    }

    @GetMapping("/findAll")
    @PreAuthorize("hasRole('USER')")
    //@ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, paramType = "header", example = "Bearer access_token")
    public List<MovieInfo> findAll() {
        return movie.findAll();
    }

    @PostMapping("/save")
    @PreAuthorize("hasRole('ADMIN')")
    //@ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, paramType = "header", example = "Bearer access_token")
    public boolean save(@RequestBody MovieInfo entity) {
        return movie.save(entity);
    }

    @DeleteMapping("/lowScore")
    @PreAuthorize("hasRole('ADMIN')")
    //@ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, paramType = "header", example = "Bearer access_token")
    public boolean deleteLowScore() {
        return movie.deleteLowScore();
    }

    @GetMapping("/lowScore")
    @PreAuthorize("hasRole('ADMIN')")
    //@ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, paramType = "header", example = "Bearer access_token")
    public MovieInfo getLowScore() {
        return movie.getLowScore();
    }
}
