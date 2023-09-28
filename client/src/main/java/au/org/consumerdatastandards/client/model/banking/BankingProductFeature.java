/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingProductFeature {

    public enum FeatureType {
        ADDITIONAL_CARDS,
        BALANCE_TRANSFERS,
        BILL_PAYMENT,
        BONUS_REWARDS,
        CARD_ACCESS,
        CASHBACK_OFFER,
        COMPLEMENTARY_PRODUCT_DISCOUNTS,
        DIGITAL_BANKING,
        DIGITAL_WALLET,
        DONATE_INTEREST,
        EXTRA_REPAYMENTS,
        FRAUD_PROTECTION,
        FREE_TXNS,
        FREE_TXNS_ALLOWANCE,
        GUARANTOR,
        INSURANCE,
        INSTALMENT_PLAN,
        INTEREST_FREE,
        INTEREST_FREE_TRANSFERS,
        LOYALTY_PROGRAM,
        NOTIFICATIONS,
        NPP_ENABLED,
        NPP_PAYID,
        OFFSET,
        OTHER,
        OVERDRAFT,
        REDRAW,
        RELATIONSHIP_MANAGEMENT,
        UNLIMITED_TXNS
    }

    private FeatureType featureType;

    private String additionalValue;

    private String additionalInfo;

    private String additionalInfoUri;

    /**
     * The type of feature described
     * @return featureType
     */
    public FeatureType getFeatureType() {
        return featureType;
    }

    public void setFeatureType(FeatureType featureType) {
        this.featureType = featureType;
    }

    /**
     * Generic field containing additional information relevant to the [featureType](#tocSproductfeaturetypedoc) specified. Whether mandatory or not is dependent on the value of the [featureType.](#tocSproductfeaturetypedoc)
     * @return additionalValue
     */
    public String getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
    }

    /**
     * Display text providing more information on the feature. Mandatory if the [feature type](#tocSproductfeaturetypedoc) is set to OTHER
     * @return additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * Link to a web page with more information on this feature
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
        BankingProductFeature bankingProductFeature = (BankingProductFeature) o;
        return Objects.equals(this.featureType, bankingProductFeature.featureType) &&
            Objects.equals(this.additionalValue, bankingProductFeature.additionalValue) &&
            Objects.equals(this.additionalInfo, bankingProductFeature.additionalInfo) &&
            Objects.equals(this.additionalInfoUri, bankingProductFeature.additionalInfoUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            featureType,
            additionalValue,
            additionalInfo,
            additionalInfoUri);
    }

    @Override
    public String toString() {
        return "class BankingProductFeature {\n" +
            "   featureType: " + toIndentedString(featureType) + "\n" + 
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
