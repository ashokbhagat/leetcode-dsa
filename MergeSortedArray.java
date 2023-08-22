import java.util.Arrays;

//merge sorted array
public class MergeSortedArray{

    public static void main(String a[]){
        merge(new int[] {2,3,4,10,0,0,0}, 4,  new int[] {2,5,9}, 3);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       
        int j=0;
        for(int i=m; i < nums1.length; i++){
                nums1[i] = nums2[j];
                j++;
        }

        Arrays.sort(nums1);
        
    }

}