package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class recSubSeq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string: ");
        String s=sc.nextLine();

        recSubSeq obj=new recSubSeq();
        obj.subSeq("",s);

    }

    public void subSeq(String p,String u){
        if(u.isEmpty()){
            System.out.print(p+" ");
            return ;
        }
        char ch=u.charAt(0);
        subSeq(p+ch,u.substring(1));
        subSeq(p,u.substring(1));
    }
}
