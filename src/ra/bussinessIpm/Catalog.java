package ra.bussinessIpm;

import ra.bussiness.IShop;

import java.util.Scanner;

public  class Catalog implements IShop {
    int catalogId;
    String catalogName;
    int prioty;
    String description;
    Boolean catalogStatus;
    public Catalog(){

    }

    public Catalog(int catalogId, String catalogName, int prioty, String description, Boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.prioty = prioty;
        this.description = description;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPrioty() {
        return prioty;
    }

    public void setPrioty(int prioty) {
        this.prioty = prioty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập Tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập độ ưu tiên sản phẩm");
        int priority=Integer.parseInt(scanner.nextLine());
        System.out.println("Mô tả sản phẩm");
        String description=scanner.nextLine();
        System.out.println("Trạng thái sản phẩm");
        Boolean status=Boolean.parseBoolean(scanner.nextLine());
    }


    @Override
    public void displayData() {
        System.out.println("Thông tin sản phẩm:");
        System.out.println("ID sản phẩm: " + catalogId);
        System.out.println("Tên sản phẩm: " + catalogName);
        System.out.println("Độ ưu tiên sản phẩm: " + prioty);
        System.out.println("Mô tả: " + description);
        System.out.println("Trạng thái sản phẩm: " + (catalogStatus ? "Hoạt động" : "Ngừng hoạt động"));
    }
    public void catalogName(){
        System.out.println(catalogName);
    }
}
