package el.serv;

/**
 * Commands sent from client to server
 */
public class ServerCommands {

	/** ask server if we can enter (void) */
	public static final String ENTERREQ = "enter-req";
	/** tell server we are going to spectate (void) */
	public static final String SPEC = "spec";
	/** update details of players ship */
	public static final String UPDATE = "update";
	/** update map tile request */
	public static final String MAPTILEREQ = "map-tile-req";
	/** fire transient */
	public static final String FIREREQ = "fire-req";
	/** send text message to server */
	public static final String TALKREQ = "talk-req";
	/** send client name to server (should send ID back) */
	public static final String NAME = "name";
}
