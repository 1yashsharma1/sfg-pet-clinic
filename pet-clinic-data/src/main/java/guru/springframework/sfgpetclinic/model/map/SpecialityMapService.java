package guru.springframework.sfgpetclinic.model.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.service.SpecialitiesService;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {

    @Override
    public Set<Speciality> findAll() {
	// TODO Auto-generated method stub
	return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
	// TODO Auto-generated method stub
	return super.findByid(id);
    }

    @Override
    public Speciality save(Speciality object) {
	// TODO Auto-generated method stub
	return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
	// TODO Auto-generated method stub
	super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
	// TODO Auto-generated method stub
	super.deleteById(id);
    }

}
