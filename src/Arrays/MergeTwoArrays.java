package Arrays;

public class MergeTwoArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=nums1.length-1;
        while(i>=0 && j>=0){
            if(nums1[i]<=nums2[j]){
                nums1[k--]=nums2[j];
                j--;
            }
            else{
                nums1[k--]=nums1[i];
                i--;
            }
        }
        while(i>=0){
            nums1[k--]=nums1[i--];
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3,n=3;
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<nums2.length;i++){
            System.out.print(nums2[i]+" ");
        }
        System.out.println();
        MergeTwoArrays obj=new MergeTwoArrays();

        obj.merge(nums1,m,nums2,n);

        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}
