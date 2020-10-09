package de.samuelstein.dto.error;

import java.net.URI;
import javax.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * Dedicated problem details builder
 */
@RequiredArgsConstructor
@AllArgsConstructor
public class ProblemDetailsBuilder {

  private final String message;
  private final HttpStatus status;
  private final HttpServletRequest request;
  private String detailMessage;


  public ProblemDetails build() {
    ProblemDetails detail = new ProblemDetails();
    //TODO: link to static help html file in resource folder
    detail.setType(URI.create(""));
    detail.setTitle(message);
    detail.setDetail(detailMessage);
    detail.setStatus(status.value());
    detail.setInstance(request.getAttribute("requestId").toString());
    return detail;
  }
}
