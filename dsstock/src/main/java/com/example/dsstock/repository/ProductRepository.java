package com.example.dsstock.repository;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dsstock.entities.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}