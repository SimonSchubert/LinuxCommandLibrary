# TAGLINE

Dark-web OSINT CLI from query to intelligence report

# TLDR

Run a **shallow investigation** without Tor or an LLM

```voidaccess investigate "[LockBit ransomware]" --no-llm --no-tor --depth shallow```

**List** saved investigations

```voidaccess list```

Show **config, Tor, and enrichment-key** status

```voidaccess status```

Run the **first-time setup wizard**

```voidaccess configure```

Open the **entity browser** for a saved run

```voidaccess show [investigation-id]```

**Export** an investigation as STIX

```voidaccess export [investigation-id] --format stix```

Build an **IOC package ZIP**

```voidaccess package [investigation-id]```

List **actor profiles** collected across investigations

```voidaccess actors```

Print the **version**

```voidaccess version```

# SYNOPSIS

**voidaccess** [**--version**] [**--no-banner**] _command_ [_options_]

# DESCRIPTION

**voidaccess** is the Python CLI for VoidAccess, a self-hostable OSINT tool that turns a research query into collection, entity extraction, enrichment, a relationship graph, and an exportable report. The console script is `voidaccess` (`voidaccess_cli.main:run`, Typer). Python **3.10** or newer is required. The published package version is **2.1.0**.

A run walks a 13-stage pipeline: optional LLM query refinement, parallel collection from Tor search engines, paste sites, code forges, RSS feeds, and curated `.onion` seeds, filtering, enrichment, recursive link discovery, page fetch through Tor, persistence, entity extraction (regex, spaCy NER, optional LLM), cross-reference against stored data, graph construction, and a summary. Results are written under **~/.voidaccess/results** as JSON and Markdown unless **--output** or **--format** changes that. Investigations are also stored in **~/.voidaccess/investigations.db**.

The same repository ships a Docker Compose stack (PostgreSQL, Tor, FastAPI, Next.js) for a browser UI. This page documents the installed CLI, not that stack.

# COMMANDS

**investigate** _QUERY_

> Run a new investigation. _QUERY_ must be 3 to 500 characters after stripping whitespace. **--depth** is `shallow`, `normal` (default), or `deep`. **--format** is `json`, `md`, or `both` (default). **--output** overrides the results directory. **--model** overrides the configured LLM. **--no-tor** skips Tor (clearnet only). **--no-llm** skips query refinement, LLM filtering, and the LLM summary. **--pace** is `quiet`, `normal`, or `aggressive` for this run only. **--use-scraping-api** and **--use-proxies** turn on ScrapingAnt clearnet transports for this run; they never affect Tor or `.onion` traffic. **--quiet** prints only fatal errors. **--events-jsonl** _PATH_ appends one JSON progress event per line. **--trace** adds per-engine and per-URL trace events to that file (same as `VOIDACCESS_TRACE_EVENTS=1`). SIGTERM finishes the current item, emits a cancelled event, and exits **143**. Ctrl-C exits **130**.

**show** [_TARGET_]

> Open the Textual entity browser. _TARGET_ is an investigation id or a `.json` export. With no target, pick from recent runs. **--no-tui** prints a summary table. **--path** _FROM_ _TO_ prints the shortest graph path (at most 6 hops) and does not start the TUI.

**list**

> List saved investigations. **-n** / **--limit** defaults to 20. **--json** prints JSON.

**export** _TARGET_

> Export an investigation id or `.json` file. **--format** is `stix`, `misp`, `sigma`, `yara`, `snort`, `suricata`, `package`, `csv`, `md`, or `json` (default `json`). **--output** is the destination file. **--tlp** is `white`, `green`, `amber`, or `red` (default `white`). **--redact-credentials** / **--no-redact-credentials** and **--include-raw** / **--no-include-raw** apply to IOC packages. STIX, MISP, and Sigma need a database investigation id, not a bare JSON file. An existing output path is not overwritten; a suffix is added.

**package** _TARGET_

> Shortcut for **export** _TARGET_ **--format package**. Builds an IOC package ZIP.

**enrich** _TARGET_

> Re-enrich a stored investigation against current feeds (IP, domain, hash, email, breach, infostealer). **--skip-ips**, **--skip-domains**, **--skip-hashes**, **--skip-emails**, **--skip-breach**, and **--skip-infostealer** turn individual layers off.

**status**

> Show version, config path, database path, output directory, LLM settings, Tor reachability, spaCy NER, enrichment-key counts, and clearnet routing. **--engines** prints search-engine scores. **--cache** adds enrichment-cache stats. **--seeds** adds the seed-pool breakdown.

**actors**

> List persistent actor profiles. **-n** / **--limit** defaults to 20. **-s** / **--search** is a case-insensitive partial match. **--json** prints JSON.

**actor** _HANDLE_

> Show one actor profile (handle or UUID): aliases, infrastructure, investigation history, notes. **--note** _TEXT_ appends a timestamped analyst note. **--timeline** prints the activity timeline. **--event-types** filters that timeline (`FIRST_SEEN`, `INVESTIGATION`, `NEW_ALIAS`, `NEW_INFRASTRUCTURE`, `NOTE_ADDED`). **--json** prints JSON. **--limit** applies to list and timeline views.

**timeline** _HANDLE_

> Shortcut for **actor** _HANDLE_ **--timeline**.

**configure**

> Interactive first-run wizard (LLM, optional enrichment keys, output directory). Needs a TTY. Subcommands: **llm**, **keys**, **tor** (**--host**, **--port**; defaults `127.0.0.1:9050`), **pace** (**--profile** `quiet`|`normal`|`aggressive`, **--show**), **proxy** (**--enable** / **--disable**, **--enable-proxy** / **--disable-proxy**, **--show**).

**benchmark metrics** / **benchmark probe**

> Pipeline metrics on the shipped query set, or a read-only Tor engine-health probe. **metrics --llm** turns LLM stages on (they are off by default). Both accept **--no-tor**, **--pace**, **--out**, and **--queries**. **probe --sample** _N_ uses only the first _N_ queries.

**admin promote --email** _ADDRESS_

> Grant the administrator role to a user in a self-hosted API database.

**version**

> Print `voidaccess` and the package version. Same as **--version**.

# PARAMETERS

**--version**
> Print the version and exit. Eager; skips the rest of the CLI.

**--no-banner**
> Skip the startup banner for this invocation. `VOIDACCESS_NO_BANNER=1` does the same for the whole session.

# CONFIGURATION

**~/.voidaccess/config.json**
> Persistent CLI config: LLM provider, model, and API key; enrichment keys; Tor host and port; pacing profile; feature toggles for ScrapingAnt clearnet transports; output directory. Mode **0600** on POSIX. Created by **voidaccess configure**.

**~/.voidaccess/investigations.db**
> SQLite store for investigations, entities, and actor profiles.

**~/.voidaccess/results/**
> Default report directory (`<slug>-<YYYYMMDD-HHMMSS>.json` and `.md`). Override with **investigate --output** or `output_dir` in the config.

**.env** in the current directory
> Optional project-level secrets for a self-hosted checkout. **voidaccess configure** locks it to the owner when the file exists.

**VOIDACCESS_PACE**
> Pacing profile for this process: `quiet`, `normal`, or `aggressive`. **investigate --pace** sets it for one run and wins over the saved default.

**VOIDACCESS_USE_PROXIES** / **VOIDACCESS_USE_PROXY**
> Clearnet ScrapingAnt REST API transport and HTTP CONNECT proxy transport. Mutually exclusive; if both are on, the proxy wins. Never applied to Tor or `.onion` fetches.

**VOIDACCESS_NO_BANNER**
> Set to `1` to hide the banner on every command.

**VOIDACCESS_TRACE_EVENTS**
> Set to `1` for the same trace events as **investigate --trace**.

**VOIDACCESS_ENRICHMENT_SOURCES** / **VOIDACCESS_DISABLED_SOURCES**
> Allow-list and disable-list for enrichment sources. A bad value aborts **investigate** before any network work (exit **2**).

LLM keys may also come from **OPENROUTER_API_KEY**, **GROQ_API_KEY**, **GOOGLE_API_KEY**, **OPENAI_API_KEY**, or **ANTHROPIC_API_KEY**. Ollama needs no key. Optional extras: `pip install "voidaccess[nlp]"` for sentence-transformer embeddings, `voidaccess[js]` for Playwright, `voidaccess[telegram]` for Telethon.

# CAVEATS

Use only for authorized security research and threat-intelligence work. Queries, URLs, content, and extracted entities pass mandatory content-safety gates; a blocked query exits **1**.

Without an LLM configured, **investigate** exits **2** unless **--no-llm** is set. Ollama is the local, key-less provider. Missing enrichment keys skip those sources instead of failing the run.

Tor is required for dark-web collection. **--no-tor** is clearnet only. Default SOCKS5 is `127.0.0.1:9050`.

The first **investigate** may download the spaCy `en_core_web_sm` model. Optional NLP embeddings fall back to a deterministic SHA-256 encoder when PyTorch is absent.

A stale SQLite schema raises a database error on every command; the project tells you to run `alembic upgrade head`. **configure** without a TTY exits **1** and names the non-interactive subcommands.

# HISTORY

VoidAccess is a Python 3 project under the MIT License. The CLI is published on PyPI as **voidaccess** **2.1.0**. It is built with Typer, Rich, and Textual, and is independent of Recorded Future, DarkOwl, and Flare.

# SEE ALSO

[theHarvester](/man/theHarvester)(1), [recon-ng](/man/recon-ng)(1), [maltego](/man/maltego)(1), [amass](/man/amass)(1), [osintui](/man/osintui)(1), [sherlock](/man/sherlock)(1), [tor](/man/tor)(1), [yara](/man/yara)(1), [snort](/man/snort)(8), [suricata](/man/suricata)(1), [ollama](/man/ollama)(1), [pip](/man/pip)(1), [python](/man/python)(1), [docker-compose](/man/docker-compose)(1)

# RESOURCES

```[Source code](https://github.com/KatrielMoses/voidaccess)```

```[Documentation](https://github.com/KatrielMoses/voidaccess/blob/main/docs/architecture.md)```

<!-- verified: 2026-10-20 -->
