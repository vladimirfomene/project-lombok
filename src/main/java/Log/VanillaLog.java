package Log;

import java.util.logging.Logger;

public class VanillaLog {

    private static final Logger log = java.util.logging.Logger.getLogger(VanillaLog.class.getName());

    public void log(){
        log.info("Your Christmas gift is coming.");
    }
}
