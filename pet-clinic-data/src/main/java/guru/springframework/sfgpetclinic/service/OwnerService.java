package guru.springframework.sfgpetclinic.service;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {
    Owner findbyId(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

    Owner findByLastName(String lastName);

}
