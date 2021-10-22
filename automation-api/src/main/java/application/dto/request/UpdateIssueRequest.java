package application.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class UpdateIssueRequest {

    private Long id;
    private String title;
    private String description;
    private Long occurrenceId;
    private Long environmentId;
    private Long componentId;
    private Long impactAreaId;
    private Long sprintId;
    private String stepsToReproduce;
    private String actualBehavior;
    private String expectedBehavior;
    private Date inSprintDate;
    private String devAssignedId;
    private String qaAssignedId;
    private Boolean isReproducedStep;
}
