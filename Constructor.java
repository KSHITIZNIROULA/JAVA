 class Box{
    double l,b,h,vol;
    Box(){
        l=5;
        b=3;
        h=2.3;
        
    }
    void calculate(){
        vol=l*b*h;
        System.out.println("volume of the box is "+vol);
        
    }
        
    }
    public class Constructor{
        public static void main(String[]args){
            Box obj= new Box();
            obj.calculate();
        }
    }
