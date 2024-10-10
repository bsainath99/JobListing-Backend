package com.sainath.joblisting.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sainath.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post, String>{}
