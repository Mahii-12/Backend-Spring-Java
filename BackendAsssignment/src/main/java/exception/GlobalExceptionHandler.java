package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionHandler {

	 @ExceptionHandler(value = NosuchQuizException.class)
	 @ResponseStatus(HttpStatus.BAD_REQUEST)
	 public @ResponseBody ErrorResponse ErrorResponsehandleException(NosuchQuizException ex)  {
		 
		 return new ErrorResponse(ex.getMessage());
		 
	 }
	
}
