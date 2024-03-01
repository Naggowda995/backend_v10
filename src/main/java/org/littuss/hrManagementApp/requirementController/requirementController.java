package org.littuss.hrManagementApp.requirementController;

import org.littuss.hrManagementApp.requirementModel.requirementEntity;
import org.littuss.hrManagementApp.requirementService.requirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityNotFoundException;

@RestController
@CrossOrigin("*")

@RequestMapping("/requirement")
public class requirementController {
	
	@Autowired
	private requirementService rService;
	
	@PostMapping("/save/technology")
	public requirementEntity addRequirement(@RequestBody requirementEntity rre) {
        return rService.save(rre);
    }
	

	
	//visibile on webpage
	   @GetMapping("/get/{id}")
	    public ResponseEntity<?> getClassDataById(@PathVariable Long id) {
	        try {
	        	requirementEntity nrml = rService.getDataById(id);
	        //	System.out.println(nrml.getActiveStatus());
	        	if (nrml.getActiveStatus().equals("1")) {
	        		return ResponseEntity.ok(nrml);
				}else
				{
	        	return ResponseEntity.ok("Data not found because `INACTIVE` ");
				}
	        	
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
	        }
	    }
	   
	     //update
		 @PutMapping("/update/{id}")
		    public ResponseEntity<requirementEntity> updateUser(@PathVariable Long id, @RequestBody requirementEntity updatedUserData) {
		        try {
		        	requirementEntity updatedUser = rService.updateUser(id, updatedUserData);
		            return ResponseEntity.ok(updatedUser);
		        } catch (EntityNotFoundException e) {
		            return ResponseEntity.notFound().build();
		        }
		    }

		 //delete
		 
		 @DeleteMapping("/delete/{id}")
		 public ResponseEntity<requirementEntity> deleteUser(@PathVariable Long id) {
		     try {
		    	 requirementEntity updatedUser = rService.softDeleteUser(id);
		         return ResponseEntity.ok(updatedUser);
		     } catch (EntityNotFoundException e) {
		         return ResponseEntity.notFound().build();
		     }
		 }

}



