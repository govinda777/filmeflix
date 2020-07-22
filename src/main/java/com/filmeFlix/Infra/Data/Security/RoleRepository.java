package com.filmeFlix.Infra.Data.Security;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.filmeFlix.Domain.Entities.Security.ERole;
import com.filmeFlix.Domain.Entities.Security.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
