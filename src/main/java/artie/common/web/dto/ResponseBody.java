package artie.common.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBody {
    private String message;
    private Object object;


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

}
