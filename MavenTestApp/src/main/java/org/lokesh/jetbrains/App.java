package org.lokesh.jetbrains;
import org.slf4j.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // logger class is present in slf4j package
        // we are using it to log the message
        // System.out.println( "Hello World!" );
        // if we compile it will throw error
        // we tell maven to download the jar dependency for slf4j by adding it in the pom.xml dependency
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Hello World");
    }
}
