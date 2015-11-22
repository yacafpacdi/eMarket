package logic;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import model.Product;

@ManagedBean
@ApplicationScoped
public class CatalogManager implements Serializable{
    
    private Integer textId;
    private String textName;
    private Double textPrice;
    private ArrayList<Product> products;

    public CatalogManager() {
        this.products=new ArrayList<>();
    }

    public CatalogManager(ArrayList<Product> products) {
        this.products = products;
    }

    public CatalogManager(Integer textId, String textName, Double textPrice) {
        this.textId = textId;
        this.textName = textName;
        this.textPrice = textPrice;
        
    }

    
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "CatalogManager{" + "products=" + products + '}';
    }
    
    @PostConstruct
    public void initCatalog(){
//        Product p1=new Product(1, "UN", 1.0);
//        this.products.add(p1);
//        Product p2=new Product(2, "DEUX", 2.0);
//        this.products.add(p2);
//        Product p3=new Product(3, "TROIS", 3.0);
//        this.products.add(p3);
//        Product p4=new Product(4, "QUATRE", 4.0);
//        this.products.add(p4);
//        Product p5=new Product(5, "CINQ", 5.0);
//        this.products.add(p5);
    }
    
    public Integer getCatalogSize(){
        return products.size();
    }

    public Integer getTextId() {
        return textId;
    }

    public void setTextId(Integer textId) {
        this.textId = textId;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public Double getTextPrice() {
        return textPrice;
    }

    public void setTextPrice(Double textPrice) {
        this.textPrice = textPrice;
    }
    
    public String createProduct(){
        Product p=new Product(textId, textName, textPrice);
        this.products.add(p);        
        return "toCatalog";
    }
    
}
