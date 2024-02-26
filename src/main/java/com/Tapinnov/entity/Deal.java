package com.Tapinnov.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbldeals_dealdemographics", schema = "dbo")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Deal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "demo_i_id", nullable = false)
	private int demoID;
	@Column(name = "demo_v_dealname")
	private String demoDealName;
	@Column(name = "demo_i_peopclientid")
	private int demoPeopClientID;
	@Column(name = "demo_d_chgdate")
	private Date demoChgDate;
	
	 @Column(name = "demo_i_userid",nullable = true) 
	 private Integer demoUserID;
	 
	 

}
