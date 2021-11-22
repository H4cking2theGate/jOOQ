/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainersflyway.db.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.example.testcontainersflyway.db.enums.MpaaRating;
import org.jooq.example.testcontainersflyway.db.tables.Film;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmRecord extends UpdatableRecordImpl<FilmRecord> implements Record14<Long, String, String, Integer, Long, Long, Short, BigDecimal, Short, BigDecimal, MpaaRating, LocalDateTime, String[], Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.film.film_id</code>.
     */
    public void setFilmId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film.film_id</code>.
     */
    public Long getFilmId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.film.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.film.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.film.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.film.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.film.release_year</code>.
     */
    public void setReleaseYear(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.film.release_year</code>.
     */
    public Integer getReleaseYear() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.film.language_id</code>.
     */
    public void setLanguageId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.film.language_id</code>.
     */
    public Long getLanguageId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.film.original_language_id</code>.
     */
    public void setOriginalLanguageId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.film.original_language_id</code>.
     */
    public Long getOriginalLanguageId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.film.rental_duration</code>.
     */
    public void setRentalDuration(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.film.rental_duration</code>.
     */
    public Short getRentalDuration() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>public.film.rental_rate</code>.
     */
    public void setRentalRate(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.film.rental_rate</code>.
     */
    public BigDecimal getRentalRate() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>public.film.length</code>.
     */
    public void setLength(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.film.length</code>.
     */
    public Short getLength() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>public.film.replacement_cost</code>.
     */
    public void setReplacementCost(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.film.replacement_cost</code>.
     */
    public BigDecimal getReplacementCost() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>public.film.rating</code>.
     */
    public void setRating(MpaaRating value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.film.rating</code>.
     */
    public MpaaRating getRating() {
        return (MpaaRating) get(10);
    }

    /**
     * Setter for <code>public.film.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.film.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>public.film.special_features</code>.
     */
    public void setSpecialFeatures(String[] value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.film.special_features</code>.
     */
    public String[] getSpecialFeatures() {
        return (String[]) get(12);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setFulltext(Object value) {
        set(13, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getFulltext() {
        return get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<Long, String, String, Integer, Long, Long, Short, BigDecimal, Short, BigDecimal, MpaaRating, LocalDateTime, String[], Object> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Long, String, String, Integer, Long, Long, Short, BigDecimal, Short, BigDecimal, MpaaRating, LocalDateTime, String[], Object> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Film.FILM.FILM_ID;
    }

    @Override
    public Field<String> field2() {
        return Film.FILM.TITLE;
    }

    @Override
    public Field<String> field3() {
        return Film.FILM.DESCRIPTION;
    }

    @Override
    public Field<Integer> field4() {
        return Film.FILM.RELEASE_YEAR;
    }

    @Override
    public Field<Long> field5() {
        return Film.FILM.LANGUAGE_ID;
    }

    @Override
    public Field<Long> field6() {
        return Film.FILM.ORIGINAL_LANGUAGE_ID;
    }

    @Override
    public Field<Short> field7() {
        return Film.FILM.RENTAL_DURATION;
    }

    @Override
    public Field<BigDecimal> field8() {
        return Film.FILM.RENTAL_RATE;
    }

    @Override
    public Field<Short> field9() {
        return Film.FILM.LENGTH;
    }

    @Override
    public Field<BigDecimal> field10() {
        return Film.FILM.REPLACEMENT_COST;
    }

    @Override
    public Field<MpaaRating> field11() {
        return Film.FILM.RATING;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return Film.FILM.LAST_UPDATE;
    }

    @Override
    public Field<String[]> field13() {
        return Film.FILM.SPECIAL_FEATURES;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field14() {
        return Film.FILM.FULLTEXT;
    }

    @Override
    public Long component1() {
        return getFilmId();
    }

    @Override
    public String component2() {
        return getTitle();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Integer component4() {
        return getReleaseYear();
    }

    @Override
    public Long component5() {
        return getLanguageId();
    }

    @Override
    public Long component6() {
        return getOriginalLanguageId();
    }

    @Override
    public Short component7() {
        return getRentalDuration();
    }

    @Override
    public BigDecimal component8() {
        return getRentalRate();
    }

    @Override
    public Short component9() {
        return getLength();
    }

    @Override
    public BigDecimal component10() {
        return getReplacementCost();
    }

    @Override
    public MpaaRating component11() {
        return getRating();
    }

    @Override
    public LocalDateTime component12() {
        return getLastUpdate();
    }

    @Override
    public String[] component13() {
        return getSpecialFeatures();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component14() {
        return getFulltext();
    }

    @Override
    public Long value1() {
        return getFilmId();
    }

    @Override
    public String value2() {
        return getTitle();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public Integer value4() {
        return getReleaseYear();
    }

    @Override
    public Long value5() {
        return getLanguageId();
    }

    @Override
    public Long value6() {
        return getOriginalLanguageId();
    }

    @Override
    public Short value7() {
        return getRentalDuration();
    }

    @Override
    public BigDecimal value8() {
        return getRentalRate();
    }

    @Override
    public Short value9() {
        return getLength();
    }

    @Override
    public BigDecimal value10() {
        return getReplacementCost();
    }

    @Override
    public MpaaRating value11() {
        return getRating();
    }

    @Override
    public LocalDateTime value12() {
        return getLastUpdate();
    }

    @Override
    public String[] value13() {
        return getSpecialFeatures();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value14() {
        return getFulltext();
    }

    @Override
    public FilmRecord value1(Long value) {
        setFilmId(value);
        return this;
    }

    @Override
    public FilmRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public FilmRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FilmRecord value4(Integer value) {
        setReleaseYear(value);
        return this;
    }

    @Override
    public FilmRecord value5(Long value) {
        setLanguageId(value);
        return this;
    }

    @Override
    public FilmRecord value6(Long value) {
        setOriginalLanguageId(value);
        return this;
    }

    @Override
    public FilmRecord value7(Short value) {
        setRentalDuration(value);
        return this;
    }

    @Override
    public FilmRecord value8(BigDecimal value) {
        setRentalRate(value);
        return this;
    }

    @Override
    public FilmRecord value9(Short value) {
        setLength(value);
        return this;
    }

    @Override
    public FilmRecord value10(BigDecimal value) {
        setReplacementCost(value);
        return this;
    }

    @Override
    public FilmRecord value11(MpaaRating value) {
        setRating(value);
        return this;
    }

    @Override
    public FilmRecord value12(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public FilmRecord value13(String[] value) {
        setSpecialFeatures(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public FilmRecord value14(Object value) {
        setFulltext(value);
        return this;
    }

    @Override
    public FilmRecord values(Long value1, String value2, String value3, Integer value4, Long value5, Long value6, Short value7, BigDecimal value8, Short value9, BigDecimal value10, MpaaRating value11, LocalDateTime value12, String[] value13, Object value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmRecord
     */
    public FilmRecord() {
        super(Film.FILM);
    }

    /**
     * Create a detached, initialised FilmRecord
     */
    public FilmRecord(Long filmId, String title, String description, Integer releaseYear, Long languageId, Long originalLanguageId, Short rentalDuration, BigDecimal rentalRate, Short length, BigDecimal replacementCost, MpaaRating rating, LocalDateTime lastUpdate, String[] specialFeatures, Object fulltext) {
        super(Film.FILM);

        setFilmId(filmId);
        setTitle(title);
        setDescription(description);
        setReleaseYear(releaseYear);
        setLanguageId(languageId);
        setOriginalLanguageId(originalLanguageId);
        setRentalDuration(rentalDuration);
        setRentalRate(rentalRate);
        setLength(length);
        setReplacementCost(replacementCost);
        setRating(rating);
        setLastUpdate(lastUpdate);
        setSpecialFeatures(specialFeatures);
        setFulltext(fulltext);
    }
}
