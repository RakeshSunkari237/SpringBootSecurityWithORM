package com.securityexample.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_tab")
public class User {

	@Id
	@GeneratedValue
	private Integer uid;

	@Column(name = "uname")
	private String name;

	private String email;

	@Column(name = "pwd")
	private String pwd;

	@ElementCollection
	@CollectionTable(name = "roles_tab", joinColumns = @JoinColumn(name = "uid"))
	@Column(name = "role")
	private List<String> roles;
}
