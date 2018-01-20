import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by KrishnaPriya on 1/20/2018.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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

    protected String userName;

    protected  String permissionType;

    public Long getSearchedUser() {
        return searchedUser;
    }

    public void setSearchedUser(Long searchedUser) {
        this.searchedUser = searchedUser;
    }

    protected Long searchedUser;

    public Map<Long, String> getHasPermissions() {
        return hasPermissions;
    }

    public void setHasPermissions(Map<Long, String> hasPermissions) {
        this.hasPermissions = hasPermissions;
    }

    protected Map<Long, String> hasPermissions = new HashMap();


    public User addUserPermissions (User user) {

        if (user != null) {
            Map<Long, String> results = new LinkedHashMap<Long, String>();
            if (user.userId.toString().startsWith("K")) {
                user.setPermissionType("Admin");
                results.put(user.userId, "Yes");
            }
            user.setHasPermissions(results);
        }
        return user;
    }
}
