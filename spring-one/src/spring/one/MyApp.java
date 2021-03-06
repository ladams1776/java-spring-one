package spring.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.one.Coach.CoachInterface;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CoachInterface theCoach = context.getBean("myCoach", CoachInterface.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
