/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingProductCardArt {

    private String title;

    private String imageUri;

    /**
     * Display label for the specific image
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * URI reference to a PNG, JPG or GIF image with proportions defined by ISO 7810 ID-1 and width no greater than 512 pixels.
     * The URI reference may be a link or url-encoded data URI [RFC 2397](https://tools.ietf.org/html/rfc2397)
     * @return imageUri
     */
    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingProductCardArt cardArt = (BankingProductCardArt) o;
        return Objects.equals(this.title, cardArt.title) && Objects.equals(this.imageUri, cardArt.imageUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            title,
            imageUri);
    }

    @Override
    public String toString() {
        return "class BankingProductV2CardArt {\n" +
            "   title: " + toIndentedString(title) + "\n" + 
            "   imageUri: " + toIndentedString(imageUri) + "\n" + 
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
