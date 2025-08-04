package com.example.springtest;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.springtest.entity.User;
import com.example.springtest.repository.UserRepository;

@DataJpaTest
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepo;
	
	
	public void testSaveAndFindByEmail() {
		User user = new User(null,"Alice","alice@example.com");
		userRepo.save(user);
		
		User fetched = userRepo.findByEmail("alice@example.com");
		assertThat(fetched).isNotNull();
		assertThat(fetched.getName()).isEqualTo("Alice");
	}
}
