package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "experience")
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "exp_id")
    private long id;
    @Column(name = "from_date")
    private Date from_date;
    @Column(name = "to_date")
    private Date to_date;
    @Column(name = "role",length = 100)
    private String role;
    @Column(name = "company",length = 120)
    private String company;
    @Column(name = "work_desc",length = 400)
    private String work_desc;
    @ManyToOne
    private Candidate candidate;
}
