package ConfigProvider;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigList;

public class ConfigProvider {

    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.systemProperties().hasPath("TestProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }

    String URL = readConfig().getString("url");
    Integer age = readConfig().getInt("age");
    String adminLogin = readConfig().getString("usersParams.admin.login");
    String adminPass = readConfig().getString("usersParams.admin.password");
    Boolean isAdminAdmin = readConfig().getBoolean("usersParam.admin.isAdmin");
    String userLogin = readConfig().getString("usersParam.demo.login");
    String userPass = readConfig().getString("usersParam.demo.password");
    Boolean isUserAdmin = readConfig().getBoolean("usersParam.demo.isAdmin");
    ConfigList fruits = readConfig().getList("usersParams.demo.fruits");

}
