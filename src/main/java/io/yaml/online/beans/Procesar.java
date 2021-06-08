package io.yaml.online.beans;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "items",
    "idField",
    "customFields",
    "progressField"
})
public class Procesar {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("items")
    @JsonPropertyDescription("")
    private String items;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idField")
    @JsonPropertyDescription("")
    private String idField;
    /**
     * 
     */
    @JsonProperty("customFields")
    @JsonPropertyDescription("")
    private List<CustomField> customFields = new ArrayList<CustomField>();
    /**
     * Root Type for ProgressField
     * <p>
     * 
     * 
     */
    @JsonProperty("progressField")
    @JsonPropertyDescription("")
    private ProgressField progressField;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("items")
    public String getItems() {
        return items;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("items")
    public void setItems(String items) {
        this.items = items;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idField")
    public String getIdField() {
        return idField;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idField")
    public void setIdField(String idField) {
        this.idField = idField;
    }

    /**
     * 
     */
    @JsonProperty("customFields")
    public List<CustomField> getCustomFields() {
        return customFields;
    }

    /**
     * 
     */
    @JsonProperty("customFields")
    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    /**
     * Root Type for ProgressField
     * <p>
     * 
     * 
     */
    @JsonProperty("progressField")
    public ProgressField getProgressField() {
        return progressField;
    }

    /**
     * Root Type for ProgressField
     * <p>
     * 
     * 
     */
    @JsonProperty("progressField")
    public void setProgressField(ProgressField progressField) {
        this.progressField = progressField;
    }

}
