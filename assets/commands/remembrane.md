# TAGLINE

Local-first SQLite memory store CLI for AI agents

# TLDR

**Install** via pip

```pip install remembrane```

**Store** a memory in a SQLite database

```remembrane --db [agent.db] store "[the user prefers dark mode]" --importance 0.8```

**Recall** memories matching a query

```remembrane --db [agent.db] recall "[what theme?]"```

**List** all stored memories

```remembrane --db [agent.db] list```

Show **stats** for the memory database

```remembrane --db [agent.db] stats```

**Export** memories as JSON

```remembrane --db [agent.db] export > [backup.json]```

**Snapshot** the current state, then **diff** later changes

```remembrane --db [agent.db] snapshot [v1]```

```remembrane --db [agent.db] diff [v1]```

# SYNOPSIS

**remembrane** [**--db** _path_] _subcommand_ [_options_] [_args_]

# DESCRIPTION

**remembrane** is a command-line interface for inspecting and managing a local-first agent memory store backed by a single SQLite file. The same package also exposes a Python API, framework adapters (LangChain, CrewAI), and an optional MCP server entry point (**remembrane-mcp**).

Memories are stored with optional namespaces and importance scores. **recall** ranks candidates with a hybrid of vector similarity and BM25 keyword score, plus recency decay, importance, and usefulness learned from task-outcome feedback. Ranking is exact (brute-force over the store) rather than approximate nearest-neighbor; the default embedder is a pure-stdlib hash embedder so **pip install remembrane** needs no extra dependencies.

Every store, forget, and reinforce operation is journaled, so **snapshot**, **diff**, and **log** support time-travel over what the agent knew. **conflicts** surfaces contradictory memories for adjudication instead of silently picking one. **pack** selects an optimal (or near-optimal without numpy) memory set under a token budget. **merge** absorbs another memory database with near-duplicate deduplication.

# PARAMETERS

**--db** _path_
> Path to the SQLite memory database (default: **remembrane.db**).

**store** [_content_] [**--file** _path_|**-**] [**--namespace** _ns_] [**--importance** _f_]
> Store a memory. Provide _content_ as an argument, or use **--file** (or **--file -** for stdin) for large payloads that hit OS argv limits.

**recall** _query_ [**--namespace** _ns_] [**-k** _n_] [**--mode** hybrid|vector|keyword] [**--explain**]
> Recall top memories for _query_. **--explain** prints the ranking breakdown per result.

**list** [**--namespace** _ns_]
> List stored memories (optionally filtered by namespace).

**forget** _memory_id_
> Delete one memory by id.

**export** [**--namespace** _ns_]
> Export memories as JSON to stdout.

**stats**
> Print memory counts overall and per namespace.

**snapshot** _label_
> Record a named point in the journal for later **diff** / reconstruction.

**log** [**--namespace** _ns_] [**--limit** _n_]
> Show newest-first history of operations (default limit 30).

**diff** _a_ [_b_]
> Show what changed between snapshot _a_ and snapshot _b_ (or now if _b_ is omitted).

**conflicts** [_query_] [**--namespace** _ns_] [**--min-confidence** possible|likely]
> Surface memories in tension (heuristic conflict detection).

**feedback** _memory_id_ **--useful**|**--useless**
> Record task-outcome feedback that adjusts usefulness ranking.

**pack** _query_ [**--budget** _tokens_] [**--namespace** _ns_]
> Select memories that fit a hard token budget for context packing.

**merge** _source.db_ [**--dedupe-threshold** _f_]
> Merge another memory database into the current one.

# CAVEATS

The CLI writes wherever **--db** points with the invoking user's permissions; it is a local tool, not a sandbox. The default embedder is lexical (n-gram hashes), not semantic—plug in optional embedders for true semantic recall, and do not mix embedders in one database. Conflict detection is heuristic: treat **likely** / **possible** hits as candidates for the agent or user to adjudicate. WAL mode keeps transient **-wal** / **-shm** sidecars next to the db file; avoid placing memory files on NFS/SMB. For MCP use, install **remembrane[mcp]** and run **remembrane-mcp** separately.

# HISTORY

**remembrane** is an open-source Python project for local agent memory without a vector-database dependency. Public releases on PyPI (0.4–0.5.x series) refined hybrid recall, conflict signals, usefulness feedback, and packing; the console scripts **remembrane** and **remembrane-mcp** ship with the package.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/satyasairay/remembrane)```

```[Homepage](https://pypi.org/project/remembrane/)```

<!-- verified: 2026-08-07 -->
