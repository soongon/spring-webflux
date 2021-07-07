package kr.re.kitri.springwebflux.controller;

import kr.re.kitri.springwebflux.model.Post;
import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@RestController
public class PostController {

    @GetMapping("/posts")
    public Flux<Post> getPosts() {
        List<Post> posts = Arrays.asList(
                new Post(1, "안녕하세요", "good day"),
                new Post(2, "안녕하세요", "good day"),
                new Post(3, "안녕하세요", "good day"),
                new Post(4, "안녕하세요", "good day"),
                new Post(5, "안녕하세요", "good day")
        );
        return Flux
                .fromIterable(posts)
                .filter(t -> t.getPostId() > 3);
    }

    @GetMapping("/posts/{postId}")
    public Mono<Post> getPostById(@PathVariable int postId) {
        Post post = new Post(postId, "안녕하세요", "반가워요..");
        return Mono
                .just(post);
    }

    @PostMapping("/posts")
    public void registPost(@RequestBody Mono<Post> post) {

    }
}
