package cn.bestrivenlf.Realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.org.apache.bcel.internal.generic.NEW;

import cn.bestrivenlf.dao.UserDao;
import cn.bestrivenlf.entity.User;


public class MyRealm extends AuthenticatingRealm {

	@Autowired
	private UserDao userdao;
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		UsernamePasswordToken upToken = (UsernamePasswordToken)token;
		String username = upToken.getUsername();
		User user = new User();
		user.setUsername(username);
		user.setPassword("16fe90cb7a2c8a18faf0adcb74e92dbe");
		ByteSource salt = ByteSource.Util.bytes("shagou");
		Object principal = user;
		String credential = user.getPassword();
		String realmName = super.getName();
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal,credential,salt,realmName);
		return info;
		
	}
	
	public static void main(String[] args) {
		String hashAlo = "MD5";
		Object pass="123456";
		ByteSource salt = ByteSource.Util.bytes("shagou");
		Object result = new SimpleHash(hashAlo,pass,salt,1);
		System.out.println("result="+result);
	}
}
