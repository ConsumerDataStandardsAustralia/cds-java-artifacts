package au.org.consumerdatastandards.client.model.energy;

import java.util.Objects;

/**
 * EnergyPaymentSchedule
 */
public class EnergyPaymentSchedule {
    private String amount;

    /**
     * The type of object present in this response
     */
    public enum PaymentScheduleUTypeEnum {
        CARDDEBIT,
        DIRECTDEBIT,
        MANUALPAYMENT
    }

    private PaymentScheduleUTypeEnum paymentScheduleUType;

    private EnergyPaymentScheduleCardDebit cardDebit;

    private EnergyPaymentScheduleDirectDebit directDebit;

    private EnergyPaymentScheduleManualPayment manualPayment;

    public EnergyPaymentSchedule amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Optional payment amount indicating that a constant payment amount is scheduled to be paid (used in bill smooting scenarios)
     *
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public EnergyPaymentSchedule paymentScheduleUType(PaymentScheduleUTypeEnum paymentScheduleUType) {
        this.paymentScheduleUType = paymentScheduleUType;
        return this;
    }

    /**
     * The type of object present in this response
     *
     * @return paymentScheduleUType
     */
    public PaymentScheduleUTypeEnum getPaymentScheduleUType() {
        return paymentScheduleUType;
    }

    public void setPaymentScheduleUType(PaymentScheduleUTypeEnum paymentScheduleUType) {
        this.paymentScheduleUType = paymentScheduleUType;
    }

    public EnergyPaymentSchedule cardDebit(EnergyPaymentScheduleCardDebit cardDebit) {
        this.cardDebit = cardDebit;
        return this;
    }

    /**
     * Get cardDebit
     *
     * @return cardDebit
     */
    public EnergyPaymentScheduleCardDebit getCardDebit() {
        return cardDebit;
    }

    public void setCardDebit(EnergyPaymentScheduleCardDebit cardDebit) {
        this.cardDebit = cardDebit;
    }

    public EnergyPaymentSchedule directDebit(EnergyPaymentScheduleDirectDebit directDebit) {
        this.directDebit = directDebit;
        return this;
    }

    /**
     * Get directDebit
     *
     * @return directDebit
     */
    public EnergyPaymentScheduleDirectDebit getDirectDebit() {
        return directDebit;
    }

    public void setDirectDebit(EnergyPaymentScheduleDirectDebit directDebit) {
        this.directDebit = directDebit;
    }

    public EnergyPaymentSchedule manualPayment(EnergyPaymentScheduleManualPayment manualPayment) {
        this.manualPayment = manualPayment;
        return this;
    }

    /**
     * Get manualPayment
     *
     * @return manualPayment
     */
    public EnergyPaymentScheduleManualPayment getManualPayment() {
        return manualPayment;
    }

    public void setManualPayment(EnergyPaymentScheduleManualPayment manualPayment) {
        this.manualPayment = manualPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnergyPaymentSchedule energyPaymentSchedule = (EnergyPaymentSchedule) o;
        return Objects.equals(this.amount, energyPaymentSchedule.amount) &&
                Objects.equals(this.paymentScheduleUType, energyPaymentSchedule.paymentScheduleUType) &&
                Objects.equals(this.cardDebit, energyPaymentSchedule.cardDebit) &&
                Objects.equals(this.directDebit, energyPaymentSchedule.directDebit) &&
                Objects.equals(this.manualPayment, energyPaymentSchedule.manualPayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, paymentScheduleUType, cardDebit, directDebit, manualPayment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnergyPaymentSchedule {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    paymentScheduleUType: ").append(toIndentedString(paymentScheduleUType)).append("\n");
        sb.append("    cardDebit: ").append(toIndentedString(cardDebit)).append("\n");
        sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
        sb.append("    manualPayment: ").append(toIndentedString(manualPayment)).append("\n");
        sb.append("}");
        return sb.toString();
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
