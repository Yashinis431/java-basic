public class reversestrusingrecursion{
    public static void recursion(String str,int index){
        if(index<0){
            return;
        }
        System.out.print(str.charAt(index));
        recursion(str,index-1);
    }
    public static void main(String[] args){
        String str="JAVA";
        recursion(str,str.length()-1);
    }
}
    