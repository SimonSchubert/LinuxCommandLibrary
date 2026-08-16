# TAGLINE

Scrape a URL to Markdown, JSON, text, or HTML

# TLDR

**Install** the CLI from PyPI

```pip install pyscrappy```

**Scrape** a page to clean Markdown

```pyscrappy extract [https://example.com] [out.md]```

**Write** structured JSON instead

```pyscrappy extract [https://example.com] [out.json]```

**Extract** only elements matching a CSS selector

```pyscrappy extract [https://example.com] [items.txt] --css-selector [.product]```

**Render** JavaScript first (needs **pyscrappy[browser]**)

```pyscrappy extract [https://example.com] [page.md] --render-js```

**Ask** a local Ollama model that can call the built-in scrapers (needs **pyscrappy[mcp]**)

```pyscrappy chat --model [qwen2.5] "[what's the current AAPL quote?]"```

# SYNOPSIS

**pyscrappy** **extract** _url_ _output_ [**--css-selector** _selector_] [**--render-js**]

**pyscrappy** **chat** _prompt_ [**--model** _name_] [**--host** _url_] [**--max-steps** _n_] [**-v**] [**--json**]

# DESCRIPTION

**pyscrappy** is the command-line interface for PyScrappy, a Python web-scraping toolkit. It fetches a page and writes the result to a file, or (with the optional MCP extra) lets a local tool-calling model invoke the same scrapers.

**extract** infers the output format from the destination file extension:

- **.md** — Markdown from **ScrapeResult.to_markdown**
- **.json** — structured JSON from **ScrapeResult.to_json**
- **.txt** — extracted page text (or only matching CSS text when **--css-selector** is set)
- **.html** — raw fetched HTML (not the structured scrape result)

The default fetch is a static HTTP request. **--render-js** uses a headless browser instead and requires **pip install 'pyscrappy[browser]'** plus **playwright install chromium**.

**chat** talks to an Ollama-compatible **/api/chat** endpoint (default **http://localhost:11434**) and exposes the same scraper tools as **pyscrappy-mcp**. It needs Python 3.10+, **pip install 'pyscrappy[mcp]'**, and a model that supports tool calling. The loop is capped at **8** rounds unless **--max-steps** is set.

The package also ships as a Python library with site-specific scrapers (Wikipedia, stocks, news, GitHub, and others) and optional adaptive selectors. Those APIs are not part of this CLI.

# COMMANDS

**extract** _url_ _output_

> Scrape _url_ and write it to _output_. Format comes from the file extension (**.md**, **.json**, **.txt**, **.html**).

**chat** _prompt_

> Ask a local model a question it can answer by calling PyScrappy scrapers.

# OPTIONS

**--css-selector** _selector_

> With **extract**, keep only elements matching this CSS selector. For **.txt** output, writes the matched text, one hit per line.

**--render-js**

> With **extract**, render the page in a headless browser before extracting.

**--model** _name_

> With **chat**, Ollama model to use (default **qwen2.5**).

**--host** _url_

> With **chat**, Ollama base URL (default **http://localhost:11434**).

**--max-steps** _n_

> With **chat**, maximum tool-calling rounds (default **8**).

**-v**, **--verbose**

> With **chat**, print each tool call to stderr.

**--json**

> With **chat**, print the latest raw scraper result as JSON instead of the model's text answer.

# CAVEATS

**extract** is a single-URL fetch. Site-specific scrapers, concurrency helpers, proxies, and TLS impersonation live in the Python API, not this CLI.

JavaScript-heavy pages often return an almost empty shell unless **--render-js** is used. Some sites block automated clients; the library can route through a proxy or scraping API, but those options are not exposed on **extract**.

**chat** fails with a clear error if the MCP extra is missing. It requires a running Ollama (or compatible) server and a tool-calling model; tool *selection* quality is up to the model.

# SEE ALSO

[pyscrappy-mcp](/man/pyscrappy-mcp)(1), [scrapy](/man/scrapy)(1), [rdrview](/man/rdrview)(1), [htmlq](/man/htmlq)(1), [curl](/man/curl)(1), [httpie](/man/httpie)(1)

# RESOURCES

```[Source code](https://github.com/mldsveda/PyScrappy)```

```[Documentation](https://pyscrappy.vercel.app)```

<!-- verified: 2026-08-16 -->
