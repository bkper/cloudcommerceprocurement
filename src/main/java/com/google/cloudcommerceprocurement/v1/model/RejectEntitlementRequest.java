/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.cloudcommerceprocurement.v1.model;

/**
 * Request message for PartnerProcurementService.RejectEntitlement.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Commerce Partner Procurement API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RejectEntitlementRequest extends com.google.api.client.json.GenericJson {

  /**
   * Free form text string explaining the rejection reason.
   *
   * Max allowed length: 256 bytes. Longer strings will be truncated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Free form text string explaining the rejection reason.
   *
   * Max allowed length: 256 bytes. Longer strings will be truncated.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * Free form text string explaining the rejection reason.
   *
   * Max allowed length: 256 bytes. Longer strings will be truncated.
   * @param reason reason or {@code null} for none
   */
  public RejectEntitlementRequest setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public RejectEntitlementRequest set(String fieldName, Object value) {
    return (RejectEntitlementRequest) super.set(fieldName, value);
  }

  @Override
  public RejectEntitlementRequest clone() {
    return (RejectEntitlementRequest) super.clone();
  }

}
