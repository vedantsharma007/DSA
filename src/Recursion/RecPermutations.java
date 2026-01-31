package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecPermutations {
    //**************************************main function************************************************88888
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string: ");
        String u=sc.nextLine();

        int i=0;
        RecPermutations obj=new RecPermutations();
        obj.permutations("",u,i);

    }
    public void permutations(String p,String u,int i){
        if(u.isEmpty()) {
            System.out.println(p);
            return ;
        }
        char ch=p.charAt(i);
        String left=p.substring(0,i);
        String right=p.substring(i+1);
        p=left+right;
        u+=ch;
        permutations(p,u,i+1);
    }
}
