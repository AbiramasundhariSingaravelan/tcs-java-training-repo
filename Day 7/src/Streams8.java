import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	float price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class Streams8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> pdtList=new ArrayList<Product>();
		pdtList.add(new Product(6,"Veena",90000.00f));
		pdtList.add(new Product(1,"Laptop",25000.00f));
		pdtList.add(new Product(2,"Headphones",35000.00f));
		pdtList.add(new Product(3,"Ipad",45000.00f));
		pdtList.add(new Product(4,"Keyboard",75000.00f));
		pdtList.add(new Product(5,"Guitar",85000.00f));
		List<Float> pdtPriceList=pdtList.stream()
								.filter(p->p.price>35000)
								.map(p->p.price)
								.collect(Collectors.toList());
		System.out.println(pdtPriceList);
	}

}
