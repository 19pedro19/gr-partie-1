package org.example.inventoryservice.repositories;

import org.example.inventoryservice.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<Creator, Integer> {
}
