package artie.common.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedagogicalSoftwareBlock {

    private PedagogicalSoftwareBlock previousBlock;
    private String blockName;
    private PedagogicalSoftwareBlock nextBlock;

}
