/*
 * Copyright 2025 Google LLC
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
package com.google.cloud.bigtable.data.v2.models.sql;

import com.google.api.gax.grpc.GrpcStatusCode;
import com.google.api.gax.rpc.ApiException;
import io.grpc.Status.Code;

/**
 * Error thrown when an executeQuery attempt hits the attempt deadline waiting for {@link
 * PreparedStatement} to refresh it's underlying plan.
 */
public class PreparedStatementRefreshTimeoutException extends ApiException {
  public PreparedStatementRefreshTimeoutException(String message) {
    super(message, null, GrpcStatusCode.of(Code.DEADLINE_EXCEEDED), true);
  }
}
