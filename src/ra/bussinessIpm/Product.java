package ra.bussinessIpm;

import ra.bussiness.IShop;
import ra.bussinessIpm.Catalog;

import java.util.Scanner;

public class Product implements IShop  {
    int productId;
     String productName;
     String title;
     String description;
     Catalog catalog;
     float impPrice;
     float exportPrice;
     Boolean productStatus;

    public Product(int productId, String productName, String title, String description, Catalog catalog, float impPrice, float exportPrice, Boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.description = description;
        this.catalog = catalog;
        this.impPrice = impPrice;
        this.exportPrice = exportPrice;
        this.productStatus = productStatus;
    }
    public Product(){

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImpPrice() {
        return impPrice;
    }

    public void setImpPrice(float impPrice) {
        this.impPrice = impPrice;
    }

    public float getExportPrice() {
        return impPrice*IShop.RATE;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập mã sản phẩm : ");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập tiêu đề sản phẩm");
        String title=scanner.nextLine();
        System.out.println("Mô tả sản phẩm");
        String descriptions=scanner.nextLine();
        System.out.println(("Danh mục sản phẩm"));
        Catalog catalog1=new Catalog();
         String catalogName = catalog1.catalogName;
        System.out.println("Gía Nhập");
        float imp=Float.parseFloat(scanner.nextLine());
        System.out.println("Trạng thái");
        Boolean status=Boolean.parseBoolean(scanner.nextLine());
    }



    @Override
    public void displayData() {
        System.out.println("Mã sản phẩm là " + productId);
        System.out.println("Tên sản phẩm " + productName);
        System.out.println("Tên danh mục sản phẩm " +productName);
        System.out.println("Gía bán sản phẩm là 0 " + exportPrice);
        System.out.println("Trạng thái sản phẩm là " + productStatus);

    }
}
