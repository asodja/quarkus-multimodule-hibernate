package org.my.group;

import javax.validation.constraints.NotBlank;

public class MyPojo {

    @NotBlank(message = "Value is blank")
    public String value;

}
