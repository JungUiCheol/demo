package com.example.demo.member.domain;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.example.demo.role.domain.Role;

import lombok.Builder;

@Table
@Entity
public class Member {
	
	@Id
	@Column(columnDefinition = "VARCHAR(15)")
	private String id;
	
	@Column(columnDefinition = "VARCHAR(16)")
	private String pw;
	
	@Column(columnDefinition = "VARCHAR(20)")
	private String name;
	
	@Column(columnDefinition = "VARCHAR(15)")
	private String createdId;
	
	@Column(columnDefinition = "DATETIME")
	private LocalDateTime createdDt;
	
	@Column(columnDefinition = "VARCHAR(15)")
	private String updatedId;
	
	@Column(columnDefinition = "DATETIME")
	private LocalDateTime updatedDt;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name               = "member_role"
	         , joinColumns        = @JoinColumn(name = "id")
	         , inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> role;
	
	
	
	@Builder
	public Member(String id
				, String pw
				, String name
				, String createdId
				, LocalDateTime createdDt
				, String updatedId
				, LocalDateTime updatedDt
				, Set<Role> role
				) {
		this.id        = id;
		this.pw        = pw;
		this.name      = name;
		this.createdId = createdId;
		this.createdDt = createdDt;
		this.updatedId = updatedId;
		this.updatedDt = updatedDt;
		this.role      = role;
	}
}
