package com.example.demo.board.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;

@Table
@Entity
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seq", columnDefinition = "BIGINT")
	private Long seq;
	
	@Column(name = "title", columnDefinition = "VARCHAR(100)")
	private String title;
	
	@Column(name = "content", columnDefinition = "BLOB")
	private String content;
	
	@Column(name = "creation_id", columnDefinition = "VARCHAR(15)")
	private String creationId;
	
	@Column(name = "creation_dt", columnDefinition = "DATETIME")
	private LocalDateTime creationDt;
	
	@Column(name = "updated_id", columnDefinition = "VARCHAR(15)")
	private String updatedId;
	
	@Column(name = "updated_dt", columnDefinition = "DATETIME")
	private LocalDateTime updatedDt;
	
	@Column(name = "view_cnt", columnDefinition = "INT")
	private int viewCnt;
	
	
	@Builder
	public Board(Long seq
			   , String title
			   , String content
			   , String creationId
			   , LocalDateTime creationDt
			   , String updatedId
			   , LocalDateTime updatedDt
			   , int viewCnt
			   ) {
		this.seq = seq;
		this.title = title;
		this.content = content;
		this.creationId = creationId;
		this.creationDt = creationDt;
		this.updatedId = updatedId;
		this.updatedDt = updatedDt;
		this.viewCnt = viewCnt;
	}
}
