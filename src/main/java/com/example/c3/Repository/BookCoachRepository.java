package com.example.c3.Repository;

import com.example.c3.Model.BookCoach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCoachRepository extends JpaRepository<BookCoach, Integer> {
    BookCoach findBookCoachById(Integer id);
}
