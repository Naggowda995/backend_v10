package org.littuss.hrManagementApp.empRegisterService;

import org.littuss.hrManagementApp.empRegisterModel.EmpAcknowledgement;
import org.littuss.hrManagementApp.empRegisterModel.EmpAddressInfo;
import org.littuss.hrManagementApp.empRegisterModel.EmpBankDetails;
import org.littuss.hrManagementApp.empRegisterModel.EmpChecklistJoining;
import org.littuss.hrManagementApp.empRegisterModel.EmpDependentInfo;
import org.littuss.hrManagementApp.empRegisterModel.EmpEducationDetais;
import org.littuss.hrManagementApp.empRegisterModel.EmpEmergencyContact;
import org.littuss.hrManagementApp.empRegisterModel.EmpExperience;
import org.littuss.hrManagementApp.empRegisterModel.EmpFullName;
import org.littuss.hrManagementApp.empRegisterModel.EmpJioningInfo;
import org.littuss.hrManagementApp.empRegisterModel.EmpNominee;
import org.littuss.hrManagementApp.empRegisterModel.EmpNormalizedData;
import org.littuss.hrManagementApp.empRegisterModel.EmpPersonalInfo;
import org.littuss.hrManagementApp.empRegisterModel.EmployeeDTO;
import org.littuss.hrManagementApp.empRegisterRepository.EmployeeRegisterRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeRegisterService {

	@Autowired
	private EmployeeRegisterRepo employeeRegisterRepo;
	
	public EmpNormalizedData saveData(EmployeeDTO empDto)
	{
		    EmpFullName fullname = new EmpFullName();
		    EmpJioningInfo jioninfo = new EmpJioningInfo();
		    EmpChecklistJoining checklistJion = new EmpChecklistJoining();
		    EmpPersonalInfo personalInfo = new EmpPersonalInfo();
		    EmpAddressInfo addrInfo = new EmpAddressInfo();
		    EmpDependentInfo dependentInfo = new EmpDependentInfo();
		    EmpEmergencyContact emgContInfo = new EmpEmergencyContact();
		    EmpEducationDetais educationDetais = new EmpEducationDetais();
		    EmpExperience experience = new EmpExperience();
		    EmpNominee employeeNominee = new EmpNominee();
		    EmpBankDetails bankDetails = new EmpBankDetails();
		    EmpAcknowledgement acknowledgement = new EmpAcknowledgement();

		    // Copy relevant data from DTO to respective entities
		    BeanUtils.copyProperties(empDto, fullname);
		    BeanUtils.copyProperties(empDto, jioninfo);
		    BeanUtils.copyProperties(empDto, checklistJion);
		    BeanUtils.copyProperties(empDto, personalInfo);
		    BeanUtils.copyProperties(empDto, addrInfo);
		    BeanUtils.copyProperties(empDto, dependentInfo);
		    BeanUtils.copyProperties(empDto, emgContInfo);
		    BeanUtils.copyProperties(empDto, educationDetais);
		    BeanUtils.copyProperties(empDto, experience);
		    BeanUtils.copyProperties(empDto, employeeNominee);
		    BeanUtils.copyProperties(empDto, bankDetails);
		    BeanUtils.copyProperties(empDto, acknowledgement);

		    // Create Class4 object and set the entities
		    EmpNormalizedData normalizedData = new EmpNormalizedData();
		    normalizedData.setEmpFullname(fullname);
		    normalizedData.setEmpJioninfo(jioninfo);
		    normalizedData.setEmpCheccklistJoin(checklistJion);
		    normalizedData.setEmpPersonalInfo(personalInfo);
		    normalizedData.setEmpAddrInfo(addrInfo);
		    normalizedData.setEmpDependentInfo(dependentInfo);
		    normalizedData.setEmpEmgContInfo(emgContInfo);
		    normalizedData.setEmpEducationDetais(educationDetais);
		    normalizedData.setEmpExperience(experience);
		    normalizedData.setEmpEmployeeNominee(employeeNominee);
		    normalizedData.setEmpBankDetails(bankDetails);
		    normalizedData.setEmpAcknowledgement(acknowledgement);

		    return employeeRegisterRepo.save(normalizedData);


	}
	
	public EmpNormalizedData getClassDataById(Long id) {
        return employeeRegisterRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Data not found with id: " + id)); 
    }
	
	
}
