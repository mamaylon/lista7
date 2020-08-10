package util;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

public class ConexaoBanco {

    private Connection conexao = null;
    private final String BANCO = "dbjava";   //troque pelo nome do seu database
    private final String LOGIN = "root";   //use o usuário do banco (default: root)
    private final String SENHA = "123";      //se estiver sem senha deixe vazio: ""
    private final String HOST = "localhost"; //se o mysql estiver rodando localmente, use "localhost"

    public Connection getConnection() throws SQLException {

        MysqlDataSource ds = new MysqlDataSource();
        ds.setServerName(HOST);
        ds.setDatabaseName(BANCO);
        ds.setUser(LOGIN);
        ds.setPassword(SENHA);

        ds.setServerTimezone("UTC");
        ds.setConnectTimeout(8000);

        conexao = ds.getConnection();

        return conexao;
    }
    
}