package com.filmeFlix.Config;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = {"com.filmeFlix.Infra.Data"})
public class MongoConfig {

}

