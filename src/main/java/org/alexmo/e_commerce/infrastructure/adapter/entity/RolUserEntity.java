package org.alexmo.e_commerce.infrastructure.adapter.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name ="rol_user")
public class RolUserEntity {

	@Id
	@ManyToOne
	@JoinColumn(name="rol_id", nullable = false)
	private RolEntity rolId;
	
	@Id
	@OneToOne
	@JoinColumn(name="user_id", nullable = false)
	private UserEntity userId;	
	
}
