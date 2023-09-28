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
 * Indicates that the schedule of payments is defined according to the last occurrence of a specific weekday in an interval. Mandatory if recurrenceUType is set to lastWeekDay
 */
public class BankingScheduledPaymentRecurrenceLastWeekday {

    public enum LastWeekDay {
        MON,
        TUE,
        WED,
        THU,
        FRI,
        SAT,
        SUN
    }

    public enum NonBusinessDayTreatment {
        AFTER,
        BEFORE,
        ON,
        ONLY
    }

    private LocalDate finalPaymentDate;

    private Integer paymentsRemaining;

    private String interval;

    private LastWeekDay lastWeekDay;

    private NonBusinessDayTreatment nonBusinessDayTreatment = NonBusinessDayTreatment.ON;

    /**
     * The limit date after which no more payments should be made using this schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely
     * @return finalPaymentDate
     */
    public LocalDate getFinalPaymentDate() {
        return finalPaymentDate;
    }

    public void setFinalPaymentDate(LocalDate finalPaymentDate) {
        this.finalPaymentDate = finalPaymentDate;
    }

    /**
     * Indicates the number of payments remaining in the schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely
     * @return paymentsRemaining
     */
    public Integer getPaymentsRemaining() {
        return paymentsRemaining;
    }

    public void setPaymentsRemaining(Integer paymentsRemaining) {
        this.paymentsRemaining = paymentsRemaining;
    }

    /**
     * The interval for the payment. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax) with components less than a day in length ignored. This duration defines the period between payments starting with nextPaymentDate
     * @return interval
     */
    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * The weekDay specified. The payment will occur on the last occurrence of this weekday in the interval.
     * @return lastWeekDay
     */
    public LastWeekDay getLastWeekDay() {
        return lastWeekDay;
    }

    public void setLastWeekDay(LastWeekDay lastWeekDay) {
        this.lastWeekDay = lastWeekDay;
    }

    /**
     * Enumerated field giving the treatment where a scheduled payment date is not a business day. If absent assumed to be ON.<br>**AFTER** - If a scheduled payment date is a non-business day the payment will be made on the first business day after the scheduled payment date.<br>**BEFORE** - If a scheduled payment date is a non-business day the payment will be made on the first business day before the scheduled payment date.<br>**ON** - If a scheduled payment date is a non-business day the payment will be made on that day regardless.<br>**ONLY** - Payments only occur on business days. If a scheduled payment date is a non-business day the payment will be ignored
     * @return nonBusinessDayTreatment
     */
    public NonBusinessDayTreatment getNonBusinessDayTreatment() {
        return nonBusinessDayTreatment;
    }

    public void setNonBusinessDayTreatment(NonBusinessDayTreatment nonBusinessDayTreatment) {
        this.nonBusinessDayTreatment = nonBusinessDayTreatment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingScheduledPaymentRecurrenceLastWeekday bankingScheduledPaymentRecurrenceLastWeekday = (BankingScheduledPaymentRecurrenceLastWeekday) o;
        return Objects.equals(this.finalPaymentDate, bankingScheduledPaymentRecurrenceLastWeekday.finalPaymentDate) &&
            Objects.equals(this.paymentsRemaining, bankingScheduledPaymentRecurrenceLastWeekday.paymentsRemaining) &&
            Objects.equals(this.interval, bankingScheduledPaymentRecurrenceLastWeekday.interval) &&
            Objects.equals(this.lastWeekDay, bankingScheduledPaymentRecurrenceLastWeekday.lastWeekDay) &&
            Objects.equals(this.nonBusinessDayTreatment, bankingScheduledPaymentRecurrenceLastWeekday.nonBusinessDayTreatment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            finalPaymentDate,
            paymentsRemaining,
            interval,
            lastWeekDay,
            nonBusinessDayTreatment);
    }

    @Override
    public String toString() {
        return "class BankingScheduledPaymentRecurrenceLastWeekday {\n" +
            "   finalPaymentDate: " + toIndentedString(finalPaymentDate) + "\n" + 
            "   paymentsRemaining: " + toIndentedString(paymentsRemaining) + "\n" + 
            "   interval: " + toIndentedString(interval) + "\n" + 
            "   lastWeekDay: " + toIndentedString(lastWeekDay) + "\n" + 
            "   nonBusinessDayTreatment: " + toIndentedString(nonBusinessDayTreatment) + "\n" + 
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
