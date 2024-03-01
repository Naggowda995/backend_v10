package org.littuss.hrManagementApp.itRecruitmentService;


import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateDTO;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateNormalizedData;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentClientSideDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentInterviewDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentScreeningDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentStatusEntity;
import org.littuss.hrManagementApp.itRecruitmentRepository.ItRecruitmentCandidateDetailsRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItRecruitmentCandidateDetailsService {
       
       @Autowired
       private ItRecruitmentCandidateDetailsRepo itRecruitmentRepository; 


    public ItRecruitmentCandidateNormalizedData saveData(ItRecruitmentCandidateDTO itrecruitmentcandidateDto) {
        ItRecruitmentCandidateDetailsEntity candidatedetailsentity = new ItRecruitmentCandidateDetailsEntity();
        ItRecruitmentClientSideDetailsEntity clientsidedetailsentity = new ItRecruitmentClientSideDetailsEntity();
        ItRecruitmentInterviewDetailsEntity interviewdetailsentity = new ItRecruitmentInterviewDetailsEntity();
        ItRecruitmentScreeningDetailsEntity screeningdetailsentity = new ItRecruitmentScreeningDetailsEntity();
        ItRecruitmentStatusEntity statusentity = new ItRecruitmentStatusEntity();

        BeanUtils.copyProperties(itrecruitmentcandidateDto, candidatedetailsentity);
        BeanUtils.copyProperties(itrecruitmentcandidateDto, clientsidedetailsentity);
        BeanUtils.copyProperties(itrecruitmentcandidateDto, interviewdetailsentity);
        BeanUtils.copyProperties(itrecruitmentcandidateDto, screeningdetailsentity);
        BeanUtils.copyProperties(itrecruitmentcandidateDto, statusentity);

        ItRecruitmentCandidateNormalizedData normalizedData = new ItRecruitmentCandidateNormalizedData();
        normalizedData.setItRecruitmentCandidateDetailsEntity(candidatedetailsentity);
        normalizedData.setItRecruitmentClientSideDetailsEntity(clientsidedetailsentity);
        normalizedData.setItRecruitmentInterviewDetailsEntity(interviewdetailsentity);
        normalizedData.setItRecruitmentScreeningDetailsEntity(screeningdetailsentity);
        normalizedData.setItRecruitmentStatusEntity(statusentity);

        return itRecruitmentRepository.save(normalizedData);
    }

    public ItRecruitmentCandidateNormalizedData findById(Long id) {
        return itRecruitmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data not found with id: " + id));
    }
}
