package org.example.inventoryservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity @Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class Creator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "creator")
    private List<Video> videoList;
}
