package com.alexproject.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexproject.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	

}
