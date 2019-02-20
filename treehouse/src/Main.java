public class Main {
    public static void main(String[] args){
        System.out.println("Beginning forum example");
        if(args.length < 2){
            System.out.println("Usage: java Main <first name> <last name>");
            System.err.println("<first name> and <last name> are required");
            System.exit(1);
        }
        //Uncomment this when prompted
        Forum forum = new Forum("Java");
        // TODO: pass in the first name and last name that are in the args parameter
        String firstName = args[0];
        String lastName = args[1];
        User author = new User(firstName, lastName);
        // TODO: initialize the forum post with the user created above and a title and description of your choice.
        ForumPost post = new ForumPost(author, "Programming is awesome", "Cuz it makes us create new stuff!");
        forum.addPost(post);
    }
}
