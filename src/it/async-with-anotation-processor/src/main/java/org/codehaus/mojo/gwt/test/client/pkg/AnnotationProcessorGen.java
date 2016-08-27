package org.codehaus.mojo.gwt.test.client.pkg;

import java.io.Serializable;

import com.gwtplatform.dispatch.annotation.GenDto;
import com.gwtplatform.dispatch.annotation.Order;

/**
 * The GWTP annotation processor will generate a Dto from this class.
 *
 */
@GenDto
public final class AnnotationProcessorGen implements Serializable {
	
	@Order( 1 )
	int id;

}
