package app.fb.service;

import java.util.List;

import app.fb.model.Post;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost(); 
}
