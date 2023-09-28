/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model;

import java.util.List;
import java.util.Objects;

public class CommonPersonDetail extends CommonPerson {

    private List<CommonPhoneNumber> phoneNumbers;

    private List<CommonEmailAddress> emailAddresses;

    private List<CommonPhysicalAddressWithPurpose> physicalAddresses;

    /**
     * Array is mandatory but may be empty if no phone numbers are held
     * @return phoneNumbers
     */
    public List<CommonPhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<CommonPhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    /**
     * May be empty
     * @return emailAddresses
     */
    public List<CommonEmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(List<CommonEmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    /**
     * Array is mandatory but may be empty if no valid addresses are held. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail
     * @return physicalAddresses
     */
    public List<CommonPhysicalAddressWithPurpose> getPhysicalAddresses() {
        return physicalAddresses;
    }

    public void setPhysicalAddresses(List<CommonPhysicalAddressWithPurpose> physicalAddresses) {
        this.physicalAddresses = physicalAddresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonPersonDetail commonPersonDetail = (CommonPersonDetail) o;
        return Objects.equals(this.phoneNumbers, commonPersonDetail.phoneNumbers) &&
            Objects.equals(this.emailAddresses, commonPersonDetail.emailAddresses) &&
            Objects.equals(this.physicalAddresses, commonPersonDetail.physicalAddresses) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            phoneNumbers,
            emailAddresses,
            physicalAddresses,
            super.hashCode());
    }

    @Override
    public String toString() {
        return "class CommonPersonDetail {\n" +
            "   lastUpdateTime: " + toIndentedString(getLastUpdateTime()) + "\n" + 
            "   firstName: " + toIndentedString(getFirstName()) + "\n" + 
            "   lastName: " + toIndentedString(getLastName()) + "\n" + 
            "   middleNames: " + toIndentedString(getMiddleNames()) + "\n" + 
            "   prefix: " + toIndentedString(getPrefix()) + "\n" + 
            "   suffix: " + toIndentedString(getSuffix()) + "\n" + 
            "   occupationCode: " + toIndentedString(getOccupationCode()) + "\n" + 
            "   phoneNumbers: " + toIndentedString(phoneNumbers) + "\n" + 
            "   emailAddresses: " + toIndentedString(emailAddresses) + "\n" + 
            "   physicalAddresses: " + toIndentedString(physicalAddresses) + "\n" + 
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
