package org.littuss.hrManagementApp.clientRepository;


import org.littuss.hrManagementApp.clientModel.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity,Long> {
    ClientEntity findByemailId(String emailId);
    
}