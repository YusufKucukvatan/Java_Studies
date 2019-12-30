package day39_Review;

public class CellPhoneTest {
	public static void main(String[] args) {
		CellPhone phone1 = new CellPhone();
		phone1.brand = "Samsung";
		phone1.model = "S8";
		phone1.screensize = 5.8;
		phone1.color = "Black";
		phone1.price = 400;
		phone1.phoneID();
		phone1.call(5711234567L);
		phone1.sendMessage(5711234567L);

		CellPhone phone2 = new CellPhone("panasonic", 100, "white", 2.1, "GD93");
		phone1.phoneID();

	}
}
