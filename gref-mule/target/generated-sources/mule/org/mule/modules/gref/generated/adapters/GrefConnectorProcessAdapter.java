
package org.mule.modules.gref.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.gref.GrefConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>GrefConnectorProcessAdapter</code> is a wrapper around {@link GrefConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-01-18T02:03:51+00:00", comments = "Build UNNAMED.2762.e3b1307")
public class GrefConnectorProcessAdapter
    extends GrefConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<GrefConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, GrefConnectorCapabilitiesAdapter> getProcessTemplate() {
        final GrefConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,GrefConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, GrefConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, GrefConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
