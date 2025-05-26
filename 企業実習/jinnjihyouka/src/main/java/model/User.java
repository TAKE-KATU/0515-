package model;

import java.sql.Timestamp;

public class User {
    private String id;
    private String pass;
    private String name;
    private String role;              // 管理区分（職員／管理職）
    private Timestamp lastLogin;     // 最終ログイン日時
    private Timestamp lastLogout;    // 最終ログアウト日時

    // デフォルトコンストラクタ
    public User() {}

    // 基本コンストラクタ（ID, パスワード）
    public User(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    // フルコンストラクタ（必要に応じて）
    public User(String id, String pass, String name, String role,
                Timestamp lastLogin, Timestamp lastLogout) {
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.role = role;
        this.lastLogin = lastLogin;
        this.lastLogout = lastLogout;
    }

    // Getter
    public String getId() { return id; }
    public String getPass() { return pass; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public Timestamp getLastLogin() { return lastLogin; }
    public Timestamp getLastLogout() { return lastLogout; }

    // Setter
    public void setId(String id) { this.id = id; }
    public void setPass(String pass) { this.pass = pass; }
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void setLastLogin(Timestamp lastLogin) { this.lastLogin = lastLogin; }
    public void setLastLogout(Timestamp lastLogout) { this.lastLogout = lastLogout; }
}
