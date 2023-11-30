package vn.edu.iuh.fit.backend.pks;

import vn.edu.iuh.fit.backend.models.Candidate;
import vn.edu.iuh.fit.backend.models.Skill;

import java.io.Serializable;

public class CandidateSkillPK implements Serializable {
    private Candidate candidate;
    private Skill skill;
}
