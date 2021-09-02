import java.io.Serializable;

public class Address{

    private String street;
    private String housNumber;
    private String postalCode;
    private String City;
    private String Country;

    public Address(String street, String housNumber, String postalCode, String city, String country) {
        this.street = street;
        this.housNumber = housNumber;
        this.postalCode = postalCode;
        City = city;
        Country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", housNumber='" + housNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
