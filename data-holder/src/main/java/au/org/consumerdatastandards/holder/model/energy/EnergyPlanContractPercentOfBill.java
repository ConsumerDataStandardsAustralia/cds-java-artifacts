package au.org.consumerdatastandards.holder.model.energy;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Required if methodUType is percentOfBill
 */
@ApiModel(description = "Required if methodUType is percentOfBill")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2022-01-11T14:03:27.755+11:00[Australia/Sydney]")
public class EnergyPlanContractPercentOfBill {
    @JsonProperty("rate")
    private String rate;

    public EnergyPlanContractPercentOfBill rate(String rate) {
        this.rate = rate;
        return this;
    }

    /**
     * The rate of the discount applied to the bill amount
     *
     * @return rate
     */
    @ApiModelProperty(required = true,
            value = "The rate of the discount applied to the bill amount")
    @NotNull


    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnergyPlanContractPercentOfBill energyPlanContractPercentOfBill = (EnergyPlanContractPercentOfBill) o;
        return Objects.equals(this.rate, energyPlanContractPercentOfBill.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnergyPlanContractPercentOfBill {\n");

        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

