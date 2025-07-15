public class BoxVolume{
    public static void main(String[] args){
        Box a=new Box( 3.4f,4.4f,6f);
        a.boxvolume();
    }
}
class Box {
    float width;
    float height;
    float depth;
    public Box (float width,float height,float depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    void boxvolume(){
        float vol = width*height*depth;
        System.out.println("volume"+vol);
    }
}
