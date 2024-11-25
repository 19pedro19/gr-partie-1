package org.example.inventoryservice.web;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.inventoryservice.entities.Creator;
import org.example.inventoryservice.entities.Video;
import org.example.inventoryservice.repositories.CreatorRepository;
import org.example.inventoryservice.repositories.VideoRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor @Controller
public class VideoGraphQlController {

    private CreatorRepository creatorRepository;
    private VideoRepository videoRepository;

    @QueryMapping
    public List<Video> videoList() {
        return videoRepository.findAll();
    }

    @QueryMapping
    public Creator creatorById(@Argument Integer id) {
        return creatorRepository.findById(id).get();
    }
}
