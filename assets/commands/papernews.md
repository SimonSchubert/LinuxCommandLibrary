# TAGLINE

Build a typeset daily news PDF from RSS and Hacker News feeds

# TLDR

**Run the full pipeline** locally

```python -m papernews build```

**Fetch** new articles only

```python -m papernews gather```

**Summarize** fetched articles with the LLM using 2 workers

```python -m papernews summarize --workers [2]```

**Rewrite** article bodies for the PDF layout

```python -m papernews rewrite```

**Run** gather, summarize and rewrite without rendering

```python -m papernews ingest```

**Render** the current edition to PDF

```python -m papernews render```

**Show** store counts

```python -m papernews status```

**Run** the web service and scheduler with Docker

```docker compose up --build -d```

**Trigger** a manual ingest on a running server

```curl -X POST http://localhost:8000/ingest```

# SYNOPSIS

**papernews** [**--config** _file_] [**--state** _file_] [**--out** _dir_] _subcommand_ [_options_]

# PARAMETERS

**gather**
> Pull new items from configured sources and extract article text

**summarize**
> Generate short ledes for fetched articles

**rewrite**
> Produce clean, translated article bodies for rendering

**ingest**
> Run gather, summarize, and rewrite without producing a PDF

**render** [**--date** _YYYY-MM-DD_]
> Build a LaTeX PDF from stored articles

**build** [**--date** _YYYY-MM-DD_]
> Run ingest and render in sequence (the default)

**status**
> Print store counts

**--workers** _N_
> Parallel LLM batches for **summarize**, **rewrite**, **ingest** and **build** (default 6)

**--config** _file_
> Sources file (default **sources.toml**)

**--state** _file_
> SQLite store (default **state.db**)

**--out** _dir_
> Output directory for PDFs (default **archive**)

# DESCRIPTION

**papernews** is a self-hosted tool that turns RSS feeds and Hacker News stories into one consistently typeset PDF. It fetches sources listed in **sources.toml**, extracts article bodies, uses an LLM (Anthropic Claude by default, or a local **Ollama** model) to summarize and rewrite them, and renders the result with **xelatex**.

The output is meant for calm offline reading on e-ink devices such as a reMarkable, but any PDF viewer works. A typical edition contains a cover page, table of contents, world-news snippets, and full article text set in two-column Latin Modern typography.

In server mode (a Flask app run by **gunicorn**, usually via Docker Compose on port 8000), **papernews** exposes **/** for a landing page, **/digest.pdf** for the current cached edition, **/preview.png**, **/sources**, **/healthz** and **POST /ingest**. A background scheduler reruns ingest every 4 hours by default or at fixed times, and an optional **POST_INGEST_HOOK** script receives each new PDF, e.g. to push it to a reMarkable. State is stored locally in SQLite, so content survives restarts.

Configured sources can be Hacker News rankings or any Atom/RSS feed. Non-English articles can be translated to English during the rewrite step.

# CONFIGURATION

**sources.toml**
> Defines feed order, source kind (**hn** or **rss**), limits, and HN filtering thresholds

**papernews/template.tex.j2**
> Controls page size, fonts, cover layout, and article formatting

**.env**
> Holds **LLM_BACKEND** (**anthropic** or **ollama**), **ANTHROPIC_API_KEY**, **ANTHROPIC_MODEL**, **OLLAMA_HOST**, **OLLAMA_MODEL**, schedule variables such as **INGEST_INTERVAL_SECONDS**, **INGEST_SCHEDULE** and **INGEST_TIMEZONE**, and **POST_INGEST_HOOK**

# CAVEATS

With the Anthropic backend, summarize and rewrite send article text to the Anthropic API; with **LLM_BACKEND=ollama** nothing leaves the machine. Gather and render stay local.

Running without Docker requires Python 3.11+, **xelatex** (TeX Live with XeTeX, latex-extra and lmodern) and **pdftoppm**. The first PDF build can take one to two minutes before caching makes later requests fast.

This is a hobby project; configuration and output quality may change between versions.

# SEE ALSO

[xelatex](/man/xelatex)(1), [ollama](/man/ollama)(1), [gunicorn](/man/gunicorn)(1), [curl](/man/curl)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/marcj/papernews)```

<!-- verified: 2026-11-23 -->
