package Recursion;

import java.util.Scanner;

public class RecPermutations {
    //**************************************main function************************************************88888
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string: ");
        String u=sc.nextLine();

        int i=0;
        RecPermutations obj=new RecPermutations();
        obj.permutations("",u);

    }
    public void permutations(String p,String u){
        if(u.isEmpty()) {
            System.out.println(p);
            return ;
        }
        for(int i=0;i<u.length();i++){
            char ch=u.charAt(i);
            String left=u.substring(0,i);
            String right=u.substring(i+1);
            permutations(p+ch,left+right);
        }
    }
}
