package common.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Group implements Serializable {
    private static final long serialVersionUID = 5942011574971939671L;

    private String name;

    private List<User> users;

    public Group(){
        users = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(User user){
        users.add(user);
    }
}
