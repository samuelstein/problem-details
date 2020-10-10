package dto;

import lombok.Data;
import lombok.NonNull;
import lombok.Value;

import java.net.URI;

/**
 * Problem details implementation (RFC 7807) for HTTP API to carry machine-readable details of errors in a HTTP response
 * to avoid the need to define new error response formats for HTTP APIs.
 */

//@Value
@Data
public class ProblemDetails {

    @NonNull
    Integer status;
    @NonNull
    String title;
    String detail;
    String instance;
    URI type;
}
