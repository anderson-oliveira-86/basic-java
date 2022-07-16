package basic.java.unit13.lesson135;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class QuadrinhoRepository {
    private static List<Quadrinho> quadrinhos = List.of(new Quadrinho(1 , "Boku no hero" , 50) , new Quadrinho(2,"Overlord" , 25));


    public static Optional<Quadrinho> findById(Integer id){
        return find(i -> i.getId().equals(id));
    }

    public static Optional<Quadrinho> findByTitle(String title){
        return find(a -> a.getTitle().equals(title));
    }

    private static Optional<Quadrinho> find(Predicate<Quadrinho> predicate){
        for (Quadrinho quadrinho :
                quadrinhos) {
            if(predicate.test(quadrinho)){
                return Optional.of(quadrinho);
            }
        }
        return Optional.empty();
    }
}
