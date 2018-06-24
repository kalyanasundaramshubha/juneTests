package organize1;

import static java.lang.Math.abs;

public class matrixdiagSum {
    public int matdiagSD(int[][]arr,int n){
        int i=0, j=0, lr=0, rl=0;
        for(i=0;i<n;i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    lr = lr + arr[i][j];
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i+j==n-1){
                    rl=rl+arr[i][j];
                }
            }
        }return abs(lr-rl);
    }
}
