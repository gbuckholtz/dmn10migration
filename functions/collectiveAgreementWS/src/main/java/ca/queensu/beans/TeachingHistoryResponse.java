package ca.queensu.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class TeachingHistoryResponse {
    @JsonProperty("value")
    private List<TeachingHistoryRec> value;

    // Getter and setter
    public List<TeachingHistoryRec> getValue() {
        return value;
    }

    public void setValue(List<TeachingHistoryRec> value) {
        this.value = value;
    }
}