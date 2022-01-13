package com.alexproject.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexproject.dsmovie.entities.Score;
import com.alexproject.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	

}
