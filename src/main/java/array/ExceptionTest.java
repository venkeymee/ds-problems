package array;


import java.sql.SQLException;

class Parent {
    Parent() throws  SQLException{}
    // having exception child class must same or parent exception
public void est()throws  Exception{
}}
public class ExceptionTest extends Parent {
    ExceptionTest() throws Exception{} //
    @Override
    public void est() throws  SQLException{
         System.out.println("tes");
     }
    public static void main(String[] args) {
    }
    // 1. child class override method checked exception expect parent should be check exception
    // 2. without throwing checked exception we cannot catch checked exception.
}
