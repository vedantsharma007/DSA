package BinarySearch;

public class smallestLargeElement {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans=letters[0];
        int s=0,e=letters.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(letters[m]>target){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return letters[s%letters.length];
    }
    public static void main(String[] args){
        char[] letters={'c','j','f'};
        char target='d';
        smallestLargeElement obj= new smallestLargeElement();
        char SLA=obj.nextGreatestLetter(letters,target);

        System.out.println("smallest large element is : "+SLA);
    }
}
