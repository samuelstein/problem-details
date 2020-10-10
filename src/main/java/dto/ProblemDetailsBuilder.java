package dto;

import lombok.AllArgsConstructor;

import java.net.URI;

/**
 * Dedicated problem details builder
 */
@AllArgsConstructor
public class ProblemDetailsBuilder {

    private final String message;
    private final Integer statusCode;
    private final String requestId;
    private final String detailMessage;


    public ProblemDetails build() {
        ProblemDetails detail = new ProblemDetails(statusCode, message);
        detail.setType(URI.create("/resources/errordescriptions.html"));
        detail.setDetail(detailMessage);
        detail.setInstance(requestId);
        return detail;
    }
}
