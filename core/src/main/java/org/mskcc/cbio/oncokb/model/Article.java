

package org.mskcc.cbio.oncokb.model;

import java.util.Objects;

/**
 *
 * @author jgao
 */
public class Article implements java.io.Serializable {
    private Integer articleId;
    private String pmid;
    private String title;
    private String journal;
    private String pubDate;
    private String volume;
    private String issue;
    private String pages;
    private String authors;
    private String elocationId;

    public Article() {
    }

    public Article(String pmid) {
        this.pmid = pmid;
    }

    public Article(String pmid, String title, String journal, String pubDate, String volume, String issue, String pages, String authors, String elocationId) {
        this.pmid = pmid;
        this.title = title;
        this.journal = journal;
        this.pubDate = pubDate;
        this.volume = volume;
        this.issue = issue;
        this.pages = pages;
        this.authors = authors;
        this.elocationId = elocationId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getElocationId() {
        return elocationId;
    }

    public void setElocationId(String elocationId) {
        this.elocationId = elocationId;
    }
    
    public String getReference() {
        StringBuilder sb = new StringBuilder();
        sb.append(authors).append(". ")
                .append(journal).append(". ");
        if (pubDate!=null)
            sb.append(pubDate).append(";");
        if (volume!=null)
            sb.append(volume);
        if (issue!=null)
            sb.append("(").append(issue).append(")");
        if (pages!=null)
            sb.append(pages);
        sb.append(".");
        
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.pmid);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Article other = (Article) obj;
        if (!Objects.equals(this.pmid, other.pmid)) {
            return false;
        }
        return true;
    }
    
}
