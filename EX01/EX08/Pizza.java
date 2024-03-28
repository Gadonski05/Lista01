import java.util.List;
import java.util.ArrayList;

class Pizza{

    private String nome;
    private double val;
    private List<String> comp;

    public Pizza(String nome, double val, List<String> comp){

        this.nome = nome;
        this.val = val;
        this.comp = comp;
    }

    public String getNome(){
        this.nome = nome;

    }

    public double getVal(){
        return val;

    }

    public List<String> getComp(){
        this.comp = comp;
    }
}

class Pedido{
    private List<Pizza> pizzas;

    public Pedido(){
        this.pizzas = new ArrayList<>();

    }

    public void adcPizza(Pizza pizza){
        pizzas.add(pizza);

    }

    public double valTotal(){
        double total = 0;

        for(Pizza pizza: pizzas){
            total += pizza.getVal();
        }
        return total;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void getPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}