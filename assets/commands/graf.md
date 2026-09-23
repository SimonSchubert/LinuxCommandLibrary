# TAGLINE

Persistent local code graph for indexing, search, and impact analysis

# TLDR

**Index** the current project into a SQLite graph

```graf index .```

Show **coverage and diagnostics** for the stored graph

```graf stats```

**Search** for a symbol and its neighborhood

```graf query [authenticate]```

Search with **JSON output**, a deeper neighborhood, and a result cap

```graf query [authenticate] --depth 2 --limit 50 --json```

Restrict a search to **functions that call** a symbol

```graf query [authenticate] --kind function --relation calls --induced-edges```

Show **incoming callers** of a unique symbol or exact node ID

```graf callers [authenticate]```

Show **what would break** if a symbol changed (use an exact ID when names collide)

```graf impact [python:src/auth.py:authenticate@64]```

**Refresh** only files that changed since the last index

```graf update```

Reclaim unused **database space** without changing graph facts

```graf compact```

Install **agent guidance and a read-only MCP server** for Codex

```graf install --platform [codex] --project . --skill --mcp```

Import an existing **Graphify snapshot** into `.graf/index.db`

```graf switch graphify```

# SYNOPSIS

**graf** [**--db** _PATH_] [**--json**] _command_ [_args_]

# DESCRIPTION

**graf** is a native Rust CLI that builds a persistent local graph of a codebase and its documents. It indexes definitions and relationships into **SQLite** (default **.graf/index.db** in the project, or the nearest ancestor database) so later searches query the store instead of reloading the whole graph into memory.

Queries never refresh sources, fetch remotes, or call a model. **graf update** and **graf watch** are the explicit write paths: they re-extract only what changed, commit as one generation, and keep the previous graph if extraction fails. When two symbols could match, graf reports the ambiguity and source evidence instead of guessing; **show**, **callers**, **callees**, **impact**, and **path** accept exact node IDs.

Static extractors cover many languages (Python, JavaScript/TypeScript, Rust, Go, C/C++, Java, and others) plus local documents such as Markdown, HTML, YAML, and text-bearing PDF. This is syntax-level extraction, not a compiler. Optional semantic providers, OCR, and transcription adapters exist but are off unless configured. Graf can also serve the graph over MCP, export snapshots, and migrate a Graphify `graph.json` with **graf switch graphify**.

# PARAMETERS

**--db** _PATH_
> Database path. Otherwise discover the nearest ancestor **.graf/index.db**.

**--json**
> Print machine-readable JSON instead of human-readable output.

**--query-log** _FILE_
> Append read-command metadata to a JSONL file. **--log-responses** also records returned graph data.

**index** [_PATH_]
> Index supported source and documents (default path: **.**). Alias: **extract**.

**--code-only**
> Exclude local documents from discovery during **index** / **add**.

**--force**
> Re-extract local files for this invocation (also on **update**). Saved remote sources stay offline.

**--timing**
> Include measured detection, extraction, and commit times in the report.

**update**
> Refresh the native source root recorded in the database.

**check-update**
> Compare local fingerprints without invoking models or converters.

**compact**
> Reclaim unused SQLite space. Does not read sources or change graph facts.

**watch** [**--interval-ms** _N_]
> Foreground polling loop that runs **update** when fingerprints change (default 1000 ms). Not a service.

**query** _TEXT_
> Find symbols and explore a bounded neighborhood (BFS by default).

**--depth** _N_
> Traversal depth **0–6** (query default **1**, impact default **3**, path default **6**).

**--limit** _N_
> Maximum results **1–500** (default **100**). Truncation is reported.

**--direction** **in**|**out**|**both**
> Edge direction for **query** (default **both**) and **path** (default **out**).

**--relation** _NAME_
> Filter by relation such as **calls**, **imports**, or **contains**. Repeatable on **impact**.

**--kind** _KIND_
> Restrict node kinds (repeatable). **--file** restricts source files.

**--dfs**
> Depth-first traversal instead of breadth-first.

**--induced-edges**
> Include edges between any returned nodes, within the query bounds.

**show** _SYMBOL_
> Show an exact ID or unique symbol and its immediate neighbors. Alias: **explain**.

**callers** _SYMBOL_
> Immediate incoming calls.

**callees** _SYMBOL_
> Immediate outgoing calls.

**impact** _SYMBOL_
> Follow reverse dependencies from a symbol, class members, or source file. Alias: **affected**.

**path** _SOURCE_ _TARGET_
> Find a bounded path between two nodes.

**stats**
> Graph-wide counts, coverage, and diagnostics.

**add** _SOURCE_
> Import a URL, Google pointer, or local document and keep its extracted facts.

**clone** _URL_ [**--index**]
> Shallow-clone a GitHub repository under **~/.graf/repos/OWNER/REPO** (or **--output** _DIR_). **--refresh** fetches and fast-forwards; local changes are never reset.

**switch graphify**
> Import a Graphify snapshot into **.graf/index.db** and switch a supported project MCP connection. **--undo** reverses the switch.

**install** / **uninstall**
> Add or remove reversible agent guidance, skills, or MCP configuration (**--platform**, **--project**, **--skill**, **--mcp**).

**serve**
> Serve read-only MCP tools over stdin/stdout or explicit HTTP.

**import** **graf**|**graphify** _FILE_
> Import a graph snapshot into an empty database.

**export** _FORMAT_
> Write a complete snapshot (JSON, GraphML, Cypher, Mermaid, HTML, and others).

**hook install**
> Opt into refreshing an existing index after Git commits and merges. Does not add the index to Git.

# CAVEATS

Queries never refresh the graph; run **graf update** (or **watch**) after editing source. Ambiguous names are errors—copy an exact node ID from **query** or **stats**. Extraction is static: dynamic dispatch, macros, and reassigned function pointers can stay unresolved. A drop in model-generated facts is refused unless **--allow-semantic-shrink** is set (a portable snapshot is saved under **.graf/backups** first). Keep **.graf/index.db** out of Git. Compaction can need temporary free space up to twice the database size. Git must be installed separately for **clone**.

# HISTORY

**graf** is an independent Rust implementation inspired by **Graphify**. It stores the graph in SQLite so searches and incremental updates do not reload the whole graph. The crate is **graf-cli**; the installed binary is **graf**. Licensed under Apache-2.0.

# SEE ALSO

[ctags](/man/ctags)(1), [cscope](/man/cscope)(1), [ast-grep](/man/ast-grep)(1), [rg](/man/rg)(1), [graphify-csharp](/man/graphify-csharp)(1)

# RESOURCES

```[Source code](https://github.com/ctxrs/graf)```

```[Homepage](https://ctx.rs/graf)```

```[Documentation](https://github.com/ctxrs/graf/blob/main/docs/usage.md)```

<!-- verified: 2026-09-23 -->
