package application.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class CreateIssueRequest {

    private String title;
    private String description;
    private Long projectId;
    private Long priorityId;
    private Long issueTypeId;
    private Long bugTypeId;
    private Long natureId;
    private Long occurrenceId;
    private Long environmentId;
    private Long componentId;
    private Long moduleId;
    private Long impactAreaId;
    private Long sprintId;
    private String stepsToReproduce;
    private String actualBehavior;
    private String expectedBehavior;
    private Date inSprintDate;
    private String devAssignedId;
    private String qaAssignedId;
}
