package fr.solutec.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor @AllArgsConstructor @Data @Entity

public class UserEvent implements Serializable {
	@Id @GeneratedValue
	private Long id;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Events event;
	
	private Date dateDemande;

	@Column(columnDefinition = "boolean default false", nullable = false)
	private boolean demandeTraitee;

	 @Column(columnDefinition = "boolean default false", nullable = false)
	private boolean demandeAcceptee;
}
