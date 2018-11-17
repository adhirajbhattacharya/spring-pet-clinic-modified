package com.adhiraj.clinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.adhiraj.clinic.model.Owner;
import com.adhiraj.clinic.model.PetType;
import com.adhiraj.clinic.model.Vet;
import com.adhiraj.clinic.model.service.OwnerService;
import com.adhiraj.clinic.model.service.PetTypeService;
import com.adhiraj.clinic.model.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

  private static final String OWNER_LAST_NAME = "Owner";
  private static final String VET_LAST_NAME = "Vet";

  private final OwnerService ownerService;
  private final VetService vetService;
  private final PetTypeService petTypeService;

  @Autowired
  public DataLoader(OwnerService ownerService, VetService vetService,
      PetTypeService petTypeService) {
    super();
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService = petTypeService;
  }

  @Override
  public void run(String... args) throws Exception {

    PetType dog = new PetType();
    dog.setName("Dog");
    PetType savedDog = petTypeService.save(dog);

    PetType cat = new PetType();
    cat.setName("Cat");
    PetType savedCat = petTypeService.save(cat);

    Owner owner1 = new Owner();
    owner1.setFirstName("John");
    owner1.setLastName(OWNER_LAST_NAME);

    Owner owner2 = new Owner();
    owner2.setFirstName("Jane");
    owner2.setLastName(OWNER_LAST_NAME);

    ownerService.save(owner1);
    ownerService.save(owner2);

    System.out.println("Loaded Owners ...");

    Vet vet1 = new Vet();
    vet1.setFirstName("John");
    vet1.setLastName(VET_LAST_NAME);

    Vet vet2 = new Vet();
    vet2.setFirstName("Jane");
    vet2.setLastName(VET_LAST_NAME);

    vetService.save(vet1);
    vetService.save(vet2);

    System.out.println("Loaded Vet ...");
  }

}
