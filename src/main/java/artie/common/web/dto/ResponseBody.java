package artie.common.web.dto;

public class ResponseBody {
    private String message;
    private Object object;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }

    /**
     * Default constructor
     */
    public ResponseBody() {}

    /**
     * Parameterized constructor
     * @param message
     */
    public ResponseBody(String message) {
        this.message = message;
    }

    /**
     * Parameterized constructor
     * @param object
     */
    public ResponseBody(Object object) {
        this.object = object;
    }

    /**
     * Parameterized constructor
     * @param message
     * @param object
     */
    public ResponseBody(String message, Object object) {
        this.message = message;
        this.object = object;
    }
}
