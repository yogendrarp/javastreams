import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

import org.graalvm.compiler.graph.spi.Canonicalizable.Binary;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //Comparator<String> comparator = (String s1,String s2)->Integer.compare(s1.length(), s2.length());


        // Runnable r= ()->{
        //     int i=0;

        // };

        /*
         *Method References
         */
        //Function<Person,Integer> f = person->person.getAge();
        //Function<Person,Integer> f = Person::getAge; // non static method

        // BinaryOperator<Integer> sum=(i1,i2) ->i1+i2;
        // BinaryOperator<Integer> sum2=(i1,i2) -> Integer.sum(i1, i2);
        // BinaryOperator<Integer> sum3 = Integer::sum; // it can be both static and non static.. here static


        // Consumer<String> printer = s->System.out.println(s);
        // Consumer<String> printer2 = System.out::println;


        // How to Create new APIs

    }

}
