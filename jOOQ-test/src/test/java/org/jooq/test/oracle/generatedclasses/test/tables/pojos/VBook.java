/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "V_BOOK", schema = "TEST")
public class VBook implements Serializable {

	private static final long serialVersionUID = 423423353;

	private Integer    id;
	private Integer    authorId;
	private Integer    coAuthorId;
	private Integer    detailsId;
	private String     title;
	private Integer    publishedIn;
	private Integer    languageId;
	private String     contentText;
	private byte[]     contentPdf;
	private BigDecimal recVersion;
	private Timestamp  recTimestamp;

	public VBook() {}

	public VBook(VBook value) {
		this.id = value.id;
		this.authorId = value.authorId;
		this.coAuthorId = value.coAuthorId;
		this.detailsId = value.detailsId;
		this.title = value.title;
		this.publishedIn = value.publishedIn;
		this.languageId = value.languageId;
		this.contentText = value.contentText;
		this.contentPdf = value.contentPdf;
		this.recVersion = value.recVersion;
		this.recTimestamp = value.recTimestamp;
	}

	public VBook(
		Integer    id,
		Integer    authorId,
		Integer    coAuthorId,
		Integer    detailsId,
		String     title,
		Integer    publishedIn,
		Integer    languageId,
		String     contentText,
		byte[]     contentPdf,
		BigDecimal recVersion,
		Timestamp  recTimestamp
	) {
		this.id = id;
		this.authorId = authorId;
		this.coAuthorId = coAuthorId;
		this.detailsId = detailsId;
		this.title = title;
		this.publishedIn = publishedIn;
		this.languageId = languageId;
		this.contentText = contentText;
		this.contentPdf = contentPdf;
		this.recVersion = recVersion;
		this.recTimestamp = recTimestamp;
	}

	@Column(name = "ID", nullable = false, precision = 7)
	@NotNull
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	@NotNull
	public Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	@Column(name = "CO_AUTHOR_ID", precision = 7)
	public Integer getCoAuthorId() {
		return this.coAuthorId;
	}

	public void setCoAuthorId(Integer coAuthorId) {
		this.coAuthorId = coAuthorId;
	}

	@Column(name = "DETAILS_ID", precision = 7)
	public Integer getDetailsId() {
		return this.detailsId;
	}

	public void setDetailsId(Integer detailsId) {
		this.detailsId = detailsId;
	}

	@Column(name = "TITLE", nullable = false, length = 400)
	@NotNull
	@Size(max = 400)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	@NotNull
	public Integer getPublishedIn() {
		return this.publishedIn;
	}

	public void setPublishedIn(Integer publishedIn) {
		this.publishedIn = publishedIn;
	}

	@Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	@NotNull
	public Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	@Column(name = "CONTENT_TEXT")
	public String getContentText() {
		return this.contentText;
	}

	public void setContentText(String contentText) {
		this.contentText = contentText;
	}

	@Column(name = "CONTENT_PDF")
	public byte[] getContentPdf() {
		return this.contentPdf;
	}

	public void setContentPdf(byte[] contentPdf) {
		this.contentPdf = contentPdf;
	}

	@Column(name = "REC_VERSION")
	public BigDecimal getRecVersion() {
		return this.recVersion;
	}

	public void setRecVersion(BigDecimal recVersion) {
		this.recVersion = recVersion;
	}

	@Column(name = "REC_TIMESTAMP")
	public Timestamp getRecTimestamp() {
		return this.recTimestamp;
	}

	public void setRecTimestamp(Timestamp recTimestamp) {
		this.recTimestamp = recTimestamp;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final VBook other = (VBook) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		}
		else if (!id.equals(other.id))
			return false;
		if (authorId == null) {
			if (other.authorId != null)
				return false;
		}
		else if (!authorId.equals(other.authorId))
			return false;
		if (coAuthorId == null) {
			if (other.coAuthorId != null)
				return false;
		}
		else if (!coAuthorId.equals(other.coAuthorId))
			return false;
		if (detailsId == null) {
			if (other.detailsId != null)
				return false;
		}
		else if (!detailsId.equals(other.detailsId))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		}
		else if (!title.equals(other.title))
			return false;
		if (publishedIn == null) {
			if (other.publishedIn != null)
				return false;
		}
		else if (!publishedIn.equals(other.publishedIn))
			return false;
		if (languageId == null) {
			if (other.languageId != null)
				return false;
		}
		else if (!languageId.equals(other.languageId))
			return false;
		if (contentText == null) {
			if (other.contentText != null)
				return false;
		}
		else if (!contentText.equals(other.contentText))
			return false;
		if (contentPdf == null) {
			if (other.contentPdf != null)
				return false;
		}
		else if (!Arrays.equals(contentPdf, other.contentPdf))
			return false;
		if (recVersion == null) {
			if (other.recVersion != null)
				return false;
		}
		else if (!recVersion.equals(other.recVersion))
			return false;
		if (recTimestamp == null) {
			if (other.recTimestamp != null)
				return false;
		}
		else if (!recTimestamp.equals(other.recTimestamp))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((authorId == null) ? 0 : authorId.hashCode());
		result = prime * result + ((coAuthorId == null) ? 0 : coAuthorId.hashCode());
		result = prime * result + ((detailsId == null) ? 0 : detailsId.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((publishedIn == null) ? 0 : publishedIn.hashCode());
		result = prime * result + ((languageId == null) ? 0 : languageId.hashCode());
		result = prime * result + ((contentText == null) ? 0 : contentText.hashCode());
		result = prime * result + ((contentPdf == null) ? 0 : Arrays.hashCode(contentPdf));
		result = prime * result + ((recVersion == null) ? 0 : recVersion.hashCode());
		result = prime * result + ((recTimestamp == null) ? 0 : recTimestamp.hashCode());
		return result;
	}
}
