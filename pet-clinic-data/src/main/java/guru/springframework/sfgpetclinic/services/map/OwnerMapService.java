package guru.springframework.sfgpetclinic.services.map;

import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;

@Service
@Profile({ "default", "map" })
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
	super();
	this.petTypeService = petTypeService;
	this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
	// OwnerODO Auto-generated method stub
	return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
	// OwnerODO Auto-generated method stub
	return super.findByid(id);
    }

    @Override
    public Owner save(Owner object) {
	if (object != null) {
	    if (object.getPets() != null) {
		object.getPets().forEach(pet -> {
		    if (pet.getPetType() != null) {
			if (pet.getPetType().getId() == null) {
			    pet.setPetType(petTypeService.save(pet.getPetType()));
			}
		    } else {
			throw new RuntimeException("Pet Type is Required");
		    }
		    if (pet.getId() == null) {
			Pet savedPet = petService.save(pet);
			pet.setId(savedPet.getId());
		    }

		});
	    }
	    return super.save(object);
	} else {
	    return null;
	}
    }

    @Override
    public void delete(Owner object) {
	// OwnerODO Auto-generated method stub
	super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
	// OwnerODO Auto-generated method stub
	super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {

	return this.findAll().stream().filter(owner -> owner.getLastName().equalsIgnoreCase(lastName)).findFirst()
		.orElse(null);
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
	// TODO Auto-generated method stub
	return null;
    }

}
