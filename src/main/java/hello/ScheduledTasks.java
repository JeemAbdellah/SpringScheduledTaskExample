package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks{
	
	private static final SimpleDateFormat dateFormat  = new SimpleDateFormat("HH:mm:ss"); 
	@Scheduled(fixedRate=10000)
	public void scheduledTask(){
		System.err.println(renderDate());
	}
	public String renderDate(){
		return "the time is :"+ dateFormat.format(new Date());
	}

}