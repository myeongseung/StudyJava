package j18_제네릭.와일드카드;

public class Main {
    public AnimalData<? extends Animal> getAnimal(int flag){ //?주면 어떤 형태든 가능
        if(flag == 1){
            AnimalData<Human> animalData1 = new AnimalData<Human>(new Human());
            return animalData1;
        }else if(flag == 2){
            AnimalData<Tiger> animalData1 = new AnimalData<Tiger>(new Tiger());
            return animalData1;
        }
//        else if(flag == 3){
//            AnimalData<Tiger> animalData1 = new AnimalData<Tiger>(new Tiger());
//            return animalData1;
//        }
        else{
            return null;
        }

    }
    public static void main(String[] args) {

        Main main = new Main();
        System.out.println(main.getAnimal(3));
        main.getAnimal(3).toString();
        //AnimalData<Human> animalData2 = new AnimalData<Human>();
    }
}
