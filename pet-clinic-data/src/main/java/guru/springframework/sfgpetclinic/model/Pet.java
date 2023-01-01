package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Created by jt on 7/13/18.
 */

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    public Pet(PetType petType, Owner owner, LocalDate birthDate, String name, Set<Visit> visits) {
	super();
	this.petType = petType;
	this.owner = owner;
	this.birthDate = birthDate;
	this.name = name;
	if (visits == null || visits.size() > 0) {
	    this.visits = visits;
	}
    }

    public Pet() {
	super();
    }

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();

    public Set<Visit> getVisits() {
	return visits;
    }

    public void setVisits(Set<Visit> visits) {
	this.visits = visits;
    }

    public PetType getPetType() {
	return petType;
    }

    public void setPetType(PetType petType) {
	this.petType = petType;
    }

    public Owner getOwner() {
	return owner;
    }

    public void setOwner(Owner owner) {
	this.owner = owner;
    }

    public LocalDate getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
}
