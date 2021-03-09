package array;

public class ArrayDuplicate {

    public static void main(String[] args) {
        int s[]={'a','b','a','c','b'};
//        for(int i=0;i<s.length;i++){
//            s[i]=(char)65+1;
//            System.out.println(s[i]);
//        }

        // finding duplicate logic

        for(int i=0;i<s.length;i++){

            for(int j=i+1;j<s.length;j++){

                if(s[i]==s[j]){
                    System.out.println((char)s[i]+":position at "+i+" , "+j+" are duplicate");
                }
            }
        }


    }
}
