package seven.design.principle.compositeReuse.two;

public class MysqlConnection extends DbConnection2 {

    @Override
    public String getDbConnection() {
        return "返回mysql数据库链接";
    }
}
