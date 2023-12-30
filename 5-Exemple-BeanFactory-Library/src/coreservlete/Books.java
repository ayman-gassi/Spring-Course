package coreservlete;

public class Books {
    int id;
    String Name;
    int PagesNbr;

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

    public int getPagesNbr() {
        return PagesNbr;
    }

    public void setPagesNbr(int pagesNbr) {
        PagesNbr = pagesNbr;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", PagesNbr=" + PagesNbr +
                '}';
    }
}
