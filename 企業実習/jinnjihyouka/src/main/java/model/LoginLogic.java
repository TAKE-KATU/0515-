package model;

import dao.UserDAO;

public class LoginLogic {
    public boolean execute(User inputUser) { // パラメーターの名前をinputUserに変更
        System.out.println("ログイン試行: ユーザー名=" + inputUser.getId() + " パスワード=" + inputUser.getPass());
        UserDAO dao = new UserDAO();
        User foundUser = dao.findByIdAndPass(inputUser.getId(), inputUser.getPass()); // 結果の変数名をfoundUserに変更

        if (foundUser != null) {
            System.out.println("ユーザーが見つかりました: " + foundUser.getName());
        } else {
            System.out.println("ユーザーが見つかりませんでした");
        }

        return foundUser != null;
    }
}
