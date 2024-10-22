package com.projeto.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}