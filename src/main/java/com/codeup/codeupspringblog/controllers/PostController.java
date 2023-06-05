package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String viewAllPosts(Model model) {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("First Post", "This is the first post."));
        posts.add(new Post("Second Post", "This is the second post."));
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String viewSinglePost(@PathVariable long id, Model model) {
        Post post = new Post("Sample Post", "This is a sample post.");
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String showPostForm() {
        return "posts/create";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String submitNewPost() {
        return "create a new post";
    }
}
