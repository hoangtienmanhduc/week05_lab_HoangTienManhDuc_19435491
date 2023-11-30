package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.backend.repositories.CompanyRepository;

import java.util.List;

@Entity
@Table(name = "company")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "com_id")
    private long id;
    @Column(name = "about" ,length = 1000)
    private String about;
    @Column(name = "comp_name",length = 255,nullable = false)
    private String comp_name;
    @Column(name = "email",length = 255,nullable = false)
    private String email;
    @Column(name = "phone",length = 15,nullable = false)
    private String phone;
    @Column(name = "web_url",length = 255,nullable = false)
    private String web_url;

    @OneToOne
    private CompanyRepository.Address address;
    @OneToMany(mappedBy = "company")
    private List<Job> lJob;
}
