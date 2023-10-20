package ra.run;

import ra.bussinessIpm.Catalog;
import ra.bussinessIpm.Product;

import java.util.Scanner;

import static sun.misc.Signal.handle;

public class ProductManagemen {
    static Scanner scanner = new Scanner(System.in);
    static Catalog[] catalogs = new Catalog[100];
    static Product[] products = new Product[100];
    static int idCatalog = 0;
    static int idProduct = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************\n" +
                    "1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục \n" +
                    "2. Nhập số sản phẩm và nhập thông tin các sản phẩm \n" +
                    "3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần\n" +
                    "4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm \n" +
                    "5. Thoát ");
            int choie = Integer.parseInt(scanner.nextLine());
            handle(choie);
        }

    }

    private static void handle(int choie) {

            switch (choie) {
                case 1:
                    addCatalog();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    sortProduct();
                    break;
                case 4:
                    seachProduct();
                    break;
                case 5:
                    System.exit(1);
                    break;
            }

        }


    private static void seachProduct() {

    }

    private static void sortProduct() {

    }

    private static void addProduct() {
        Product product = new Product();
        product.inputData(scanner);
        products[idProduct]=product;

    }

    private static void addCatalog() {
        Catalog catalog = new Catalog();
        catalog.inputData(scanner);
        catalogs[idCatalog++] = catalog;
    }

}
