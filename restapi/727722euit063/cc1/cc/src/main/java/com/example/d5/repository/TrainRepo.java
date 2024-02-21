package com.example.d5.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d5.model.Train;

@Repository
public interface TrainRepo extends JpaRepository<Train, Integer>{

}
