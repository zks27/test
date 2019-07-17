package lessonStudy3;

public class Box4 {
    double width;
    double height;
    double depth;

    Box4() {
        System.out.println("Объект");
        width = 10;
        height = 20;
        depth = 30;
    }

    double vol() {
        return width * height * depth;
    }
}

class Box4Demo {
    public static void main(String[] args) {
        Box4 newBox = new Box4();
        System.out.println(newBox.vol());

    }
}