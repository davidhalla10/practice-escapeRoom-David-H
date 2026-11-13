package escaperoom.repository;

import escaperoom.model.EscapeSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscapeSessionRepository
    extends JpaRepository<EscapeSession, Long> {
}
