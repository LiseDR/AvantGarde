package fr.solutec.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor @AllArgsConstructor @Data @Entity

public class UserEvent implements Serializable {
	@Id @ManyToOne
	private User user;
	
	@Id @ManyToOne
	private Events event;
	
	private Date demandDate;

	@Column(columnDefinition = "boolean default false", nullable = false)
	    private boolean demandTreated;

	 @Column(columnDefinition = "boolean default false", nullable = false)
	    private boolean accessGranted;
}
