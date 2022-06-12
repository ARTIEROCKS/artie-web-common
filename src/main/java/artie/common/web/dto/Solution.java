package artie.common.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Solution {

    private String id;
    private String exerciseId;
    private String name;
    private String description;
    private String screenShot;
    private String binary;
}
