package curso.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DesenhoApp {

	public static void main(String[] args) {
		//Triangulo triangulo = new Triangulo();
		
		//Spring do jeito antigo menos usado. O arquivo xml tem que estar fora do src
		//exemplo1();
		
		//Spring do jeito antigo menos usado. O arquivo xml tem que estar dentro do src
		exemplo2();
		
	}

	private static void exemplo2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		  //So comentei pq criei dois bean com a mesma classe ai diferenciei pelo id
		//Triangulo trianguloExemplo1 = context.getBean(Triangulo.class);
		Triangulo trianguloExemplo2 = (Triangulo) context.getBean("trianguloId");
	//	trianguloExemplo1.desenhar();
		trianguloExemplo2.desenhar();
	}

	private static void exemplo1() {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangulo trianguloExemplo1 = factory.getBean(Triangulo.class);
		Triangulo trianguloExemplo2 = (Triangulo) factory.getBean("trianguloId");
		trianguloExemplo1.desenhar();
		trianguloExemplo2.desenhar();
		
	}

}
