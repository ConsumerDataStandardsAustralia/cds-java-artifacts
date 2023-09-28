/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingTransactionDetail extends BankingTransaction {

    private BankingTransactionDetailExtendedData extendedData;

    /**
     * Get extendedData
     * @return extendedData
     */
    public BankingTransactionDetailExtendedData getExtendedData() {
        return extendedData;
    }

    public void setExtendedData(BankingTransactionDetailExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingTransactionDetail bankingTransactionDetail = (BankingTransactionDetail) o;
        return Objects.equals(this.extendedData, bankingTransactionDetail.extendedData) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            extendedData,
            super.hashCode());
    }

    @Override
    public String toString() {
        return "class BankingTransactionDetail {\n" +
            "   accountId: " + toIndentedString(getAccountId()) + "\n" + 
            "   transactionId: " + toIndentedString(getTransactionId()) + "\n" + 
            "   isDetailAvailable: " + toIndentedString(getIsDetailAvailable()) + "\n" + 
            "   type: " + toIndentedString(getType()) + "\n" + 
            "   status: " + toIndentedString(getStatus()) + "\n" + 
            "   description: " + toIndentedString(getDescription()) + "\n" + 
            "   postingDateTime: " + toIndentedString(getPostingDateTime()) + "\n" + 
            "   valueDateTime: " + toIndentedString(getValueDateTime()) + "\n" + 
            "   executionDateTime: " + toIndentedString(getExecutionDateTime()) + "\n" + 
            "   amount: " + toIndentedString(getAmount()) + "\n" + 
            "   currency: " + toIndentedString(getCurrency()) + "\n" + 
            "   reference: " + toIndentedString(getReference()) + "\n" + 
            "   merchantName: " + toIndentedString(getMerchantName()) + "\n" + 
            "   merchantCategoryCode: " + toIndentedString(getMerchantCategoryCode()) + "\n" + 
            "   billerCode: " + toIndentedString(getBillerCode()) + "\n" + 
            "   billerName: " + toIndentedString(getBillerName()) + "\n" + 
            "   crn: " + toIndentedString(getCrn()) + "\n" + 
            "   apcaNumber: " + toIndentedString(getApcaNumber()) + "\n" + 
            "   extendedData: " + toIndentedString(extendedData) + "\n" + 
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
