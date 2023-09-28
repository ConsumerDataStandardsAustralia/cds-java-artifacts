/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingPayeeDetail extends BankingPayee {

    public enum PayeeUType {
        biller,
        digitalWallet,
        domestic,
        international
    }

    private PayeeUType payeeUType;

    private BankingDomesticPayee domestic;

    private BankingBillerPayee biller;

    private BankingInternationalPayee international;

    private BankingDigitalWalletPayee digitalWallet;

    /**
     * Type of object included that describes the payee in detail
     * @return payeeUType
     */
    public PayeeUType getPayeeUType() {
        return payeeUType;
    }

    public void setPayeeUType(PayeeUType payeeUType) {
        this.payeeUType = payeeUType;
    }

    /**
     * Get domestic
     * @return domestic
     */
    public BankingDomesticPayee getDomestic() {
        return domestic;
    }

    public void setDomestic(BankingDomesticPayee domestic) {
        this.domestic = domestic;
    }

    /**
     * Get biller
     * @return biller
     */
    public BankingBillerPayee getBiller() {
        return biller;
    }

    public void setBiller(BankingBillerPayee biller) {
        this.biller = biller;
    }

    /**
     * Get international
     * @return international
     */
    public BankingInternationalPayee getInternational() {
        return international;
    }

    public void setInternational(BankingInternationalPayee international) {
        this.international = international;
    }

    public BankingDigitalWalletPayee getDigitalWallet() {
        return digitalWallet;
    }

    public void setDigitalWallet(BankingDigitalWalletPayee digitalWallet) {
        this.digitalWallet = digitalWallet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingPayeeDetail bankingPayeeDetail = (BankingPayeeDetail) o;
        return Objects.equals(this.payeeUType, bankingPayeeDetail.payeeUType) &&
            Objects.equals(this.domestic, bankingPayeeDetail.domestic) &&
            Objects.equals(this.biller, bankingPayeeDetail.biller) &&
            Objects.equals(this.international, bankingPayeeDetail.international) &&
            Objects.equals(this.digitalWallet, bankingPayeeDetail.digitalWallet) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            payeeUType,
            domestic,
            biller,
            international,
            digitalWallet,
            super.hashCode());
    }

    @Override
    public String toString() {
        return "class BankingPayeeDetail {\n" +
            "   payeeId: " + toIndentedString(getPayeeId()) + "\n" +
            "   nickname: " + toIndentedString(getNickname()) + "\n" +
            "   description: " + toIndentedString(getDescription()) + "\n" +
            "   type: " + toIndentedString(getType()) + "\n" +
            "   creationDate: " + toIndentedString(getCreationDate()) + "\n" +
            "   payeeUType: " + toIndentedString(payeeUType) + "\n" +
            "   domestic: " + toIndentedString(domestic) + "\n" +
            "   biller: " + toIndentedString(biller) + "\n" +
            "   international: " + toIndentedString(international) + "\n" +
            "   digitalWallet: " + toIndentedString(digitalWallet) + "\n" +
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
