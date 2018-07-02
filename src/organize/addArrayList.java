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
        ArrayList<String> stdname1=new ArrayList<String>();
        int i=1;
        stdname1.remove(names.indexOf(i));
        return names;
    }
}
