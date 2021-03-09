package array;

public class ArrayResvers {

    public static void main(String[] args) {
        int s[]=new int[]{1,2,3,4,5};
        for (int i=s.length-1;i>=0;i--){
            System.out.println(s[i]);
        }
    }
}
