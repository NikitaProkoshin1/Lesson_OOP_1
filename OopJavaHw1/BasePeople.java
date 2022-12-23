package OopJavaHw1;

import java.util.ArrayList;

public abstract class BasePeople {
    String name;
    String surname;
    String patronymic;
    Children children;
    Parents parents;

    protected BasePeople(String peopleSurname,String peopleName,String peoplePatronymic) {
        name = peopleName;
        surname = peopleSurname;
        patronymic = peoplePatronymic;
        children = new Children ();
        parents = new Parents();
    }

    public void setName(String peopleName) {
        name = peopleName;
    }
    public void setSurname(String peopleSurname) {
        surname = peopleSurname;
    }
    public void setPatronymic(String peoplePatronymic) {
        patronymic = peoplePatronymic;
    }

    public ArrayList<BasePeople> getParents() {
        return parents.getParents();
    }

    public ArrayList<BasePeople> getChilds() {
        return children.getChildren ();
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
}
