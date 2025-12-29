public class Item_nullpoint{
	public static void main(String[] args){
        Item[] items = { new Item(100), new Item(200), new Item(300) };
	int total = 0;
	for (int i = 0; i < items.length; i++){
		total += items[i].price;
	}
	System.out.println(total);
	}
}
