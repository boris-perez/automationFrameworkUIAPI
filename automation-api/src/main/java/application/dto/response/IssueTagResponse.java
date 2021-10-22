package application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTagResponse {
    private Long issueTagId;
    private String name;
    private String type;
    private boolean removable;
}
