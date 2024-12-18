package com.example.c3.Repository;
import com.example.c3.Model.BookOffering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookOfferingRepository extends JpaRepository<BookOffering,Integer> {
    BookOffering findBookOfferingById(Integer id);
}