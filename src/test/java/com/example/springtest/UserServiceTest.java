package com.example.springtest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.springtest.entity.User;
import com.example.springtest.repository.UserRepository;
import com.example.springtest.service.UserService;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@Mock
	private UserRepository userRepo;
	
	@InjectMocks
	private UserService service;
	
	@Test
	void testGetUserByEmail() {
		User mockUser = new User(1L,"Bob","bob@example.com");
		when(userRepo.findByEmail("bob@example.com")).thenReturn(mockUser);
		
		User result = service.getUserByEmail("bob@example.com");
		assertThat(result.getName()).isEqualTo("Bob");
	}
	
}
