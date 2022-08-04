package mappers;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ExceptionMessage {
	int errorCode;
	String errorMessage;
	String documetation;
	
	public ExceptionMessage() {}
	public ExceptionMessage(int errorCode, String errorMessage, String documetation) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.documetation = documetation;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getDocumetation() {
		return documetation;
	}
	public void setDocumetation(String documetation) {
		this.documetation = documetation;
	}
	
}
