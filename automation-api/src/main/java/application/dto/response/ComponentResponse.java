package application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComponentResponse {

    private Long id;
    private String label;
    private Long moduleId;
    private Long projectId;

}
