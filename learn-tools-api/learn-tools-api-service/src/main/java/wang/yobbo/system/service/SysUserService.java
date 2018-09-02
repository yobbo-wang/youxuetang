package wang.yobbo.system.service;

import wang.yobbo.common.base.BaseService;
import wang.yobbo.system.model.SysUser;
import wang.yobbo.system.model.SysUserCriteria;

/**
* SysUserService接口
* Created by yobbo on 2018/8/29.
*/
public interface SysUserService extends BaseService<SysUser, SysUserCriteria> {
    SysUser findUserByUsername(String username);
}