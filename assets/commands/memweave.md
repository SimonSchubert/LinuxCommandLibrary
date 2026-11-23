# TAGLINE

Persistent agent memory stored as Markdown files indexed in SQLite

# TLDR

**Index** the current workspace, embedding any Markdown files that changed

```memweave index --workspace [.]```

**Force** a full re-embed of every file

```memweave index --workspace [.] --force```

**Index** a single new memory file

```memweave add [memory/2026-04-26.md] --workspace [.]```

**Search** the index with a hybrid keyword + vector query

```memweave search "[PostgreSQL JSONB]" --workspace [.]```

**Limit** the number of results and require a minimum score

```memweave search "[caching layer]" --max-results [3] --min-score [0.3]```

**Run a keyword-only** search (no embedding cost)

```memweave search "[Redis]" --strategy keyword```

**Show** machine-readable JSON output

```memweave search "[topic]" --json```

**Index** using a local Ollama embedding model (no API key)

```memweave index --embedding-model [ollama/nomic-embed-text]```

**Display** index statistics

```memweave stats --workspace [.]```

**List** all tracked files

```memweave files --workspace [.]```

**List** only files from one source label as JSON

```memweave files --source [sessions] --json```

# SYNOPSIS

**memweave** _command_ [_options_] [_args_]

# PARAMETERS

**index**
> Walk the workspace and embed any Markdown files whose SHA-256 has changed since the last run.

**add** _file_
> Index a single Markdown file immediately.

**search** _query_
> Run a hybrid (BM25 keyword + vector) search across the index.

**files**
> List every tracked file with source labels and chunk counts.

**stats**
> Print a summary of index state, search mode, cache usage, and staleness warnings.

**-w**, **--workspace** _PATH_
> Root workspace directory (default **.**). Accepted by every subcommand.

**--embedding-model** _NAME_
> Embedding model, any LiteLLM-compatible name (e.g. **text-embedding-3-small**, **ollama/nomic-embed-text**). For **index**, **add** and **search**.

**--force**
> Skip hash-based change detection and reprocess every file (**index**, **add**).

**-q**, **--quiet**
> Suppress progress output (**index**, **add**).

**--max-results** _N_
> Maximum number of search hits to return (default **6**).

**--min-score** _F_
> Minimum relevance score from 0 to 1 (default **0.35**).

**--source-filter** _NAME_
> Restrict search results to one source label (e.g. **memory**, **sessions**).

**--source** _NAME_
> Filter the **files** listing by source label.

**--strategy** _NAME_
> Search strategy: **hybrid** (default), **vector**, or **keyword**.

**--mmr-lambda** _F_
> Maximal Marginal Relevance weight from 0 (diverse) to 1 (relevant).

**--decay-half-life-days** _N_
> Temporal decay half-life in days, so older notes rank lower.

**--snippet-chars** _N_
> Maximum characters per result snippet (default **700**).

**--json**
> Emit JSON output (**search**, **files**, **stats**).

**--version**
> Print the version and exit.

# DESCRIPTION

**memweave** is a Python library and CLI that gives AI agents a persistent, searchable memory whose primary storage format is plain Markdown. Every memory file is hashed, chunked, and embedded into a single local **SQLite** database that combines **FTS5** keyword ranking with **sqlite-vec** vector search, so retrieval works offline and merges keyword and semantic signals in one ranked list.

Each subcommand maps directly onto a method of the underlying **MemWeave** Python class, which makes it natural to compose memweave with shell pipelines, editor hooks, and CI jobs without writing Python. Embeddings are cached by content hash, so re-running **memweave index** is cheap when most files are unchanged, and **memweave search** never invokes an LLM, only the embedding endpoint.

# CONFIGURATION

memweave stores its database in **.memweave/index.sqlite** inside the workspace. Embeddings are produced through **LiteLLM**, so the model is selected with **--embedding-model** and credentials come from the provider's usual environment variables (e.g. **OPENAI_API_KEY** for OpenAI; none for local **ollama/** models). For the optional file-watcher integration (Python API only) install the **watch** extra:

```
pip install memweave[watch]
```

# CAVEATS

memweave is intentionally zero-infrastructure: there is no server component, sharing model, or access-control layer. The hybrid index assumes Markdown input; binary files are ignored. Because embeddings are cached by content hash, switching embedding models requires **--force** to invalidate prior vectors. There are unrelated projects with similar names; this page documents **sachinsharma9780/memweave**.

# HISTORY

**memweave** was created by **Sachin Sharma** and published on GitHub and **PyPI** in **March 2026**, positioned as a lightweight alternative to vector-database stacks for agentic workflows that already use Markdown.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [pip](/man/pip)(1), [grep](/man/grep)(1), [ripgrep](/man/ripgrep)(1)

# RESOURCES

```[Source code](https://github.com/sachinsharma9780/memweave)```

<!-- verified: 2026-11-23 -->
