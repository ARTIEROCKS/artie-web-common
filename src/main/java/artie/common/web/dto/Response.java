package artie.common.web.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Response {

    private ResponseBody body;



    public ResponseBody getBody() {
        return body;
    }

    public void setBody(ResponseBody body) {
        this.body = body;
    }

    /**
     * Default Constructor
     */
    public Response() {}

    /**
     * Parameterized constructor
     * @param body
     */
    public Response(ResponseBody body) {
        this.body = body;
    }


    /**
     * Function to transform this object in a JSON
     * @return
     */
    public String toJSON() {

        String result = "";
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            result = objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return result;
    }
}
