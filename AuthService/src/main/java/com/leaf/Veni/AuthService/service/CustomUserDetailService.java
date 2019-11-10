package com.leaf.Veni.AuthService.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;

//import com.leaf.job.dao.SysRoleAuthorityDAO;
//import com.leaf.job.dao.SysUserAuthorityDAO;
//import com.leaf.job.dao.SysUserDAO;
//import com.leaf.job.entity.SysRoleEntity;
//import com.leaf.job.entity.SysUserEntity;
//import com.leaf.job.enums.DefaultStatusEnum;

@Service
public class CustomUserDetailService implements UserDetailsService{
	
//	private SysUserDAO sysUserDAO;
//	private SysRoleAuthorityDAO sysRoleAuthorityDAO;
//	private SysUserAuthorityDAO sysUserAuthorityDAO;
//
//
//	@Autowired
//	public CustomUserDetailService(SysUserDAO sysUserDAO,SysRoleAuthorityDAO sysRoleAuthorityDAO,SysUserAuthorityDAO sysUserAuthorityDAO) {
//		this.sysUserDAO = sysUserDAO;
//		this.sysRoleAuthorityDAO = sysRoleAuthorityDAO;
//		this.sysUserAuthorityDAO = sysUserAuthorityDAO;
//	}



	@Override
//	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
//			SysUserEntity sysUserEntity = sysUserDAO.getSysUserEntityByUsername(username);
//
//			if(! DefaultStatusEnum.ACTIVE.getCode().equals(sysUserEntity.getStatusEntity().getCode())){
//				throw new UsernameNotFoundException("User is Not Activated");
//			}

			return new User("SYSTEM","$2a$10$/9rQ/RW6jv1DS0uXS4FoxeHvzZPiWpgnB6XdIxjymSYE9UFoGKEnq",getGrantedAuthoritiesForUser("SYSTEM"));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	private List<GrantedAuthority> getGrantedAuthoritiesForUser(String user) {
        
        Map<String, SimpleGrantedAuthority> authorityMap = new HashMap<>();
//        List<SysRoleEntity> sysRoles = new ArrayList<>();
//        user.getSysUserSysRoleEntities()
//                .forEach(sysUserSysRole -> {
//                    sysRoles.add(sysUserSysRole.getSysRoleEntity());
//                });
//        if (! sysRoles.isEmpty()) {
//            sysRoleAuthorityDAO.getSysRoleAuthorityEntitiesBySysRolesAndAnuthorityStatusAndSysRoleStatus(sysRoles,DefaultStatusEnum.ACTIVE.getCode(),DefaultStatusEnum.ACTIVE.getCode())
//                    .stream()
//                    .forEach(roleAuthority -> {
//                    	String key = roleAuthority.getAuthorityEntity().getAuthCode();
//                    	if(! authorityMap.containsKey(key)){
//                    		authorityMap.put(key, new SimpleGrantedAuthority(key));
//                    	}
//                    });
//        }
//
//        sysUserAuthorityDAO.getSysUserAuthorityEntitiesBySysUser(user.getUsername())
//        	.stream()
//        	.forEach(userAuthority -> {
//        		String key = userAuthority.getAuthorityEntity().getAuthCode();
//        		long isEnabled = userAuthority.getIsGrant();
//        		if(isEnabled == 1) {
//                	if(! authorityMap.containsKey(key)){
//                		authorityMap.put(key, new SimpleGrantedAuthority(key));
//                	}
//        		}
//        		else {
//        			if(authorityMap.containsKey(key)){
//                		authorityMap.remove(key);
//                	}
//        		}
//
//        	});

		authorityMap.put("ROLE_SYSTEM",new SimpleGrantedAuthority("ROLE_SYSTEM"));
        return authorityMap.values().stream().collect(Collectors.toList());
}

}
