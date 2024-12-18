package com.example.c3.Repository;

import com.example.c3.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{
    Admin findAdminById(Integer id);
}
