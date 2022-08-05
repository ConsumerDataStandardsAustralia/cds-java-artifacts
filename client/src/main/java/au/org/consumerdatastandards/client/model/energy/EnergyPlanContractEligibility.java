package au.org.consumerdatastandards.client.model.energy;

import java.util.Objects;

/**
 * EnergyPlanContractEligibility
 */
public class EnergyPlanContractEligibility {
    /**
     * The type of the eligibility restriction.<br>The CONTINGENT_PLAN value indicates that the plan is contingent on the customer taking up an alternate fuel plan from the same retailer (for instance, if the fuelType is ELECTRICITY then a GAS plan from the same retailer must be taken up)
     */
    public enum TypeEnum {
        EXISTING_CUST,
        EXISTING_POOL,
        EXISTING_SOLAR,
        EXISTING_BATTERY,
        EXISTING_SMART_METER,
        EXISTING_BASIC_METER,
        SENIOR_CARD,
        SMALL_BUSINESS,
        NO_SOLAR_FIT,
        NEW_CUSTOMER,
        ONLINE_ONLY,
        REQ_EQUIP_SUPPLIER,
        THIRD_PARTY_ONLY,
        SPORT_CLUB_MEMBER,
        ORG_MEMBER,
        SPECIFIC_LOCATION,
        MINIMUM_USAGE,
        LOYALTY_MEMBER,
        GROUP_BUY_MEMBER,
        CONTINGENT_PLAN,
        OTHER
    }

    private TypeEnum type;

    private String information;

    private String description;

    public EnergyPlanContractEligibility type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the eligibility restriction.<br>The CONTINGENT_PLAN value indicates that the plan is contingent on the customer taking up an alternate fuel plan from the same retailer (for instance, if the fuelType is ELECTRICITY then a GAS plan from the same retailer must be taken up)
     *
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public EnergyPlanContractEligibility information(String information) {
        this.information = information;
        return this;
    }

    /**
     * Information of the eligibility restriction specific to the type of the restriction
     *
     * @return information
     */
    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public EnergyPlanContractEligibility description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A description of the eligibility restriction
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnergyPlanContractEligibility energyPlanContractEligibility = (EnergyPlanContractEligibility) o;
        return Objects.equals(this.type, energyPlanContractEligibility.type) &&
                Objects.equals(this.information, energyPlanContractEligibility.information) &&
                Objects.equals(this.description, energyPlanContractEligibility.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, information, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnergyPlanContractEligibility {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    information: ").append(toIndentedString(information)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
