package org.example.inventoryservice.repositories;

import org.example.inventoryservice.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
