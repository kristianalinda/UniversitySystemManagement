package Library;

import Library.interfaces.User;

public interface IUser implements User {
    String name = "";
    int age = 0;
    boolean active = true;

    public void suspend();
}
