/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.time.LocalDate;
import java.util.Objects;
/**
 * Object containing the detail of the schedule for the payment
 */
public class BankingScheduledPaymentRecurrence {

    public enum RecurrenceUType {
        onceOff,
        intervalSchedule,
        lastWeekDay,
        eventBased
    }

    private LocalDate nextPaymentDate;

    private RecurrenceUType recurrenceUType;

    private BankingScheduledPaymentRecurrenceOnceOff onceOff;

    private BankingScheduledPaymentRecurrenceIntervalSchedule intervalSchedule;

    private BankingScheduledPaymentRecurrenceLastWeekday lastWeekDay;

    private BankingScheduledPaymentRecurrenceEventBased eventBased;

    /**
     * The date of the next payment under the recurrence schedule
     * @return nextPaymentDate
     */
    public LocalDate getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(LocalDate nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    /**
     * The type of recurrence used to define the schedule
     * @return recurrenceUType
     */
    public RecurrenceUType getRecurrenceUType() {
        return recurrenceUType;
    }

    public void setRecurrenceUType(RecurrenceUType recurrenceUType) {
        this.recurrenceUType = recurrenceUType;
    }

    /**
     * Get onceOff
     * @return onceOff
     */
    public BankingScheduledPaymentRecurrenceOnceOff getOnceOff() {
        return onceOff;
    }

    public void setOnceOff(BankingScheduledPaymentRecurrenceOnceOff onceOff) {
        this.onceOff = onceOff;
    }

    /**
     * Get intervalSchedule
     * @return intervalSchedule
     */
    public BankingScheduledPaymentRecurrenceIntervalSchedule getIntervalSchedule() {
        return intervalSchedule;
    }

    public void setIntervalSchedule(BankingScheduledPaymentRecurrenceIntervalSchedule intervalSchedule) {
        this.intervalSchedule = intervalSchedule;
    }

    /**
     * Get lastWeekDay
     * @return lastWeekDay
     */
    public BankingScheduledPaymentRecurrenceLastWeekday getLastWeekDay() {
        return lastWeekDay;
    }

    public void setLastWeekDay(BankingScheduledPaymentRecurrenceLastWeekday lastWeekDay) {
        this.lastWeekDay = lastWeekDay;
    }

    /**
     * Get eventBased
     * @return eventBased
     */
    public BankingScheduledPaymentRecurrenceEventBased getEventBased() {
        return eventBased;
    }

    public void setEventBased(BankingScheduledPaymentRecurrenceEventBased eventBased) {
        this.eventBased = eventBased;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingScheduledPaymentRecurrence bankingScheduledPaymentRecurrence = (BankingScheduledPaymentRecurrence) o;
        return Objects.equals(this.nextPaymentDate, bankingScheduledPaymentRecurrence.nextPaymentDate) &&
            Objects.equals(this.recurrenceUType, bankingScheduledPaymentRecurrence.recurrenceUType) &&
            Objects.equals(this.onceOff, bankingScheduledPaymentRecurrence.onceOff) &&
            Objects.equals(this.intervalSchedule, bankingScheduledPaymentRecurrence.intervalSchedule) &&
            Objects.equals(this.lastWeekDay, bankingScheduledPaymentRecurrence.lastWeekDay) &&
            Objects.equals(this.eventBased, bankingScheduledPaymentRecurrence.eventBased);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            nextPaymentDate,
            recurrenceUType,
            onceOff,
            intervalSchedule,
            lastWeekDay,
            eventBased);
    }

    @Override
    public String toString() {
        return "class BankingScheduledPaymentRecurrence {\n" +
            "   nextPaymentDate: " + toIndentedString(nextPaymentDate) + "\n" +
            "   recurrenceUType: " + toIndentedString(recurrenceUType) + "\n" +
            "   onceOff: " + toIndentedString(onceOff) + "\n" +
            "   intervalSchedule: " + toIndentedString(intervalSchedule) + "\n" +
            "   lastWeekDay: " + toIndentedString(lastWeekDay) + "\n" +
            "   eventBased: " + toIndentedString(eventBased) + "\n" +
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
