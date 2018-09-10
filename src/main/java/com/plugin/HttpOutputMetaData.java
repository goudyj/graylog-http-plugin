package com.plugin;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

/**
 * Implement the PluginMetaData interface here.
 */
public class HttpOutputMetaData implements PluginMetaData {
    private static final String PLUGIN_PROPERTIES = "com.plugin.graylog-plugin-http-output/graylog-plugin.properties";

    @Override
    public String getUniqueId() {
        return "com.plugin.HttpOutputPlugin";
    }

    @Override
    public String getName() {
        return "HttpOutput";
    }

    @Override
    public String getAuthor() {
        return "Sagar Revanna <sagarinpursue@gmail.com>";
    }

    @Override
    public URI getURL() {
        return URI.create("https://github.com/sagarinpursue/graylog-http-plugin");
    }

    @Override
    public Version getVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "version", Version.from(0, 0, 0, "unknown"));
    }

    @Override
    public String getDescription() {
        return "Graylog plugin to post Stream data to HTTP.";
    }

    @Override
    public Version getRequiredVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "graylog.version", Version.from(0, 0, 0, "unknown"));
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}
