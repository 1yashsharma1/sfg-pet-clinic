package guru.springframework.sfgpetclinic.services.map;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;
    final Long ownerId = 1L;
    final String lastName = "Smith";

    @BeforeEach
    void setUp() throws Exception {
	ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
	Owner owner = new Owner();
	owner.setId(ownerId);
	owner.setLastName(lastName);
	ownerMapService.save(owner);
    }

    @Test
    void testFindAll() {
	Set<Owner> owners = ownerMapService.findAll();
	assertEquals(1, owners.size());
    }

    @Test
    void testFindById() {
	Owner owner = ownerMapService.findById(ownerId);
	assertEquals(ownerId, owner.getId());
    }

    @Test
    void testSaveOwner() {
	Long newOwnerId = 2L;
	Owner owner2 = new Owner();
	owner2.setId(newOwnerId);
	Owner savedOwner = ownerMapService.save(owner2);
	assertEquals(newOwnerId, savedOwner.getId());
    }

    @Test
    void saveNoId() {
	Owner owner3 = new Owner();
	Owner savedOwner2 = ownerMapService.save(owner3);
	assertNotNull(savedOwner2);
	assertNotNull(savedOwner2.getId());

    }

    @Test
    void testDeleteOwner() {
	ownerMapService.delete(ownerMapService.findById(ownerId));
	assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void testDeleteByIdLong() {
	ownerMapService.deleteById(ownerId);
	assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void testFindByLastName() {
	Owner smith = ownerMapService.findByLastName(lastName);
	assertNotNull(smith);
	assertEquals(lastName, smith.getLastName());

    }

}
