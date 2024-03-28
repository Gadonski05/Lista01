public class MainPz {
    
    public static void main(String[] args) {
        
        Pizza pizzaBroto = new Pizza("Dois amores", 59.0, "chocolate branco");

        Pedido pedido = new Pedido();

        pedido.adcPizza(pizzaBroto);

        System.out.println("Valor total: R$" + pedido.valTotal());
    }
}
