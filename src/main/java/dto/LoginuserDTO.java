package dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
@ApiModel(value = "LoginuserDTO",description = "用户DTO信息")
public class LoginuserDTO implements Serializable {
    private static final  long serialVersionUID=1L;

    @ApiModelProperty("用户名")
    private String username;


    @ApiModelProperty("昵称")
    private String nickname;
}
