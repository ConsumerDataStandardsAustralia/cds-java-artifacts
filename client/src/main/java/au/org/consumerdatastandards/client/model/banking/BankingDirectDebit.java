/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.time.OffsetDateTime;
import java.util.Objects;

public class BankingDirectDebit {

    private String accountId;

    private BankingAuthorisedEntity authorisedEntity;

    private OffsetDateTime lastDebitDateTime;

    private String lastDebitAmount;

    /**
     * A unique ID of the account adhering to the standards for ID permanence.
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Get authorisedEntity
     * @return authorisedEntity
     */
    public BankingAuthorisedEntity getAuthorisedEntity() {
        return authorisedEntity;
    }

    public void setAuthorisedEntity(BankingAuthorisedEntity authorisedEntity) {
        this.authorisedEntity = authorisedEntity;
    }

    /**
     * The date and time of the last debit executed under this authorisation
     * @return lastDebitDateTime
     */
    public OffsetDateTime getLastDebitDateTime() {
        return lastDebitDateTime;
    }

    public void setLastDebitDateTime(OffsetDateTime lastDebitDateTime) {
        this.lastDebitDateTime = lastDebitDateTime;
    }

    /**
     * The amount of the last debit executed under this authorisation
     * @return lastDebitAmount
     */
    public String getLastDebitAmount() {
        return lastDebitAmount;
    }

    public void setLastDebitAmount(String lastDebitAmount) {
        this.lastDebitAmount = lastDebitAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingDirectDebit bankingDirectDebit = (BankingDirectDebit) o;
        return Objects.equals(this.accountId, bankingDirectDebit.accountId) &&
            Objects.equals(this.authorisedEntity, bankingDirectDebit.authorisedEntity) &&
            Objects.equals(this.lastDebitDateTime, bankingDirectDebit.lastDebitDateTime) &&
            Objects.equals(this.lastDebitAmount, bankingDirectDebit.lastDebitAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            authorisedEntity,
            lastDebitDateTime,
            lastDebitAmount);
    }

    @Override
    public String toString() {
        return "class BankingDirectDebit {\n" +
            "   accountId: " + toIndentedString(accountId) + "\n" + 
            "   authorisedEntity: " + toIndentedString(authorisedEntity) + "\n" + 
            "   lastDebitDateTime: " + toIndentedString(lastDebitDateTime) + "\n" + 
            "   lastDebitAmount: " + toIndentedString(lastDebitAmount) + "\n" + 
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
