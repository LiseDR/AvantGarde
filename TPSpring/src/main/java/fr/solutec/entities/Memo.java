package fr.solutec.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;	
import lombok.NoArgsConstructor;


@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Memo {
	@Id @GeneratedValue
	private Long idMemo;
	private String memo;
	@Column(columnDefinition = "boolean default true", nullable=false)
	private boolean prive; 
	@CreationTimestamp
	private Date dateCreation;
	
	@ManyToOne
	private User expediteur;
	@ManyToOne
	private User destinataire;
}
