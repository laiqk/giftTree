package com.dept.web.dao.model;

public class User {
    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.id-
     */
    private Integer id;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.role-用户角色
     */
    private Integer role;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.user_type-用户类型1:普通,2企业
     */
    private Integer userType;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.username-用户名
     */
    private String username;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.password_hash-登录密码
     */
    private String passwordHash;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.password_pay_hash-交易密码
     */
    private String passwordPayHash;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.password_reset_token-重置密码token
     */
    private String passwordResetToken;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.auth_key-记住我
     */
    private String authKey;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.status-用户状态
     */
    private Integer status;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.mobile-手机号
     */
    private String mobile;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.email-邮箱
     */
    private String email;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.realname-真实姓名
     */
    private String realname;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.id_card-身份证
     */
    private String idCard;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.sex-性别
     */
    private Integer sex;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.litpic-用户头像
     */
    private String litpic;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.birthday-生日
     */
    private String birthday;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.email_binding_status-邮箱认证状态
     */
    private Byte emailBindingStatus;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.mobile_binding_status-手机认证状态
     */
    private Integer mobileBindingStatus;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.real_verify_status-实名认证状态
     */
    private Integer realVerifyStatus;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.card_binding_status-银行卡绑定状态
     */
    private Integer cardBindingStatus;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.card_id_base-银行卡ID基数
     */
    private Integer cardIdBase;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.created_at-注册时间
     */
    private Integer createdAt;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.last_logintime-最后登录时间
     */
    private Integer lastLogintime;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.updated_at-更新时间
     */
    private Integer updatedAt;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.created_ip-注册ip
     */
    private String createdIp;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.invite_userid-推荐人用戶id
     */
    private Integer inviteUserid;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.real_verify_time-实名认证时间
     */
    private Integer realVerifyTime;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.trust_trxId-本平台 交易唯一标 识
     */
    private String trustTrxid;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.trust_usr_custId-用户客户号
     */
    private String trustUsrCustid;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.audit_stat-企业开户状态
     */
    private String auditStat;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.audit_desc-企业开户审核信息
     */
    private String auditDesc;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.accessToken-APP长登录accesstoken
     */
    private String accesstoken;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.loginTimes-用户连续登录次数
     */
    private Integer logintimes;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user.frist_recharge_time-首次充值时间
     */
    private Integer fristRechargeTime;

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.id-
     *
     * @return the value for 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.id-
     *
     * @param id set value for 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.role-用户角色
     *
     * @return the value for 用户角色
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.role-用户角色
     *
     * @param role set value for 用户角色
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.user_type-用户类型1:普通,2企业
     *
     * @return the value for 用户类型1:普通,2企业
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.user_type-用户类型1:普通,2企业
     *
     * @param userType set value for 用户类型1:普通,2企业
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.username-用户名
     *
     * @return the value for 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.username-用户名
     *
     * @param username set value for 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.password_hash-登录密码
     *
     * @return the value for 登录密码
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.password_hash-登录密码
     *
     * @param passwordHash set value for 登录密码
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.password_pay_hash-交易密码
     *
     * @return the value for 交易密码
     */
    public String getPasswordPayHash() {
        return passwordPayHash;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.password_pay_hash-交易密码
     *
     * @param passwordPayHash set value for 交易密码
     */
    public void setPasswordPayHash(String passwordPayHash) {
        this.passwordPayHash = passwordPayHash;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.password_reset_token-重置密码token
     *
     * @return the value for 重置密码token
     */
    public String getPasswordResetToken() {
        return passwordResetToken;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.password_reset_token-重置密码token
     *
     * @param passwordResetToken set value for 重置密码token
     */
    public void setPasswordResetToken(String passwordResetToken) {
        this.passwordResetToken = passwordResetToken;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.auth_key-记住我
     *
     * @return the value for 记住我
     */
    public String getAuthKey() {
        return authKey;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.auth_key-记住我
     *
     * @param authKey set value for 记住我
     */
    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.status-用户状态
     *
     * @return the value for 用户状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.status-用户状态
     *
     * @param status set value for 用户状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.mobile-手机号
     *
     * @return the value for 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.mobile-手机号
     *
     * @param mobile set value for 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.email-邮箱
     *
     * @return the value for 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.email-邮箱
     *
     * @param email set value for 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.realname-真实姓名
     *
     * @return the value for 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.realname-真实姓名
     *
     * @param realname set value for 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.id_card-身份证
     *
     * @return the value for 身份证
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.id_card-身份证
     *
     * @param idCard set value for 身份证
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.sex-性别
     *
     * @return the value for 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.sex-性别
     *
     * @param sex set value for 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.litpic-用户头像
     *
     * @return the value for 用户头像
     */
    public String getLitpic() {
        return litpic;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.litpic-用户头像
     *
     * @param litpic set value for 用户头像
     */
    public void setLitpic(String litpic) {
        this.litpic = litpic;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.birthday-生日
     *
     * @return the value for 生日
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.birthday-生日
     *
     * @param birthday set value for 生日
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.email_binding_status-邮箱认证状态
     *
     * @return the value for 邮箱认证状态
     */
    public Byte getEmailBindingStatus() {
        return emailBindingStatus;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.email_binding_status-邮箱认证状态
     *
     * @param emailBindingStatus set value for 邮箱认证状态
     */
    public void setEmailBindingStatus(Byte emailBindingStatus) {
        this.emailBindingStatus = emailBindingStatus;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.mobile_binding_status-手机认证状态
     *
     * @return the value for 手机认证状态
     */
    public Integer getMobileBindingStatus() {
        return mobileBindingStatus;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.mobile_binding_status-手机认证状态
     *
     * @param mobileBindingStatus set value for 手机认证状态
     */
    public void setMobileBindingStatus(Integer mobileBindingStatus) {
        this.mobileBindingStatus = mobileBindingStatus;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.real_verify_status-实名认证状态
     *
     * @return the value for 实名认证状态
     */
    public Integer getRealVerifyStatus() {
        return realVerifyStatus;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.real_verify_status-实名认证状态
     *
     * @param realVerifyStatus set value for 实名认证状态
     */
    public void setRealVerifyStatus(Integer realVerifyStatus) {
        this.realVerifyStatus = realVerifyStatus;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.card_binding_status-银行卡绑定状态
     *
     * @return the value for 银行卡绑定状态
     */
    public Integer getCardBindingStatus() {
        return cardBindingStatus;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.card_binding_status-银行卡绑定状态
     *
     * @param cardBindingStatus set value for 银行卡绑定状态
     */
    public void setCardBindingStatus(Integer cardBindingStatus) {
        this.cardBindingStatus = cardBindingStatus;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.card_id_base-银行卡ID基数
     *
     * @return the value for 银行卡ID基数
     */
    public Integer getCardIdBase() {
        return cardIdBase;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.card_id_base-银行卡ID基数
     *
     * @param cardIdBase set value for 银行卡ID基数
     */
    public void setCardIdBase(Integer cardIdBase) {
        this.cardIdBase = cardIdBase;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.created_at-注册时间
     *
     * @return the value for 注册时间
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.created_at-注册时间
     *
     * @param createdAt set value for 注册时间
     */
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.last_logintime-最后登录时间
     *
     * @return the value for 最后登录时间
     */
    public Integer getLastLogintime() {
        return lastLogintime;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.last_logintime-最后登录时间
     *
     * @param lastLogintime set value for 最后登录时间
     */
    public void setLastLogintime(Integer lastLogintime) {
        this.lastLogintime = lastLogintime;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.updated_at-更新时间
     *
     * @return the value for 更新时间
     */
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.updated_at-更新时间
     *
     * @param updatedAt set value for 更新时间
     */
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.created_ip-注册ip
     *
     * @return the value for 注册ip
     */
    public String getCreatedIp() {
        return createdIp;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.created_ip-注册ip
     *
     * @param createdIp set value for 注册ip
     */
    public void setCreatedIp(String createdIp) {
        this.createdIp = createdIp;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.invite_userid-推荐人用戶id
     *
     * @return the value for 推荐人用戶id
     */
    public Integer getInviteUserid() {
        return inviteUserid;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.invite_userid-推荐人用戶id
     *
     * @param inviteUserid set value for 推荐人用戶id
     */
    public void setInviteUserid(Integer inviteUserid) {
        this.inviteUserid = inviteUserid;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.real_verify_time-实名认证时间
     *
     * @return the value for 实名认证时间
     */
    public Integer getRealVerifyTime() {
        return realVerifyTime;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.real_verify_time-实名认证时间
     *
     * @param realVerifyTime set value for 实名认证时间
     */
    public void setRealVerifyTime(Integer realVerifyTime) {
        this.realVerifyTime = realVerifyTime;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.trust_trxId-本平台 交易唯一标 识
     *
     * @return the value for 本平台 交易唯一标 识
     */
    public String getTrustTrxid() {
        return trustTrxid;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.trust_trxId-本平台 交易唯一标 识
     *
     * @param trustTrxid set value for 本平台 交易唯一标 识
     */
    public void setTrustTrxid(String trustTrxid) {
        this.trustTrxid = trustTrxid;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.trust_usr_custId-用户客户号
     *
     * @return the value for 用户客户号
     */
    public String getTrustUsrCustid() {
        return trustUsrCustid;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.trust_usr_custId-用户客户号
     *
     * @param trustUsrCustid set value for 用户客户号
     */
    public void setTrustUsrCustid(String trustUsrCustid) {
        this.trustUsrCustid = trustUsrCustid;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.audit_stat-企业开户状态
     *
     * @return the value for 企业开户状态
     */
    public String getAuditStat() {
        return auditStat;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.audit_stat-企业开户状态
     *
     * @param auditStat set value for 企业开户状态
     */
    public void setAuditStat(String auditStat) {
        this.auditStat = auditStat;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.audit_desc-企业开户审核信息
     *
     * @return the value for 企业开户审核信息
     */
    public String getAuditDesc() {
        return auditDesc;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.audit_desc-企业开户审核信息
     *
     * @param auditDesc set value for 企业开户审核信息
     */
    public void setAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.accessToken-APP长登录accesstoken
     *
     * @return the value for APP长登录accesstoken
     */
    public String getAccesstoken() {
        return accesstoken;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.accessToken-APP长登录accesstoken
     *
     * @param accesstoken set value for APP长登录accesstoken
     */
    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.loginTimes-用户连续登录次数
     *
     * @return the value for 用户连续登录次数
     */
    public Integer getLogintimes() {
        return logintimes;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.loginTimes-用户连续登录次数
     *
     * @param logintimes set value for 用户连续登录次数
     */
    public void setLogintimes(Integer logintimes) {
        this.logintimes = logintimes;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_user.frist_recharge_time-首次充值时间
     *
     * @return the value for 首次充值时间
     */
    public Integer getFristRechargeTime() {
        return fristRechargeTime;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_user.frist_recharge_time-首次充值时间
     *
     * @param fristRechargeTime set value for 首次充值时间
     */
    public void setFristRechargeTime(Integer fristRechargeTime) {
        this.fristRechargeTime = fristRechargeTime;
    }
}