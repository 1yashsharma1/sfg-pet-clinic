package guru.springframework.sfgpetclinic.model.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.service.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

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
	// OwnerODO Auto-generated method stub
	return super.save(object.getId(), object);
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
	// TODO Auto-generated method stub
	return null;
    }

}
