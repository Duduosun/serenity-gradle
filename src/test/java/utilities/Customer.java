package utilities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

    @JsonProperty String type;
    @JsonProperty String CustomerName;
    @JsonProperty String CustomerType;
    @JsonProperty Boolean IsUltimate;
    @JsonProperty String AccountLevel;
    @JsonProperty String DigitalTiering;
    @JsonProperty String GeoShrtNm;
    @JsonProperty String RelatedCustomerAccount;


    public void setCustomerType(String s) {
        CustomerType = s;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerName(String s) {
        CustomerName = s;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setIsUltimate(Boolean s) {
        IsUltimate = s;
    }

    public Boolean getIsUltimate() {
        return IsUltimate;
    }

    public void setAccountLevel(String s) {
        AccountLevel = s;
    }

    public String getAccountLevel() {
        return AccountLevel;
    }

    public void setDigitalTiering(String s) {
        DigitalTiering = s;
    }

    public String getDigitalTiering() {
        return DigitalTiering;
    }

    public void setGeoShrtNm(String s) {
        GeoShrtNm = s;
    }

    public String getGeoShrtNm() {
        return GeoShrtNm;
    }

    public void setRelatedCustomerAccount(String s) {
        RelatedCustomerAccount = s;
    }

    public String getRelatedCustomerAccount() {
        return RelatedCustomerAccount;
    }
}
