package com.ericsson.functions;

import java.util.List;

public class Functions {
public static void main(String[] args) {
	
	
	var list = List.of("New","Style","of","wrtting","list");
	list.stream().forEach(System.out::println);
	
	var option = list.stream()
	     .reduce((s,e) ->s.concat(e))
	     .orElse("Hey Default Value ");

	System.out.println("Großbritannien : "+option );
}
}
