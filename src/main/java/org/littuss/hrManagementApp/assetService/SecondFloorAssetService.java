package org.littuss.hrManagementApp.assetService;

import org.littuss.hrManagementApp.assetModel.FirstFloorAssetRegister;
import org.littuss.hrManagementApp.assetModel.SecondFloorAssetEntity;
import org.littuss.hrManagementApp.assetRepository.SecondFloorAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public class SecondFloorAssetService {
	@Autowired 
	 private SecondFloorAssetRepository asf; 
	
	//save User
	public SecondFloorAssetEntity save(SecondFloorAssetEntity ser) {
		return  asf.save(ser);
	 }

	//find by Id
	 public SecondFloorAssetEntity getClassDataById(Long id) {
	        return asf.findById(id)
	                .orElseThrow(() -> new RuntimeException("Data not found with id: " + id)); 
	    }
	 
	 //updateUser
	 public SecondFloorAssetEntity updateUser(Long id, SecondFloorAssetEntity updatedUser) {
		 SecondFloorAssetEntity existingUser = asf.findById(id)
	                .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));
		    
			
	        existingUser.setNormalChairs(updatedUser.getNormalChairs());
	        existingUser.setWheelChairs(updatedUser.getWheelChairs());
	        existingUser.setAcRemotes(updatedUser.getAcRemotes());
	        existingUser.setFanRemotes(updatedUser.getFanRemotes());
	        existingUser.setPedestals(updatedUser.getPedestals());
	        existingUser.setAirConditioners(updatedUser.getAirConditioners());
	        existingUser.setLaptops(updatedUser.getLaptops());
	        existingUser.setMouse(updatedUser.getMouse());
	        existingUser.setChargers(updatedUser.getChargers());
	        existingUser.setBags(updatedUser.getBags());
	        existingUser.setFans(updatedUser.getFans());
	        existingUser.setDustbins(updatedUser.getDustbins());
	        existingUser.setTables(updatedUser.getTables());
	        

	        return asf.save(existingUser);
	    }
	 
	//delete
		 public SecondFloorAssetEntity softDeleteUser(Long id) {
			 SecondFloorAssetEntity existingUser = asf.findById(id)
			            .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));

			    existingUser.setActiveStatus("0"); // Assuming ActiveStatus is a String. If it's boolean, use setActive(false);

			    return asf.save(existingUser);
			}
}
