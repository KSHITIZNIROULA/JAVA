class A{
    void msg(){System.out.println("hello");}
}class B{
    void msg(){System.out.println("welcome");}
    
}

class C extends A,B{
    public Static void main(String arg[]){
        C obj=new C();
        obj.msg();
        
        
    }
}

