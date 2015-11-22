package logic;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Product;
import model.ShoppingCartItem;

@ManagedBean
@SessionScoped
public class ShoppingCartManager implements Serializable{
    
    private ArrayList<ShoppingCartItem> shoppingCartItems;

    public ShoppingCartManager() {
        this.shoppingCartItems=new ArrayList<>();
    }

    public ShoppingCartManager(ArrayList<ShoppingCartItem> shoppingCartItems) {
        this.shoppingCartItems = shoppingCartItems;
    }

    public ArrayList<ShoppingCartItem> getShoppingCartItems() {
        return shoppingCartItems;
    }

    public void setShoppingCartItems(ArrayList<ShoppingCartItem> shoppingCartItems) {
        this.shoppingCartItems = shoppingCartItems;
    }
    
    public Integer getShoppingCartSize(){
        
        return shoppingCartItems.size();
        
    }
    
    @PostConstruct
    public void initCart(){
        Product p1=new Product(1, "fufu", 34.0);
        ShoppingCartItem s1=new ShoppingCartItem(11, 3, p1);
        this.shoppingCartItems.add(s1);
        
    }
    
    
}
