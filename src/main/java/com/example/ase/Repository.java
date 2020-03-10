package com.example.ase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Repository extends JpaRepository<Request, Long> {

    Optional<Request> findById(Long id);

    Request save(Request request);
}

