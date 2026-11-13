package escaperoom.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class EscapeSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Team name is required")
    private String teamName;

    private String roomTheme;

    @Min(value = 1, message = "Escape time must be at least 1 minute")
    private int escapeTimeMinutes;

    private int hintsUsed;

    private boolean escapedSuccessfully;

    public EscapeSession() {
    }

    public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getEscapeTimeMinutes() {
        return escapeTimeMinutes;
    }

    public void setEscapeTimeMinutes(int escapeTimeMinutes) {
        this.escapeTimeMinutes = escapeTimeMinutes;
    }

    public String getRoomTheme() {
        return roomTheme;
    }

    public void setRoomTheme(String roomTheme) {
        this.roomTheme = roomTheme;
    }

    public int getHintsUsed() {
        return hintsUsed;
    }

    public void setHintsUsed(int hintsUsed) {
        this.hintsUsed = hintsUsed;
    }

    public boolean isEscapedSuccessfully() {
        return escapedSuccessfully;
    }

    public void setEscapedSuccessfully(boolean escapedSuccessfully) {
        this.escapedSuccessfully = escapedSuccessfully;
    }
}


