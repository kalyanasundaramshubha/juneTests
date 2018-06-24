package organize;

public class sumofArray {
    public int sumArray(int[] marks, int size){
        int i=0,m;
        m=marks[i];
            for(int j=1;j<size;j++){
                m=m+marks[j];
            }
        int sum=m;
        return sum;
    }
}
