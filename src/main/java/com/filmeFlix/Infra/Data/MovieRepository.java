package com.filmeFlix.Infra.Data;

import com.filmeFlix.Domain.Entities.CustomerInfo;
import com.filmeFlix.Domain.Entities.MovieInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<MovieInfo, String> {

}