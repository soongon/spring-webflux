package kr.re.kitri.springwebflux.model;

public class Post {
    private int postId;
    private String title;
    private String body;

    public Post(int postId, String title, String body) {
        this.postId = postId;
        this.title = title;
        this.body = body;
    }
    public int getPostId() {
        return postId;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }
    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
