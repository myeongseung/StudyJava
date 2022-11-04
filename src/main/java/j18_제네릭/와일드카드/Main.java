package j18_제네릭.와일드카드;

public class Main {
    public AnimalData<?> getAnimal(int flag){ //?주면 어떤 형태든 가능
        if(flag == 1){
            AnimalData<Human> animalData1 = new AnimalData<Human>(new Human());
            return animalData1;
        }else if(flag == 2){
            AnimalData<Tiger> animalData1 = new AnimalData<Tiger>(new Tiger());
            return animalData1;
        }else{
            return null;
        }

    }
    public static void main(String[] args) {

        Main main = new Main();
        main.getAnimal(2).printData();
        //AnimalData<Human> animalData2 = new AnimalData<Human>();
    }
}
