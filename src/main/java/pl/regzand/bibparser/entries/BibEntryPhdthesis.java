package pl.regzand.bibparser.entries;

import pl.regzand.bibparser.parser.BibField;
import pl.regzand.bibparser.values.BibValue;

/**
 * Data container for BibTeX @Phdthesis entry
 *
 * @see <a href="https://pl.wikipedia.org/wiki/BibTeX#Struktura_plik.C3.B3w_bazy_bibliograficznej">BibTeX entry fields</a>
 */
public class BibEntryPhdthesis extends BibEntry {

    @BibField(name = "author", required = true, names = true)
    public BibValue author;

    // ==============================================================================
    // === INJECTABLE FIELDS
    // ==============================================================================
    @BibField(name = "title", required = true)
    public BibValue title;
    @BibField(name = "school", required = true)
    public BibValue school;
    @BibField(name = "year", required = true)
    public BibValue year;
    @BibField(name = "type")
    public BibValue type;
    @BibField(name = "address")
    public BibValue address;
    @BibField(name = "month")
    public BibValue month;
    @BibField(name = "note")
    public BibValue note;
    @BibField(name = "key")
    public BibValue key;

    /**
     * Creates entry
     *
     * @param id unique entry id
     */
    public BibEntryPhdthesis(String id) {
        super("PhDThesis", id);
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

    public BibValue getSchool() {
        return school;
    }

    public BibValue getType() {
        return type;
    }

    public BibValue getAddress() {
        return address;
    }
}
