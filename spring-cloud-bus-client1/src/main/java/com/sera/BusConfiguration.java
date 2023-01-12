package com.sera;

import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@RemoteApplicationEventScan({"com.sera.busevent"})
public class BusConfiguration {
}
