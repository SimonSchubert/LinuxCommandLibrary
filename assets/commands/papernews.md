# TAGLINE

Build a typeset daily news PDF from RSS and Hacker News feeds

# TLDR

**Run the full pipeline** locally

```python -m papernews build```

**Fetch** new articles only

```python -m papernews gather```

**Summarize** fetched articles with Claude

```python -m papernews summarize```

**Rewrite** article bodies for the PDF layout

```python -m papernews rewrite```

**Render** the current edition to PDF

```python -m papernews render```

**Start** the web server and scheduler

```python -m papernews web```

# SYNOPSIS

**papernews** _subcommand_

# PARAMETERS

**gather**
> Pull new items from configured sources and extract article text

**summarize**
> Generate short ledes for fetched articles

**rewrite**
> Produce clean, translated article bodies for rendering

**render**
> Build a LaTeX PDF from stored articles

**build**
> Run gather, summarize, rewrite, and render in sequence

**web**
> Start the HTTP service with background ingest and PDF delivery

# DESCRIPTION

**papernews** is a self-hosted tool that turns RSS feeds and Hacker News stories into one consistently typeset PDF. It fetches sources listed in **sources.toml**, extracts article bodies, uses Claude to summarize and rewrite them, and renders the result with **xelatex**.

The output is meant for calm offline reading on e-ink devices such as a reMarkable, but any PDF viewer works. A typical edition contains a cover page, table of contents, world-news snippets, and full article text set in two-column Latin Modern typography.

In server mode, **papernews** exposes **/** for a landing page and **/digest.pdf** for the current cached edition. A background scheduler reruns ingest on a fixed interval or cron schedule. State is stored locally in SQLite, so content survives restarts.

Configured sources can be Hacker News rankings or any Atom/RSS feed. Non-English articles can be translated to English during the rewrite step.

# CONFIGURATION

**sources.toml**
> Defines feed order, source kind (**hn** or **rss**), limits, and HN filtering thresholds

**papernews/template.tex.j2**
> Controls page size, fonts, cover layout, and article formatting

**.env**
> Holds **ANTHROPIC_API_KEY** and ingest schedule variables such as **INGEST_INTERVAL_SECONDS** or **INGEST_SCHEDULE**

# CAVEATS

Summarize and rewrite steps call the Anthropic API, so article text leaves the machine for processing. Gather and render stay local.

Rendering requires **xelatex** and related TeX packages. The first PDF build can take one to two minutes before caching makes later requests fast.

This is a hobby project; configuration and output quality may change between versions.

# SEE ALSO

[curl](/man/curl)(1), [docker](/man/docker)(1)