package ca.queensu.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeachingHistoryRec {
    @JsonProperty("adj_deliveryformat")
    private String adjDeliveryFormat;

    @JsonProperty("adj_acadyeartaught")
    private int adjAcadYearTaught;

    @JsonProperty("adj_responsibilitypercent")
    private double adjResponsibilityPercent;

    @JsonProperty("adj_coursecode")
    private String adjCourseCode;

    @JsonProperty("adj_units")
    private int adjUnits;

    @JsonProperty("adj_empid")
    private String adjEmpId;

    // Getters and setters
    public String getAdjDeliveryFormat() {
        return adjDeliveryFormat;
    }

    public void setAdjDeliveryFormat(String adjDeliveryFormat) {
        this.adjDeliveryFormat = adjDeliveryFormat;
    }

    public int getAdjAcadYearTaught() {
        return adjAcadYearTaught;
    }

    public void setAdjAcadYearTaught(int adjAcadYearTaught) {
        this.adjAcadYearTaught = adjAcadYearTaught;
    }

    public double getAdjResponsibilityPercent() {
        return adjResponsibilityPercent;
    }

    public void setAdjResponsibilityPercent(double adjResponsibilityPercent) {
        this.adjResponsibilityPercent = adjResponsibilityPercent;
    }

    public String getAdjCourseCode() {
        return adjCourseCode;
    }

    public void setAdjCourseCode(String adjCourseCode) {
        this.adjCourseCode = adjCourseCode;
    }

    public String getAdjEmpId() {
        return adjEmpId;
    }

    public void setAdjEmpId(String adjEmpId) {
        this.adjEmpId = adjEmpId;
    }
    public int getAdjUnits() {
        return adjUnits;
    }

    public void setAdjUnits(int adjUnits) {
        this.adjUnits = adjUnits;
    }
}