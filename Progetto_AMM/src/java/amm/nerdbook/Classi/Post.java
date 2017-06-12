
package amm.nerdbook.Classi;


public class Post {

    public enum Type {
        TEXT, IMAGE
    };

    protected int id;
    protected Utente user;
    private String content;
    private Type postType;

    public Post() {
        id = 0;
        user = null;
        content = "";
        postType = Type.TEXT;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    
    public Utente getUser() {
        return user;
    }

 
    public void setUser(Utente user) {
        this.user = user;
    }

   
    public String getContent() {
        return content;
    }

    
    public void setContent(String content) {
        this.content = content;
    }

    public Type getPostType() {
        return postType;
    }

    
    public void setPostType(Type postType) {
        this.postType = postType;
    }
}
