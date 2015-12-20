package exception;


public class StageException extends Exception {
	public StageException() {
		super();
		app.ApplicationSession.instance().getExceptionLogger().severe("empty");
	}
	public StageException(StageException e) {
		super (e);
		app.ApplicationSession.instance().getExceptionLogger().severe(e.getMessage());
	}
	public StageException(String message) {
		super(message);
		app.ApplicationSession.instance().getExceptionLogger().severe(message);
	}
	
}
