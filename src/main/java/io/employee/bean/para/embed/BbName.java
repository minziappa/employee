package io.employee.bean.para.embed;

import io.employee.annotation.Array;

import javax.validation.constraints.NotNull;

public class BbName {

    @NotNull(message = "bb is the not null error.")
    @Array(message = "bb must be array")
	private String[] bb;

	public String[] getBb() {
		return bb;
	}

	public void setBb(String[] bb) {
		this.bb = bb;
	}

}
