package com.configuration;


import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;

@LoadPolicy(LoadType.MERGE)
@Config.Sources({"system:properties", "classpath:config.properties"})
public interface Configuration extends Config {
	@Key("app_url")
	String getAppURL();
}
