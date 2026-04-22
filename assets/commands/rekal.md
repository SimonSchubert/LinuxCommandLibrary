# TAGLINE

Git-anchored intent ledger for AI development teams

# TLDR

**Initialize** rekal in the current git repository

```rekal init```

**Capture** current AI session context after a commit

```rekal checkpoint```

**Search** for context related to a query

```rekal "[search query]"```

**Search** scoped to a specific file or directory

```rekal --file [src/billing/] "[discount logic]"```

**View** recent checkpoints

```rekal log```

**Drill into** a specific session

```rekal query --session [session_id] --full```

**Push** rekal data to the remote branch

```rekal push```

**Sync** team context from remote branches

```rekal sync```

# SYNOPSIS

**rekal** \<command\> [_options_] [_query_]

# PARAMETERS

**init**
> Initialize rekal in the current git repository

**clean**
> Remove rekal setup from the repository

**checkpoint**
> Capture current AI session context at the latest commit

**push** [_--force_]
> Push rekal data to the remote branch

**sync** [_--self_]
> Sync team context from remote branches

**index**
> Rebuild the local search index database

**log** [_--limit n_]
> Show recent checkpoints

**query --session** _id_ [_--full_] [_--offset n_] [_--limit n_]
> Drill into a specific session with optional pagination

**query** _"SQL"_ [_--index_]
> Execute a raw SQL query against the data or index database

**version**
> Print CLI version

**--file** _path_
> Scope search to a specific file or directory

**--role** _human_
> Filter search results to human turns only

# DESCRIPTION

**rekal** captures AI session context at every git commit, creating a permanent, append-only record of development reasoning and conversations alongside code changes. It stores two databases: a shared **data.db** (turns, tool calls, checkpoints, files touched — distributed via a dedicated git orphan branch) and a local **index.db** (full-text index, vector embeddings, file co-occurrence graphs) used only for search.

The tool installs git hooks so checkpoints are written automatically on every commit. Retrieval is a hybrid of BM25 lexical search, LSA, and Nomic vector embeddings, returning scored JSON with the best-matching turn index for progressive drill-down. A session of 2–10 MB of raw transcripts compresses to roughly 300 bytes on disk. Embeddings ship with the binary — no API keys, accounts, or external services.

# CAVEATS

Currently works with **Claude Code** sessions only; support for other agents is planned. Requires **Git** and runs on **macOS** or **Linux**. The append-only design means records cannot be edited or deleted after capture. Data never leaves your local machine or git repository.

# HISTORY

rekal was created by the **rekal-dev** team and written in **Go**. It was first released in **2026** as a tool for preserving the reasoning context behind AI-assisted development, addressing the problem of lost conversation history when AI coding agents are used across team workflows.

# SEE ALSO

[git](/man/git)(1), [claude](/man/claude)(1)
