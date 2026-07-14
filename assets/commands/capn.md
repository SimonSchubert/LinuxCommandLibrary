# TAGLINE

persistent, self-invalidating discovery memory for coding agents

# TLDR

**Initialize** project memory and agent session-start hooks

```capn init
capn init --git```

**Ask** for a previously charted answer

```capn ask "[where are payment webhooks handled?]"```

**Chart** a hard-won discovery with backing files

```capn chart "[question]" --files [src/a.ts,src/b.ts] --details "[notes]"```

**List** charted entries or **prune** stale ones

```capn list
capn prune```

**Remove** one entry or bust all charts for a file

```capn unchart [id]
capn bust [path/to/file]```

Print the **session context** note (used by hooks)

```capn context```

# SYNOPSIS

**capn** _command_ [_options_] [_args_]

# DESCRIPTION

**capn** (package **capn-hook**) gives coding agents disposable, local memory of codebase discoveries. After an expensive search, the agent **charts** a short question plus the files that answer it. **capn ask** returns those files (as JSONL) if the chart still matches; if any backing file changed, the entry is deleted automatically before it can mislead.

**capn init** creates **.capn/**, a QMD search index, and SessionStart hooks for Claude Code and Codex that inject **capn context** (ask first, chart after hard discoveries). Recall uses semantic hybrid search by default (**--no-embedding** for BM25-only). The chart is gitignored and local to the working copy.

# PARAMETERS

**init** [**--git**] [**--embedding**|**--no-embedding**]
> Create **.capn/**, index, hooks; optional post-commit prune hook

**ask** _question_
> Return relevant chart hits after pruning; exit 1 on miss

**chart** _question_ **--files** _a,b_ [**--details** _text_]
> Save a discovery with content hashes of backing files

**unchart** _id_ / **bust** _path_ / **prune** / **list**
> Delete one entry, all entries for a file, all stale entries, or list charts

**context**
> Print the ask-first charting contract for agent hooks

# CAVEATS

Default embedding path downloads models on first use (hundreds of MB to ~2GB). Charts are local and disposable—never a substitute for reading current source. Misses intentionally exit non-zero.

# SEE ALSO

[rg](/man/rg)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/CyrusNuevoDia/capn-hook)```

```[Documentation](https://github.com/CyrusNuevoDia/capn-hook/blob/main/INSTALL.md)```

<!-- verified: 2026-07-14 -->
