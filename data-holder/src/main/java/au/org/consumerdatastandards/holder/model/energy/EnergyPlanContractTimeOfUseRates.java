package au.org.consumerdatastandards.holder.model.energy;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EnergyPlanContractTimeOfUseRates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2022-01-11T14:03:27.755+11:00[Australia/Sydney]")
public class EnergyPlanContractTimeOfUseRates {
    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("description")
    private String description;

    @JsonProperty("rates")
    @Valid
    private List<EnergyPlanContractRates> rates = new ArrayList<>();

    @JsonProperty("timeOfUse")
    @Valid
    private List<EnergyPlanContractTimeOfUse> timeOfUse = new ArrayList<>();

    /**
     * The type of usage that the rate applies to
     */
    public enum TypeEnum {
        PEAK("PEAK"),

        OFF_PEAK("OFF_PEAK"),

        SHOULDER("SHOULDER"),

        SHOULDER1("SHOULDER1"),

        SHOULDER2("SHOULDER2");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("type")
    private TypeEnum type;

    public EnergyPlanContractTimeOfUseRates displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name of the rate
     *
     * @return displayName
     */
    @ApiModelProperty(required = true,
            value = "Display name of the rate")
    @NotNull


    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public EnergyPlanContractTimeOfUseRates description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the rate
     *
     * @return description
     */
    @ApiModelProperty(value = "Description of the rate")


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnergyPlanContractTimeOfUseRates rates(List<EnergyPlanContractRates> rates) {
        this.rates = rates;
        return this;
    }

    public EnergyPlanContractTimeOfUseRates addRatesItem(EnergyPlanContractRates ratesItem) {
        this.rates.add(ratesItem);
        return this;
    }

    /**
     * Array of controlled load rates in order of usage volume
     *
     * @return rates
     */
    @ApiModelProperty(required = true,
            value = "Array of controlled load rates in order of usage volume")
    @NotNull

    @Valid

    public List<EnergyPlanContractRates> getRates() {
        return rates;
    }

    public void setRates(List<EnergyPlanContractRates> rates) {
        this.rates = rates;
    }

    public EnergyPlanContractTimeOfUseRates timeOfUse(List<EnergyPlanContractTimeOfUse> timeOfUse) {
        this.timeOfUse = timeOfUse;
        return this;
    }

    public EnergyPlanContractTimeOfUseRates addTimeOfUseItem(EnergyPlanContractTimeOfUse timeOfUseItem) {
        this.timeOfUse.add(timeOfUseItem);
        return this;
    }

    /**
     * Array of times of use
     *
     * @return timeOfUse
     */
    @ApiModelProperty(required = true,
            value = "Array of times of use")
    @NotNull

    @Valid

    public List<EnergyPlanContractTimeOfUse> getTimeOfUse() {
        return timeOfUse;
    }

    public void setTimeOfUse(List<EnergyPlanContractTimeOfUse> timeOfUse) {
        this.timeOfUse = timeOfUse;
    }

    public EnergyPlanContractTimeOfUseRates type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of usage that the rate applies to
     *
     * @return type
     */
    @ApiModelProperty(required = true,
            value = "The type of usage that the rate applies to")
    @NotNull


    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnergyPlanContractTimeOfUseRates energyPlanContractTimeOfUseRates = (EnergyPlanContractTimeOfUseRates) o;
        return Objects.equals(this.displayName, energyPlanContractTimeOfUseRates.displayName) &&
                Objects.equals(this.description, energyPlanContractTimeOfUseRates.description) &&
                Objects.equals(this.rates, energyPlanContractTimeOfUseRates.rates) &&
                Objects.equals(this.timeOfUse, energyPlanContractTimeOfUseRates.timeOfUse) &&
                Objects.equals(this.type, energyPlanContractTimeOfUseRates.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, description, rates, timeOfUse, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnergyPlanContractTimeOfUseRates {\n");

        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
        sb.append("    timeOfUse: ").append(toIndentedString(timeOfUse)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

