package Arrays.Sorting;
//Mergesort implementation

public class MergeSort {
    public void mergeSort(int[] nums,int p,int r){
        if(p>=r){
            return;
        }
        int q=(p+r)/2;
        mergeSort(nums,p,q);
        mergeSort(nums,q+1,r);
        merge(nums,p,q,r);
    }
    public void merge(int[] nums,int p,int q,int r){
        int n1=q-p+1;
        int n2=r-q;

        int[] left=new int[n1];
        int[] right=new int[n2];

        int i=0,j=0;

        while(i<n1){
            left[i]=nums[p+i];
            i++;
        }

        while(j<n2){
            right[j]=nums[q+1+j];
            j++;
        }

        i=0;
        j=0;
        int k=p;

        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                nums[k++]=left[i++];
            }
            else{
                nums[k++]=right[j++];
            }
        }

        while(i<n1){
            nums[k++]=left[i++];
        }

        while(j<n2){
            nums[k++]=right[j++];
        }
    }

    public static void main(String[] args) {
        int[] nums={3,56,12,7,132,46,21,3,23,57,134};

        MergeSort obj=new MergeSort();
        obj.mergeSort(nums,0,nums.length-1);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
