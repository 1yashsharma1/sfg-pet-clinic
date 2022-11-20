package guru.springframework.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.service.OwnerService;
import guru.springframework.sfgpetclinic.service.PetTypeService;
import guru.springframework.sfgpetclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
	super();
	this.ownerService = ownerService;
	this.vetService = vetService;
	this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
	PetType dog = new PetType();
	dog.setName("dog");
	PetType savedDogPetType = petTypeService.save(dog);

	PetType cat = new PetType();
	dog.setName("cat");
	PetType savedCatPetType = petTypeService.save(cat);

	Owner owner1 = new Owner();
	owner1.setFirstName("Michael");
	owner1.setLastName("Weston");
	owner1.setAddress("Owner1 address");
	owner1.setCity("NY");
	owner1.setTelephone("0000000000");

	Pet mikesPet = new Pet();
	mikesPet.setBirthDate(LocalDate.now());
	mikesPet.setName("Rosco");
	mikesPet.setOwner(owner1);
	mikesPet.setPetType(savedDogPetType);
	owner1.getPets().add(mikesPet);

	ownerService.save(owner1);

	Owner owner2 = new Owner();
	owner2.setFirstName("Fiona");
	owner2.setLastName("Gleanne");
	owner2.setAddress("Owner2 address");
	owner2.setCity("Texas");
	owner2.setTelephone("1111111111");

	Pet fionasCat = new Pet();
	fionasCat.setName("Just Cat");
	fionasCat.setBirthDate(LocalDate.now());
	fionasCat.setPetType(savedCatPetType);
	fionasCat.setOwner(owner2);
	owner2.getPets().add(fionasCat);

	ownerService.save(owner2);

	System.out.println("Loaded Owners....");

	Vet vet1 = new Vet();
	vet1.setFirstName("Sam");
	vet1.setLastName("Axe");

	vetService.save(vet1);

	Vet vet2 = new Vet();
	vet2.setFirstName("Alexandar");
	vet2.setLastName("The Great");

	vetService.save(vet2);

	System.out.println("Loaded Vets....");
    }

}
