package lesson4.GetResponse;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "aisles",
        "cost",
        "startDate",
        "endDate"
})
public class GetResponse {
    @JsonProperty("aisles")
    private List<Aisle> aisles = null;
    @JsonProperty("cost")
    private Double cost;
    @JsonProperty("startDate")
    private Integer startDate;
    @JsonProperty("endDate")
    private Integer endDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("aisles")
    public List<Aisle> getAisles() {
        return aisles;
    }

    @JsonProperty("aisles")
    public void setAisles(List<Aisle> aisles) {
        this.aisles = aisles;
    }

    @JsonProperty("cost")
    public Double getCost() {
        return cost;
    }

    @JsonProperty("cost")
    public void setCost(Double cost) {
        this.cost = cost;
    }

    @JsonProperty("startDate")
    public Integer getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("endDate")
    public Integer getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}*/