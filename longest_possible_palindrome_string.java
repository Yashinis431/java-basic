import java.util.*;
public class longest_possible_palindrome_string {
    public static void main(String[] args){
        String s="abbcad";
        int len=0;
        int count=0;
        boolean flag=false;
        boolean[] visited=new boolean[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!visited[i]){
                for(int j=0;j<s.length();j++){
                   char cha=s.charAt(j);
                   if(ch==cha){
                      count++;
                      visited[j]=true;
                    }
                }
            }
            if(count%2==0){
                len+=count;
            }
            else if(count%2!=0&&count>1){
                len+=count-1;
                flag=true;
            }
            else{
                flag=true;
            }
        
        }
        if(flag){
            System.out.print(count+1);
        }
        else{
            System.out.print(count);
        }
    }
    
}
