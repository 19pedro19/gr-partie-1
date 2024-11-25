package org.example.inventoryservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity @Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String url;
    private String description;
    private Date datePublication;
    @ManyToOne(fetch = FetchType.LAZY)
    private Creator creator;
}
