package Garbaje;

import java.util.ArrayList;
import java.util.List;

public class Parent {
    public static void main(String[] args) {
        System.out.println(getTry());
    }
    protected List<String> parentMethod(){
        return new ArrayList<>();
    }
    public static String getTry(){
        try{
            System.out.println("tryy");
            return "трай";
        }catch (Exception e){
            return "ex";
        }finally {
            return "finaly";
        }
    }
}
