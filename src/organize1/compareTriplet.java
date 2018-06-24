package organize1;

public class compareTriplet {
    public int [] compare2triplets(int[] Alice, int[] Bob) {
        int i = 0, A = 0, B = 0;

        for (i = 0; i < 3; i++) {
            if (Alice[i] == Bob[i]) {
                continue;
            }
            if (Alice[i] > Bob[i]) {
                 A++;
            } else {
                 B++;
            }

        }
        int[] alice=new int[2];
        alice[0]=A;
        alice[1]=B;
        return alice;

    }

}
