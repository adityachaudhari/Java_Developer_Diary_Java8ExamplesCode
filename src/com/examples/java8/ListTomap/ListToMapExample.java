package com.examples.java8.ListTomap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by adityacchaudhari
 */
public class ListToMapExample
{
	public static void main(String[] args)
	{
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1001, "Steive", "steive@gmail.com", "Marketing"));
        employeeList.add(new Employee(1002, "Joe", "joe@gmail.com", "Admin"));
        employeeList.add(new Employee(1003, "louise", "louise@gmail.com", "Marketing"));
        employeeList.add(new Employee(1004, "karan", "karan@gmail.com", "Admin"));

        //create map of ID and Email ID by accessing method way
        Map<Integer,String> mapOfIDAndEmail = employeeList.stream().collect(Collectors.toMap(Employee::getID, Employee::getEmailID));

        //create map of ID and Email ID by predicate way
        Map<Integer,String> mapOfIDAndEmialPredicateWay = employeeList.stream()
                .collect(Collectors.toMap(ID -> ID.getID(), emailID -> emailID.getEmailID()));

        System.out.println("The mapOfIdAndEmail is  :  " + mapOfIDAndEmail);
        System.out.println("The mapOfIDAndEmialPredicateWay is  :  " + mapOfIDAndEmialPredicateWay);

	}
}
