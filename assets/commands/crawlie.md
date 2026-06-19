# TAGLINE

Technical SEO and GEO crawler for the terminal

# TLDR

**Crawl** an entire site and print a report

```crawlie crawl [https://example.com] --format pretty```

**Audit** a single page

```crawlie audit [https://example.com/pricing]```

**Save** an HTML report to a file

```crawlie crawl [https://example.com] --format html -o [report.html]```

**Limit** the number of pages fetched

```crawlie crawl [https://example.com] --max-pages [100]```

**Fail** a CI build when errors are found

```crawlie crawl [https://example.com] --fail-on error```

**Explain** why a finding matters

```crawlie explain [geo-not-answerable]```

# SYNOPSIS

**crawlie** _subcommand_ [_url_] [_options_]

# DESCRIPTION

**crawlie** is a fast, open-source crawler that audits a website for technical SEO and GEO (Generative Engine Optimization) issues. It seeds from **sitemap.xml**, respects **robots.txt**, follows internal links, and applies a set of rules covering broken links, missing or duplicate metadata, performance hints, mobile and international optimization, and AI-search readiness.

Results can be printed to the terminal or exported as JSON, CSV, or a shareable HTML report. The same engine is exposed as an MCP server (**crawlie-mcp**) for use inside agent workflows.

# SUBCOMMANDS

**crawl** _url_
> Crawl an entire site, seeding from the sitemap and following internal links.

**audit** _url_
> Audit a single page or a specific set of pages.

**explain** _finding_
> Describe why a finding matters and how to fix it.

**reports**
> List the local report history.

**report** _id_
> Retrieve a specific saved report by its ID.

# PARAMETERS

**--format** _fmt_
> Output format: **pretty** (terminal), **json**, **csv**, or **html** (default: json).

**-o**, **--output** _file_
> Write the report to a file instead of standard output.

**--max-pages** _n_
> Maximum number of pages to fetch (default: 500).

**--max-depth** _n_
> Maximum click depth from the seed URL.

**--concurrency** _n_
> Number of parallel requests (default: 16).

**--include** _glob_
> Only crawl URLs matching the pattern.

**--exclude** _glob_
> Skip URLs matching the pattern.

**--no-robots**
> Do not parse or honor robots.txt.

**--no-sitemap**
> Do not seed the crawl from sitemap.xml.

**--no-external**
> Skip checking external links.

**--severity** _level_
> Filter findings by severity: **error**, **warning**, or **notice**.

**--save**
> Store the result in the local report history.

**--fail-on** _level_
> Exit with a non-zero status when findings of **error** or **warning** severity are present (useful in CI).

# HISTORY

**crawlie** is written in Rust (with a TypeScript desktop companion) and released under the MIT license. It was published in 2026 as a free, agent-friendly alternative to commercial SEO crawlers, adding GEO checks aimed at how AI search engines read a site.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [httrack](/man/httrack)(1), [scrapy](/man/scrapy)(1)

# RESOURCES

```[Source code](https://github.com/spronta/crawlie)```

<!-- verified: 2026-06-19 -->
