public class countingCharacters {
    public static void main (String[]arguments){
        String document="\n" +
                "\t\n" +
                " \n" +
                "Medical Device Security Market by Solution (Encryption, Antivirus, Identity & Access Management), Type (Network Security, Endpoint Security)\n" +
                " \n" +
                "Kalpana G in Cloud Computing, SaaS amp; Virtualization\n" +
                " \n" +
                "Download Free Brochure @ http://bit.ly/MD_Security The global medical device security market is projected to reach USD 6.59 billion by 2023 from 4.36 billion in 2018, at a CAGR of 8.6%. Factors...\n" +
                " \n" +
                " \n" +
                "\t\n" +
                " \n" +
                "Selenium basics - Step by Step\n" +
                " \n" +
                "Raghav Pal in Test automation\n" +
                " \n" +
                "I created this playlist for complete beginners to understand Selenium and its components in an easy way and get started to write automation tests with Selenium. Hope this will be helpful....\n" +
                " \n" +
                " \n" +
                "\t\n" +
                " \n" +
                "Microsoft 70-473, preparation\n" +
                " \n" +
                "Fadel DABO in Cloud Computing\n" +
                " \n" +
                "Just a quick share after passing the exam 70 473 at this date of June 2018. DO First and foremost, review the exam objectives and the exam changes document. Study and practice each of the topics if. ";
        char[] character=document.toCharArray();
        int count=0;
        for(int i=0;i<document.length();i++){
            char current= character[i];
            System.out.println("character: "+ current +" count : "+ i);
            count=i;
        }System.out.println("Total number of characters in the document :"+ count );
    }

}
