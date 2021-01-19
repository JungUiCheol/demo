package com.example.demo.role.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;

@Table
@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "INT")
	private int roleId;
	
	@Column(columnDefinition = "VARCHAR(10)")
	private String role;
	
	@Column(columnDefinition = "VARCHAR(20)")
	private String roleNm;
	
	
	@Builder
	public Role(int roleId, String role, String roleNm) {
		this.roleId = roleId;
		this.role   = role;
		this.roleNm = roleNm;
	}
}
