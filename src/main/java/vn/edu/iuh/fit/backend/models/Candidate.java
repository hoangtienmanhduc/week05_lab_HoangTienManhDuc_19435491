package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "candidate")
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "can_id")
    private long can_id;
    @Column(name = "dob")
    private LocalDate dob;
    @OneToOne
    private Address address;
    @Column(name = "phone",length = 15)
    private String phone;
    @Column(name = "email",length = 255)
    private String email;
    @Column(name = "full_name")
    private String full_name;
    @OneToMany(mappedBy = "candidate")
    private List<Experience> lsExperiences;
    @OneToMany(mappedBy = "candidate")
    private List<CandidateSkill> lsCandidateSkills;
    public Candidate(String fullName, LocalDate dob, Address address, String phone, String email, List<Experience> experiences, List<CandidateSkill> candidateSkills) {
        this.full_name = fullName;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.lsExperiences = experiences;
        this.lsCandidateSkills = candidateSkills;
    }

    public Candidate(String fullName, LocalDate dob, Address address, String phone, String email) {
        this.full_name = fullName;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}
