package LOCSearch.repository;

import LOCSearch.repository.dto.LocResponse;
import LOCSearch.repository.dto.Result;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Repository
public class LocRepository {

    private final WebClient webClient;

    private static final String baseUrl = "https://www.loc.gov/books";

    public LocRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }

    public List<Result> getResults(String query) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("fo", "json")
                        .queryParam("at", "results")
                        .queryParam("q", query)
                        .build()
                )
                .retrieve()
                .bodyToMono(LocResponse.class)
                .block()
                .getResults();
    }
}
