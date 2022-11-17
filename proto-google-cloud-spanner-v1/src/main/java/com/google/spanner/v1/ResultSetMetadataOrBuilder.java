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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/result_set.proto

package com.google.spanner.v1;

public interface ResultSetMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.ResultSetMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Indicates the field names and types for the rows in the result
   * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
   * Users"` could return a `row_type` value like:
   *     "fields": [
   *       { "name": "UserId", "type": { "code": "INT64" } },
   *       { "name": "UserName", "type": { "code": "STRING" } },
   *     ]
   * </pre>
   *
   * <code>.google.spanner.v1.StructType row_type = 1;</code>
   *
   * @return Whether the rowType field is set.
   */
  boolean hasRowType();
  /**
   *
   *
   * <pre>
   * Indicates the field names and types for the rows in the result
   * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
   * Users"` could return a `row_type` value like:
   *     "fields": [
   *       { "name": "UserId", "type": { "code": "INT64" } },
   *       { "name": "UserName", "type": { "code": "STRING" } },
   *     ]
   * </pre>
   *
   * <code>.google.spanner.v1.StructType row_type = 1;</code>
   *
   * @return The rowType.
   */
  com.google.spanner.v1.StructType getRowType();
  /**
   *
   *
   * <pre>
   * Indicates the field names and types for the rows in the result
   * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
   * Users"` could return a `row_type` value like:
   *     "fields": [
   *       { "name": "UserId", "type": { "code": "INT64" } },
   *       { "name": "UserName", "type": { "code": "STRING" } },
   *     ]
   * </pre>
   *
   * <code>.google.spanner.v1.StructType row_type = 1;</code>
   */
  com.google.spanner.v1.StructTypeOrBuilder getRowTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * If the read or SQL query began a transaction as a side-effect, the
   * information about the new transaction is yielded here.
   * </pre>
   *
   * <code>.google.spanner.v1.Transaction transaction = 2;</code>
   *
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   *
   *
   * <pre>
   * If the read or SQL query began a transaction as a side-effect, the
   * information about the new transaction is yielded here.
   * </pre>
   *
   * <code>.google.spanner.v1.Transaction transaction = 2;</code>
   *
   * @return The transaction.
   */
  com.google.spanner.v1.Transaction getTransaction();
  /**
   *
   *
   * <pre>
   * If the read or SQL query began a transaction as a side-effect, the
   * information about the new transaction is yielded here.
   * </pre>
   *
   * <code>.google.spanner.v1.Transaction transaction = 2;</code>
   */
  com.google.spanner.v1.TransactionOrBuilder getTransactionOrBuilder();

  /**
   *
   *
   * <pre>
   * A SQL query can be parameterized. In PLAN mode, these parameters can be
   * undeclared. This indicates the field names and types for those undeclared
   * parameters in the SQL query. For example, a SQL query like `"SELECT * FROM
   * Users where UserId = &#64;userId and UserName = &#64;userName "` could return a
   * `undeclared_parameters` value like:
   *     "fields": [
   *       { "name": "UserId", "type": { "code": "INT64" } },
   *       { "name": "UserName", "type": { "code": "STRING" } },
   *     ]
   * </pre>
   *
   * <code>.google.spanner.v1.StructType undeclared_parameters = 3;</code>
   *
   * @return Whether the undeclaredParameters field is set.
   */
  boolean hasUndeclaredParameters();
  /**
   *
   *
   * <pre>
   * A SQL query can be parameterized. In PLAN mode, these parameters can be
   * undeclared. This indicates the field names and types for those undeclared
   * parameters in the SQL query. For example, a SQL query like `"SELECT * FROM
   * Users where UserId = &#64;userId and UserName = &#64;userName "` could return a
   * `undeclared_parameters` value like:
   *     "fields": [
   *       { "name": "UserId", "type": { "code": "INT64" } },
   *       { "name": "UserName", "type": { "code": "STRING" } },
   *     ]
   * </pre>
   *
   * <code>.google.spanner.v1.StructType undeclared_parameters = 3;</code>
   *
   * @return The undeclaredParameters.
   */
  com.google.spanner.v1.StructType getUndeclaredParameters();
  /**
   *
   *
   * <pre>
   * A SQL query can be parameterized. In PLAN mode, these parameters can be
   * undeclared. This indicates the field names and types for those undeclared
   * parameters in the SQL query. For example, a SQL query like `"SELECT * FROM
   * Users where UserId = &#64;userId and UserName = &#64;userName "` could return a
   * `undeclared_parameters` value like:
   *     "fields": [
   *       { "name": "UserId", "type": { "code": "INT64" } },
   *       { "name": "UserName", "type": { "code": "STRING" } },
   *     ]
   * </pre>
   *
   * <code>.google.spanner.v1.StructType undeclared_parameters = 3;</code>
   */
  com.google.spanner.v1.StructTypeOrBuilder getUndeclaredParametersOrBuilder();
}
