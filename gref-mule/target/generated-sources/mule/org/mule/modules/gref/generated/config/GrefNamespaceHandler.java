
package org.mule.modules.gref.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/gref</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-01-18T02:03:51+00:00", comments = "Build UNNAMED.2762.e3b1307")
public class GrefNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(GrefNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [gref] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [gref] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new GrefConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-canonical-id", new GetCanonicalIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-canonical-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-canonical-object", new GetCanonicalObjectDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-canonical-object", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-canonical-object", new CreateCanonicalObjectDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-canonical-object", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("modify-canonical-object", new ModifyCanonicalObjectDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("modify-canonical-object", "@Processor", ex);
        }
    }

}
