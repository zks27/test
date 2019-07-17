package lessonStudy3;

public class Box2 {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Volume is:");
        System.out.println(width * depth * height);
    }
}

class Box2Demo {
    public static void main(String[] args) {
        Box2 newBox = new Box2();
        newBox.width = 30;
        newBox.height = 30;
        newBox.depth = 30;
        newBox.volume();

    }
}
