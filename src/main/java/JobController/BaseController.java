package JobController;


import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseController {
	
	/** The Constant REQUEST_IS_UNAUTHORIZED. */
	private static final String	REQUEST_IS_UNAUTHORIZED	= "Request is unauthorized";
	
	/** The Constant SUCCESS. */
	public static final String	SUCCESS					= "success";
	
	/** The Constant FAILED. */
	public static final String	FAILED					= "failed";

	/**
	 * Size of.
	 *
	 * @param list the list
	 * @return the int
	 */
	protected int sizeOf(List<?> list) {
		return list == null ? 0 : list.size();
	}

	

	/**
	 * Newresponse not found.
	 *
	 * @param logger the logger
	 * @param msg the msg
	 * @return the response entity
	 */
	protected ResponseEntity<String> newresponseNotFound(Logger logger, String msg) {
		logger.error(msg);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(msg);
	}

	/**
	 * Newresponse unauthorized.
	 *
	 * @param logger the logger
	 * @return the response entity
	 */
	protected ResponseEntity<String> newresponseUnauthorized(Logger logger) {
		logger.error(REQUEST_IS_UNAUTHORIZED);
		return ResponseEntity.status(org.springframework.http.HttpStatus.UNAUTHORIZED).body(REQUEST_IS_UNAUTHORIZED);
	}

	/**
	 * Newresponse not acceptable.
	 *
	 * @param logger the logger
	 * @param body the body
	 * @return the response entity
	 */
	protected ResponseEntity<String> newresponseNotAcceptable(Logger logger, String body) {
		logger.error(body);
		return ResponseEntity.status(org.springframework.http.HttpStatus.NOT_ACCEPTABLE).body(body);
	}

}