package migant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Migant{
    private Logger logger = LoggerFactory.getLogger(Migant.class);
    public void runMigant() throws InterruptedException{
        logger.info("This is Ant test app MIGANT");
        while (true){
            logger.info("Migant is running . . .");
            Thread.sleep(1000);
        }
    }
}