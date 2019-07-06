/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.greenpower;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.IeeeAddress;
import com.zsmartsystems.zigbee.security.ZigBeeKey;
import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Gp Pairing value object class.
 * <p>
 * Cluster: <b>Green Power</b>. Command ID 0x01 is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Green Power cluster.
 * <p>
 * From GPS to the entire network to (de)register for tunneling service, or for removing GPD
 * from the network.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-07-04T22:13:40Z")
public class GpPairing extends ZclCommand {
    /**
     * The cluster ID to which this command belongs.
     */
    public static int CLUSTER_ID = 0x0021;

    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x01;

    /**
     * Options command message field.
     */
    private Integer options;

    /**
     * Gpd Src ID command message field.
     */
    private Integer gpdSrcId;

    /**
     * Gpd IEEE command message field.
     */
    private IeeeAddress gpdIeee;

    /**
     * Endpoint command message field.
     */
    private Integer endpoint;

    /**
     * Sink IEEE Address command message field.
     */
    private IeeeAddress sinkIeeeAddress;

    /**
     * Sink NWK Address command message field.
     */
    private Integer sinkNwkAddress;

    /**
     * Sink Group ID command message field.
     */
    private Integer sinkGroupId;

    /**
     * Device ID command message field.
     */
    private Integer deviceId;

    /**
     * Gpd Security Frame Counter command message field.
     */
    private Integer gpdSecurityFrameCounter;

    /**
     * Gpd Key command message field.
     */
    private ZigBeeKey gpdKey;

    /**
     * Assigned Alias command message field.
     */
    private Integer assignedAlias;

    /**
     * Forwarding Radius command message field.
     */
    private Integer forwardingRadius;

    /**
     * Default constructor.
     */
    public GpPairing() {
        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    /**
     * Gets Options.
     *
     * @return the Options
     */
    public Integer getOptions() {
        return options;
    }

    /**
     * Sets Options.
     *
     * @param options the Options
     */
    public void setOptions(final Integer options) {
        this.options = options;
    }

    /**
     * Gets Gpd Src ID.
     *
     * @return the Gpd Src ID
     */
    public Integer getGpdSrcId() {
        return gpdSrcId;
    }

    /**
     * Sets Gpd Src ID.
     *
     * @param gpdSrcId the Gpd Src ID
     */
    public void setGpdSrcId(final Integer gpdSrcId) {
        this.gpdSrcId = gpdSrcId;
    }

    /**
     * Gets Gpd IEEE.
     *
     * @return the Gpd IEEE
     */
    public IeeeAddress getGpdIeee() {
        return gpdIeee;
    }

    /**
     * Sets Gpd IEEE.
     *
     * @param gpdIeee the Gpd IEEE
     */
    public void setGpdIeee(final IeeeAddress gpdIeee) {
        this.gpdIeee = gpdIeee;
    }

    /**
     * Gets Endpoint.
     *
     * @return the Endpoint
     */
    public Integer getEndpoint() {
        return endpoint;
    }

    /**
     * Sets Endpoint.
     *
     * @param endpoint the Endpoint
     */
    public void setEndpoint(final Integer endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Gets Sink IEEE Address.
     *
     * @return the Sink IEEE Address
     */
    public IeeeAddress getSinkIeeeAddress() {
        return sinkIeeeAddress;
    }

    /**
     * Sets Sink IEEE Address.
     *
     * @param sinkIeeeAddress the Sink IEEE Address
     */
    public void setSinkIeeeAddress(final IeeeAddress sinkIeeeAddress) {
        this.sinkIeeeAddress = sinkIeeeAddress;
    }

    /**
     * Gets Sink NWK Address.
     *
     * @return the Sink NWK Address
     */
    public Integer getSinkNwkAddress() {
        return sinkNwkAddress;
    }

    /**
     * Sets Sink NWK Address.
     *
     * @param sinkNwkAddress the Sink NWK Address
     */
    public void setSinkNwkAddress(final Integer sinkNwkAddress) {
        this.sinkNwkAddress = sinkNwkAddress;
    }

    /**
     * Gets Sink Group ID.
     *
     * @return the Sink Group ID
     */
    public Integer getSinkGroupId() {
        return sinkGroupId;
    }

    /**
     * Sets Sink Group ID.
     *
     * @param sinkGroupId the Sink Group ID
     */
    public void setSinkGroupId(final Integer sinkGroupId) {
        this.sinkGroupId = sinkGroupId;
    }

    /**
     * Gets Device ID.
     *
     * @return the Device ID
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * Sets Device ID.
     *
     * @param deviceId the Device ID
     */
    public void setDeviceId(final Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * Gets Gpd Security Frame Counter.
     *
     * @return the Gpd Security Frame Counter
     */
    public Integer getGpdSecurityFrameCounter() {
        return gpdSecurityFrameCounter;
    }

    /**
     * Sets Gpd Security Frame Counter.
     *
     * @param gpdSecurityFrameCounter the Gpd Security Frame Counter
     */
    public void setGpdSecurityFrameCounter(final Integer gpdSecurityFrameCounter) {
        this.gpdSecurityFrameCounter = gpdSecurityFrameCounter;
    }

    /**
     * Gets Gpd Key.
     *
     * @return the Gpd Key
     */
    public ZigBeeKey getGpdKey() {
        return gpdKey;
    }

    /**
     * Sets Gpd Key.
     *
     * @param gpdKey the Gpd Key
     */
    public void setGpdKey(final ZigBeeKey gpdKey) {
        this.gpdKey = gpdKey;
    }

    /**
     * Gets Assigned Alias.
     *
     * @return the Assigned Alias
     */
    public Integer getAssignedAlias() {
        return assignedAlias;
    }

    /**
     * Sets Assigned Alias.
     *
     * @param assignedAlias the Assigned Alias
     */
    public void setAssignedAlias(final Integer assignedAlias) {
        this.assignedAlias = assignedAlias;
    }

    /**
     * Gets Forwarding Radius.
     *
     * @return the Forwarding Radius
     */
    public Integer getForwardingRadius() {
        return forwardingRadius;
    }

    /**
     * Sets Forwarding Radius.
     *
     * @param forwardingRadius the Forwarding Radius
     */
    public void setForwardingRadius(final Integer forwardingRadius) {
        this.forwardingRadius = forwardingRadius;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(options, ZclDataType.BITMAP_24_BIT);
        serializer.serialize(gpdSrcId, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(gpdIeee, ZclDataType.IEEE_ADDRESS);
        serializer.serialize(endpoint, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(sinkIeeeAddress, ZclDataType.IEEE_ADDRESS);
        serializer.serialize(sinkNwkAddress, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(sinkGroupId, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(deviceId, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(gpdSecurityFrameCounter, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(gpdKey, ZclDataType.SECURITY_KEY);
        serializer.serialize(assignedAlias, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(forwardingRadius, ZclDataType.UNSIGNED_8_BIT_INTEGER);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        options = (Integer) deserializer.deserialize(ZclDataType.BITMAP_24_BIT);
        gpdSrcId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        gpdIeee = (IeeeAddress) deserializer.deserialize(ZclDataType.IEEE_ADDRESS);
        endpoint = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        sinkIeeeAddress = (IeeeAddress) deserializer.deserialize(ZclDataType.IEEE_ADDRESS);
        sinkNwkAddress = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        sinkGroupId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        deviceId = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        gpdSecurityFrameCounter = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        gpdKey = (ZigBeeKey) deserializer.deserialize(ZclDataType.SECURITY_KEY);
        assignedAlias = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        forwardingRadius = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(388);
        builder.append("GpPairing [");
        builder.append(super.toString());
        builder.append(", options=");
        builder.append(options);
        builder.append(", gpdSrcId=");
        builder.append(gpdSrcId);
        builder.append(", gpdIeee=");
        builder.append(gpdIeee);
        builder.append(", endpoint=");
        builder.append(endpoint);
        builder.append(", sinkIeeeAddress=");
        builder.append(sinkIeeeAddress);
        builder.append(", sinkNwkAddress=");
        builder.append(sinkNwkAddress);
        builder.append(", sinkGroupId=");
        builder.append(sinkGroupId);
        builder.append(", deviceId=");
        builder.append(deviceId);
        builder.append(", gpdSecurityFrameCounter=");
        builder.append(gpdSecurityFrameCounter);
        builder.append(", gpdKey=");
        builder.append(gpdKey);
        builder.append(", assignedAlias=");
        builder.append(assignedAlias);
        builder.append(", forwardingRadius=");
        builder.append(forwardingRadius);
        builder.append(']');
        return builder.toString();
    }

}
