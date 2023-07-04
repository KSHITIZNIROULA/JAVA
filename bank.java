
interface bank{
    float rateofinterest();
}
class NIC implements bank{
    public float rateofinterest(){
    return 9.15f;
}
}
class sanima implements bank{
    public float rateofinterest(){
        return 9.7f;
    }
    
}
class Testinterface2{
    public static void main(String[]args){
        bank b=new sanima();
        System.out.println("ROI:"+ b.rateofinterest());
    }
}