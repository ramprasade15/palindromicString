package com.assessment.palindromic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Palindrom {
	
	@Id
    @JsonIgnore
    @Column(name="id", nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String str;
	
	private String longestPalindrome; 

}
