package com.assessment.palindromic.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assessment.palindromic.model.Palindrom;

@Repository
@Transactional
public interface PalindromRepo extends CrudRepository<Palindrom, Long>{

	 Palindrom save(Palindrom palindrom);
	

}
