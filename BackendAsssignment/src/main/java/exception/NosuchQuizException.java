/**
 * 
 */
package exception;

/**
 * 
 */
public class NosuchQuizException extends RuntimeException{
	
		 
	    private String message;
	 
	    public NosuchQuizException() {}
	 
	    public NosuchQuizException(String msg)
	    {
	        super(msg);
	        this.message = msg;
	    }
	

}
