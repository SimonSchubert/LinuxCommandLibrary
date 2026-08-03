# TAGLINE

Native Rust web scraper and Firecrawl-compatible self-hosted API

# TLDR

**Scrape a page** to clean Markdown on stdout

```draco scrape [https://example.com]```

**Scrape with full JSON envelope** (markdown, metadata, trace)

```draco scrape [https://example.com] --json --pretty```

**Extract SPA JSON data** via tiered escalation

```draco scrape [https://app.example.com] --format json --pretty```

**Search the web** through multi-engine consensus

```draco search "[rust web scraper]" --limit [10]```

**Run a Firecrawl-compatible HTTP daemon**

```draco serve```

**Expose scrape tools over MCP** (stdio)

```draco mcp```

# SYNOPSIS

**draco** **scrape** _url_ [_options_]

**draco** **search** _query_ [_options_]

**draco** **serve** [_options_]

**draco** **interact** _url_ [_options_]

**draco** **mcp**

# DESCRIPTION

**draco** is a fast, native-Rust web scraper designed as a lighter, self-hostable alternative to Firecrawl and Browserbase. It fetches pages with a browser-faithful TLS/JA4 fingerprint, extracts main content as clean Markdown (and metadata), and can escalate client-rendered SPAs through an in-process V8 isolate — without shipping a headless Chrome fleet or Node runtime.

For ordinary HTML, a scrape is typically a single fingerprinted fetch plus parse. Output includes Markdown (headings, absolutized links, lists, code fences, GFM tables; nav/footer/ads stripped), metadata (title, description, language, canonical, favicon, Open Graph / Twitter / article tags, status), and optional **trace** / **timing** steps. Default scrape exit codes: **0** success, **1** error, **2** unsupported, **3** needs_browser (e.g. a real JS challenge wall such as Cloudflare).

Beyond one-shot scraping, Draco provides **search** (parallel multi-engine SERP fetch merged by reciprocal-rank consensus), **serve** (persistent HTTP daemon with a Firecrawl-compatible REST API on port **3002** by default, including scrape, map, crawl, batch scrape, discover, search, and interact), **interact** (stateful page sessions with cookie persistence and JS **exec**), and **mcp** (Model Context Protocol tools over stdio or the daemon's **POST /mcp**).

JSON extraction escalates through static embedded state (**__NEXT_DATA__**, JSON-LD, Nuxt), Next.js build-id replay, then runtime fetch/XHR interception in a sandboxed V8 isolate with no host-capability bindings. Defaults respect **robots.txt** and rate limits; use is intended for public data and properties you are permitted to scrape.

# SUBCOMMANDS

**scrape** _url_
> Fetch a URL and emit Markdown (default) or other formats. Primary CLI entrypoint.

**search** _query_
> Multi-engine web search over Draco's stealth HTTP stack; optional scrape of each hit.

**serve**
> Run the persistent Firecrawl-compatible HTTP API (default **http://127.0.0.1:3002**).

**interact** _url_
> Open a one-shot or REPL session against a page: run JS, navigate, scrape live DOM.

**mcp**
> Speak MCP over stdio for agent clients (Claude Desktop, editors, orchestrators).

# PARAMETERS

**--format** _fmt_
> Output format for scrape: **markdown** (default), **html**, **raw-html**, **links**, **json**, **endpoints**, or **both** (markdown+json). May be repeated where supported.

**--json**
> Emit the full result envelope as JSON (markdown + metadata + trace).

**--pretty**
> Pretty-print JSON output.

**--extract** _JSONPATH_
> Select a path from extracted JSON (with **--format json**).

**--proxy** _url_
> Route traffic through a proxy (e.g. **socks5://127.0.0.1:9050**).

**--delay** _ms_
> Delay between requests for politeness.

**--timeout** _ms_
> Per-request timeout.

**--tier-max** _n_
> Cap escalation tier (**0**/**1**/**2**). **2** enables V8 runtime interception and SPA render-then-Markdown (default when built with tier2).

**--no-main-content**
> Disable main-content extraction heuristics.

**--wait-for** _ms_
> Wait window related to runtime capture / hydration.

**--capture-window-ms** _ms_
> Cap the Tier-2 capture window duration.

**--ignore-robots**
> Do not honor robots.txt (use only when you have permission).

**--allow-unsafe-replay**
> Allow replaying state-changing requests during runtime modes that would otherwise stub them.

**--runtime-log**
> Print isolate diagnostics (exceptions, console errors, brokered fetches, capture close reasons).

**--limit** _n_
> For **search**: maximum number of results (default typically 5, range-capped).

**--host**, **--port**, **--max-concurrency**
> For **serve**: bind address, port, and concurrent scrape budget.

**--exec** _js_
> For **interact**: run a one-shot JavaScript expression/body against the page.

# CAVEATS

Draco does **not** defeat JavaScript challenge walls (Cloudflare, DataDome, and similar). A genuine interstitial short-circuits to exit code **3** / **needs_browser**. A normal HTTP 200 behind a CDN is not treated as a challenge.

Tier-2 isolation relies on an in-process V8 context with **no host bindings** (no filesystem or arbitrary network from page JS except engine-brokered fetches). It is not a full OS jail; older **--no-jail** / **--strict-sandbox** flags are accepted but inert. You remain responsible for target sites' terms of service and applicable law.

Platforms with full support include Linux **x86_64-gnu** and macOS **aarch64-darwin**. Lean builds without default features omit V8 and the serve daemon.

# HISTORY

**draco** is written in Rust as a single-binary, self-hostable Firecrawl alternative with native Markdown extraction and optional in-process V8 for SPA hydration and API discovery. It is dual-licensed **MIT OR Apache-2.0**. The OS process jail used in earlier releases was retired in **v0.14** in favor of isolate-only containment for throughput.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [crawlie](/man/crawlie)(1), [trafilatura](/man/trafilatura)(1), [shot-scraper](/man/shot-scraper)(1)

# RESOURCES

```[Source code](https://github.com/0xchasercat/draco)```

<!-- verified: 2026-08-03 -->
