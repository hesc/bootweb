package com.hesc.booweb.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

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
    private String category;
    //	@OneToOne
//	private Category category;
    private int priority;
    @Enumerated(EnumType.ORDINAL)
    private Status status;

}
