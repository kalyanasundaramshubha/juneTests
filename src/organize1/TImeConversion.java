package organize1;

public class TImeConversion {

    public static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        int hh=0;
        int  hhsub;
        String hhsubstr;
        String newstr;


        if(s.startsWith("12")==true&&s.endsWith("PM"))
        {
            return s.substring(0,s.length()-2);
        }
        else if(s.endsWith("PM")==true)
        {

                hhsub= Integer.parseInt(s.substring(0,2));
                hh= hhsub+12;
                newstr= String.format("%d",hh)+s.substring(2,s.length()-2);
                return newstr;
        }

        else if(s.equals("12:00:00AM")==true)
        {
            return "00:00:00";
        }
        else if(s.startsWith("12")==true&&s.endsWith("AM"))
        {
            hhsubstr= s.substring(0,2);

            newstr= s.replace(hhsubstr,"00");
            return newstr.substring(0,newstr.length()-2);
        }
        else
        {
            return s.substring(0,s.length()-2);

        }

    }

    public  static String timeConversion2(String input)
    {
        // Validations
        boolean pm = input.endsWith("PM");
        int hour = Integer.parseInt(input.substring(0,2));
        if (pm && hour != 12)
        {
            hour +=12;
        }
        else if (hour == 12 && !pm)
        {
            hour = 0;
        }

        return String.format("%02d",hour)+input.substring(2,input.length()-2);
    }
}
