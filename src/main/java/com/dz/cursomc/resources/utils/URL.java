package com.dz.cursomc.resources.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class URL {

	public static List<Integer> decodeIntList(String str){
		String[] vet = str.split(",");
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < vet.length; i++) {
			list.add(Integer.parseInt(vet[i]));
		}
		
		return list;
		//return Arrays.asList(str.split(",")).stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList()); /// Utilizando lambda
	}
	
	public static String decodeParam(String arg) {
		try {
			return URLDecoder.decode(arg, "UTF-8");
			
		}catch(UnsupportedEncodingException e) {
			return "";
		}
	}
}
