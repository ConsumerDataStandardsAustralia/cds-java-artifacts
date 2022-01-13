package au.org.consumerdatastandards.holder.model.energy;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * EnergyPlanContractSingleRateRates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2022-01-11T14:03:27.755+11:00[Australia/Sydney]")
public class EnergyPlanContractSingleRateRates {
    @JsonProperty("unitPrice")
    private String unitPrice;

    /**
     * The measurement unit of rate. Assumed to be KWH if absent
     */
    public enum MeasureUnitEnum {
        KWH("KWH"),

        KVA("KVA"),

        KVAR("KVAR"),

        KVARH("KVARH"),

        KW("KW"),

        DAYS("DAYS"),

        METER("METER"),

        MONTH("MONTH");

        private String value;

        MeasureUnitEnum(String value) {
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
        public static MeasureUnitEnum fromValue(String value) {
            for (MeasureUnitEnum b : MeasureUnitEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("measureUnit")
    private MeasureUnitEnum measureUnit;

    @JsonProperty("volume")
    private BigDecimal volume;

    public EnergyPlanContractSingleRateRates unitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * Unit price of usage per measure unit (exclusive of GST)
     *
     * @return unitPrice
     */
    @ApiModelProperty(required = true,
            value = "Unit price of usage per measure unit (exclusive of GST)")
    @NotNull


    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public EnergyPlanContractSingleRateRates measureUnit(MeasureUnitEnum measureUnit) {
        this.measureUnit = measureUnit;
        return this;
    }

    /**
     * The measurement unit of rate. Assumed to be KWH if absent
     *
     * @return measureUnit
     */
    @ApiModelProperty(value = "The measurement unit of rate. Assumed to be KWH if absent")


    public MeasureUnitEnum getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(MeasureUnitEnum measureUnit) {
        this.measureUnit = measureUnit;
    }

    public EnergyPlanContractSingleRateRates volume(BigDecimal volume) {
        this.volume = volume;
        return this;
    }

    /**
     * Volume in kWh that this rate applies to.  Only applicable for ‘stepped’ rates where different rates apply for different volumes of usage in a period
     *
     * @return volume
     */
    @ApiModelProperty(value = "Volume in kWh that this rate applies to.  Only applicable for ‘stepped’ rates where different rates apply for different volumes of usage in a period")

    @Valid

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnergyPlanContractSingleRateRates energyPlanContractSingleRateRates = (EnergyPlanContractSingleRateRates) o;
        return Objects.equals(this.unitPrice, energyPlanContractSingleRateRates.unitPrice) &&
                Objects.equals(this.measureUnit, energyPlanContractSingleRateRates.measureUnit) &&
                Objects.equals(this.volume, energyPlanContractSingleRateRates.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitPrice, measureUnit, volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnergyPlanContractSingleRateRates {\n");

        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
        sb.append("    measureUnit: ").append(toIndentedString(measureUnit)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

