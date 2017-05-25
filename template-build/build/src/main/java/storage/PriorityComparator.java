//@@author A0125084L
package main.java.storage;

import java.util.Comparator;

import main.java.data.Task;
 /**
  * A Comparator for Task objects that can sort tasks based on their priority
  * @author Hou Bo Wen
  *
  */
public class PriorityComparator implements Comparator<Task>{

	/**
	 * 
	 */
	@Override
	public int compare(Task task1, Task task2) {

		if (task1.getPriority().equals(task2.getPriority())) {
			return task1.getTask().compareTo(task2.getTask());
		}
		else {
			return task1.getPriority().compareTo(task2.getPriority());
		}
	}
}
//@@author A0125084L