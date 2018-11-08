package com.hesc.booweb.entities;


import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "toreaditem")
public class ToReadItem {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private String id;
	private String name;
	private String url;
	@OneToOne
	private Category category;
	private int priority;
	@Enumerated(EnumType.ORDINAL)
	private Status status;

}
