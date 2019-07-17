package lessonStudy3;

public class Box3 {
    double width;
    double height;
    double depth;
    double volume(){
        return width*height*depth;
    }
    double volume1(double w, double h, double d){
        width=w;
        height=h ;
        depth=d;
        return w*h*d;
    }
}
class Box3Demo{
    public static void main(String[] args){
        Box3 newBox = new Box3();
        Box3 newBox1 = new Box3();
        newBox.depth = 10;
        newBox.height = 20;
        newBox.width = 30;
       double vol = newBox.volume();
       System.out.println(vol);
       System.out.println((newBox.volume()));
       System.out.println (newBox1.volume1(10,20,30));
    }
}
