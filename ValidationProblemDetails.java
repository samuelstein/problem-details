package de.samuelstein.dto.error;

import java.util.List;
import lombok.Builder;
import lombok.Data;

/**
 * Wrapper for problem details and errors from form validation
 */

@Builder
@Data
public class ValidationProblemDetails {

  ProblemDetails problemDetails;
  List<ValidationError> validationErrors;
}
