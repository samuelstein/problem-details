package de.samuelstein.dto.error;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ValidationError {

  String name;
  String reason;
}
