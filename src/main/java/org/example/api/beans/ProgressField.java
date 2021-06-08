
package org.example.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for ProgressField
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "field",
    "firstState",
    "secondState"
})
public class ProgressField {

    @JsonProperty("field")
    private String field;
    @JsonProperty("firstState")
    private String firstState;
    @JsonProperty("secondState")
    private String secondState;

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    @JsonProperty("firstState")
    public String getFirstState() {
        return firstState;
    }

    @JsonProperty("firstState")
    public void setFirstState(String firstState) {
        this.firstState = firstState;
    }

    @JsonProperty("secondState")
    public String getSecondState() {
        return secondState;
    }

    @JsonProperty("secondState")
    public void setSecondState(String secondState) {
        this.secondState = secondState;
    }

}
