package sesf.simplejavaeasymath;

/**
 * We import the Map interface so that we can store additional attributes about
 * SimpleResults.
 * @author Fox Wilson
 * @version 1
 * @since 0.0.1
 */
import java.util.Map;

/**
 * We import the HashMap class because it is an efficient way of maintaining
 * attributes about SimpleResults. It is the default Map class for new
 * SimpleResults.
 * @author Fox Wilson
 * @version 1
 * @since 0.0.1
 */
import java.util.HashMap;

public class SimpleResult {
    /**
     * SimpleResults store the result of a calculation performed by a
     * SimpleOperator.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */

    /**
     * This field stores the actual result.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    private SimpleNumber result;

    /**
     * This field stores any additional information about the result, in the
     * form of a Map. This Map maps Strings to Objects.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    private Map<String, Object> attributes;

    public SimpleResult() {
        /**
         * The default SimpleResult constructor. Initializes private fields to
         * their default values.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        result = new SimpleInteger();
        attributes = new HashMap<String, Object>();
    }

    public SimpleResult(SimpleNumber result) {
        /**
         * A constructor to build a SimpleResult based on a SimpleNumber that
         * is passed in. Initializes the attributes mapping to the default.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        this.result = result;
        attributes = new HashMap<String, Object>();
    }

    public SimpleResult setAttribute(String key, Object value) {
        /**
         * Set an attribute on this SimpleResult object. Returns the
         * SimpleResult object to allow chaining of setAttributes.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param key the key to map the value to
         * @param value the value of the attribute to be stored
         * @return the SimpleResult object that the key was set on
         */
        attributes.put(key, value);
        return this;
    }

    public Object getAttribute(String key) {
        /**
         * Get an attribute from this SimpleResult object.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param key the key to be retrieved
         * @return the value stored in the map
         */
        return attributes.get(key);
    }

    public SimpleNumber getNumber() {
        /**
         * Get the SimpleNumber represented by this SimpleResult.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @return the SimpleNumber represented by this SimpleResult
         */
        return result;
    }
}
