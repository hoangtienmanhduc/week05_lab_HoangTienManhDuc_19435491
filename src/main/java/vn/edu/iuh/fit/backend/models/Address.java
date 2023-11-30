package vn.edu.iuh.fit.backend.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.backend.models.Company;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private long id;

    @Column(name = "country")
    private CountryCode country;
    @Column(name = "zipcode", length = 7)
    private String zipcode;
    @Column(name = "number", length = 20)
    private String number;
    @Column(name = "city", length = 50)
    private String city;
    @Column(name = "street", length = 150)
    private String street;
    @OneToOne
    private Company company;
    public Address(String number, String street, String city, String zipCode, CountryCode country) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.zipcode = zipCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return number + ", " + street + ", " + city + ", " + zipcode + ", " + country.getName();
    }
}
