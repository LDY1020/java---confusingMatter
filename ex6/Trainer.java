package matter.ex6;

public class Trainer {
    
    public void train(Animal animal){
        animal.sound();
        if(animal instanceof Dog){
            System.out.println("공 가져오기 훈련");
        }else if(animal instanceof Cat){
            System.out.println("쥐 잡기 훈련");
        }else{
            System.out.println("특별 훈련 없음");
        }
    }
}
