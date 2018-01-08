package com.izeye.samples.so48071057;

import java.util.TreeMap;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * Sample {@link ConfigurationProperties}.
 *
 * @author Johnny Lim
 */
@Data
@ConfigurationProperties
public class WebConfigProperty {

	private TreeMap<Integer, Bound> distPrice;

}
