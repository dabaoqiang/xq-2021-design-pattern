package seven.design.principle.compositeReuse.two;

public class OracleConnection extends DbConnection2 {


    @Override
    public String getDbConnection() {
        return "返回oracle数据库链接";
    }
}
