package com.example.c3.Repository;

import com.example.c3.Model.Arena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArenaRepository extends JpaRepository<Arena, Integer> {
    Arena findArenaById(Integer id);
}
