package kr.re.kitri.springwebflux.controller;

import kr.re.kitri.springwebflux.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@RestController
public class PostController {

    @GetMapping("/posts")
    public Flux<String> getPosts() {
        List<Post> posts = Arrays.asList(
                new Post(1, "안녕하세요", "good day"),
                new Post(2, "안녕하세요", "good day"),
                new Post(3, "안녕하세요", "good day"),
                new Post(4, "안녕하세요", "good day"),
                new Post(5, "안녕하세요", "good day")
        );
        return Flux
                .fromIterable(posts)
                .filter(t -> t.getPostId() > 3)
                .map(t -> t.getTitle());
    }
}
