# TAGLINE

MCP server that exposes PyScrappy scrapers as agent tools

# TLDR

**Install** the MCP extra (Python 3.10+)

```pip install 'pyscrappy[mcp]'```

**Register** the server with Claude Code

```claude mcp add pyscrappy pyscrappy-mcp```

**Run** over stdio (default, for local MCP clients)

```pyscrappy-mcp```

**Serve** over Streamable HTTP on a given host and port

```pyscrappy-mcp --http --host [127.0.0.1] --port [8000]```

**Serve** over the legacy SSE transport

```pyscrappy-mcp --sse --port [8000]```

# SYNOPSIS

**pyscrappy-mcp** [**--http** | **--sse**] [**--host** _address_] [**--port** _n_]

# DESCRIPTION

**pyscrappy-mcp** is the Model Context Protocol server shipped with PyScrappy. It registers the toolkit's scrapers as typed MCP tools so an agent (Claude, Cursor, a local LLM host, and similar) can fetch structured page data and get Markdown- or JSON-shaped results back.

Transport defaults to **stdio** for local clients. **--http** uses Streamable HTTP; **--sse** uses the older SSE transport. Host and port apply only to the network transports (defaults **127.0.0.1** and **8000**). Use **--host 0.0.0.0** only when you intend to accept remote connections.

The same tool set is available without an MCP host via **pyscrappy chat**, which talks to Ollama directly.

Built-in tools include generic **scrape_url** plus site-specific helpers (Wikipedia, stocks, news, GitHub, Hacker News, YouTube, Amazon, and others). **list_available_scrapers** lists registered names; **scrape_with** dispatches to any registered scraper, including third-party **pyscrappy-*** plugins. **lookup_movie** needs a free OMDb key in **OMDB_API_KEY**.

Successful tool responses are cached in process for a few minutes to cut repeat latency. The TTL is **PYSCRAPPY_MCP_CACHE_TTL** seconds (default **300**).

The server requires the **pyscrappy[mcp]** extra (FastMCP) and Python 3.10 or newer. The core **pyscrappy** extract CLI still works on Python 3.9 without this extra.

# OPTIONS

**--http**

> Serve over Streamable HTTP instead of stdio. Mutually exclusive with **--sse**.

**--sse**

> Serve over the legacy SSE transport instead of stdio. Mutually exclusive with **--http**.

**--host** _address_

> Bind address for **--http** / **--sse** (default **127.0.0.1**).

**--port** _n_

> Bind port for **--http** / **--sse** (default **8000**).

# CONFIGURATION

**OMDB_API_KEY**

> API key for the **lookup_movie** tool (OMDb). Without it that tool returns an error payload instead of movie data.

**PYSCRAPPY_MCP_CACHE_TTL**

> In-process cache lifetime for successful scrapes, in seconds. Default **300**. Non-numeric values fall back to the default.

Claude Desktop does not inherit the login-shell **PATH**. If the app cannot find **pyscrappy-mcp**, put the absolute path from **which pyscrappy-mcp** in **claude_desktop_config.json**.

# CAVEATS

This process is meant to be launched by an MCP host. On stdio it speaks the protocol on stdin/stdout; do not pipe other commands through it.

JavaScript-heavy pages often come back empty on a static fetch. The **scrape_url** tool then hints to retry with **render_js=true**, which needs **pyscrappy[browser]**. Some retailers and social sites block automated clients unless a proxy or scraping API is configured in the library.

The cache is per process and disappears when the server exits.

# SEE ALSO

[pyscrappy](/man/pyscrappy)(1), [claude](/man/claude)(1), [scrapy](/man/scrapy)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/mldsveda/PyScrappy)```

```[Documentation](https://pyscrappy.vercel.app)```

<!-- verified: 2026-08-16 -->
