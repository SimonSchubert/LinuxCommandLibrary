# TAGLINE

private search engine for visited pages and local files

# TLDR

**Start the local search server** (http://127.0.0.1:4433)

```hister listen```

**Open the terminal search UI**

```hister search```

**Search from the command line** and print JSON

```hister search '[query]' --format json --fields title,url --limit [20]```

**Index a URL** on the running server

```hister index [https://example.com]```

**Crawl a site** into a named, resumable job

```hister index --recursive --job-id [docs] --allowed-domain [example.com] [https://example.com]```

**Import files or a previous export**

```hister import file [backup.json] [path/to/pages]```

**Export the index** to JSON

```hister export [backup.json]```

**Check configuration and server health**

```hister doctor```

# SYNOPSIS

**hister** [_global_options_] _command_ [_args_]

# PARAMETERS

**--config** _PATH_
> Config file. Search order without this flag: `./config.yml`, `~/.histerrc`, `~/.config/hister/config.yml`. Also settable via **HISTER_CONFIG**.

**-u**, **--server-url** _URL_
> Hister server URL (overrides **server.base_url**).

**-t**, **--token** _TOKEN_
> Access token (overrides **app.access_token**).

**-l**, **--log-level** _LEVEL_
> **error**, **warning**, **info** (default), **debug**, or **trace**.

**-s**, **--search-url** _URL_
> Default external search engine URL containing a `{query}` placeholder.

**--client-timeout** _N_
> HTTP timeout in seconds for server communication (0 = none; default 10).

**listen**
> Start the search server. Default bind is **127.0.0.1:4433**. Keep the process running while clients index or search.

**search** [_query_]
> With no arguments, open the TUI. With a query, print matching documents. **--format** / **-f** is **text**, **json**, **jsonl**, or **csv**. **--fields** selects columns; **--limit** caps the result count.

**index** [_URL_...]
> Fetch pages and add them to the running server. Direct URLs are fetched once. **--recursive** / **-r** starts a persistent crawl; **--input** _FILE_ queues one URL per line (**-** reads stdin); **--job-id** _NAME_ creates or resumes a named job.

**crawl** _subcommand_
> Inspect persistent crawl jobs without fetching. Subcommands include **list**, **show**, **urls**, **queue**, **errors**, and delete operations.

**import file** [_paths_...]
> Import JSON exports, 7z archives of those exports, saved HTML, and local file snapshots (PDF, DOCX, Markdown, Org, UTF-8 text). Talks to a running server.

**export** _FILE_ [_query_]
> Write indexed documents as JSON. Use **-** for stdout. Optional query and **--start-date** / **--end-date** (`YYYY-MM-DD`) limit the dump.

**update** _query_
> Change **user_id**, **label**, **title**, or **language** on matching documents. Prompts unless **--yes** or **--dry**.

**config** _subcommand_
> **create** [_file_] writes defaults (refuses to overwrite). **path** prints the selected file. **show** prints effective YAML with credentials redacted. **validate** checks keys and types.

**doctor**
> Check local config, extractor executables, and server connectivity. **--format** selects **text**, **json**, **jsonl**, or **csv**. Exit **1** if any check fails.

**check-update**
> Compare the installed version with the latest release. Does not download an update.

**help**
> List commands. Root help labels each operation as local, remote, or hybrid.

# DESCRIPTION

**hister** is a private search engine for pages you visit and files you keep. One binary contains the HTTP server, a command-line client, and a terminal UI. It indexes full text so you can search from the web interface at **http://127.0.0.1:4433**, from the terminal, or through an MCP endpoint for AI assistants.

A typical local setup is **hister listen**, then the Firefox or Chrome extension to capture newly visited pages. The server must stay running for indexing and search. No configuration is required for a single-user bind on localhost.

Queries support field filters (`title:`, `text:`, `url:`, `domain:`, `label:`, `language:`, `type:`, `visits:`, `added:`, `updated:`, `user_id:`), quoted phrases, wildcards, negation, `sort:`, and `(a|b)` alternation. **hister index** can fetch individual URLs or run persistent, resumable crawls whose queues live in the database; **hister crawl** only inspects those jobs.

Local commands such as **crawl list** and most user-admin operations do not contact the HTTP server. Remote commands such as **search**, **export**, and **cleanup** talk only to the configured server. Hybrid commands such as persistent **index** can use both.

# CONFIGURATION

Without **--config** or **HISTER_CONFIG**, Hister looks for `./config.yml`, then `~/.histerrc`, then `~/.config/hister/config.yml`. TUI settings live in a sibling **tui.yaml** (created on first **hister search**). After editing **tui.yaml**, restart the TUI.

`hister config create ~/.config/hister/config.yml` writes a starter file. `hister config show` prints the effective YAML. Server listen address, database path, authentication, directory watchers, crawler backends, and optional embeddings are documented in the configuration reference.

# CAVEATS

Indexing and most search operations require a running **hister listen** (or equivalent service). Closing that terminal stops the server. Browser capture needs the official extension; the CLI can still **index** URLs and **import** files without it.

**index** exit status is **0** on success (skipped URLs allowed), **1** on setup/execution failure, and **2** when item errors occurred. Search JSON/JSONL can be partial if a later page fails; check the exit status. Optional semantic search sends document text to whatever embeddings endpoint you configure.

# HISTORY

**Hister** is developed by **Adam Tauber** (**asciimoo**), author of Searx. It is written in Go and released under **AGPLv3**. Source is published on GitHub and mirrored on Codeberg.

# INSTALL

```aur: yay -S hister```

```brew: brew install hister```

```nix: nix profile install nixpkgs#hister```

<!-- packages: 2026-09-17 -->

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [lynx](/man/lynx)(1), [rg](/man/rg)(1), [grep](/man/grep)(1)

# RESOURCES

```[Source code](https://github.com/asciimoo/hister)```

```[Homepage](https://hister.org/)```

```[Documentation](https://hister.org/docs)```

<!-- verified: 2026-09-17 -->
