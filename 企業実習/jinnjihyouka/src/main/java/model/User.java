package model;

public class User {
    private String id;
    private String pass;
    private String name;

    public User(String id, String pass) {
    	this.id = id;
    	this.pass = pass;
    }

    public String getId() { return id; }
    public String getPass() { return pass; }
    public String getName() { return name; }

    public void setId(String id) { this.id = id; }
    public void setPass(String pass) { this.pass = pass; }
    public void setName(String name) { this.name = name; }
}
