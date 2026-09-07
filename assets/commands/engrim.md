# TAGLINE

local SQLite memory store for AI coding agents

# TLDR

**Install hooks** for detected agent environments (Antigravity, Claude Code, Cursor)

```engrim setup```

**Record a decision** for the current project

```engrim add -t decision -s "[Switched the primary database to PostgreSQL]"```

**Search project memory**

```engrim recall -q "[database]"```

**Print the session-boot memory pack**

```engrim context```

**List recent memories**

```engrim list -k [20]```

**Start the MCP server** on stdio

```engrim serve --mcp```

**Mark a record superseded**

```engrim supersede --id [12] --status superseded```

# SYNOPSIS

**engrim** [**--db** _path_] _command_ [_options_]

# PARAMETERS

**--db** _path_
> SQLite store path. Default: `$ENGRIM_DB` or `~/.engrim/memory.db`.

**add** **-t** _type_ **-s** _summary_
> Insert a memory. Types: `decision`, `fact`, `feedback`, `state`, `user`, `reference`.

**recall** **-q** _query_
> Ranked hybrid search (FTS5 bm25 plus optional embeddings). **-k** sets the hit count.

**context** [**-b** _budget_]
> Print a budget-capped session-boot pack (default 4000 characters).

**list** [**-k** _n_]
> List recent memories for the current project.

**setup** [**--agy**|**--claude**|**--cursor**|**--all**]
> Wire hooks and MCP config. With no flags, auto-detects installed environments.

**serve** **--mcp**
> Run the JSON-RPC MCP server on stdio (`engrim mcp` is the same).

**review**
> Scan the transcript log for decisions not yet stored as memories.

**supersede** **--id** _n_ [**--status** _status_]
> Change a record's status (`active`, `superseded`, `done`).

**hook** [**--agent** _{claude,agy,antigravity}_] [**--event** _{boot,stop}_]
> Lifecycle hook used by agent integrations; prints JSON for the host.

**-p**, **--project** _tag_
> Project scope. Default `auto` (git/hg/svn/`.claude` root, else cwd). **--global** on **add** writes the shared user layer.

# DESCRIPTION

**engrim** is a local-first, project-scoped memory engine for AI coding agents. It stores curated records (decisions, facts, feedback, state) in a SQLite database and reloads a small working set at session start so you can switch models or clear a chat without losing project context.

Recall combines SQLite FTS5 (bm25) with optional static embeddings (`model2vec`) via reciprocal-rank fusion. Set `ENGRIM_EMBED=off` for lexical-only search with no extra model load. The default database is `~/.engrim/memory.db` with owner-only file permissions.

**setup** can install Google Antigravity hooks, Claude Code SessionStart/Stop hooks, and a Cursor MCP entry. The MCP tools include `engrim_recall`, `engrim_add`, `engrim_context`, and `engrim_review`.

Project tags default to the nearest VCS or `.claude` directory. `$ENGRIM_PROJECT` overrides that when host and container paths differ.

# CAVEATS

Python 3.10+ and a `pip install engrim` (or equivalent) install. Memory is local only; there is no cloud sync. Agent hook installation writes files under `~/.gemini`, `~/.claude`, or `~/.cursor`. Embedding download happens on first semantic recall unless `ENGRIM_EMBED=off`. Not affiliated with Anthropic, Google, or Cursor.

# CONFIGURATION

**ENGRIM_DB**
> Path to the SQLite store.

**ENGRIM_PROJECT**
> Stable project tag (overrides path detection).

**ENGRIM_EMBED**
> Set to `off` to disable embeddings.

**ENGRIM_EMBED_MODEL**
> Hugging Face id for the static embedder (default `minishlab/potion-base-8M`).

**ENGRIM_NO_GLOBAL**
> Disable the shared user-layer that otherwise loads in every project.

**ENGRIM_ORIGIN_AGENT**
> Default `origin_agent` on **add** (`antigravity`, `claude-code`, `cursor`, `cli`, `user`).

# HISTORY

Written by Tim Gordon and released under the MIT license. Distributed on PyPI as **engrim**.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [claude](/man/claude)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/timgordontg/engrim)```

```[Documentation](https://github.com/timgordontg/engrim#readme)```

<!-- verified: 2026-09-07 -->
