package coreservlete;

public class Articles {
    int id;
    String Name;
    String Productions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProductions() {
        return Productions;
    }

    public void setProductions(String productions) {
        Productions = productions;
    }

    @Override
    public String toString() {
        return "Articles{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Productions='" + Productions + '\'' +
                '}';
    }
}
