package cn.hxdev.platform.core.entity.base;

import cn.hxdev.platform.core.entity.SuperObject;

/**
 *
 * @author Javen
 */
public class User extends SuperObject {
    
    private static final long serialVersionUID = -4234054582097296462L;

    private String FirstName;
    private String LastName;
    private String UserName;
    private String Email;
    private String Password;
    private String WorkPhone;
    private String HomePhone;
    private String Company;
    private String Title;
    private boolean Active;
    private String EmployeeId;
    private UserRole UserRoleId;
    private UserProfile UserProfileId;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getWorkPhone() {
        return WorkPhone;
    }

    public void setWorkPhone(String WorkPhone) {
        this.WorkPhone = WorkPhone;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(String HomePhone) {
        this.HomePhone = HomePhone;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean Active) {
        this.Active = Active;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public UserRole getUserRoleId() {
        return UserRoleId;
    }

    public void setUserRoleId(UserRole UserRoleId) {
        this.UserRoleId = UserRoleId;
    }

    public UserProfile getUserProfileId() {
        return UserProfileId;
    }

    public void setUserProfileId(UserProfile UserProfileId) {
        this.UserProfileId = UserProfileId;
    }
    
    
    
    

}
