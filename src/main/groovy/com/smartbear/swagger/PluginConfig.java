package com.smartbear.swagger;

import com.eviware.soapui.plugins.PluginAdapter;
import com.eviware.soapui.plugins.PluginConfiguration;

/**
 * Created by ole on 08/06/14.
 */

@PluginConfiguration(groupId = "com.smartbear.soapui.plugins", name = "Swagger Plugin", version = "2.4.0-SNAPSHOT",
        autoDetect = true, description = "Provides Swagger 1.X/2.0 import/export functionality for REST APIs",
        infoUrl = "https://github.com/SmartBear/readyapi-swagger-plugin")
public class PluginConfig extends PluginAdapter {
    @Override
    public void initialize() {
        super.initialize();
    }
}
