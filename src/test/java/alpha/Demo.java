package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Demo {

        private static Logger Log = (Logger) LogManager.getLogger(Demo.class.getName());


        public static void main(String[] args) {

            Log.debug("I am debugging");

            if(5>4){
                Log.info("object is present");
                Log.error("Object not found");
                Log.fatal("this is fatal");
            }
        }
}
