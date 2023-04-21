package base;

public class Catalog {
  this.product=new ArrayList<Product>();
}
public void addProduct(Product product){
     return this.product.add(product);
}
public Iterator<Product>iterator(){
     return this.products.iterator();
}

public Product getProduct(String code){
  for(Ptoduct product:this.products){
      if(product.getCode().equals(code)){
        return product;
      }
    )
      return null;
  }
  pulic int getNumberOfProducts(){
    return this.products.size();
  }
