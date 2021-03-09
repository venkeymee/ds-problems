package array;

public class ArrayLargestElement {

    public static void main(String[] args) {
        int[] s=new int[]{1,5,67,3,6};

        for (int i=0;i<s.length;i++){
            int sw;
            for(int j=i+1;j<s.length;j++){
                if(s[i]>s[j]){
                   sw=s[i];
                   s[i]=s[j];
                   s[j]=sw;
                }
            }
            System.out.println(s[i]);

        }
    }
}
