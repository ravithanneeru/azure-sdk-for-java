// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.fluent.models.VaultInner;
import com.azure.resourcemanager.recoveryservices.models.IdentityData;
import com.azure.resourcemanager.recoveryservices.models.InfrastructureEncryptionState;
import com.azure.resourcemanager.recoveryservices.models.MonitoringSettings;
import com.azure.resourcemanager.recoveryservices.models.PublicNetworkAccess;
import com.azure.resourcemanager.recoveryservices.models.ResourceIdentityType;
import com.azure.resourcemanager.recoveryservices.models.RestoreSettings;
import com.azure.resourcemanager.recoveryservices.models.SecuritySettings;
import com.azure.resourcemanager.recoveryservices.models.Sku;
import com.azure.resourcemanager.recoveryservices.models.SkuName;
import com.azure.resourcemanager.recoveryservices.models.UpgradeDetails;
import com.azure.resourcemanager.recoveryservices.models.UserIdentity;
import com.azure.resourcemanager.recoveryservices.models.VaultProperties;
import com.azure.resourcemanager.recoveryservices.models.VaultPropertiesEncryption;
import com.azure.resourcemanager.recoveryservices.models.VaultPropertiesMoveDetails;
import com.azure.resourcemanager.recoveryservices.models.VaultPropertiesRedundancySettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VaultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VaultInner model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"principalId\":\"tyhxhurokft\",\"tenantId\":\"olniwpwcukjf\",\"type\":\"None\",\"userAssignedIdentities\":{\"dhsgcba\":{\"principalId\":\"xklrypl\",\"clientId\":\"kbasyypn\"},\"yqkgfg\":{\"principalId\":\"hejkotynqgou\",\"clientId\":\"ndlik\"}}},\"properties\":{\"provisioningState\":\"adgakeqsrxybz\",\"upgradeDetails\":{\"operationId\":\"dqytbciqfouflmm\",\"startTimeUtc\":\"2021-12-07T12:50:46Z\",\"lastUpdatedTimeUtc\":\"2021-02-23T09:34:26Z\",\"endTimeUtc\":\"2021-11-15T12:40:24Z\",\"status\":\"InProgress\",\"message\":\"ougpbkwt\",\"triggerType\":\"ForcedUpgrade\",\"upgradedResourceId\":\"uqktap\",\"previousResourceId\":\"wgcu\"},\"privateEndpointConnections\":[{\"id\":\"mkdo\",\"name\":\"whbmd\",\"type\":\"bjf\",\"location\":\"gmbmbexppbh\"},{\"id\":\"qrolfpf\",\"name\":\"lgbquxig\",\"type\":\"jgzjaoyfhrtx\",\"location\":\"n\"},{\"id\":\"kujysvlejuvfq\",\"name\":\"lyxwjkcprbnwbx\",\"type\":\"vtb\",\"location\":\"ysszdnrujqguh\"},{\"id\":\"ouqfprwz\",\"name\":\"g\",\"type\":\"tnwu\",\"location\":\"gazxuf\"}],\"privateEndpointStateForBackup\":\"None\",\"privateEndpointStateForSiteRecovery\":\"None\",\"encryption\":{\"infrastructureEncryption\":\"Disabled\"},\"moveDetails\":{\"operationId\":\"dfvzwdzuhty\",\"startTimeUtc\":\"2021-11-17T17:09:54Z\",\"completionTimeUtc\":\"2021-04-25T02:46:04Z\",\"sourceResourceId\":\"fthwxmnteiwa\",\"targetResourceId\":\"vkmijcmmxdcuf\"},\"moveState\":\"Failure\",\"backupStorageVersion\":\"V2\",\"publicNetworkAccess\":\"Disabled\",\"monitoringSettings\":{},\"restoreSettings\":{},\"redundancySettings\":{\"standardTierStorageRedundancy\":\"LocallyRedundant\",\"crossRegionRestore\":\"Disabled\"},\"securitySettings\":{}},\"sku\":{\"name\":\"Standard\",\"tier\":\"yc\",\"family\":\"newmdwzjeiachbo\",\"size\":\"flnrosfqpteehzz\",\"capacity\":\"pyqr\"},\"etag\":\"inpvswjdkirsoodq\",\"location\":\"hc\",\"tags\":{\"dsoifiyipj\":\"ohjtckw\",\"norcjxvsnbyxqab\":\"sqwpgrjb\"},\"id\":\"mocpc\",\"name\":\"shurzafbljjgpbto\",\"type\":\"c\"}")
                .toObject(VaultInner.class);
        Assertions.assertEquals("hc", model.location());
        Assertions.assertEquals("ohjtckw", model.tags().get("dsoifiyipj"));
        Assertions.assertEquals(ResourceIdentityType.NONE, model.identity().type());
        Assertions
            .assertEquals(
                InfrastructureEncryptionState.DISABLED, model.properties().encryption().infrastructureEncryption());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.properties().publicNetworkAccess());
        Assertions.assertEquals(SkuName.STANDARD, model.sku().name());
        Assertions.assertEquals("yc", model.sku().tier());
        Assertions.assertEquals("newmdwzjeiachbo", model.sku().family());
        Assertions.assertEquals("flnrosfqpteehzz", model.sku().size());
        Assertions.assertEquals("pyqr", model.sku().capacity());
        Assertions.assertEquals("inpvswjdkirsoodq", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VaultInner model =
            new VaultInner()
                .withLocation("hc")
                .withTags(mapOf("dsoifiyipj", "ohjtckw", "norcjxvsnbyxqab", "sqwpgrjb"))
                .withIdentity(
                    new IdentityData()
                        .withType(ResourceIdentityType.NONE)
                        .withUserAssignedIdentities(mapOf("dhsgcba", new UserIdentity(), "yqkgfg", new UserIdentity())))
                .withProperties(
                    new VaultProperties()
                        .withUpgradeDetails(new UpgradeDetails())
                        .withEncryption(
                            new VaultPropertiesEncryption()
                                .withInfrastructureEncryption(InfrastructureEncryptionState.DISABLED))
                        .withMoveDetails(new VaultPropertiesMoveDetails())
                        .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
                        .withMonitoringSettings(new MonitoringSettings())
                        .withRestoreSettings(new RestoreSettings())
                        .withRedundancySettings(new VaultPropertiesRedundancySettings())
                        .withSecuritySettings(new SecuritySettings()))
                .withSku(
                    new Sku()
                        .withName(SkuName.STANDARD)
                        .withTier("yc")
                        .withFamily("newmdwzjeiachbo")
                        .withSize("flnrosfqpteehzz")
                        .withCapacity("pyqr"))
                .withEtag("inpvswjdkirsoodq");
        model = BinaryData.fromObject(model).toObject(VaultInner.class);
        Assertions.assertEquals("hc", model.location());
        Assertions.assertEquals("ohjtckw", model.tags().get("dsoifiyipj"));
        Assertions.assertEquals(ResourceIdentityType.NONE, model.identity().type());
        Assertions
            .assertEquals(
                InfrastructureEncryptionState.DISABLED, model.properties().encryption().infrastructureEncryption());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.properties().publicNetworkAccess());
        Assertions.assertEquals(SkuName.STANDARD, model.sku().name());
        Assertions.assertEquals("yc", model.sku().tier());
        Assertions.assertEquals("newmdwzjeiachbo", model.sku().family());
        Assertions.assertEquals("flnrosfqpteehzz", model.sku().size());
        Assertions.assertEquals("pyqr", model.sku().capacity());
        Assertions.assertEquals("inpvswjdkirsoodq", model.etag());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
