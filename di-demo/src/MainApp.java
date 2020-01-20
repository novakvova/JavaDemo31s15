import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello app");
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("ConfigSpring.xml");
		
		
//		Engine engine = context.getBean("myEngine", Engine.class);//new EngineLanos();
//		engine.start();
		
		Car car = context.getBean("myCar", Car.class);
		car.drive();
		
		context.close();
	}

}
