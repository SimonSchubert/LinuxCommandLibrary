# TAGLINE

Git-backed memory for AI coding agents

# TLDR

**Initialize** rekal in the current git repository (store, hooks, agent skill)

```rekal init```

**Search** past sessions and team context for a query

```rekal "[search query]"```

**Read a source** returned by a search

```rekal query --ref [reference]```

**Search** scoped to a file path (regex)

```rekal --file [src/billing/] "[discount logic]"```

**Search only human turns**, as raw JSON

```rekal --actor human --json "[query]"```

**Search for a word** that is also a command name

```rekal -- [log]```

**Drill into** a specific session including tool calls and files

```rekal query --session [s3] --full```

**View** recent checkpoints

```rekal log```

**Push** merged checkpoints to your rekal branch

```rekal push```

**Sync** teammates' context from remote branches

```rekal sync```

# SYNOPSIS

**rekal** [_filters_...] [_query_]

**rekal** _command_ [_options_]

# PARAMETERS

**init**
> Initialize rekal: `.rekal/` store, `post-commit` and `pre-push` hooks, agent skill and instruction lines, and the orphan branch `rekal/<email>`. Re-running refreshes managed assets without touching data.

**clean** [**-y**]
> Delete the local store and managed setup; does not retract remote copies. Asks first, or requires `-y` / `--yes` when not on a terminal.

**checkpoint**
> Capture sessions and repository memory against the current commit (runs automatically from the post-commit hook).

**push** [**--remote** _NAME_] [**--strict**] [**--timeout** _DUR_] [**--rebuild**]
> Export merged checkpoints to your `rekal/<email>` branch. Append-only; there is no force option.

**sync** [**--self**]
> Fetch and import teammates' branches (or only your own with `--self`).

**index** [**--include-all**] [**--include** _PATH_] [**--no-local**]
> Rebuild the local search index `index.db`.

**embed**
> Fill missing semantic vectors in resumable, budgeted steps.

**log** [**-n** _N_]
> Show recent checkpoints (default 20).

**find** _TERM_ [_role_]
> Time-ordered literal sweep over matching turns; role is `human`, `assistant`, `human_steering`, or `summary`.

**query** [**--ref** _REF_ | **-s** _SESSION_ | **-q** _SQL_] [**-F**] [**-o** _N_] [**-n** _N_] [**-r** _ROLE_] [**-i**] [**-j**]
> Read a source reference, drill into a session (with offset, limit, role filter, `--full`), or run a read-only SQL SELECT against `data.db` (or `index.db` with `-i`).

**version**
> Print CLI version.

**-p**, **--file** _REGEX_
> Filter search by file path.

**-c**, **--commit** _SHA_
> Filter search by git commit.

**-a**, **--author** _EMAIL_
> Filter search by author email.

**-A**, **--actor** _human|agent_
> Filter search by actor type.

**-n**, **--limit** _N_
> Ranked results per framing (default 20).

**-j**, **--json**
> Output raw structured JSON instead of the text digest.

**-e**, **--explain**
> Per-layer scores and related-session joins (with `--json`).

# DESCRIPTION

**rekal** captures AI coding agent conversations and native memory notes at every git commit, keeping a permanent, append-only record of the reasoning behind code changes. It keeps two local DuckDB databases in `.rekal/`: **data.db**, the append-only ledger (sessions, turns, tool calls, checkpoints, files touched) that is shared through a dedicated orphan git branch per user, and **index.db**, a derived and disposable local search index.

Search is the default action: `rekal "<query>"` returns a ranked digest combining lexical, LSA, and vector search, plus literal matches and memory notes, with references that can be read in full via `rekal query --ref`. Embeddings run locally by default, so no hosted account is needed. Only checkpoints whose commits have been merged into the default branch are pushed to the shared branch.

`rekal init` also installs a skill and instruction lines so that agents (Claude Code, Cursor, Copilot, Codex, Gemini, Kiro, OpenCode) know how to query rekal themselves.

# CAVEATS

Requires **Git**; prebuilt binaries cover macOS ARM64 and Linux AMD64/ARM64. Search exits 1 when nothing confident is found (SILENCE) or on error. A query whose first word is a command name runs that command; use `--` to force a search. The ledger is append-only: records cannot be edited, and discarding a shared branch requires a manual `git push --force`. Captured conversations may contain secrets or private data, so review what is shared before pushing. Version 2.0 changed several commands; see the upgrade guide when migrating from 1.x.

# HISTORY

rekal was created by **rekal-dev** and is written in **Go** under the Apache-2.0 license. It was first released in **2026**, initially supporting only Claude Code sessions; version **2.0** (November 2026) added native memory integration, support for more agents, and reference-based source reading.

# SEE ALSO

[git](/man/git)(1), [claude](/man/claude)(1), [codex](/man/codex)(1)

# RESOURCES

```[Source code](https://github.com/rekal-dev/rekal-cli)```

```[Homepage](https://rekal.dev)```

```[Documentation](https://github.com/rekal-dev/rekal-cli/blob/main/docs/commands.md)```

<!-- verified: 2026-11-23 -->
