package org.littuss.hrManagementApp.vendorService;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;


import org.littuss.hrManagementApp.vendorDetailsModel.VendorDetails;
import org.littuss.hrManagementApp.vendorRepo.vendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import jakarta.persistence.EntityNotFoundException;


@Service
public class vendorService {


   @Autowired
    private vendorRepo venRepo;
    
            //for Save User
    public VendorDetails save(VendorDetails vedInfo) {
         return venRepo.save(vedInfo);
         }
    
         //find by Id
    public VendorDetails getDataById(Long id) {
                return venRepo.findById(id)
                        .orElseThrow(() -> new RuntimeException("Data not found with id: " + id));
    }
    
    public byte[] loadFileById(Long id) {
        VendorDetails user = venRepo.getById(id);
        return (user != null) ? user.getCvFormat() : null;
    }
         


    //update
    public VendorDetails updateUser(Long id, VendorDetails updatedUser) {
        VendorDetails existingUser = venRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));
        
        existingUser.setVendorName(updatedUser.getVendorName());
        existingUser.setRateCard(updatedUser.getRateCard());
        existingUser.setLocation(updatedUser.getLocation());
        existingUser.setJobType(updatedUser.getJobType());
        existingUser.setPayRoll(updatedUser.getPayRoll());
        existingUser.setCandidateName(updatedUser.getCandidateName());
        existingUser.setCandidateLocation(updatedUser.getCandidateLocation());
        existingUser.setTechnology(updatedUser.getTechnology());
        existingUser.setFirstReviewed(updatedUser.getFirstReviewed());
        existingUser.setSecondReviewed(updatedUser.getSecondReviewed());
        existingUser.setCvFormat(updatedUser.getCvFormat());
        


       return venRepo.save(existingUser);
    }
    
    //compresser
    public static byte[] compressFile(byte[] input) throws IOException {
        Deflater deflater = new Deflater();
        deflater.setInput(input);
        deflater.finish();


       ByteArrayOutputStream outputStream = new ByteArrayOutputStream(input.length);


       byte[] buffer = new byte[1024];
        while (!deflater.finished()) {
            int count = deflater.deflate(buffer);
            outputStream.write(buffer, 0, count);
        }


       outputStream.close();
        return outputStream.toByteArray();
    }


   public static byte[] decompressfile(byte[] input) throws IOException {
        Inflater inflater = new Inflater();
        inflater.setInput(input);


       ByteArrayOutputStream outputStream = new ByteArrayOutputStream(input.length);


       byte[] buffer = new byte[1024];
        while (!inflater.finished()) {
            try {
                int count = inflater.inflate(buffer);
                outputStream.write(buffer, 0, count);
            } catch (DataFormatException e) {
                // Handle DataFormatException
            }
        }


       outputStream.close();
        return outputStream.toByteArray();
    }
    
    //controller
    public String uploadFile(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        byte[] content = compressFile(file.getBytes());
        
        VendorDetails cvUpload = new VendorDetails();
//        cvUpload.setName(fileName);
        cvUpload.setCvFormat(content);
        
        venRepo.save(cvUpload);
        
        return "File uploaded successfully: " + fileName;
    }


   public ResponseEntity<?> downloadFile(Long id) throws IOException {
        Optional<VendorDetails> dbCVdata = venRepo.findById(id);


       if (dbCVdata.isPresent()) {
            byte[] content = decompressfile(dbCVdata.get().getCvFormat());
                //////    CompresserController.decompressfile(dbCVdata.get().getContent());
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .body(content);
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("File not found");
        }
    }


   public String deleteFile(Long id) {
        Optional<VendorDetails> dbCVdata = venRepo.findById(id);


       if (dbCVdata.isPresent()) {
            venRepo.delete(dbCVdata.get());
            return "File deleted successfully: " + id;
        } else {
            return "File not found: " + id;
        }
    }
    
    
    
    /*
     * // public VendorDetails findByvendorName(String vendorName) { // return
     * venRepo.findByvendorName(vendorName); //} //for Save User //public
     * VendorDetails save(VendorDetails vedInfo) { // return venRepo.save(vedInfo);
     * //}
     *
     * //delete by Id //public void deleteById(Long id) //{
     * //venRepo.deleteById(id);; //}
     */}