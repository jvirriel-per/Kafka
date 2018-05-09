package com.jvirriel.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RestJpaRepository extends JpaRepository<Rest, Long>,
        JpaSpecificationExecutor<Rest> {
}
