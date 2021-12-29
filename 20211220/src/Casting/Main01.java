package Casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있다.
		
		Animal c1 = new Cat("뿡이",3);
		Animal d1 = new Dog("뿡뿡이",2);
		Animal a1 = new Animal("동물",1);
		
		c1.sit(); // Cat에만 있는 push는 불가 sit은 Animal 과 Cat 두곳에 다 있기 떄문에 가능
		d1.sit();
		a1.sit();				
		
		// 각 자료형에 맞는 변수로 채워서 대입하겠습니다.
		Cat cat = (Cat)c1; // c1은 Animal타입이지만 힙에 저장된 데이터는 Cat이므로 Cat으로 변환 가능
        cat.push();	
        
        Dog dog = (Dog)d1;
        dog.bark();
	}
}
