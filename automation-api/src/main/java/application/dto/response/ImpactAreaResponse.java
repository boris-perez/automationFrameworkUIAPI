package application.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ImpactAreaResponse {

    private Long id;
    private String label;
    private List<ComponentResponse> componentResponseList;

}
