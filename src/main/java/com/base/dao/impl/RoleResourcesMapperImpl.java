package com.base.dao.impl;

import javax.annotation.PostConstruct;
import com.base.dao.impl.BaseDaoImpl;
import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import com.base.dao.RoleResourcesMapper;
import com.base.model.RoleResources;
import com.base.model.RoleResourcesExample;

@Repository("roleResourcesMapper")
public class RoleResourcesMapperImpl extends
		BaseDaoImpl<RoleResources, RoleResourcesExample> implements
		RoleResourcesMapper {
	private SqlSessionFactory mySqlSessionFacotry;

	@Resource(name = "sqlSessionFactory")
	public void setMySessionFacotry(SqlSessionFactory sqlSessionFactory) {
		this.mySqlSessionFacotry = sqlSessionFactory;
	}

	@PostConstruct
	public void injectSqlSessionFactory() {
		super.setSqlSessionFactory(mySqlSessionFacotry);
	}

	@Override
	public String getNamespace() {
		return RoleResourcesMapper.class.getName();
	}
}