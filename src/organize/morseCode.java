package organize;

import java.util.HashSet;

public class morseCode {
    private static final String[] mcdic=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public static int uniquemorseRepresentations(String[] words){
        HashSet<String> mcset = new HashSet<String>();
        //String word="";

        //for(String word : words)
        for(int i=0;i<words.length;i++){
            mcset.add(mct(words[i]));

        }
        return mcset.size();
    }

    public static String mct(String word){
            StringBuilder builder= new StringBuilder();
            for(int i=0; i<word.length();i++) {
                builder.append(mcdic[word.charAt(i) - 'a']);
            }
            return String.valueOf(builder);
            //return builder.toString();
    }
}
