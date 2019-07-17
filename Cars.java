package lessonStudy3;

public class Cars {
    int weight;
    String engType;
    double year;

    Cars() {
        weight = 1234;
        engType = "Дизель";
        year = 2006;
    }

    Cars(int a, String b, double c) {
        weight = a;
        engType = b;
        year = c;
    }

    static int weightCheck(int i) {
        switch (i / 1000) {
            case 1:
            case 2:
                System.out.println("легковая");
               i = 1;
                break;
            case 3:
            case 4:
                System.out.println("джип");
                i = 2;
                break;
            case 5:
            case 6:
                System.out.println("грузовая");
                i = 3;
                break;
            default:
                System.out.println("самолет");
                i = 4;

                break;
        }
        return i;
    }

    void randomCars() {
        weight = (int)(Math.random() * (8000 - 100) + 1000);
        year = (Math.random() * (2019 - 1995) + 1995) / 1;
        double i;
        i = (Math.random() * (3 - 1) + 1) / 1;
        String en;
        if (i == 1) engType = "Дизель";
        else engType = "Бензин";
    }
}
class CarsDemo{
    public static void main(String[] args){
        Cars toyota = new Cars();
        Cars mazda = new Cars();
        mazda.randomCars();


        System.out.println(Cars.weightCheck(toyota.weight));
    }
}


