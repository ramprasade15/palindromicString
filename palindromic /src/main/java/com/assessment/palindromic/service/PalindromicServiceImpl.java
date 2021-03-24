package com.assessment.palindromic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.palindromic.model.Palindrom;
import com.assessment.palindromic.repository.PalindromRepo;

@Service
public class PalindromicServiceImpl implements PalindromicService {
	
	@Autowired
	PalindromRepo palindromRepo;
	
	Palindrom palindrom = new Palindrom();
	
	public String  retrivePalindrom(String str) {
		int stringLength = str.length();

		String maxLengthPalindrom = "";
		String currentString;

		int maxLength = 0;
		int currentStringLength;
		for (int i = 0; i < stringLength; i++) {
			currentString = expand(str, i, i);
			currentStringLength = currentString.length();

			if (currentStringLength > maxLength) {
				maxLength = currentStringLength;
				maxLengthPalindrom = currentString;
			}

			currentString = expand(str, i, i + 1);
			currentStringLength = currentString.length();

			if (currentStringLength > maxLength) {
				maxLength = currentStringLength;
				maxLengthPalindrom = currentString;
			}
		}
		palindrom.setStr(str);
		palindrom.setLongestPalindrome(maxLengthPalindrom);
		palindromRepo.save(palindrom);
		return maxLengthPalindrom;
	}
	
	 private String expand(String str, int l, int r)
	    {
	        int stringLength = str.length();

	        while (l >= 0 && r < stringLength &&
	                (str.charAt(l) == str.charAt(r))) {
	            l--;
	            r++;
	        }
	        return str.substring(l + 1, r);
	    }
	

}
