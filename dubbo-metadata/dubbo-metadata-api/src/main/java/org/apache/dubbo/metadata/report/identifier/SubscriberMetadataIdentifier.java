package org.apache.dubbo.metadata.report.identifier;

import org.apache.dubbo.common.URL;

import static org.apache.dubbo.common.constants.CommonConstants.APPLICATION_KEY;
import static org.apache.dubbo.common.constants.CommonConstants.REVISION_KEY;

/**
 *
 * 2019-08-12
 */
public class SubscriberMetadataIdentifier extends BaseApplicationMetadataIdentifier{

    private String revision;

    public SubscriberMetadataIdentifier() {
    }

    public SubscriberMetadataIdentifier(String application, String revision) {
        this.application = application;
        this.revision = revision;
    }


    public SubscriberMetadataIdentifier(URL url) {
        this.application = url.getParameter(APPLICATION_KEY, "");
        this.revision = url.getParameter(REVISION_KEY, "");
    }

    public String getUniqueKey(MetadataIdentifier.KeyTypeEnum keyType) {
        return super.getUniqueKey(keyType, revision);
    }

    public String getIdentifierKey() {
        return super.getIdentifierKey(revision);
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }


}