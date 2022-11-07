package j18_제네릭.와일드카드;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class AnimalData<T> {
    private T animal;

    public void printData(){
        ((Animal)animal).move();

        if(animal.getClass() == Human.class){
            ((Human)animal).readBooks();
        }else if(animal.getClass() == Tiger.class) {
            ((Tiger) animal).hunting();
        }
//        }else if(animal.getClass() == Car.class){
//            ((Car)animal).
//        }
        System.out.println();
    }
}
