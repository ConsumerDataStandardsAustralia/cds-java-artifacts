/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.List;
import java.util.Objects;

public class ResponseBankingTransactionListData {

    private List<BankingTransaction> transactions;

    /**
     * Get transactions
     * @return transactions
     */
    public List<BankingTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<BankingTransaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseBankingTransactionListData responseBankingTransactionListData = (ResponseBankingTransactionListData) o;
        return Objects.equals(this.transactions, responseBankingTransactionListData.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            transactions);
    }

    @Override
    public String toString() {
        return "class ResponseBankingTransactionListData {\n" +
            "   transactions: " + toIndentedString(transactions) + "\n" + 
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
