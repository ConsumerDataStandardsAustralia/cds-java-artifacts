package au.org.consumerdatastandards.holder.model.energy;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * EnergyPlanContractTiers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2022-01-11T14:03:27.755+11:00[Australia/Sydney]")
public class EnergyPlanContractTiers {
    @JsonProperty("percentGreen")
    private String percentGreen;

    @JsonProperty("rate")
    private String rate;

    @JsonProperty("amount")
    private String amount;

    public EnergyPlanContractTiers percentGreen(String percentGreen) {
        this.percentGreen = percentGreen;
        return this;
    }

    /**
     * The upper percentage of green power used applicable for this tier
     *
     * @return percentGreen
     */
    @ApiModelProperty(required = true,
            value = "The upper percentage of green power used applicable for this tier")
    @NotNull


    public String getPercentGreen() {
        return percentGreen;
    }

    public void setPercentGreen(String percentGreen) {
        this.percentGreen = percentGreen;
    }

    public EnergyPlanContractTiers rate(String rate) {
        this.rate = rate;
        return this;
    }

    /**
     * The rate of the charge if the type implies the application of a rate
     *
     * @return rate
     */
    @ApiModelProperty(value = "The rate of the charge if the type implies the application of a rate")


    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public EnergyPlanContractTiers amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * The amount of the charge if the type implies the application of a fixed amount
     *
     * @return amount
     */
    @ApiModelProperty(value = "The amount of the charge if the type implies the application of a fixed amount")


    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnergyPlanContractTiers energyPlanContractTiers = (EnergyPlanContractTiers) o;
        return Objects.equals(this.percentGreen, energyPlanContractTiers.percentGreen) &&
                Objects.equals(this.rate, energyPlanContractTiers.rate) &&
                Objects.equals(this.amount, energyPlanContractTiers.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(percentGreen, rate, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnergyPlanContractTiers {\n");

        sb.append("    percentGreen: ").append(toIndentedString(percentGreen)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

