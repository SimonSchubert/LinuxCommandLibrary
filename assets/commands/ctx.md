# TAGLINE

Local search across coding agent session history

# TLDR

**Index all discovered local agent sessions**

```ctx setup```

**Search prior sessions by keyword**

```ctx search "failed migration"```

**Search sessions that touched a file**

```ctx search --file [path/to/file.rs]```

**Show a matching event with surrounding context**

```ctx show event [ctx-event-id] --window 3```

**Show a compact session transcript**

```ctx show session [ctx-session-id]```

# SYNOPSIS

**ctx** _command_ [_options_]

# PARAMETERS

**setup**
> Discover and import local agent history into the SQLite index.

**search** _query_
> Full-text search across indexed sessions and events.

**--file** _PATH_
> Restrict search to sessions that touched the given file.

**--term** _TERM_
> Add an additional search term (repeatable).

**show event** _ID_
> Print transcript context around a specific event.

**show session** _ID_
> Print a compact session transcript.

**sources**
> List importable agent history sources on this machine.

**sql** _QUERY_
> Run read-only SQL against the local index.

**--json**
> Emit machine-readable JSON output.

# DESCRIPTION

**ctx** is a Rust CLI that indexes coding agent session logs already stored on your machine and makes them searchable from the shell. It imports history from Claude Code, Codex, Cursor, Pi, OpenCode, Antigravity, Factory AI Droid, and Copilot CLI, normalizing sessions and events into a local SQLite database.

Agents often start from zero and cannot recover prior decisions, failed commands, or rejected approaches. **ctx** lets you or a current agent find that context before repeating work. Results include session IDs, event IDs, snippets, and cited matches — far more token-efficient than grepping raw transcripts.

All indexing and search runs locally. No prompts, transcripts, or history are sent to a cloud service.

# CAVEATS

Transcript text is preserved as stored locally; review output before sharing outside the machine. Source builds and package-manager installs do not self-upgrade — only installer-managed binaries support **ctx upgrade**.

# SEE ALSO

[rg](/man/rg)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/ctxrs/ctx)```

```[Homepage](https://ctx.rs)```

```[Documentation](https://ctx.rs/reference/cli)```

<!-- verified: 2026-07-03 -->