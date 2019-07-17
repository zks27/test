package lessonStudy3;

class Box5 {
    double width;
    double height;
    double depth;
    Box5(double w,double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume (){
        return width*height*depth;
    }
}
class Box5demo{
    public static void main (String[] args){
        Box5 newBox = new Box5(10,20,30);
        System.out.println(newBox.volume());
    }
}
