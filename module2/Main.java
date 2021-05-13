package module2;

public class Main {
    public static void main(String[] args) {
        Predicate<String> p1 = s-> s.length() < 20;
        Predicate<String> p2 = s-> s.length() >5;

        System.out.println(p1.test("hello"));

        Predicate<String> p3 = p1.and(p2);


        Predicate<String> p5 = Predicate.isEqualsTo("Yes");
        System.out.println(p5.test("Yes"));
        System.out.println(p5.test("No"));


    }
    
}
