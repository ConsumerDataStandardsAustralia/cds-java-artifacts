/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.List;
import java.util.Objects;

public class BankingProductDepositRate<T extends BankingProductRateTier> {

    public enum DepositRateType {
        BONUS,
        BUNDLE_BONUS,
        FIXED,
        FLOATING,
        INTRODUCTORY,
        MARKET_LINKED,
        VARIABLE
    }

    private DepositRateType depositRateType;

    private String rate;

    private String calculationFrequency;

    private String applicationFrequency;

    private List<T> tiers;

    private String additionalValue;

    private String additionalInfo;

    private String additionalInfoUri;

    /**
     * The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning
     * @return depositRateType
     */
    public DepositRateType getDepositRateType() {
        return depositRateType;
    }

    public void setDepositRateType(DepositRateType depositRateType) {
        this.depositRateType = depositRateType;
    }

    /**
     * The rate to be applied
     * @return rate
     */
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    /**
     * The period after which the rate is applied to the balance to calculate the amount due for the period. Calculation of the amount is often daily (as balances may change) but accumulated until the total amount is 'applied' to the account (see applicationFrequency). Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
     * @return calculationFrequency
     */
    public String getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(String calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    /**
     * The period after which the calculated amount(s) (see calculationFrequency) are 'applied' (i.e. debited or credited) to the account. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
     * @return applicationFrequency
     */
    public String getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(String applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    /**
     * Rate tiers applicable for this rate
     * @return tiers
     */
    public List<T> getTiers() {
        return tiers;
    }

    public void setTiers(List<T> tiers) {
        this.tiers = tiers;
    }

    /**
     * Generic field containing additional information relevant to the [depositRateType](#tocSproductdepositratetypedoc) specified. Whether mandatory or not is dependent on the value of [depositRateType](#tocSproductdepositratetypedoc)
     * @return additionalValue
     */
    public String getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
    }

    /**
     * Display text providing more information on the rate
     * @return additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * Link to a web page with more information on this rate
     * @return additionalInfoUri
     */
    public String getAdditionalInfoUri() {
        return additionalInfoUri;
    }

    public void setAdditionalInfoUri(String additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingProductDepositRate<T> bankingProductDepositRate = (BankingProductDepositRate<T>) o;
        return Objects.equals(this.depositRateType, bankingProductDepositRate.depositRateType) &&
            Objects.equals(this.rate, bankingProductDepositRate.rate) &&
            Objects.equals(this.calculationFrequency, bankingProductDepositRate.calculationFrequency) &&
            Objects.equals(this.applicationFrequency, bankingProductDepositRate.applicationFrequency) &&
            Objects.equals(this.tiers, bankingProductDepositRate.tiers) &&
            Objects.equals(this.additionalValue, bankingProductDepositRate.additionalValue) &&
            Objects.equals(this.additionalInfo, bankingProductDepositRate.additionalInfo) &&
            Objects.equals(this.additionalInfoUri, bankingProductDepositRate.additionalInfoUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            depositRateType,
            rate,
            calculationFrequency,
            applicationFrequency,
            tiers,
            additionalValue,
            additionalInfo,
            additionalInfoUri);
    }

    @Override
    public String toString() {
        return "class BankingProductDepositRate {\n" +
            "   depositRateType: " + toIndentedString(depositRateType) + "\n" + 
            "   rate: " + toIndentedString(rate) + "\n" + 
            "   calculationFrequency: " + toIndentedString(calculationFrequency) + "\n" + 
            "   applicationFrequency: " + toIndentedString(applicationFrequency) + "\n" + 
            "   tiers: " + toIndentedString(tiers) + "\n" + 
            "   additionalValue: " + toIndentedString(additionalValue) + "\n" + 
            "   additionalInfo: " + toIndentedString(additionalInfo) + "\n" + 
            "   additionalInfoUri: " + toIndentedString(additionalInfoUri) + "\n" + 
            "}";
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
