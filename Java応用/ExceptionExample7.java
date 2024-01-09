public class ExceptionExample7{
    public static void main(String[] args){
        Person p =  new Person();
        try{
            p.setAge(-5);
        }catch(InvalidAgeExceptio e){
            System.out.println(e);
        }
    }
}
class InvalidAgeExceptio extends Exception {
    InvalidAgeExceptio(String message) {
        super(message);
    }
}
class Person{
    int age;
    void setAge(int age) throws InvalidAgeExceptio{
        if (age < 0){
            throw new InvalidAgeExceptio("年齢にマイナスの値が追加されました。");
        }
        this.age = age;
    }
    }

