package org.littuss.hrManagementApp.requirementService;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

import org.littuss.hrManagementApp.requirementModel.requirementEntity;
import org.littuss.hrManagementApp.requirementRepository.requirementRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class requirementService {
	
	@Autowired
	private requirementRepository rRS;
	
	//save User
		public requirementEntity save(requirementEntity rre) {
		return rRS.save(rre);
		}
	
	     //find by Id
		 public requirementEntity getDataById(Long id) {
		        return rRS.findById(id)
		                .orElseThrow(() -> new RuntimeException("Data not found with id: " + id)); 
		    }
		 
		//updateUser
		 public requirementEntity updateUser(Long id, requirementEntity updatedUser) {
			 requirementEntity existingUser = rRS.findById(id)
		                .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));
				
			 existingUser.setFullName(updatedUser.getFullName());
			    existingUser.setExperience(updatedUser.getExperience());
			    existingUser.setClientName(updatedUser.getClientName());
			    existingUser.setSector(updatedUser.getSector());
			    existingUser.setTechnology(updatedUser.getTechnology());
			    existingUser.setGender(updatedUser.getGender());
			    existingUser.setStatus(updatedUser.getStatus());
			    existingUser.setTermsConditions(updatedUser.getTermsConditions());
		        

		        return rRS.save(existingUser);
		    }

		//delete
		 public requirementEntity softDeleteUser(Long id) {
			 requirementEntity existingUser = rRS.findById(id)
			            .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));

			    existingUser.setActiveStatus("0"); // Assuming ActiveStatus is a String. If it's boolean, use setActive(false);

			    return rRS.save(existingUser);
			}
}

