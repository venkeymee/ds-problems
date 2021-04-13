package array;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

class Parent {
public void est() {
}

}
public class Test extends Parent{

        @Override
    public void est()  {
         System.out.println("tes");
     }

    public static void main(String[] args) {
//        super.defaultMethod();
        Test ts=new Test();
            ts.est();

    }


}
