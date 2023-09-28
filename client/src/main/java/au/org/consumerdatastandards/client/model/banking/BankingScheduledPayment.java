/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.List;
import java.util.Objects;

public class BankingScheduledPayment<T extends BankingScheduledPaymentTo> {

    public enum Status {
        ACTIVE,
        INACTIVE,
        SKIP
    }

    private String scheduledPaymentId;

    private String nickname;

    private String payerReference;

    private String payeeReference;

    private Status status;

    private BankingScheduledPaymentFrom from;

    private List<BankingScheduledPaymentSet<T>> paymentSet;

    private BankingScheduledPaymentRecurrence recurrence;

    /**
     * A unique ID of the scheduled payment adhering to the standards for ID permanence
     * @return scheduledPaymentId
     */
    public String getScheduledPaymentId() {
        return scheduledPaymentId;
    }

    public void setScheduledPaymentId(String scheduledPaymentId) {
        this.scheduledPaymentId = scheduledPaymentId;
    }

    /**
     * The short display name of the scheduled payment as provided by the customer if provided. Where a customer has not provided a nickname, a display name derived by the bank for the scheduled payment should be provided that is consistent with existing digital banking channels
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * The reference for the transaction that will be used by the originating institution for the purposes of constructing a statement narrative on the payer’s account. Empty string if no data provided
     * @return payerReference
     */
    public String getPayerReference() {
        return payerReference;
    }

    public void setPayerReference(String payerReference) {
        this.payerReference = payerReference;
    }

    /**
     * The reference for the transaction, if applicable, that will be provided by the originating institution for all payments in the payment set. Empty string if no data provided
     * @return payeeReference
     */
    public String getPayeeReference() {
        return payeeReference;
    }

    public void setPayeeReference(String payeeReference) {
        this.payeeReference = payeeReference;
    }

    /**
     * Indicates whether the schedule is currently active. The value SKIP is equivalent to ACTIVE except that the customer has requested the next normal occurrence to be skipped.
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Get from
     * @return from
     */
    public BankingScheduledPaymentFrom getFrom() {
        return from;
    }

    public void setFrom(BankingScheduledPaymentFrom from) {
        this.from = from;
    }

    /**
     * Get paymentSet
     * @return paymentSet
     */
    public List<BankingScheduledPaymentSet<T>> getPaymentSet() {
        return paymentSet;
    }

    public void setPaymentSet(List<BankingScheduledPaymentSet<T>> paymentSet) {
        this.paymentSet = paymentSet;
    }

    /**
     * Get recurrence
     * @return recurrence
     */
    public BankingScheduledPaymentRecurrence getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(BankingScheduledPaymentRecurrence recurrence) {
        this.recurrence = recurrence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingScheduledPayment bankingScheduledPayment = (BankingScheduledPayment) o;
        return Objects.equals(this.scheduledPaymentId, bankingScheduledPayment.scheduledPaymentId) &&
            Objects.equals(this.nickname, bankingScheduledPayment.nickname) &&
            Objects.equals(this.payerReference, bankingScheduledPayment.payerReference) &&
            Objects.equals(this.payeeReference, bankingScheduledPayment.payeeReference) &&
            Objects.equals(this.status, bankingScheduledPayment.status) &&
            Objects.equals(this.from, bankingScheduledPayment.from) &&
            Objects.equals(this.paymentSet, bankingScheduledPayment.paymentSet) &&
            Objects.equals(this.recurrence, bankingScheduledPayment.recurrence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            scheduledPaymentId,
            nickname,
            payerReference,
            payeeReference,
            status,
            from,
            paymentSet,
            recurrence);
    }

    @Override
    public String toString() {
        return "class BankingScheduledPayment {\n" +
            "   scheduledPaymentId: " + toIndentedString(scheduledPaymentId) + "\n" + 
            "   nickname: " + toIndentedString(nickname) + "\n" + 
            "   payerReference: " + toIndentedString(payerReference) + "\n" + 
            "   payeeReference: " + toIndentedString(payeeReference) + "\n" + 
            "   status: " + toIndentedString(status) + "\n" + 
            "   from: " + toIndentedString(from) + "\n" + 
            "   paymentSet: " + toIndentedString(paymentSet) + "\n" + 
            "   recurrence: " + toIndentedString(recurrence) + "\n" + 
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
