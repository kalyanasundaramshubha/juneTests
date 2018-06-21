public class spaceRemover {
    public static void main(String[]arguments){
        String sentence="Aditi and Arjun are my kids.";
        char[] character= sentence.toCharArray();
        for(int i=0;i<character.length;i++){
            char current=character[i];
            if(current != ' ' )
            {
              System.out.println(current);
            }else
            {
                System.out.println(".");
            }
        }

    }
}
