package organize;

public class BinarySearch {

    //
    // return index in the array where the number exists. -1 if number doesn't exist
    //
    public static int Search(int[] arr, int tar)
    {
        int left=0, right=arr.length-1;
        //int ptr=(left+right)/2;

        while(left<=right)
        {
            int ptr=(left+right)/2;
            if(arr[ptr]==tar)
            {
                return ptr;
            }
            if(tar<arr[ptr])
            {
                right=ptr-1;

            }
            else
            {
                left=ptr+1;
            }
        }

        return -1;

    }
}
