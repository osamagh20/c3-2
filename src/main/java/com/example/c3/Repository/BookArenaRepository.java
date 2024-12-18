package com.example.c3.Repository;

import com.example.c3.Model.BookOffering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookArenaRepository extends JpaRepository<BookOffering,Integer> {
    BookOffering findBookArenasById(Integer id);
}