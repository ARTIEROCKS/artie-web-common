package artie.common.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelpResult {

    private String id;
    private boolean predictedNeedHelp;
    private boolean answeredNeedHelp;
    private Date dateAnsweredNeedHelp;
    private SolutionDistance solutionDistance;

}
