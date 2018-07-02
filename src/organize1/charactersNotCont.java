package organize1;

public class charactersNotCont {

    public static String charNotcont(String str){
        int pos=2;
        String save=String.valueOf(str.charAt(0));
        String newstr= String.valueOf(str.charAt(0));
        for(int i =1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1))
            {
                if(str.charAt(pos)!=str.charAt(i))
                {
                        newstr=newstr+str.charAt(i);
                        save=newstr;
                        pos++;

                }
            }
            else
                {
                    if(str.charAt(0)==str.charAt(1))
                    {
                        save=newstr;
                        newstr="";
                    }
                pos++;
                }
        }
        return save;
    }

    public static String charNotcont2(String str)
    {
        StringBuilder sb =new StringBuilder();
        int crntCount = 1;
        boolean foundDup = false;

        if (str == null || str.isEmpty())
        {
            return "";
        }

        for(int i =1;i<str.length();i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                // change of chars
                if (foundDup == false)
                {
                    sb.append(str.charAt(i-1));
                }

                foundDup = false;
            }
            else
            {
                foundDup = true;
            }
        }

        if (foundDup == false)
        {
            sb.append(str.charAt(str.length()-1));
        }

        return sb.toString();
    }

}
