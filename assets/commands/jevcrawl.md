# TAGLINE

Crawl a website toward a question, returning only the passages that answer it

# TLDR

Check the **API key** and the connection to Jev

```jevcrawl doctor```

**Crawl** from a start URL toward a goal

```jevcrawl crawl [https://docs.python.org/3/] --goal "[What does the walrus operator do?]"```

Print the **full JSON** result

```jevcrawl crawl [https://docs.python.org/3/] --goal "[What does the walrus operator do?]" --json```

**Scrape** one known page (no Jev call unless **--goal** is set)

```jevcrawl scrape [https://example.com/help/returns]```

Scrape one page and **keep only passages** that match a goal

```jevcrawl scrape [https://example.com/help/returns] --goal "[How do I request a refund?]"```

**Rank URLs** on a site for a goal

```jevcrawl map [https://example.com] --goal "[pricing]" --limit [20]```

Run the **MCP server** on stdio (the default with no subcommand)

```jevcrawl```

# SYNOPSIS

**jevcrawl** [**-v**] [_command_] [_options_]

# PARAMETERS

**(no command)**
> Start the MCP server on stdio. MCP clients typically launch this with `uvx jevcrawl` and `TYPESAFE_API_KEY` in the environment.

**crawl** _url_ **--goal** _question_ [**--max-pages** _n_] [**--max-seconds** _s_] [**--return-tokens** _n_] [**--max-usd** _amount_] [**--json**]
> Fetch from _url_ toward _question_. Default **--max-pages** 30, **--max-seconds** 120, **--return-tokens** 4000, **--max-usd** 0.05 (hard cap on Jev spend; a request that would pass it is never sent). Stops when the kept passages are judged to answer the goal, the frontier is empty, or a budget is hit.

**scrape** _url_ [**--goal** _question_] [**--max-usd** _amount_] [**--json**]
> Fetch one page. With **--goal**, return only the relevant passages. Without it, return the page content and make no Jev call.

**map** _url_ **--goal** _question_ [**--limit** _n_] [**--max-pages** _n_] [**--max-usd** _amount_] [**--json**]
> Rank URLs found from _url_ for _question_. Default **--limit** 50, **--max-pages** 10. Prints `priority  url  (anchor)` lines, or the JSON list with **--json**.

**doctor**
> Print version, endpoint, model, whether an API key is set (length only, never the key), and cache path, then list models from Jev. Exit 0 if Jev accepted the key; exit 1 if the key is missing, rejected, or the endpoint cannot be reached.

**--json**
> Print the full result object instead of the human-readable blocks. On a crawl error, print `{"error": "...", "message": "..."}`.

**-v**, **--verbose**
> Repeatable. Once logs INFO to stderr; twice or more logs DEBUG. Default is WARNING.

**--version**
> Print `jevcrawl` and the package version.

# DESCRIPTION

**jevcrawl** is a Python 3.11+ CLI and MCP server that crawls a website for a specific question. TypeSafe's **Jev** decision model scores links and passages; it never writes text. Everything returned is copied from the page, with URL, heading path, and character offsets so a quote can be checked later.

A crawl stays on the start host and its subdomains, fetches up to four pages at a time, and can offer sitemap URLs that share words with the goal. Blocks scoring at or above 0.35 are **kept**; scores in [0.20, 0.35) are **uncertain**. The crawl stops when "do the kept blocks answer the goal?" reaches 0.85, or when `stopped_because` is `frontier_empty`, `max_pages`, `max_seconds`, `budget`, or `auth_error`. After three failed Jev requests the crawl continues breadth-first, returns every block unscored in `uncertain`, and sets `stats.degraded`.

The console script is `jevcrawl.cli:main` (`pip install jevcrawl` or `uv tool install jevcrawl`). Version **0.1.0**. Human-readable output lists kept and uncertain blocks, then a summary line with pages fetched, stop reason, token counts, Jev call count, cost, and elapsed time. Pages that need JavaScript are listed in `stats.needs_js_urls` and are not rendered.

# CONFIGURATION

**TYPESAFE_API_KEY**
> Jev API key. Required for crawl, map, scrape-with-goal, doctor, and the MCP server. Create a key at https://console.typesafe.ai/. Never written to disk or logs.

**JEVCRAWL_BASE_URL**
> Jev-compatible HTTP endpoint. Default `https://api.typesafe.ai`.

**JEVCRAWL_MODEL**
> Model id. Default `jev-1.13.0`. Thresholds are calibrated per version; changing the model without retuning them changes keep/stop behaviour.

**JEVCRAWL_CACHE_DIR**
> Local cache of Jev answers. Default `~/.jevcrawl/cache`. Repeating the same goal on the same pages does not spend again.

Python callers can pass a `Config` with different thresholds, link limits, and concurrency; the CLI reads only the four environment variables above.

# CAVEATS

Requires a TypeSafe Jev API key and network access. Page text (blocks, link labels, and URLs) is sent to TypeSafe to be scored. Jev charges for input tokens only; `jev-1.13.0` is billed at $0.042 per million input tokens.

Does not read `robots.txt` and does not rate-limit beyond four concurrent fetches. It never logs in, does not try to pass paywalls or CAPTCHAs, and does not run JavaScript. You are responsible for the sites you crawl and their terms.

A missing or rejected key stops a crawl with `auth_error`. Install from PyPI (`jevcrawl` 0.1.0); Linux distribution packages may not exist.

# HISTORY

**jevcrawl** was published in **October 2026** by **Rayen Mlayeh** (PyPI 0.1.0 on 2026-10-13) as an Apache-2.0 MCP server and CLI on top of TypeSafe **Jev**. It is measured against Crawl4AI's goal-directed crawl and against an LLM that picks each link, on WebWalkerQA tasks whose answers sit several clicks into a site.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [scrapy](/man/scrapy)(1), [httpx](/man/httpx)(1), [jevchat](/man/jevchat)(1), [jevals](/man/jevals)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/RayenMlayeh/jevcrawl)```

<!-- verified: 2026-10-14 -->
