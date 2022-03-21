package com.springproject.dsmovie.repositories;

import com.springproject.dsmovie.entities.Score;
import com.springproject.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
