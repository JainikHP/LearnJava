import com.food.Fruit;

class Apple implements Fruit {

	public static void main (String[] args) {
		System.out.println("Apple there");
		System.out.println(FRUIT_SCORE);
		//FRUIT_SCORE = 20;
	}

	public boolean amIFruit() {
		return false;
	}

}

javac -d ../out com/company/MyClass.java com/food/Fruit.java com/home/MySecondClass.java  com/certification/Parent.java com/other/Child.java Apple.java
