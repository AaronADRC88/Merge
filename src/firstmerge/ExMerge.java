
package firstmerge;

import java.util.logging.Logger;


public class ExMerge {

    public ExMerge() {
    }
    private static final Logger LOG = Logger.getLogger(ExMerge.class.getName());
    
    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }

}
