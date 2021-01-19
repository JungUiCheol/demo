package com.example.demo.board.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.member.domain.Member;

import lombok.Builder;

@Table
@Entity
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "BIGINT")
	private Long seq;
	
	@Column(columnDefinition = "VARCHAR(100)")
	private String title;
	
	@Column(columnDefinition = "BLOB")
	private String content;
	
	@Column(columnDefinition = "VARCHAR(15)")
	private String createdId;
	
	@Column(columnDefinition = "DATETIME")
	private LocalDateTime createdDt;
	
	@Column(columnDefinition = "VARCHAR(15)")
	private String updatedId;
	
	@Column(columnDefinition = "DATETIME")
	private LocalDateTime updatedDt;
	
	@Column(columnDefinition = "INT")
	private int viewCnt;
	
	
	@ManyToOne
	private Member member;
	
	
	@Builder
	public Board(Long seq
			   , String title
			   , String content
			   , String createdId
			   , LocalDateTime createdDt
			   , String updatedId
			   , LocalDateTime updatedDt
			   , int viewCnt
			   , Member member
			   ) {
		this.seq       = seq;
		this.title     = title;
		this.content   = content;
		this.createdId = createdId;
		this.createdDt = createdDt;
		this.updatedId = updatedId;
		this.updatedDt = updatedDt;
		this.viewCnt   = viewCnt;
		this.member    = member;
	}
}
