# TAGLINE

Local-first analytics for Claude Code and Codex session logs

# TLDR

**Start** the local web UI (indexes logs and watches for changes)

```decant```

**Index** new and changed sessions without serving

```decant sync```

**List** sessions, then **render** a transcript

```decant ls```

```decant show [1]```

**Search** transcripts and tool calls

```decant search "[auth bug]"```

**Roll up** usage by model, then break down tokens and estimated cost

```decant stats --by model```

```decant economics```

**Export** a session as Markdown

```decant export [1] > [session.md]```

Use a **scratch database** and skip ingesting the default source trees

```decant --db [/tmp/decant.db] --no-sync serve --no-open```

# SYNOPSIS

**decant** [_global-options_] [_command_] [_args_]

# PARAMETERS

**--db** _path_
> Path to the SQLite archive (default **~/.decant/decant.db**, or **DECANT_DB**)

**--json**
> Emit machine-readable JSON

**--format** _table_|_json_|_md_
> Output format for read commands

**-q**, **--quiet**
> Suppress non-essential output

**--no-color**
> Disable ANSI color

**--no-sync**
> Skip sync-on-read. With **serve**, also disable the source watcher (manual **POST /api/sync** still works)

**--version**
> Print the Decant version and exit

# COMMANDS

**serve** [**--host** _addr_] [**--port** _n_] [**--claude-dir** _dir_] [**--codex-dir** _dir_] [**--interval-ms** _ms_] [**--debounce-ms** _ms_] [**--no-fs-watch**] [**--trusted-peer** _ip_] [**--no-open**]
> Serve the local UI and keep the index current. This is the default when **decant** is invoked with no arguments. Binds **127.0.0.1:3000** unless overridden. **--trusted-peer** (repeatable or comma-separated) allows API clients when bound off loopback.

**sync** [**--claude-dir** _dir_] [**--codex-dir** _dir_] [**--path** _path_]
> Scan session directories and upsert new or changed sessions. **--path** may be repeated to ingest selected files or trees.

**watch** [**--claude-dir** _dir_] [**--codex-dir** _dir_] [**--interval-ms** _ms_] [**--debounce-ms** _ms_] [**--no-fs-watch**]
> Watch source directories and refresh the archive (filesystem events plus a periodic sweep).

**ls** [**--tool** _name_] [**--model** _name_] [**--project** _path_] [**--include-subagents**] [**--limit** _n_]
> List sessions (default limit 50). Also available as **session ls**.

**show** _id_
> Render a full transcript. Also available as **session show**.

**project ls**
> List projects with session counts and estimated cost.

**search** _query_ [**--limit** _n_]
> Full-text search across messages, tool calls, and transcripts (default limit 30).

**stats** [**--by** _tool_|_model_|_project_|_day_]
> Usage and cost rollups. Without **--by**, print totals.

**tokens**, **economics**
> Break tokens, estimated cost, agent time, and user wait into context, planning, code, and communicating.

**files** [**--group** _path_|_ext_] [**--op** _read_|_edit_|_write_|_delete_] [**--limit** _n_]
> File hotspots touched by agents.

**tool stats**, **tool ls** [**--errors-only**] [**--limit** _n_]
> Tool-call usage.

**mcp stats**, **mcp ls** [**--limit** _n_]
> MCP server usage.

**export** [_id_] [**--all**] [**--include-subagents**] [**--as** _md_|_json_|_trajectory_] [**--out** _dir_]
> Export one session (or **--all** into **--out**) as Markdown, JSON, or a trajectory-v1 record file.

**distill script** [**--project** _name_] [**--work-type** _type_] [**--from-session** _id_] [**--as** _sh_|_just_|_make_] [**--min-frequency** _n_] [**-o** _path_] [**--force**]
> Generate a workflow script from command history.

**distill replay** _id_ [**--include-errors**] [**-o** _path_] [**--force**]
> Reproduce one session's commands and file writes as a script.

**distill skill** [**--project** _name_] [**--work-type** _type_] [**--kind** _skill_|_agents_|_command_] [**-o** _path_] [**--force**]
> Generate a **SKILL.md**, AGENTS.md section, or slash command from history.

**db info**, **db migrate**, **db vacuum**
> Inspect the archive, apply schema migrations, or reclaim free space.

**recommendations ls** [**--status** _open_|_implemented_|_all_], **recommendations mark** _key_
> List or mark persisted recommendations.

**completion** _bash_|_zsh_|_fish_|_powershell_|_elvish_
> Print a shell completion script.

# DESCRIPTION

**decant** turns Claude Code and Codex session logs already on the machine into a searchable SQLite archive and a local analytics UI. It reports token spend, estimated cost, context-window use, agent time, files and tools touched, and MCP activity. Bare **decant** starts **serve**, which indexes sources, watches for changes, and opens **http://127.0.0.1:3000**.

Default sources are **~/.claude/projects** for Claude Code and **~/.codex** for Codex (including archived Codex sessions). Read commands sync first unless **--no-sync** or **DECANT_NO_SYNC** is set. **sync** inserts new sessions and replaces changed ones transactionally; unchanged files are skipped. Deleting or rebuilding the archive does not delete the original JSONL logs.

The local HTTP API has no credentials. Keep the bind address on loopback unless you explicitly trust remote peers. A running server exposes OpenAPI at **/api/openapi.json**.

Decant is local-first: it makes no outbound network calls at runtime, and transcripts stay on the machine. Published binaries cover Linux and macOS on x64 and arm64. Native Windows binaries are not available.

# CONFIGURATION

**DECANT_DB**
> Archive path (default **~/.decant/decant.db**)

**DECANT_CLAUDE_DIR**
> Claude Code projects directory (default **~/.claude/projects**)

**DECANT_CODEX_DIR**
> Codex home directory (default **~/.codex**)

**DECANT_NO_SYNC**
> Same effect as **--no-sync** when set

**DECANT_NO_OPEN**
> Do not open a browser after **serve** starts

**DECANT_TRUSTED_PEERS**
> Comma-separated IPs or IPv4 CIDRs allowed to call the API when not bound to loopback. An empty value means trust nobody.

**DECANT_TRUST_DEFAULT_GATEWAY**
> Set to **1** to auto-trust the container bridge gateway (Docker **--publish** to loopback). Off by default.

**DECANT_LOG_LEVEL**
> Structured log level

The shell installer (**install.sh**) also honors **DECANT_VERSION**, **DECANT_INSTALL_DIR** (default **~/.local/bin**), **DECANT_NO_MODIFY_PATH**, and **DECANT_BASE_URL**.

# CAVEATS

The serve API is unauthenticated. Publishing the port on every interface exposes the archive. Binding off loopback without **--trusted-peer** or **DECANT_TRUSTED_PEERS** typically returns **403 forbidden remote**.

Costs are estimates from Decant's pricing table. Rebuilding the archive with a newer Decant version can change historical figures even when source logs did not change.

Archiving or deleting a session in Decant hides or removes index rows and can tombstone identities so later syncs do not resurrect them. The source JSONL is left in place; remove it through Claude Code or Codex if the original transcript must go as well.

**sync** exits **3** when source lines could not be parsed (content was dropped). Other ingest issue codes are reported without failing the command.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [confessor](/man/confessor)(1)

# RESOURCES

```[Source code](https://github.com/dosu-ai/decant)```

```[Documentation](https://github.com/dosu-ai/decant#readme)```

<!-- verified: 2026-08-13 -->
