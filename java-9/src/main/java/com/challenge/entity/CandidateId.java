package com.challenge.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Embeddable
@EntityListeners(AuditingEntityListener.class)
public class CandidateId implements Serializable{
	

	@NotNull
	@ManyToOne
	private User user_id;
	
	@NotNull
	@ManyToOne
	private Acceleration acceleration_id;
	
	@NotNull
	@ManyToOne
	private Company company_id;
}
