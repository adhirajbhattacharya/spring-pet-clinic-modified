package com.adhiraj.clinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.adhiraj.clinic.model.Owner;
import com.adhiraj.clinic.model.Vet;
import com.adhiraj.clinic.model.service.OwnerService;
import com.adhiraj.clinic.model.service.VetService;
import com.adhiraj.clinic.model.service.map.OwnerServiceMap;
import com.adhiraj.clinic.model.service.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

  private static final String OWNER_LAST_NAME = "Owner";
  private static final String VET_LAST_NAME = "Vet";

  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader(OwnerService ownerService, VetService vetService) {
    super();
    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override
  public void run(String... args) throws Exception {

    Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("John");
    owner1.setLastName(OWNER_LAST_NAME);

    Owner owner2 = new Owner();
    owner2.setId(2L);
    owner2.setFirstName("Jane");
    owner2.setLastName(OWNER_LAST_NAME);

    ownerService.save(owner1);
    ownerService.save(owner2);

    System.out.println("Loaded Owners ...");

    Vet vet1 = new Vet();
    vet1.setId(1L);
    vet1.setFirstName("John");
    vet1.setLastName(VET_LAST_NAME);

    Vet vet2 = new Vet();
    vet2.setId(2L);
    vet2.setFirstName("Jane");
    vet2.setLastName(VET_LAST_NAME);

    vetService.save(vet1);
    vetService.save(vet2);

    System.out.println("Loaded Vet ...");
  }

}
