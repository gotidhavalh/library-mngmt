package com.example.lib.repository;

import com.example.lib.entity.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatronRepository extends JpaRepository<Patron, Integer> {

    Patron findByName(String username);
}
