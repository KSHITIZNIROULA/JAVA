class employee{
    public static int base=10000;
    int salary(){
        return base;
    }
}
class manager extends employee{
    int salary(){
        return base+20000;
    }
}
class clerk extends employee{
    int salary(){
        return base+10000;
    }
}
class main{
      static void printsalary(employee e){
        System.out.print(e.salary());
    } 
    public static void main(String[]args){
        employee obj1=new manager();
        System.out.print("manager's salary:");
        
        printsalary(obj1);
        employee obj2=new clerk();
        System.out.print("clerk's salary:");
        printsalary(obj2);
        
        
    }
}