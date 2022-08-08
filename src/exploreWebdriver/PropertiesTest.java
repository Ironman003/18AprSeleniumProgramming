package exploreWebdriver;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args)
        throws Exception {

        // set up new properties object
        // from file "doTHis.txt"
        FileInputStream propFile =
            new FileInputStream( "C:\\Users\\AKSHAY\\Desktop\\doTHis.txt");
        Properties p =
            new Properties(System.getProperties());
        p.load(propFile);
        // set the system properties
        System.setProperties(p);
        // display new properties
        System.getProperties().list(System.out);
        
    }
}
