package com.demo;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringReversalUsingReduce {
	public static void main(String[] args) {
		String value="{{}}[[]{";
	List<String> list=	value.chars().mapToObj(c->String.valueOf((char)c)).toList();
	
	Map<String,Long> symVsCount=	list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	symVsCount.entrySet().stream().filter(e->e.getValue()%2!=0).map(e->e.getKey()).collect(Collectors.toList()).forEach(System.out::println);
	}
}






