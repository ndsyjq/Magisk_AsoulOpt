package project;

import java.util.ArrayList;

public class campus {

    private String name;
    private int ID;
    private ArrayList<classRoom> classList;

    public campus(String name,int ID) {
        this.name = name;
        this.classList =new ArrayList<>();

        this.ID = ID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<classRoom> getClassList() {
        return classList;
    }

    public void applyClassList(classRoom classRoom) {
        classList.add(classRoom);

    }

    public String toString() {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < classList.size(); i++) {
            str.append(getClassList().get(i).toString()).append("\n");
        }
        return "campus{"+"id="+getID()+"length = " + classList.size() + ", name = " + name + ", class = "  +str+"}";
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}
