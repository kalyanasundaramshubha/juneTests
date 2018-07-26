package organize;

public class merge2Strings {

      public static String mergeStrings(String a, String b) {

          int len= a.length()+b.length();
          StringBuilder sb = new StringBuilder(len);
          int big=0;
          if(a.length()>b.length())
          {
              big=a.length();
          }
          else
          {
              big=b.length();
          }

          for(int i=0; i<big;i++)
          {
              if (i < a.length())
              {
                  sb.append(a.charAt(i));
              }
              if(i<b.length())
              {
                  sb.append(b.charAt(i));
              }

          }

          return sb.toString();
        }
}
