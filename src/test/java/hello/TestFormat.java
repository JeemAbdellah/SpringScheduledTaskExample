package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFormat {
	private ScheduledTasks task = new ScheduledTasks();
	
	@Test
	public void verifiyForamt() {
		assertTrue(task.renderDate().matches("(the time is )?((:)[0-9]{2})+"));
	}

}
