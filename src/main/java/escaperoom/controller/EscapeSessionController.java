package escaperoom.controller;

import escaperoom.model.EscapeSession;
import escaperoom.repository.EscapeSessionRepository;
import jakarta.validation.Valid;
import org.apache.tomcat.util.security.Escape;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sessions")
public class EscapeSessionController {

    private final EscapeSessionRepository repository;

    public EscapeSessionController(EscapeSessionRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<EscapeSession> createSession(@Valid @RequestBody EscapeSession session) {
        session.setId(null);
        EscapeSession savedSession = repository.save(session);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedSession);
    }
}
