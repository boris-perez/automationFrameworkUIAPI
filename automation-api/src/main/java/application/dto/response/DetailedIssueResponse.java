package application.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class DetailedIssueResponse {

    private Long id;
    private Long projectId;
    private String projectName;
    private String title;
    private String code;
    private String description;
    private Long issueStatusId;
    private String issueStatusLabel;
    private Long bugTypeId;
    private String bugTypeLabel;
    private Long issueTypeId;
    private String issueTypeLabel;
    private Long environmentId;
    private String environmentLabel;
    private Long natureId;
    private String natureLabel;
    private Long occurrenceId;
    private String occurrenceLabel;
    private Long priorityId;
    private String priorityLabel;
    private Long resolutionId;
    private String resolutionLabel;
    private String actualBehavior;
    private String expectedBehavior;
    private List<IssueTagResponse> tags;
    private String affectedVersions;
    private String fixedAtVersion;
    private String fixedAtSprint;
    private String reporterId;
    private String reporterName;
    private String devAssigned;
    private String qaAssigned;
    private Date createDate;
    private String createDateTimeAgo;
    private String createUserId;
    private String createUserName;
    private String updateDate;
    private String updateDateTimeAgo;
    private String updateUserId;
    private String updateUserName;
    private Date devAssignedDate;
    private String devAssignedDateTimeAgo;
    private Date inSprintDate;
    private String inSprintDateTimeAgo;
    private Date devCompletedDate;
    private String devCompletedDateTimeAgo;
    private Date qaAssignedDate;
    private String qaAssignedDateTimeAgo;
    private Date qaCompletedDate;
    private String qaCompletedDateTimeAgo;
    private Date resolutionDate;
    private String resolutionDateTimeAgo;

    private Long defaultAttachmentId;

    private String sprintId;
    private String sprintLabel;

    private Long moduleId;
    private String moduleLabel;

    private List<ComponentResponse> componentResponseList;
    private List<ImpactAreaResponse> impactAreaResponseList;

    private Boolean isReproducedStep;
    private List<StepResponse> steps;

}
