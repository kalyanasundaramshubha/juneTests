package organize1;

public class mainClass1 {
    public static void main(String[] args){

        int[] alice={1,4,8};
        int[] bob={2,4,7};
        compareTriplet ct=new compareTriplet();
        int[] comt=ct.compare2triplets(alice,bob);
        for(int i=0;i<comt.length;i++) {
            System.out.print("  " + comt[i]);
        }

        int[][]arr={{1, 2, 3},
                    {4, 5, 6},
                    { 9, 8, 9}} ;
        int n=3;
        matrixdiagSum ms=new matrixdiagSum();
        int diff= ms.matdiagSD(arr,n);
        System.out.println("\n absolute diff of the diagnols are: "+ diff);


    }
}
