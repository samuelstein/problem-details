package de.samuelstein.dto.error;

import java.net.URI;
import lombok.Data;
import org.springframework.lang.Nullable;

/**
 * Problem details implementation (RFC 7807) for HTTP API to carry machine-readable details of errors in a HTTP response
 * to avoid the need to define new error response formats for HTTP APIs.
 */

@Data
public class ProblemDetails {

  Integer status;
  String title;
  @Nullable
  String detail;
  String instance;
  @Nullable
  URI type;
}
