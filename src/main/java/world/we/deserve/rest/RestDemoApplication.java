/**
 * 
 */
package world.we.deserve.rest;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 *
 */
public class RestDemoApplication extends ResourceConfig {

	/**
	 * Register JAX-RS application components.
	 */
	public RestDemoApplication() {
		packages("org.codingpedia.demo.rest");
	}

}
