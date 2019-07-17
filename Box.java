package lessonStudy3;

public class Box {
    double width;
    double height;
    double depth;
}

class BoxDemo {
    public static void main(String[] args) {
        Box newBox1 = new Box();
        Box newBox2 = new Box();
        double vol1;
        double vol2;
        newBox1.width = 10;
        newBox1.height = 20;
        newBox1.depth = 30;
        vol1 = newBox1.depth*newBox1.height*newBox1.width;
        System.out.println(vol1);
        newBox2.width = 30;
        newBox2.height = 40;
        newBox2.depth = 50;
        vol2 = newBox2.depth*newBox2.height*newBox2.width;
        System.out.println(vol2);




    }
}
