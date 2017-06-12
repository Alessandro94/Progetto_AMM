
package amm.nerdbook.Classi;

import java.util.List;
import java.util.ArrayList;


public class PostGestione {

    //Pattern Design Singleton
    private static PostGestione singleton;

    public static PostGestione getInstance() {
        if (singleton == null) {
            singleton = new PostGestione();
        }
        return singleton;
    }

    private ArrayList<Post> listaPost = new ArrayList<Post>();

    private PostGestione() {
        
        Utente_registrato utenteregistrato = Utente_registrato.getInstance();

        //Creazione Post
        Post post1 = new Post();
        post1.setContent("festa");
        post1.setId(0);
        post1.setUser(utenteregistrato.getUtenteById(0));

        Post post2 = new Post();
        post2.setContent("img/fotoprof.jpg");
        post2.setId(1);
        post2.setUser(utenteregistrato.getUtenteById(0));
        post2.setPostType(Post.Type.IMAGE);

        Post post3 = new Post();
        post3.setContent("img/juventuslogo.png");
        post3.setId(2);
        post3.setUser(utenteregistrato.getUtenteById(0));
        post3.setPostType(Post.Type.IMAGE);


        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);
    }

    public Post getPostById(int id) {
        for (Post post : this.listaPost) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public List getPostList(Utente gtt) {

        List<Post> listaPost = new ArrayList<Post>();

        for (Post post : this.listaPost) {
            if (post.getUser().equals(gtt)) {
                listaPost.add(post);
            }
        }
        return listaPost;
    }
}
