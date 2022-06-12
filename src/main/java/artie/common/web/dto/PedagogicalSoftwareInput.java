package artie.common.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedagogicalSoftwareInput {

    private String inputName;
    private String type;
    private String opcode;
    private PedagogicalSoftwareBlock element;
    private String inputValue;
    private String solutionValue;

}
