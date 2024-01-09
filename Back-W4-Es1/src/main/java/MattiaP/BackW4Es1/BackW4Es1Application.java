package MattiaP.BackW4Es1;

import MattiaP.BackW4Es1.entities.ConfigurazioneBeans;
import MattiaP.BackW4Es1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

@SpringBootApplication
public class BackW4Es1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurazioneBeans.class);
		Menu menu = ctx.getBean(Menu.class);

		System.out.println("Esempio Menu:");
		menu.stampaMenu();
	}

}
