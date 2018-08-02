package cn.eakay.web.repository.db.mybatis;

import cn.eakay.web.client.dataobject.AlipayRecord;

public interface AlipayRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AlipayRecord record);

    int insertSelective(AlipayRecord record);

    AlipayRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AlipayRecord record);

    int updateByPrimaryKey(AlipayRecord record);
}