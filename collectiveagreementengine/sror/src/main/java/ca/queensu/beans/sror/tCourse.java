package ca.queensu.beans.sror;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"Course_code", "Academic_year_taught", "Units", "Delivery_format", "Responsibility_percentage"})
public class tCourse {
    @JsonProperty(required = true)
    private String Course_code;

    @JsonProperty(required = true)
    private Integer Academic_year_taught;

    @JsonProperty(required = true)
    private  Integer Units;

    @JsonProperty(required = true)
    private String Delivery_format;
    
    @JsonProperty(required = true)
    private Integer Responsibility_percentage;
  
    public String getCourse_code() {
        return Course_code;
    }
    public void setCourse_code(String course_code) {
        Course_code = course_code;
    }
    public Integer getAcademic_year_taught() {
        return Academic_year_taught;
    }
    public void setAcademic_year_taught(Integer academic_year_taught) {
        Academic_year_taught = academic_year_taught;
    }
    public Integer getUnits() {
        return Units;
    }
    public void setUnits(Integer units) {
        Units = units;
    }
    public String getDelivery_format() {
        return Delivery_format;
    }
    public void setDelivery_format(String delivery_format) {
        Delivery_format = delivery_format;
    }
    public Integer getResponsibility_percentage() {
        return Responsibility_percentage;
    }
    public void setResponsibility_percentage(Integer responsibility_percentage) {
        Responsibility_percentage = responsibility_percentage;
    }
     
}
