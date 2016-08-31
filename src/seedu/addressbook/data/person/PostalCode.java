package seedu.addressbook.data.person;

public class PostalCode {
    
    private String postalCode;
    
    public PostalCode(String value) {
        this.setPostalCode(value);
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
