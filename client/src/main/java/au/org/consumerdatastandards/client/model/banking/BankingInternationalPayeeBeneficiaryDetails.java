/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingInternationalPayeeBeneficiaryDetails {

    private String name;

    private String country;

    private String message;

    /**
     * Name of the beneficiary
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Country where the beneficiary resides. A valid [ISO 3166 Alpha-3](https://www.iso.org/iso-3166-country-codes.html) country code
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Response message for the payment
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingInternationalPayeeBeneficiaryDetails bankingInternationalPayeeBeneficiaryDetails = (BankingInternationalPayeeBeneficiaryDetails) o;
        return Objects.equals(this.name, bankingInternationalPayeeBeneficiaryDetails.name) &&
            Objects.equals(this.country, bankingInternationalPayeeBeneficiaryDetails.country) &&
            Objects.equals(this.message, bankingInternationalPayeeBeneficiaryDetails.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            country,
            message);
    }

    @Override
    public String toString() {
        return "class BankingInternationalPayeeBeneficiaryDetails {\n" +
            "   name: " + toIndentedString(name) + "\n" + 
            "   country: " + toIndentedString(country) + "\n" + 
            "   message: " + toIndentedString(message) + "\n" + 
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
