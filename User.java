import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by KrishnaPriya on 1/20/2018.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    protected String userId ;

    protected String userName;

    protected  String permissionType;

    protected Map<String, String> hasPermissions = new HashMap();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }


    public Long getSearchedUser() {
        return searchedUser;
    }

    public void setSearchedUser(Long searchedUser) {
        this.searchedUser = searchedUser;
    }

    protected Long searchedUser;

    public Map<String, String> getHasPermissions() {
        return hasPermissions;
    }

    public void setHasPermissions(Map<String, String> hasPermissions) {
        this.hasPermissions = hasPermissions;
    }


    public User addUserPermissions (User user) {

        if (user != null) {
            Map<String, String> results = new LinkedHashMap<String, String>();
            if (user.userId.startsWith("K")) {
                user.setPermissionType("Admin");
                results.put(user.userId, "Yes");
            }
            user.setHasPermissions(results);
        }
        return user;
    }
}
