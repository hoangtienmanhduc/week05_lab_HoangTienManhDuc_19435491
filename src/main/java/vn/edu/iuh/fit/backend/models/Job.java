package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "job")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "job_id")
    private long id;
    @Column(name = "job_decs",length = 2000)
    private String job_decs;
    @Column(name = "job_name",length = 255)
    private String job_name;
    @ManyToOne
    private Company company;
    @OneToMany(mappedBy = "job")
    private List<JobSkill> lsJobSkills;
}
