package organize;

import java.util.ArrayList;

public class addArrayList {

    public ArrayList<String> addtoarray (ArrayList<String> names){
        ArrayList<String> stdname= new ArrayList<String>();
        stdname.add("Dan");
        stdname.add("bruce");
        stdname.add("Erin");
        return stdname;

    }
    public ArrayList<String> removeFromarray(ArrayList<String> names){
        ArrayList<String> stdname=new ArrayList<String>();
        stdname.remove(1);
        return names;
    }
}
