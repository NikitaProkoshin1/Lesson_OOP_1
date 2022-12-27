package OopJavaHw1;

import java.util.ArrayList;


import java.io.IOException;

public interface PersonsDataBase {
    void saveData() throws IOException;
    default String getData() {
        return "Empty";
    }

}