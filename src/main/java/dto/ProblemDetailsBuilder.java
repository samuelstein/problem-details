package dto;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.net.URI;

/**
 * Dedicated problem details builder
 */
@AllArgsConstructor
@RequiredArgsConstructor
public class ProblemDetailsBuilder {

    private final Integer statusCode;
    private final String message;
    private String requestId;
    private String detailMessage;


    public ProblemDetails build() {
        ProblemDetails detail = new ProblemDetails(statusCode, message);
        detail.setType(URI.create("/resources/errordescriptions.html"));
        detail.setDetail(detailMessage);
        detail.setInstance(requestId);
        return detail;
    }
}
