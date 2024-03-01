package org.littuss.hrManagementApp.itRecruitmentController;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateDTO;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateNormalizedData;
import org.littuss.hrManagementApp.itRecruitmentService.ItRecruitmentCandidateDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping("/itrecruitment")
public class ItRecruitmentCandidateController {
       
       @Autowired
       private ItRecruitmentCandidateDetailsService itRecruitmentCandidateDetailsService;
       
       @PostMapping("/savecandidate")
       public void saveClassData(@RequestBody ItRecruitmentCandidateDTO itDto) {
              itRecruitmentCandidateDetailsService.saveData(itDto);
             
       }
       
       @GetMapping("/get/{id}")
    public ResponseEntity<?> getClassDataById(@PathVariable Long id) {
        try {
             ItRecruitmentCandidateNormalizedData itRecruitmentCandidateNormalizedData = itRecruitmentCandidateDetailsService.findById(id);
            return ResponseEntity.ok(itRecruitmentCandidateNormalizedData);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
        }
    }
       
       
}
