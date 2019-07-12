package org.alexmo.e_commerce.infrastructure.adapter.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@Column(nullable = false, name = "user_id")
	private long userId;

	@Column(nullable = false, name = "user_first_name")
	private String userFirstName;

	@Column(nullable = true, name = "user_second_name")
	private String userSecondName;

	@Column(nullable = false, name = "user_last_name")
	private String userLastName;

	@Column(nullable = true, name = "user_second_last_name")
	private String userSecondLastName;

	@Column(nullable = false, name = "user_address")
	private String userAddress;

	@Column(nullable = true, name = "user_phone")
	private long userPhone;

	@Column(nullable = false, name = "user_cell_phone")
	private long userCellPhone;

	@Column(nullable = false, name = "user_email")
	private String userEmail;

	@Column(nullable = false, name = "user_birthday")
	private LocalDate userBirthDay;

	@Column(nullable = false, name = "user_city")
	private String userCity;

	@Column(nullable = false, name = "user_password")
	private String userPassword;

	@Column(nullable = false, name = "user_create_at")
	private LocalDateTime userCreateAt;

	@Column(nullable = true, name = "user_update_at")
	private LocalDateTime userUpdateAt;

	@JsonIgnore
	@OneToMany(mappedBy = "userId")
	private Set<SessionEntity> sessions;
	
	@JsonIgnore
	@OneToOne(mappedBy = "userId")
	private Set<RolUserEntity> RolUsers;
	
}
