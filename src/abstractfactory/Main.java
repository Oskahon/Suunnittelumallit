package abstractfactory;

import java.io.FileInputStream;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {

		Class<?> c = null;
		VaateTehdas tehdas = null;
		
		Properties properties = new Properties();
		
		try {
			properties.load(new FileInputStream("src/abstractfactory/properties"));
		} catch (Exception e) {e.printStackTrace();}
		
		try {
			c = Class.forName(properties.getProperty("tehdas1"));
			tehdas = (VaateTehdas)c.newInstance();
		} catch (Exception e) {e.printStackTrace();}
		
		
		Koodari jasper = new Koodari();
		
		jasper.puePäälle(tehdas);
		jasper.esitteleVaatteet();
		
		try {
			c = Class.forName(properties.getProperty("tehdas2"));
			tehdas = (VaateTehdas)c.newInstance();
		} catch (Exception e) {e.printStackTrace();}
		
		jasper.puePäälle(tehdas);
		jasper.esitteleVaatteet();
	}

}
