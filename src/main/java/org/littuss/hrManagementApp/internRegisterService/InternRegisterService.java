package org.littuss.hrManagementApp.internRegisterService;


import org.littuss.hrManagementApp.internRegisterModel.InternAcknowledgement;
import org.littuss.hrManagementApp.internRegisterModel.InternAddressInfo;
import org.littuss.hrManagementApp.internRegisterModel.InternBankDetails;
import org.littuss.hrManagementApp.internRegisterModel.InternChecklistJoining;
import org.littuss.hrManagementApp.internRegisterModel.InternDTO;
import org.littuss.hrManagementApp.internRegisterModel.InternDependentInfo;
import org.littuss.hrManagementApp.internRegisterModel.InternEducationDetais;
import org.littuss.hrManagementApp.internRegisterModel.InternEmergencyContact;
import org.littuss.hrManagementApp.internRegisterModel.InternFullName;
import org.littuss.hrManagementApp.internRegisterModel.InternJioningInfo;
import org.littuss.hrManagementApp.internRegisterModel.InternNormalizedData;
import org.littuss.hrManagementApp.internRegisterModel.InternPersonalInfo;
import org.littuss.hrManagementApp.internRegisterRepository.InternRegisterRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InternRegisterService {

	@Autowired
	private InternRegisterRepo internRegisterRepo;
	
	public InternNormalizedData saveData(InternDTO intDto)
	{
			InternFullName fullname = new InternFullName();
			InternJioningInfo jioninfo = new InternJioningInfo();
			InternChecklistJoining checklistJion = new InternChecklistJoining();
			InternPersonalInfo personalInfo = new InternPersonalInfo();
			InternAddressInfo addrInfo = new InternAddressInfo();
			InternDependentInfo dependentInfo = new InternDependentInfo();
			InternEmergencyContact emgContInfo = new InternEmergencyContact();
			InternEducationDetais educationDetais = new InternEducationDetais();
			InternBankDetails bankDetails = new InternBankDetails();
			InternAcknowledgement acknowledgement = new InternAcknowledgement();

		    // Copy relevant data from DTO to respective entities
		    BeanUtils.copyProperties(intDto, fullname);
		    BeanUtils.copyProperties(intDto, jioninfo);
		    BeanUtils.copyProperties(intDto, checklistJion);
		    BeanUtils.copyProperties(intDto, personalInfo);
		    BeanUtils.copyProperties(intDto, addrInfo);
		    BeanUtils.copyProperties(intDto, dependentInfo);
		    BeanUtils.copyProperties(intDto, emgContInfo);
		    BeanUtils.copyProperties(intDto, educationDetais);
		    BeanUtils.copyProperties(intDto, bankDetails);
		    BeanUtils.copyProperties(intDto, acknowledgement);

		    // Create Class4 object and set the entities
		    InternNormalizedData normalizedData = new InternNormalizedData();
		    normalizedData.setInternFullname(fullname);
		    normalizedData.setInternJioninfo(jioninfo);
		    normalizedData.setInternCheccklistJoin(checklistJion);
		    normalizedData.setInternPersonalInfo(personalInfo);
		    normalizedData.setInternAddrInfo(addrInfo);
		    normalizedData.setInternDependentInfo(dependentInfo);
		    normalizedData.setInternContInfo(emgContInfo);
		    normalizedData.setInternEducationDetais(educationDetais);
		    normalizedData.setInternBankDetails(bankDetails);
		    normalizedData.setInternAcknowledgement(acknowledgement);

		    return internRegisterRepo.save(normalizedData);

	}
	
	public InternNormalizedData getDataById(Long id) {
        return internRegisterRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Data not found with id: " + id)); 
    }
}
