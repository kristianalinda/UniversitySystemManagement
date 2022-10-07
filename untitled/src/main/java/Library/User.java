package Library.interfaces;

public class User {
    String name = "";
    int age = 0;
    boolean active = true;

    public User(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void suspend(){
        this.active = false;
    }
}{
}
