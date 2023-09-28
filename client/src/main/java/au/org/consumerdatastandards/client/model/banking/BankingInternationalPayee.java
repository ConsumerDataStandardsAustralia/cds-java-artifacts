/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingInternationalPayee {

    private BankingInternationalPayeeBeneficiaryDetails beneficiaryDetails;

    private BankingInternationalPayeeBankDetails bankDetails;

    /**
     * Get beneficiaryDetails
     * @return beneficiaryDetails
     */
    public BankingInternationalPayeeBeneficiaryDetails getBeneficiaryDetails() {
        return beneficiaryDetails;
    }

    public void setBeneficiaryDetails(BankingInternationalPayeeBeneficiaryDetails beneficiaryDetails) {
        this.beneficiaryDetails = beneficiaryDetails;
    }

    /**
     * Get bankDetails
     * @return bankDetails
     */
    public BankingInternationalPayeeBankDetails getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(BankingInternationalPayeeBankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingInternationalPayee bankingInternationalPayee = (BankingInternationalPayee) o;
        return Objects.equals(this.beneficiaryDetails, bankingInternationalPayee.beneficiaryDetails) &&
            Objects.equals(this.bankDetails, bankingInternationalPayee.bankDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            beneficiaryDetails,
            bankDetails);
    }

    @Override
    public String toString() {
        return "class BankingInternationalPayee {\n" +
            "   beneficiaryDetails: " + toIndentedString(beneficiaryDetails) + "\n" + 
            "   bankDetails: " + toIndentedString(bankDetails) + "\n" + 
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
