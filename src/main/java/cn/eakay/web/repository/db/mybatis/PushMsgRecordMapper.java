package cn.eakay.web.repository.db.mybatis;

import cn.eakay.web.client.dataobject.PushMsgRecord;

public interface PushMsgRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PushMsgRecord record);

    int insertSelective(PushMsgRecord record);

    PushMsgRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PushMsgRecord record);

    int updateByPrimaryKey(PushMsgRecord record);
}