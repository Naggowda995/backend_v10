package org.littuss.hrManagementApp.clientController;

import org.littuss.hrManagementApp.clientModel.ClientEntity;
import org.littuss.hrManagementApp.clientService.ClientService;
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
@RequestMapping("/client")

public class ClientController {
	
	 @Autowired
	 private ClientService csr;
	 
	 //register
	 //@GetMapping("/register/{email}")
	// public ClienRegisterEntity findByemailId(@PathVariable String emailId) {
	      //  return csr.findByemailId(emailId);
	   // }
	 
	 @PostMapping("/register")
	    public ClientEntity saveClientRegister(@RequestBody ClientEntity ClientRegister) {
		 	return csr.save(ClientRegister);
	    }
	 
	//visible on webpage
	   @GetMapping("/get/{id}")
	    public ResponseEntity<?> getClassDataById(@PathVariable Long id) {
	        try {
	        	ClientEntity nrml = csr.getClassDataById(id);
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
		    public ResponseEntity<ClientEntity> updateUser(@PathVariable Long id, @RequestBody ClientEntity updatedUserData) {
		        try {
		        	ClientEntity updatedUser = csr.updateUser(id, updatedUserData);
		            return ResponseEntity.ok(updatedUser);
		        } catch (EntityNotFoundException e) {
		            return ResponseEntity.notFound().build();
		        }
		    }

		 //delete
		 
		 @DeleteMapping("/delete/{id}")
		 public ResponseEntity<ClientEntity> deleteUser(@PathVariable Long id) {
		     try {
		    	 ClientEntity updatedUser = csr.softDeleteUser(id);
		         return ResponseEntity.ok(updatedUser);
		     } catch (EntityNotFoundException e) {
		         return ResponseEntity.notFound().build();
		     }
		 }
	 
//	 @GetMapping("/get/{id}")
//     public ResponseEntity<?> getClassDataById(@PathVariable Long id) {
//         try {
//              ClientEntity client = csr.getClassDataById(id);
//             return ResponseEntity.ok(client);
//         } catch (Exception e) {
//             return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
//         }
//     }

	 
}



