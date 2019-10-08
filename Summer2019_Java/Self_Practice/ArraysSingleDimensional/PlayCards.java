package ArraysSingleDimensional;

public class PlayCards {
	public static void main(String[] args) {
		String[] suits= {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks={"Ace", "2", "3", "4","5", "6", "7", "8","9", "10", "Jack", "Queen", "King"};
		int[] deck=new int[52];
		for (int i = 0; i < deck.length; i++) {
			deck[i]=i;
		}
		for (int i = 0; i < deck.length; i++) {
			int index=(int)(Math.random()*deck.length);
			int temp=deck[i];
			deck[i]=index;
			index=temp;
		}
		System.out.println("First 4 cards in the deck are: ");
		for (int i = 0; i < 4; i++) {
			String rank=ranks[deck[i]%13];
			String suit=suits[deck[i]/13];
			System.out.println(suit+" "+rank);
		}
		
	}

}
