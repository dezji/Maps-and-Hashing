// Name: Deziallia Morris

package com.dezji;

import static java.lang.System.out;
import java.util.HashMap;
import java.util.Map;


public class Event {

	public static void main(String[] args) {

		Calendar calendarEvent1 = new Calendar("Rue's Birthday", 2023, 11, 23);
		Calendar calendarEvent2 = new Calendar("Euphoria Season Premiere", 2025, 6, 30);
		Calendar calendarEvent3 = new Calendar("Jasper's Birthday", 2022, 9, 15);
		Calendar calendarEvent4 = new Calendar("Alex's Birthday", 2023, 11, 23);

		HashMap<Calendar, Integer> eventMap = new HashMap<>();
		eventMap.put(calendarEvent1, 1);
		eventMap.put(calendarEvent2, 2);
		eventMap.put(calendarEvent3, 3);
		eventMap.put(calendarEvent4, 4);
		
		for (Map.Entry<Calendar, Integer> event : eventMap.entrySet()) {
			out.println(event.getKey() + ": " + event.getValue());
		}
	}
}

class Calendar {
	String name;
	int year;
	int month;
	int day;

	public Calendar(String name, int year, int month, int day) {
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
			out.println("The event name is: " + name + "\nThe event's hashcode is: " + name.hashCode() );
		result = prime * result + year;
		out.println("The hash is: " + result + "\n");
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	
	

	@Override
	public String toString() {
		return "Calendar [name=" + name + ", year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	
	
}