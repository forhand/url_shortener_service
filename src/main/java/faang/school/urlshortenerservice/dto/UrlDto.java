package faang.school.urlshortenerservice.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import org.hibernate.validator.constraints.URL;

@Builder
public record UrlDto(
        @URL(message = "Invalid URL")
        @NotBlank(message = "Url is required")
        String url
) {
}