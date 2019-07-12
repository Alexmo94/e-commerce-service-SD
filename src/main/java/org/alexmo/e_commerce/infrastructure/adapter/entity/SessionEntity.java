package org.alexmo.e_commerce.infrastructure.adapter.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="session")
public class SessionEntity {
	
	@Id
	@Column(name = "session_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sessionId;
	
	@Column(name = "session_data_time", nullable = false)
	private LocalDateTime sessionDateTime;
	
	@Column(name = "session_ip", nullable = false)
	private String sessionIp;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private UserEntity userId;
}
