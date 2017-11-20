package pl.sdacademy;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<CD> CDs;

    public Library() {
        CDs = new ArrayList<>();
    }

    public List<CD> searchByGenre(Genre genre) {

//      return CDs.stream()
//      .filter(cd -> cd.getGenres().contains(genre))           można to robić stream'em albo pętlą
//      .collect(Collectors.toList());

        List<CD> result = new ArrayList<>();

        for (CD cd : CDs) {
            if (cd.getGenres().contains(genre)) {
                result.add(cd);
            }
        }
        return result;
    }

    public List<CD> searchCDByCDTitle(String title) {

        List<CD> result = new ArrayList<>();
        for (CD cd : CDs) {
            if (cd.getTitle().contains(title)) {
                result.add(cd);
            }
        }
        return result;
    }

    public List<CD> searchCDByTrackTitle(String title) {

        List<CD> result = new ArrayList<>();

        for (CD cd : CDs) {
            if (!cd.searchByTrackTitle(title).isEmpty()) {
                result.add(cd);
            }
        }

        return result;

        /*
        return CDs.stream()
                 .filter(cd -> !cd.searchByTrackTitle(title).isEmpty())    <---- można to również zapisać stream'em ;)
                 .collect(Collectors.toList());
         */
    }

    public void addCD(CD cd) {
        CDs.add(cd);
    }

    public void deleteCD(CD cd) {
        CDs.remove(cd);
    }
}
