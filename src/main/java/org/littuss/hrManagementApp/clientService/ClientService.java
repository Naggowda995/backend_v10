package org.littuss.hrManagementApp.clientService;

import org.littuss.hrManagementApp.clientModel.ClientEntity;
import org.littuss.hrManagementApp.clientRepository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clr;
	
	 //save by user
	 public ClientEntity save(ClientEntity ser) {
		return  clr.save(ser);
	}
	 
	//find by Id
		 public ClientEntity getClassDataById(Long id) {
		        return clr.findById(id)
		                .orElseThrow(() -> new RuntimeException("Data not found with id: " + id)); 
		    }
		 
		 //updateUser
		 public ClientEntity updateUser(Long id, ClientEntity updatedUser) {
			 ClientEntity existingUser = clr.findById(id)
		                .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));
			 
			 
			 	existingUser.setDate(updatedUser.getDate());
			 	existingUser.setClientName(updatedUser.getClientName());
			 	existingUser.setWebSite(updatedUser.getWebSite());
			 	existingUser.setContactPerson(updatedUser.getContactPerson());
			    existingUser.setContactNo(updatedUser.getContactNo());
			    existingUser.setEmailId(updatedUser.getEmailId());
			    existingUser.setMeetingTime(updatedUser.getMeetingTime());
			    existingUser.setWhoInvolved(updatedUser.getWhoInvolved());
			    existingUser.setRemark(updatedUser.getRemark());
				
		        
		        

		        return clr.save(existingUser);
		    }
		 
		//delete
			 public ClientEntity softDeleteUser(Long id) {
				 ClientEntity existingUser = clr.findById(id)
				            .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));

				    existingUser.setActiveStatus("0"); // Assuming ActiveStatus is a String. If it's boolean, use setActive(false);

				    return clr.save(existingUser);
				}
	 
	}



