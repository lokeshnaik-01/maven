
package org.lokesh.javabrains;
import java.util.*;
public class Myclass {
    public static void main(String args[]) {
        // this will not compile as in plugin we have used arraylist
        // this is not there in plugin which is java version 1.4
        // if we change it to 1.7 it will compile fine
        List<String> stringList = new ArrayList<String>();
    }
}