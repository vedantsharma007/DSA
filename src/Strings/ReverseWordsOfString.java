package Strings;

import java.util.Scanner;

public class ReverseWordsOfString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the string : ");
        String s=sc.nextLine();
        System.out.println("Original String is : "+ s);
        String[] words=s.split(" ");

        StringBuilder reversed=new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            reversed.append(words[i]);
            if(i>0){
                reversed.append(" ");
            }
        }
        System.out.print("reverse words of string : "+reversed.toString());
    }
}
