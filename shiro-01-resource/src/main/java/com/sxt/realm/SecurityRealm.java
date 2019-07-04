package com.sxt.realm;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.SimpleByteSource;

import com.sxt.pojo.User;
import com.sxt.service.UserService;

public class SecurityRealm extends AuthorizingRealm{
	
	@Resource
	private UserService userService;

	/**
	 * ��֤�ķ���
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken t = (UsernamePasswordToken) token;
		// ��ȡ��¼���˺�
		String username = t.getUsername();
		List<User> list = userService.login(username);
		if(list == null || list.size()!=1){
			return null;
		}
		User user = list.get(0);
		// �����Ϣ(�������˺�Ҳ�����Ƕ���)  ����   realmName(�Զ���)
		return new SimpleAuthenticationInfo(user
				, user.getPassword()
				,new SimpleByteSource(user.getSalt())
				, "com/sxt");
	}
	
	/**
	 * ��Ȩ�ķ���
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		return null;
	}
}
