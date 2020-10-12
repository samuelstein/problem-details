import dto.ProblemDetails;
import dto.ProblemDetailsBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

class ProblemDetailsTest {

    @Test
    @DisplayName("Test creation of problem details with mandatory fields")
    void testProblemDetailsCreation1() throws URISyntaxException {
        final var problemDetails = new ProblemDetailsBuilder(400, "Bad Request occurred").build();
        final var expectedProblemDetails = new ProblemDetails(400, "Bad Request occurred");
        expectedProblemDetails.setType(new URI("/resources/errordescriptions.html"));

        assertThat(problemDetails).isEqualTo(expectedProblemDetails);
    }
}
