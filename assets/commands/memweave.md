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

```memweave search "[Redis]" --strategy [keyword]```

**Show** machine-readable JSON output

```memweave search "[topic]" --json```

**Display** index statistics

```memweave stats --workspace [.]```

**List** all tracked files

```memweave files --workspace [.]```

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
> Workspace directory to operate on (default **$PWD**).

**--embedding-model** _NAME_
> Override the embedding model (e.g. **text-embedding-3-small**).

**--force**
> Skip change detection and reprocess every file.

**--max-results** _N_
> Maximum number of search hits to return.

**--min-score** _F_
> Drop hits below a relevance score.

**--source-filter** _NAME_
> Restrict results to a labeled source (e.g. **sessions**).

**--strategy** _NAME_
> Search strategy: **hybrid** (default), **keyword**, or **semantic**.

**--mmr-lambda** _F_
> Maximal Marginal Relevance trade-off between relevance and diversity.

**--decay-half-life-days** _N_
> Apply temporal decay so older notes rank lower over time.

**--json**
> Emit JSON output suitable for piping into other tools.

# DESCRIPTION

**memweave** is a Python library and CLI that gives AI agents a persistent, searchable memory whose primary storage format is plain Markdown. Every memory file is hashed, chunked, and embedded into a single local **SQLite** database that combines **FTS5** keyword ranking with **sqlite-vec** vector search, so retrieval works offline and merges keyword and semantic signals in one ranked list.

Each subcommand maps directly onto a method of the underlying **MemWeave** Python class, which makes it natural to compose memweave with shell pipelines, editor hooks, and CI jobs without writing Python. Embeddings are cached by content hash, so re-running **memweave index** is cheap when most files are unchanged, and **memweave search** never invokes an LLM — only the embedding endpoint.

# CONFIGURATION

memweave stores its database alongside the workspace by default. The active embedding model is selected with **--embedding-model** or read from environment variables exposed by the chosen provider (e.g. **OPENAI_API_KEY** for OpenAI embeddings). For the optional file-watcher integration install with the **watch** extra:

```
pip install memweave[watch]
```

# CAVEATS

memweave is intentionally zero-infrastructure — there is no server component, sharing model, or access-control layer. The hybrid index assumes Markdown input; binary files are ignored. Because embeddings are cached by content hash, switching embedding models requires **--force** to invalidate prior vectors. There are unrelated projects with similar names; this page documents **sachinsharma9780/memweave**.

# HISTORY

**memweave** was created by **Sachin Sharma** (**sachinsharma9780**) and published on **PyPI** as **memweave** and on GitHub at **github.com/sachinsharma9780/memweave**. It is positioned as a lightweight alternative to vector-database stacks for agentic workflows that already use Markdown as a writing format.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [pip](/man/pip)(1), [grep](/man/grep)(1), [ripgrep](/man/ripgrep)(1)
