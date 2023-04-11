package com.alinequeiroz.workshopmongo.services;

import com.alinequeiroz.workshopmongo.domain.Post;
import com.alinequeiroz.workshopmongo.repository.PostRepository;
import com.alinequeiroz.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;


    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}