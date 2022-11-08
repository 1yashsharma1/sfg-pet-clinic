package guru.springframework.sfgpetclinic.model.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.service.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
	// OwnerODO Auto-generated method stub
	return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
	// TODO Auto-generated method stub
	return super.findByid(id);
    }

    @Override
    public Pet save(Pet object) {
	// TODO Auto-generated method stub
	return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
	// TODO Auto-generated method stub
	super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
	// TODO Auto-generated method stub
	super.deleteById(id);
    }

}
