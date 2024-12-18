package com.example.c3.Repository;

import com.example.c3.Model.Athlete;
import com.example.c3.Model.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Integer> {
    Coach findCoachById(Integer id);
    Coach findCoachByUsername(String username);
}
