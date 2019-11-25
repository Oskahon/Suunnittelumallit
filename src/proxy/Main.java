package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Image> kuvat = new ArrayList<>();
		
		Image kuva1 = new ProxyImage("kuva1");
		Image kuva2 = new ProxyImage("kuva2");
		Image kuva3 = new ProxyImage("kuva3");
		Image kuva4 = new ProxyImage("kuva4");
		
		kuvat.add(kuva1);
		kuvat.add(kuva2);
		kuvat.add(kuva3);
		kuvat.add(kuva4);
		
		for (Image i:kuvat) {
			i.showData();
		}
		System.out.println();
		
		for(Image i:kuvat) {
			i.displayImage();
		}
	
		for(Image i:kuvat) {
			i.displayImage();
		}
		
	}

}
