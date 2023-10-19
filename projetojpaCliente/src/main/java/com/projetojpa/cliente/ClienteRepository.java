package com.projetojpa.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
