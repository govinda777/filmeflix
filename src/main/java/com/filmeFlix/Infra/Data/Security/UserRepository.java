package com.filmeFlix.Infra.Data.Security;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.filmeFlix.Domain.Entities.Security.User;

public interface UserRepository extends MongoRepository<User, String> {
  Optional<User> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}
