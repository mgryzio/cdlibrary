package pl.sdacademy;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class CD {

    private String band;
    private String title;
    private String publisher;
    private LocalDate releaseDate;
    private Set<Genre> genres;
    private List<Track> tracks;

    public CD(String band, String title, String publisher, LocalDate releaseDate) {
        this.band = band;
        this.title = title;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
    }

    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    public void removeGenre(Genre genre) {
        genres.remove(genre);
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void deleteTrack(int trackNumber) {
        tracks.remove(trackNumber);
    }
}
