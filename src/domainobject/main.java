package domainobject;

import java.util.ArrayList;

public class main {
    
    public static void main(String[] args) {
        
        Category categoria = new Category("9717");
        Product p1 = new Product("9712");
        Product p2 = new Product("0010");
        p1.setNombre("papas");
        p1.setDescripcion("grandes");
        p2.setNombre("gaseosa");
        p2.setDescripcion("mediana");
        
        Item i1 = new Item("1515", "etiqueta", 1500);
        Item i2 = new Item("1616", "numeropapas", 2000);
        Item i3 = new Item("1212", "embalaje", 5000);
        Item i4 = new Item("2323", "temperaturafria", 500);
        
        p1.adicionarItem(i2);
        p1.adicionarItem(i1);
        p2.adicionarItem(i3);
        p2.adicionarItem(i4);
        categoria.adicionarProducto(p1);
        categoria.adicionarProducto(p2);
        
        ArrayList<Product> listap = categoria.listarProducto();
        
        for (Product p : listap) {
            
            System.out.println(p.getNombre() + " " + p.getDescripcion());
            
            ArrayList<Item> listai = p.listarItem();
            for (Item y : listai) {
                
                System.out.println(y.getNombre() + " " + y.getUnitCost());
                
            }
        }

//       for(Product p: listap){
//       
//           System.out.println(p.getNombre() + " " + p.getDescripcion());
//          }
    }
    
}
