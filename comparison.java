import java.util.*;
class comparison{
    public static void main(String[] args){
        String s1="hello";
        String s2="World";
        String name = "nivedha";
        int age=19;
        //System.out.println(s1.concat(s2));
        //System.out.println(s1+" "+s2);
        String s=String.format("my name is %s and my age is %d",name,age);
        System.out.print(s);
    }
}
