package org.littuss.hrManagementApp.itRecruitmentRepository;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateNormalizedData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItRecruitmentCandidateDetailsRepo extends JpaRepository<ItRecruitmentCandidateNormalizedData, Long> {

}
