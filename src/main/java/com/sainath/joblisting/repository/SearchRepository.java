package com.sainath.joblisting.repository;

import java.util.List;

import com.sainath.joblisting.model.Post;

public interface SearchRepository {
List<Post> findByText(String text);
}
