package guru.springframework.sfgpetclinic.model.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.service.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
	// TODO Auto-generated method stub
	return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
	// TODO Auto-generated method stub
	return super.findByid(id);
    }

    @Override
    public PetType save(PetType object) {
	// TODO Auto-generated method stub
	return super.save(object);
    }

    @Override
    public void delete(PetType object) {
	super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
	super.deleteById(id);

    }

}
