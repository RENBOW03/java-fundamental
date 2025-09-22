package shopping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book2{
	private String isbn;
	private String name;
	private int id;
}

class Demo2 {
	public static void main(String[] args) {
		Book2 b = new Book2();
		Book2 a = new Book2("a","a",1);
		System.out.println(a);
		System.out.println(b);
	}
}