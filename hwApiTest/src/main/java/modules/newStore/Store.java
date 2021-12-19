package modules.newStore;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Store {
    @JsonProperty("id")
    private String id;
    @JsonProperty("petId")
    private String petId;
    @JsonProperty("quantity")
    private String quantity;
    @JsonProperty("shipDate")
    private String shipDate;
    @JsonProperty("status")
    private String status;
    @JsonProperty("complete")
    private boolean complete;
}
