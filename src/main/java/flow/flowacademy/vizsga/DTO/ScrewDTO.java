package flow.flowacademy.vizsga.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
public class ScrewDTO {

    @JsonProperty("sid")
    @Pattern(regexp = "^\\d{3}-\\d{4}-\\d{3}$")
    private String serialID;

    @JsonProperty("size")
    private Integer size;

    @JsonProperty("storage")
    private Long StorageID;
}
