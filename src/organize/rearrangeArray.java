package organize;

public class rearrangeArray {


    public int[] rearrange (int[]  num){
        int  j=0;
        int len=num.length;
        for(int i=0;i<len;i++){
            if(num[i]!=0){
                num[j]=num[i];
                j++;
            }
        }
        for(int k=j;k<len;k++){
            num[k]=0;
        }

        return num;
    }


}
