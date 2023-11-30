package vn.edu.iuh.fit.backend.pks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.backend.models.Job;
import vn.edu.iuh.fit.backend.models.Skill;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobSkillPK implements Serializable {
    private Skill skill;
    private Job job;
}
