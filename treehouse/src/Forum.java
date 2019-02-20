public class Forum {
    private String topic;

    // TODO: add a constructor that accepts a topic and sets the private field topic
    public Forum(String topic){
        this.topic = topic;
    }

    public String getTopic(){
        return topic;
    }

    // Uncomment this when you are prompted to do so
    public void addPost(ForumPost post) {
        System.out.printf("A new post is %s topic  from %s %s about %s is available",
                topic,
                post.getAuthor().getFirstName(),
                post.getAuthor().getLastName(),
                post.getTitle()
        );
    }
}
