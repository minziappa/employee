package io.employee.bean.para;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

public class CsvFilePara {

	private String csvName;
	@NotNull(message = "option")
	private String option;
	@NotNull(message = "csvFile")
	private MultipartFile csvFile;

	public String getCsvName() {
		return csvName;
	}

	public void setCsvName(String csvName) {
		this.csvName = csvName;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public MultipartFile getCsvFile() {
		return csvFile;
	}

	public void setCsvFile(MultipartFile csvFile) {
		this.csvFile = csvFile;
	}

}