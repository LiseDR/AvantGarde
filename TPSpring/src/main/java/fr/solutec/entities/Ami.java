package fr.solutec.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Ami {
	@Id
	@GeneratedValue
	private long id;
	private boolean accepte;
	@ManyToOne
	private User demandeur;
	@ManyToOne
	private User receveur;
}
