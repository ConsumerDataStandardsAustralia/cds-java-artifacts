/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.time.OffsetDateTime;
import java.util.Objects;

public class BankingTransaction {

    public enum Type {
        DIRECT_DEBIT,
        FEE,
        INTEREST_CHARGED,
        INTEREST_PAID,
        PAYMENT,
        TRANSFER_OUTGOING,
        TRANSFER_INCOMING,
        OTHER
    }

    public enum Status {
        PENDING,
        POSTED
    }

    private String accountId;

    private String transactionId;

    private Boolean isDetailAvailable;

    private Type type;

    private Status status;

    private String description;

    private OffsetDateTime postingDateTime;

    private OffsetDateTime valueDateTime;

    private OffsetDateTime executionDateTime;

    private String amount;

    private String currency;

    private String reference;

    private String merchantName;

    private String merchantCategoryCode;

    private String billerCode;

    private String billerName;

    private String crn;

    private String apcaNumber;

    /**
     * ID of the account for which transactions are provided
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * A unique ID of the transaction adhering to the standards for ID permanence.  This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * True if extended information is available using the transaction detail end point. False if extended data is not available
     * @return isDetailAvailable
     */
    public Boolean getIsDetailAvailable() {
        return isDetailAvailable;
    }

    public void setIsDetailAvailable(Boolean isDetailAvailable) {
        this.isDetailAvailable = isDetailAvailable;
    }

    /**
     * The type of the transaction
     * @return type
     */
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Status of the transaction whether pending or posted. Note that there is currently no provision in the standards to guarantee the ability to correlate a pending transaction with an associated posted transaction
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The transaction description as applied by the financial institution
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The time the transaction was posted. This field is Mandatory if the transaction has status POSTED.  This is the time that appears on a standard statement
     * @return postingDateTime
     */
    public OffsetDateTime getPostingDateTime() {
        return postingDateTime;
    }

    public void setPostingDateTime(OffsetDateTime postingDateTime) {
        this.postingDateTime = postingDateTime;
    }

    /**
     * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry
     * @return valueDateTime
     */
    public OffsetDateTime getValueDateTime() {
        return valueDateTime;
    }

    public void setValueDateTime(OffsetDateTime valueDateTime) {
        this.valueDateTime = valueDateTime;
    }

    /**
     * The time the transaction was executed by the originating customer, if available
     * @return executionDateTime
     */
    public OffsetDateTime getExecutionDateTime() {
        return executionDateTime;
    }

    public void setExecutionDateTime(OffsetDateTime executionDateTime) {
        this.executionDateTime = executionDateTime;
    }

    /**
     * The value of the transaction. Negative values mean money was outgoing from the account
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * The currency for the transaction amount. AUD assumed if not present
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * The reference for the transaction provided by the originating institution. Empty string if no data provided
     * @return reference
     */
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Name of the merchant for an outgoing payment to a merchant
     * @return merchantName
     */
    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    /**
     * The merchant category code (or MCC) for an outgoing payment to a merchant
     * @return merchantCategoryCode
     */
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    /**
     * BPAY Biller Code for the transaction (if available)
     * @return billerCode
     */
    public String getBillerCode() {
        return billerCode;
    }

    public void setBillerCode(String billerCode) {
        this.billerCode = billerCode;
    }

    /**
     * Name of the BPAY biller for the transaction (if available)
     * @return billerName
     */
    public String getBillerName() {
        return billerName;
    }

    public void setBillerName(String billerName) {
        this.billerName = billerName;
    }

    /**
     * BPAY CRN for the transaction (if available).<br>Where the CRN contains sensitive information, it should be masked in line with how the Data Holder currently displays account identifiers in their existing online banking channels. If the contents of the CRN match the format of a Credit Card PAN they should be masked according to the rules applicable for MaskedPANString. If the contents are otherwise sensitive, then it should be masked using the rules applicable for the MaskedAccountString common type.
     * @return crn
     */
    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    /**
     * 6 Digit APCA number for the initiating institution
     * @return apcaNumber
     */
    public String getApcaNumber() {
        return apcaNumber;
    }

    public void setApcaNumber(String apcaNumber) {
        this.apcaNumber = apcaNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingTransaction bankingTransaction = (BankingTransaction) o;
        return Objects.equals(this.accountId, bankingTransaction.accountId) &&
            Objects.equals(this.transactionId, bankingTransaction.transactionId) &&
            Objects.equals(this.isDetailAvailable, bankingTransaction.isDetailAvailable) &&
            Objects.equals(this.type, bankingTransaction.type) &&
            Objects.equals(this.status, bankingTransaction.status) &&
            Objects.equals(this.description, bankingTransaction.description) &&
            Objects.equals(this.postingDateTime, bankingTransaction.postingDateTime) &&
            Objects.equals(this.valueDateTime, bankingTransaction.valueDateTime) &&
            Objects.equals(this.executionDateTime, bankingTransaction.executionDateTime) &&
            Objects.equals(this.amount, bankingTransaction.amount) &&
            Objects.equals(this.currency, bankingTransaction.currency) &&
            Objects.equals(this.reference, bankingTransaction.reference) &&
            Objects.equals(this.merchantName, bankingTransaction.merchantName) &&
            Objects.equals(this.merchantCategoryCode, bankingTransaction.merchantCategoryCode) &&
            Objects.equals(this.billerCode, bankingTransaction.billerCode) &&
            Objects.equals(this.billerName, bankingTransaction.billerName) &&
            Objects.equals(this.crn, bankingTransaction.crn) &&
            Objects.equals(this.apcaNumber, bankingTransaction.apcaNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            transactionId,
            isDetailAvailable,
            type,
            status,
            description,
            postingDateTime,
            valueDateTime,
            executionDateTime,
            amount,
            currency,
            reference,
            merchantName,
            merchantCategoryCode,
            billerCode,
            billerName,
            crn,
            apcaNumber);
    }

    @Override
    public String toString() {
        return "class BankingTransaction {\n" +
            "   accountId: " + toIndentedString(accountId) + "\n" + 
            "   transactionId: " + toIndentedString(transactionId) + "\n" + 
            "   isDetailAvailable: " + toIndentedString(isDetailAvailable) + "\n" + 
            "   type: " + toIndentedString(type) + "\n" + 
            "   status: " + toIndentedString(status) + "\n" + 
            "   description: " + toIndentedString(description) + "\n" + 
            "   postingDateTime: " + toIndentedString(postingDateTime) + "\n" + 
            "   valueDateTime: " + toIndentedString(valueDateTime) + "\n" + 
            "   executionDateTime: " + toIndentedString(executionDateTime) + "\n" + 
            "   amount: " + toIndentedString(amount) + "\n" + 
            "   currency: " + toIndentedString(currency) + "\n" + 
            "   reference: " + toIndentedString(reference) + "\n" + 
            "   merchantName: " + toIndentedString(merchantName) + "\n" + 
            "   merchantCategoryCode: " + toIndentedString(merchantCategoryCode) + "\n" + 
            "   billerCode: " + toIndentedString(billerCode) + "\n" + 
            "   billerName: " + toIndentedString(billerName) + "\n" + 
            "   crn: " + toIndentedString(crn) + "\n" + 
            "   apcaNumber: " + toIndentedString(apcaNumber) + "\n" + 
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
