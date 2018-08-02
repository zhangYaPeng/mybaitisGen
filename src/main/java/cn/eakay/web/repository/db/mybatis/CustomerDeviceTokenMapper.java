package cn.eakay.web.repository.db.mybatis;

import cn.eakay.web.client.dataobject.CustomerDeviceToken;

public interface CustomerDeviceTokenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerDeviceToken record);

    int insertSelective(CustomerDeviceToken record);

    CustomerDeviceToken selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerDeviceToken record);

    int updateByPrimaryKey(CustomerDeviceToken record);
}