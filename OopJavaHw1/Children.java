package OopJavaHw1;

import java.util.ArrayList;

public class Children {

    ArrayList<BasePeople> children;

    public Children (){
        new ArrayList<>();
    }

    public Children ( BasePeople people){
        children.add(people);
    }
    public  ArrayList<BasePeople> getChildren () {
        return children;
    }
}