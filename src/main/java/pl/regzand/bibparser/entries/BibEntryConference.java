package pl.regzand.bibparser.entries;

import pl.regzand.bibparser.parser.BibField;
import pl.regzand.bibparser.values.BibValue;

/**
 * Data container for BibTeX @Conference and @Inproceedings entries
 *
 * @see <a href="https://pl.wikipedia.org/wiki/BibTeX#Struktura_plik.C3.B3w_bazy_bibliograficznej">BibTeX entry fields</a>
 */
public class BibEntryConference extends BibEntry {

    @BibField(name = "author", required = true, names = true)
    public BibValue author;

    // ==============================================================================
    // === INJECTED FIELDS
    // ==============================================================================
    @BibField(name = "title", required = true)
    public BibValue title;
    @BibField(name = "booktitle", required = true)
    public BibValue booktitle;
    @BibField(name = "year", required = true)
    public BibValue year;
    @BibField(name = "editor", names = true)
    public BibValue editor;
    @BibField(name = "volume")
    public BibValue volume;
    @BibField(name = "number")
    public BibValue number;
    @BibField(name = "series")
    public BibValue series;
    @BibField(name = "pages")
    public BibValue pages;
    @BibField(name = "address")
    public BibValue address;
    @BibField(name = "month")
    public BibValue month;
    @BibField(name = "organization")
    public BibValue organization;
    @BibField(name = "publisher")
    public BibValue publisher;
    @BibField(name = "note")
    public BibValue note;
    @BibField(name = "key")
    public BibValue key;

    /**
     * Creates entry
     *
     * @param id unique entry id
     */
    public BibEntryConference(String id) {
        super("Conference", id);
    }

    // ==============================================================================
    // === GETTERS
    // ==============================================================================

    /**
     * Returns title of BibTeX entry
     *
     * @return title of BibTeX entry
     */
    @Override
    public BibValue getTitle() {
        return title;
    }

    /**
     * Returns author of BibTeX entry
     *
     * @return author of BibTeX entry
     */
    @Override
    public BibValue getAuthors() {
        return author;
    }

    /**
     * Returns year of publication of BibTeX entry
     *
     * @return year of publication of BibTeX entry
     */
    @Override
    public BibValue getYear() {
        return year;
    }

    /**
     * Returns month of publication of BibTeX entry
     *
     * @return month of publication of BibTeX entry
     */
    @Override
    public BibValue getMonth() {
        return month;
    }

    /**
     * Returns note about BibTeX entry
     *
     * @return note about BibTeX entry
     */
    @Override
    public BibValue getNote() {
        return note;
    }

    /**
     * Returns key of BibTeX entry
     *
     * @return key of BibTeX entry
     */
    @Override
    public BibValue getKey() {
        return key;
    }

    public BibValue getBooktitle() {
        return booktitle;
    }

    public BibValue getEditor() {
        return editor;
    }

    public BibValue getVolume() {
        return volume;
    }

    public BibValue getNumber() {
        return number;
    }

    public BibValue getSeries() {
        return series;
    }

    public BibValue getPages() {
        return pages;
    }

    public BibValue getAddress() {
        return address;
    }

    public BibValue getOrganization() {
        return organization;
    }

    public BibValue getPublisher() {
        return publisher;
    }
}
