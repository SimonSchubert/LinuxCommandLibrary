# TAGLINE

Version, replay, and audit AI agent session transcripts

# TLDR

**Watch** Claude Code and Codex sessions and snapshot changes into a local vault

```compactdiff watch```

**Snapshot** one transcript file into the vault now

```compactdiff snapshot [~/.claude/projects/proj/session.jsonl]```

**List** vaulted sessions and their version history

```compactdiff list```

**Diff** two snapshot SHAs to see what compaction removed

```compactdiff diff [shaA] [shaB]```

**Export** a self-contained HTML replay of a transcript or vault SHA

```compactdiff export [file|sha] -o [replay.html]```

**Branch** a transcript after N conversational messages to a truncated JSONL file

```compactdiff branch [file|sha] --at [12] -o [fork.jsonl]```

**Use a custom vault directory** (default **~/.compactdiff**)

```compactdiff --vault [path/to/vault] list```

# SYNOPSIS

**compactdiff** [**--vault** _DIR_] [**--no-redact** **--i-understand-sensitive-data**] _command_ [_args_]

# PARAMETERS

**--vault** _DIR_
> Vault directory for content-addressed snapshots (default **~/.compactdiff**).

**--no-redact**
> Store and export raw transcript data without redaction. Unsafe; must be paired with **--i-understand-sensitive-data**. Both global flags go before the subcommand.

**--i-understand-sensitive-data**
> Required acknowledgement when **--no-redact** is set. Without it, the CLI exits with an error.

**snapshot** _file_...
> Snapshot one or more transcript files into the vault now. Prints short SHA, NEW/unchanged status, session id, and line count per file.

**watch**
> Poll default Claude Code and Codex session globs and auto-snapshot every change into the vault. **--pattern** _GLOB_ replaces the default globs with one custom glob. **--interval** _SECONDS_ sets the poll period (default **5**). Stop with Ctrl-C.

**list**
> List every vaulted session and its version chain (short SHA, timestamp, line count).

**diff** _sha_old_ _sha_new_
> Compare two vaulted snapshots (full SHA or unique prefix). Prints a verdict (**append-only** or **history-rewritten**) with kept/added/removed counts and previews of removed and added lines.

**export** _source_ **-o** _file_
> Export a transcript path or vaulted SHA to a single self-contained HTML replay timeline (user / assistant / thinking / tool events). No server or external assets.

**branch** _source_ **--at** _N_ **-o** _file_
> Write an inspectable truncated prefix of a transcript (path or vault SHA) after the first _N_ conversational messages. Codex developer bootstrap records are preserved but do not consume branch numbers. Does not claim direct resume in Claude/Codex.

# DESCRIPTION

**compactdiff** is a local-first CLI that versions, audits, and replays AI coding-agent session transcripts. Agents such as Claude Code and Codex persist sessions as JSONL and may rewrite them in place during compaction, so history disappears and there is no built-in way to share a readable session. compactdiff snapshots observed states into a content-addressed vault under **~/.compactdiff**, so compaction cannot destroy earlier versions.

**watch** polls Claude Code projects (**~/.claude/projects/**) and Codex sessions (**~/.codex/sessions/**) by default; **snapshot** records specific files on demand. **list** shows each session's version chain. **diff** proves what a rewrite removed with occurrence-aware ordered line counts (including duplicates and blank lines), keyed on line uuid when present. **export** writes a dark HTML timeline you can open offline or send as one file. **branch** cuts a truncated prefix for inspection or caller-managed seeding.

Requires **Python 3.9+** and uses only the standard library at runtime. Install from a checkout with **python3 -m pip install -e .** (or install the **compactdiff** package when published). Redaction of common secret fields, tokens, emails, phones, and home-directory usernames is on by default for **snapshot**, **watch**, **export**, and **branch**.

# CAVEATS

Agent transcripts can hold credentials, private prompts, source code, and personal data. Default redaction is defense-in-depth, not a guarantee—inspect every replay before sharing and keep the vault private. Raw mode (**--no-redact**) may store secrets. Session IDs and prose may remain sensitive after pattern redaction. The watcher polls (default 5s), not filesystem events. Branch files are truncated prefixes for inspection; they do not automate resume in Claude Code or Codex. Cursor and other non-JSONL agent stores are out of scope in v1.

# HISTORY

**compactdiff** is a pure-stdlib Python tool (MIT) for local agent-session vaults, audit diffs, HTML replay, and branching. Version **0.1.0** focuses on Claude Code JSONL, Codex-native sessions, and optional Nerve Codex runner logs, with redaction enabled by default.

# SEE ALSO

[diff](/man/diff)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [claude-hibernate](/man/claude-hibernate)(1), [agent-vault](/man/agent-vault)(1)

# RESOURCES

```[Source code](https://github.com/mkmkkkkk/compactdiff)```

```[Documentation](https://github.com/mkmkkkkk/compactdiff#readme)```

<!-- verified: 2026-08-09 -->
