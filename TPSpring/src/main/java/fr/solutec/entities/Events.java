package fr.solutec.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Events {
	@Id
	@GeneratedValue
	private Long id;
	private String titre;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	private String lieu;
	@CreationTimestamp
	private Date dateCreation;
}
