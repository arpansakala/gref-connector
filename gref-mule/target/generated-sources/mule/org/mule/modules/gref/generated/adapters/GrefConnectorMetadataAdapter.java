
package org.mule.modules.gref.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MetadataAware;
import org.mule.modules.gref.GrefConnector;


/**
 * A <code>GrefConnectorMetadataAdapter</code> is a wrapper around {@link GrefConnector } that adds support for querying metadata about the extension.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-01-18T02:03:51+00:00", comments = "Build UNNAMED.2762.e3b1307")
public class GrefConnectorMetadataAdapter
    extends GrefConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "Gref";
    private final static String MODULE_VERSION = "1.0.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.8.0";
    private final static String DEVKIT_BUILD = "UNNAMED.2762.e3b1307";
    private final static String MIN_MULE_VERSION = "3.5.0";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}
