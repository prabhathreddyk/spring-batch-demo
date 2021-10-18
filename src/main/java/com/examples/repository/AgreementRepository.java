package com.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.model.Aggrement;

public interface AgreementRepository extends JpaRepository<Aggrement, Integer> {
}
