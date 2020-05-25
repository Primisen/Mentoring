package epam_training.jdbc.kitty.task1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyFirstConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/cats?useUnicode=true&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static final String SELECT_CATS_QUERY = "select * from my_cats";

    public List<String> getCats() {

        List<String> cats = new ArrayList<>();

        try {
            Statement statement = getConnection().createStatement();

            ResultSet resultSet = statement.executeQuery(SELECT_CATS_QUERY);

            while (resultSet.next()) {
                cats.add(resultSet.getString("name"));
            }

            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cats;
    }

    public void setCats(int index, String name) {

        String sql = "INSERT INTO fake_cats (name) Values (?)";
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(index, name);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<String> getTables() {

        List<String> table = new ArrayList<>();

        DatabaseMetaData md = null;
        try {
            md = getConnection().getMetaData();

            ResultSet rs = md.getTables(null, null, "%", null);
            while (rs.next()) {
                table.add(rs.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return table;
    }

    private Connection getConnection() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
