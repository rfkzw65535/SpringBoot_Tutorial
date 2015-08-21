
package hello;

public class User {

    private final String tag;
    private final String username;

    public User(String tag, String username) {
        this.tag = tag;
        this.username = username;
    }

    public String getTag() {
        return tag;
    }
    
    public String getUsername() {
        return username;
    }
    
}
