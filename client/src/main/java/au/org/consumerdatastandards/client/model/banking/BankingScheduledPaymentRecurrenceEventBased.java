/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;
/**
 * Indicates that the schedule of payments is defined according to an external event that cannot be predetermined. Mandatory if recurrenceUType is set to eventBased
 */
public class BankingScheduledPaymentRecurrenceEventBased {

    private String description;

    /**
     * Description of the event and conditions that will result in the payment. Expected to be formatted for display to a customer
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
        BankingScheduledPaymentRecurrenceEventBased bankingScheduledPaymentRecurrenceEventBased = (BankingScheduledPaymentRecurrenceEventBased) o;
        return Objects.equals(this.description, bankingScheduledPaymentRecurrenceEventBased.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            description);
    }

    @Override
    public String toString() {
        return "class BankingScheduledPaymentRecurrenceEventBased {\n" +
            "   description: " + toIndentedString(description) + "\n" + 
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
