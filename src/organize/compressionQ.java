package organize;
/*
This is Qualtrics question to compress a given string.
 */
public class compressionQ {

    public static String compressed(String str){

        int count =1;
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;

            }
            else
            {
                if(count>1){
                    sb.append(count);
                }
                count=1;
                sb.append(str.charAt(i));
            }
        }
        if(count>1){
            sb.append(count);
        }
        return sb.toString();
    }
}
