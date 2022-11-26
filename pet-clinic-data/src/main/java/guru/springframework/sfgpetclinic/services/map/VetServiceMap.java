package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import guru.springframework.sfgpetclinic.services.VetService;

@Service
@Profile({ "default", "map" })
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
	super();
	this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
	// OwnerODO Auto-generated method stub
	return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
	// TODO Auto-generated method stub
	return super.findByid(id);
    }

    @Override
    public Vet save(Vet object) {
	if (object.getSpecialities().size() > 0) {
	    object.getSpecialities().forEach(speciality -> {
		if (speciality.getId() == null) {
		    Speciality savedSpeciality = specialityService.save(speciality);
		    speciality.setId(savedSpeciality.getId());
		}
	    });
	}
	return super.save(object);
    }

    @Override
    public void delete(Vet object) {
	// TODO Auto-generated method stub
	super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
	// TODO Auto-generated method stub
	super.deleteById(id);
    }

}
