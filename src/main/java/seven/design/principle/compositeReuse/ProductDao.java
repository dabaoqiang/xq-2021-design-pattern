package seven.design.principle.compositeReuse;

import seven.design.principle.compositeReuse.two.DbConnection2;

public class ProductDao {

    private DbConnection dbConnection;

    public ProductDao(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conncetion = dbConnection.getConncetion();
        System.out.println("获取 " + conncetion + ",加入产品");
    }



}
