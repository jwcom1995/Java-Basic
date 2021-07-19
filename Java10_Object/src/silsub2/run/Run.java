package silsub2.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p = new Product();
		
		p.setBrand("농심");
		p.setPName("새우깡");
		p.setPrice(1200);
		
		System.out.println(p.information());

	}

}
