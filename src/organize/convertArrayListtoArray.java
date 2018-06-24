package organize;

import java.util.Iterator;
import java.util.List;

public class convertArrayListtoArray {
    public int [] convertALtoA(List<Integer> numbers){
        int[] ret=new int[numbers.size()];
        Iterator<Integer> iterator =numbers.iterator();
        for(int i=0; i<ret.length;i++){
            ret[i]=iterator.next().intValue();
        }return ret;
    }
}
