package cl.duoc.ms_product_db.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class productDTO {
    @JsonProperty("product_id")
    private Long id;
    @JsonProperty("product_name")
    private String name;
}
