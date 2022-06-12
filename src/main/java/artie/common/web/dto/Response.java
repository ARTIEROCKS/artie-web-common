package artie.common.web.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private ResponseBody body;

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
