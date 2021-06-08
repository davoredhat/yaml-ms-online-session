
package org.example.api.beans;

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
    "id",
    "usersConnected",
    "procesar"
})
public class OnlineSession {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("")
    private String id;
    /**
     * 
     */
    @JsonProperty("usersConnected")
    @JsonPropertyDescription("")
    private List<String> usersConnected = new ArrayList<String>();
    /**
     * 
     */
    @JsonProperty("procesar")
    @JsonPropertyDescription("")
    private Procesar procesar;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     */
    @JsonProperty("usersConnected")
    public List<String> getUsersConnected() {
        return usersConnected;
    }

    /**
     * 
     */
    @JsonProperty("usersConnected")
    public void setUsersConnected(List<String> usersConnected) {
        this.usersConnected = usersConnected;
    }

    /**
     * 
     */
    @JsonProperty("procesar")
    public Procesar getProcesar() {
        return procesar;
    }

    /**
     * 
     */
    @JsonProperty("procesar")
    public void setProcesar(Procesar procesar) {
        this.procesar = procesar;
    }

}
