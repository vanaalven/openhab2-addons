/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.milight.internal;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link MilightBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author David Graeff - Initial contribution
 */
@NonNullByDefault
public class MilightBindingConstants {

    public static final String BINDING_ID = "milight";

    // List of all Thing Type UIDs
    public static final ThingTypeUID BRIDGEV3_THING_TYPE = new ThingTypeUID(BINDING_ID, "bridgeV3");
    public static final ThingTypeUID BRIDGEV6_THING_TYPE = new ThingTypeUID(BINDING_ID, "bridgeV6");

    public static final ThingTypeUID RGB_THING_TYPE = new ThingTypeUID(BINDING_ID, "rgbLed");
    public static final ThingTypeUID RGB_V2_THING_TYPE = new ThingTypeUID(BINDING_ID, "rgbv2Led");
    public static final ThingTypeUID RGB_IBOX_THING_TYPE = new ThingTypeUID(BINDING_ID, "rgbiboxLed");
    public static final ThingTypeUID RGB_CW_WW_THING_TYPE = new ThingTypeUID(BINDING_ID, "rgbwwLed");
    public static final ThingTypeUID RGB_W_THING_TYPE = new ThingTypeUID(BINDING_ID, "rgbwLed");
    public static final ThingTypeUID WHITE_THING_TYPE = new ThingTypeUID(BINDING_ID, "whiteLed");

    public static final Set<ThingTypeUID> BRIDGE_THING_TYPES_UIDS = Collections
            .unmodifiableSet(Stream.of(BRIDGEV3_THING_TYPE, BRIDGEV6_THING_TYPE).collect(Collectors.toSet()));
    public static final Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Collections
            .unmodifiableSet(Stream.of(RGB_V2_THING_TYPE, RGB_THING_TYPE, WHITE_THING_TYPE, RGB_W_THING_TYPE,
                    RGB_CW_WW_THING_TYPE, RGB_IBOX_THING_TYPE).collect(Collectors.toSet()));

    // List of all Channel ids
    public static final String CHANNEL_COLOR = "ledcolor";
    public static final String CHANNEL_NIGHTMODE = "lednightmode";
    public static final String CHANNEL_WHITEMODE = "ledwhitemode";
    public static final String CHANNEL_BRIGHTNESS = "ledbrightness";
    public static final String CHANNEL_SATURATION = "ledsaturation";
    public static final String CHANNEL_TEMP = "ledtemperature";
    public static final String CHANNEL_SPEED_REL = "animation_speed_relative";
    public static final String CHANNEL_ANIMATION_MODE = "animation_mode";
    public static final String CHANNEL_ANIMATION_MODE_REL = "animation_mode_relative";
    public static final String CHANNEL_LINKLED = "ledlink";
    public static final String CHANNEL_UNLINKLED = "ledunlink";

    public static final int PORT_DISCOVER = 48899;
    public static final int PORT_VER3 = 8899;
    public static final int PORT_VER6 = 5987;

    public static final String CONFIG_HOST_NAME = "ADDR";
    public static final String CONFIG_CUSTOM_PORT = "CUSTOM_PORT";
    public static final String CONFIG_PROTOCOL_VERSION = "CONFIG_PROTOCOL_VERSION";
    public static final String CONFIG_ID = "ID";
    public static final String CONFIG_REFRESH_SEC = "REFRESH_IN_SEC";
    public static final String CONFIG_PASSWORD_BYTE_1 = "PASSWORD_BYTE_1";
    public static final String CONFIG_PASSWORD_BYTE_2 = "PASSWORD_BYTE_2";
    public static final String CONFIG_REPEAT = "REPEAT";
    public static final String CONFIG_WAIT_BETWEEN_COMMANDS = "WAIT_BETWEEN_COMMANDS";

    public static final String PROPERTY_SESSIONID = "sessionid";
    public static final String PROPERTY_SESSIONCONFIRMED = "sessionid_last_refresh";
}
