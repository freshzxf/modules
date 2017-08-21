package com.silence.enties

import java.util.Date
import scala.beans.BeanProperty
import org.hibernate.validator.constraints.NotEmpty
import org.springframework.format.annotation.DateTimeFormat
import javax.validation.constraints.NotNull

/**
 * @description 用户属性
 * @date 2017年1月11日
 * @author wang
 *
 */
class User extends Serializable {

    @BeanProperty var id: Integer = _
    
    //用户名
    @BeanProperty
    @NotEmpty
    var username: String = _
  
    //密码
    @BeanProperty
    @NotEmpty
    var password: String = _
    
    //签名
    @BeanProperty
    @NotEmpty
    var sign: String = _
    
    //头像
    @BeanProperty var avatar: String = _
    
    //邮箱
    @BeanProperty
    @NotEmpty
    var email: String = _
    
    //创建时间
    @BeanProperty
    @NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd")
    var createDate: Date = _
    
    //性别
    @BeanProperty var sex: Integer = _
    
    //状态
    @BeanProperty var status: String = _
    
    //激活码
    @BeanProperty var active: String = _
    
    override def toString = "id = " + id + ", username = " + username + ", password = " + password + ", sign = " + sign + ", email = " + email + ", avatar = " + avatar + ", createDate = " + createDate + ", sex = " + sex + ", status = " + status 
    
}