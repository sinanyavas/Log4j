package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Demo2 {

    private static Logger Log = (Logger) LogManager.getLogger(Demo2.class.getName());

    public static void main(String[] args) {

        Log.debug("I am debugging");

        if(5>4){
            Log.info("object is present");
            Log.error("Object not found");
            Log.fatal("this is fatal");
        }
    }

}
