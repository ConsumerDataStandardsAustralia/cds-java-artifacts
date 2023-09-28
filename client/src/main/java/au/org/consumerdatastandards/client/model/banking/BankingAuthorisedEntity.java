/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingAuthorisedEntity {

    private String description;

    private String financialInstitution;

    private String abn;

    private String acn;

    private String arbn;

    /**
     * Description of the authorised entity derived from previously executed direct debits
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Name of the financial institution through which the direct debit will be executed. Is required unless the payment is made via a credit card scheme
     * @return financialInstitution
     */
    public String getFinancialInstitution() {
        return financialInstitution;
    }

    public void setFinancialInstitution(String financialInstitution) {
        this.financialInstitution = financialInstitution;
    }

    /**
     * Australian Business Number for the authorised entity
     * @return abn
     */
    public String getAbn() {
        return abn;
    }

    public void setAbn(String abn) {
        this.abn = abn;
    }

    /**
     * Australian Company Number for the authorised entity
     * @return acn
     */
    public String getAcn() {
        return acn;
    }

    public void setAcn(String acn) {
        this.acn = acn;
    }

    /**
     * Australian Registered Body Number for the authorised entity
     * @return arbn
     */
    public String getArbn() {
        return arbn;
    }

    public void setArbn(String arbn) {
        this.arbn = arbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingAuthorisedEntity bankingAuthorisedEntity = (BankingAuthorisedEntity) o;
        return Objects.equals(this.description, bankingAuthorisedEntity.description) &&
            Objects.equals(this.financialInstitution, bankingAuthorisedEntity.financialInstitution) &&
            Objects.equals(this.abn, bankingAuthorisedEntity.abn) &&
            Objects.equals(this.acn, bankingAuthorisedEntity.acn) &&
            Objects.equals(this.arbn, bankingAuthorisedEntity.arbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            description,
            financialInstitution,
            abn,
            acn,
            arbn);
    }

    @Override
    public String toString() {
        return "class BankingAuthorisedEntity {\n" +
            "   description: " + toIndentedString(description) + "\n" + 
            "   financialInstitution: " + toIndentedString(financialInstitution) + "\n" + 
            "   abn: " + toIndentedString(abn) + "\n" + 
            "   acn: " + toIndentedString(acn) + "\n" + 
            "   arbn: " + toIndentedString(arbn) + "\n" + 
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
