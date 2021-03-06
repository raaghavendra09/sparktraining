package com.dmac.analytics.spark;

import java.util.ArrayList;
import java.util.List;

public class ListSource {
	
	public List<LatLong> retrieveList() {
		List<LatLong> listSource = new ArrayList<>();
		
		listSource.add(new LatLong("11", "82°30′N", "62°20′W", "Nunavut"));
		listSource.add(new LatLong("1", "82°30′N", "62°20′W", "One"));
		listSource.add(new LatLong("2", "82°30′N", "62°20′W", "Two"));
		listSource.add(new LatLong("3", "82°30′N", "62°20′W", "Three"));
		listSource.add(new LatLong("4", "82°30′N", "62°20′W", "Four"));
		listSource.add(new LatLong("5", "82°30′N", "62°20′W", "Five"));
		listSource.add(new LatLong("6", "82°30′N", "62°20′W", "Six"));
		listSource.add(new LatLong("7", "82°30′N", "62°20′W", "Seven"));
		listSource.add(new LatLong("8", "82°30′N", "62°20′W", "Eight"));
		listSource.add(new LatLong("9", "71°18′N", "156°46′W", "Nine"));
		listSource.add(new LatLong("10", "82°30′N", "62°20′W", "Ten"));
		listSource.add(new LatLong("11", "82°30′N", "62°20′W", "Eleven"));
		listSource.add(new LatLong("11", "82°30′N", "62°20′W", "Tweleve"));
		listSource.add(new LatLong("11", "82°30′N", "62°20′W", "Thirteen"));
		listSource.add(new LatLong("11", "82°30′N", "62°20′W", "Fourteen"));
		listSource.add(new LatLong("11", "82°30′N", "62°20′W", "Fifteen"));
		listSource.add(new LatLong("11", "82°30′N", "62°20′W", "Sixteen"));
		
		return listSource;
	}
	 
	
	public List<String> retrieveListOfStrings() {
		List<String> listSource = new ArrayList<>();
		listSource.add("Karikalan");	listSource.add("Turing");
		listSource.add("Ramanujam");	listSource.add("Nathan Martz");
		listSource.add("Zeus");			listSource.add("Matei");
		listSource.add("Ramanujam");	listSource.add("Tatagatha");
		listSource.add("Karikalan");	listSource.add("Joshua");
		listSource.add("Feynman");		listSource.add("Shree");
		listSource.add("Kundera");		listSource.add("Krishnavi");
		listSource.add("Chola");		listSource.add("Kiruthi");
		listSource.add("Raja Raja");	listSource.add("Karl");
		listSource.add("Pallavas");		listSource.add("Marx");
		listSource.add("Alan"); 		listSource.add("Lenin");
		listSource.add("Das");			listSource.add("Mao");
		return listSource;
	}
}