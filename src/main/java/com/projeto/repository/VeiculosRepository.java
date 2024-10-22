package com.projeto.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.projeto.entities.Veiculos;

public interface VeiculosRepository extends JpaRepository<Veiculos, Long>{
}