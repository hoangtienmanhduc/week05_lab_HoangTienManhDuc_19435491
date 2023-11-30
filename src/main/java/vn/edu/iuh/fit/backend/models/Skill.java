package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.backend.enums.SkillType;

import java.util.List;

@Entity
@Data
@Table(name = "skill")
@AllArgsConstructor
@NoArgsConstructor

public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private long id;
    @Column(name = "skill_type")
    private SkillType skill_type;
    @Column(name = "skill_name",length = 150)
    private String skill_name;
    @Column(name = "skill_desc",length = 300)
    private String skill_desc;
    @OneToMany(mappedBy = "skill")
    private List<JobSkill> lsjobSkills;
    @OneToOne
    private CandidateSkill candidateSkill;
}
