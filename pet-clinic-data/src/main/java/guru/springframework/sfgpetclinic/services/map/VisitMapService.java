package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.VisitService;

public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
	// TODO Auto-generated method stub
	return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
	// TODO Auto-generated method stub
	return super.findByid(id);
    }

    @Override
    public Visit save(Visit object) {
	if (object.getPet() == null || object.getPet().getId() == null || object.getPet().getOwner().getId() == null
		|| object.getPet().getOwner() == null) {
	    throw new RuntimeException("Invalid Visit");
	}
	return super.save(object);
    }

    @Override
    public void delete(Visit object) {
	// TODO Auto-generated method stub
	super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
	// TODO Auto-generated method stub
	super.deleteById(id);

    }

}
