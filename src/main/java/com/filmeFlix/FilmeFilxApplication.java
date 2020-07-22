package com.filmeFlix;

import com.filmeFlix.Domain.Entities.Security.ERole;
import com.filmeFlix.Domain.Entities.Security.Role;
import com.filmeFlix.Infra.Data.Security.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

import java.util.List;

@SpringBootApplication
public class FilmeFilxApplication implements CommandLineRunner {

	@Autowired
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(FilmeFilxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		List<Role> roles = roleRepository.findAll();

		if(roles.size() == 0)
		{
			Role admin = new Role(ERole.ROLE_ADMIN);
			Role user = new Role(ERole.ROLE_USER);

			roleRepository.save(admin);
			roleRepository.save(user);
		}
	}
}
