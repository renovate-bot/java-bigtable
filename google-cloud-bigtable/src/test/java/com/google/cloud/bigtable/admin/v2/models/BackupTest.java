/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.bigtable.admin.v2.models;

import static com.google.common.truth.Truth.assertThat;

import com.google.bigtable.admin.v2.EncryptionInfo.EncryptionType;
import com.google.cloud.bigtable.common.Status;
import com.google.common.collect.Lists;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;
import com.google.rpc.Code;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.threeten.bp.Instant;

@RunWith(JUnit4.class)
public class BackupTest {
  @Test
  public void testBackupStateEnumUpToDate() {
    List<com.google.bigtable.admin.v2.Backup.State> validProtoValues =
        Lists.newArrayList(com.google.bigtable.admin.v2.Backup.State.values());

    List<Backup.State> validModelValues = Lists.newArrayList(Backup.State.values());

    List<Backup.State> actualModelValues = Lists.newArrayList();

    for (com.google.bigtable.admin.v2.Backup.State protoValue : validProtoValues) {
      Backup.State modelValue = Backup.State.fromProto(protoValue);
      actualModelValues.add(modelValue);
    }

    assertThat(actualModelValues).containsExactlyElementsIn(validModelValues);
  }

  @Test
  public void testBackupTypeEnumUpToDate() {
    List<com.google.bigtable.admin.v2.Backup.BackupType> validProtoValues =
        Lists.newArrayList(com.google.bigtable.admin.v2.Backup.BackupType.values());

    List<Backup.BackupType> validModelValues = Lists.newArrayList(Backup.BackupType.values());

    List<Backup.BackupType> actualModelValues = Lists.newArrayList();

    for (com.google.bigtable.admin.v2.Backup.BackupType protoValue : validProtoValues) {
      Backup.BackupType modelValue = Backup.BackupType.fromProto(protoValue);
      actualModelValues.add(modelValue);
    }

    assertThat(actualModelValues).containsExactlyElementsIn(validModelValues);
  }

  @Test
  public void testFromProto() {
    Timestamp expireTime = Timestamp.newBuilder().setSeconds(1234).build();
    Timestamp startTime = Timestamp.newBuilder().setSeconds(1234).build();
    Timestamp endTime = Timestamp.newBuilder().setSeconds(1234).build();
    Timestamp hotToStandardTime = Timestamp.newBuilder().setSeconds(1234).build();
    com.google.bigtable.admin.v2.Backup proto =
        com.google.bigtable.admin.v2.Backup.newBuilder()
            .setName("projects/my-project/instances/instance1/clusters/cluster1/backups/backup1")
            .setSourceTable("projects/my-project/instances/instance1/tables/table1")
            .setSourceBackup(
                "projects/my-project/instances/instance1/clusters/cluster1/backups/backup2")
            .setExpireTime(expireTime)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .setHotToStandardTime(hotToStandardTime)
            .setSizeBytes(123456)
            .setState(com.google.bigtable.admin.v2.Backup.State.READY)
            .setBackupType(com.google.bigtable.admin.v2.Backup.BackupType.HOT)
            .build();

    Backup result = Backup.fromProto(proto);

    assertThat(result.getId()).isEqualTo("backup1");
    assertThat(result.getSourceTableId()).isEqualTo("table1");
    assertThat(result.getSourceBackupId()).isEqualTo("backup2");
    assertThat(result.getExpireTime())
        .isEqualTo(Instant.ofEpochMilli(Timestamps.toMillis(expireTime)));
    assertThat(result.getStartTime())
        .isEqualTo(Instant.ofEpochMilli(Timestamps.toMillis(startTime)));
    assertThat(result.getEndTime()).isEqualTo(Instant.ofEpochMilli(Timestamps.toMillis(endTime)));
    assertThat(result.getHotToStandardTime())
        .isEqualTo(Instant.ofEpochMilli(Timestamps.toMillis(hotToStandardTime)));
    assertThat(result.getSizeBytes()).isEqualTo(123456);
    assertThat(result.getState()).isEqualTo(Backup.State.READY);
    assertThat(result.getBackupType()).isEqualTo(Backup.BackupType.HOT);
  }

  @Test
  public void testFromProtoCmek() {
    com.google.bigtable.admin.v2.Backup proto =
        com.google.bigtable.admin.v2.Backup.newBuilder()
            .setName("projects/my-project/instances/instance1/clusters/cluster1/backups/backup1")
            .setSourceTable("projects/my-project/instances/instance1/tables/table1")
            .setExpireTime(Timestamp.newBuilder().setSeconds(1234))
            .setStartTime(Timestamp.newBuilder().setSeconds(1234))
            .setEndTime(Timestamp.newBuilder().setSeconds(1234))
            .setSizeBytes(123456)
            .setState(com.google.bigtable.admin.v2.Backup.State.READY)
            .setEncryptionInfo(
                com.google.bigtable.admin.v2.EncryptionInfo.newBuilder()
                    .setEncryptionType(EncryptionType.CUSTOMER_MANAGED_ENCRYPTION)
                    .setKmsKeyVersion("some key version")
                    .setEncryptionStatus(
                        com.google.rpc.Status.newBuilder().setCode(Code.OK.getNumber()).build())
                    .build())
            .build();

    Backup result = Backup.fromProto(proto);

    assertThat(result.getEncryptionInfo().getType())
        .isEqualTo(EncryptionInfo.Type.CUSTOMER_MANAGED_ENCRYPTION);
    assertThat(result.getEncryptionInfo().getKmsKeyVersion()).isEqualTo("some key version");
    assertThat(result.getEncryptionInfo().getStatus().getCode()).isEqualTo(Status.Code.OK);
  }

  @Test
  public void testRequiresName() {
    com.google.bigtable.admin.v2.Backup proto =
        com.google.bigtable.admin.v2.Backup.newBuilder()
            .setSourceTable("projects/my-project/instances/instance1/tables/table1")
            .setExpireTime(Timestamp.newBuilder().setSeconds(1234).build())
            .setStartTime(Timestamp.newBuilder().setSeconds(123).build())
            .setEndTime(Timestamp.newBuilder().setSeconds(456).build())
            .setSizeBytes(123456)
            .setState(com.google.bigtable.admin.v2.Backup.State.READY)
            .build();

    Exception actualException = null;

    try {
      Backup.fromProto(proto);
    } catch (Exception e) {
      actualException = e;
    }

    assertThat(actualException).isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  public void testRequiresSourceTable() {
    com.google.bigtable.admin.v2.Backup proto =
        com.google.bigtable.admin.v2.Backup.newBuilder()
            .setName("projects/my-project/instances/instance1/clusters/cluster1/backups/backup1")
            .setExpireTime(Timestamp.newBuilder().setSeconds(1234).build())
            .setStartTime(Timestamp.newBuilder().setSeconds(123).build())
            .setEndTime(Timestamp.newBuilder().setSeconds(456).build())
            .setSizeBytes(123456)
            .setState(com.google.bigtable.admin.v2.Backup.State.READY)
            .build();

    Exception actualException = null;

    try {
      Backup.fromProto(proto);
    } catch (Exception e) {
      actualException = e;
    }

    assertThat(actualException).isInstanceOf(IllegalArgumentException.class);
  }
}
