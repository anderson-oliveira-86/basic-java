package basic.java.unit13.lesson135;

import basic.java.util.Util;

import java.util.Optional;
import java.util.function.Supplier;

public class Lesson135 {
    public static void main(String[] args) {
        Util.printTitle("Optional pt 02");

        Optional<Quadrinho> quadrinho = QuadrinhoRepository.findByTitle("Boku no hero");
        QuadrinhoRepository.findByTitle(quadrinho.get().getTitle())
                .ifPresent(m -> m.setTitle(m.getTitle() + " 2"));
        System.out.println(quadrinho);

        Quadrinho quadrinho1 = QuadrinhoRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(quadrinho1);

        Quadrinho quadrinho2 = QuadrinhoRepository.findByTitle("Drifters")
                .orElseGet(() -> new Quadrinho(3, "Drifters", 20));
        System.out.println(quadrinho2);


    }
}
