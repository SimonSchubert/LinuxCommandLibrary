# TAGLINE

Compact heads-up display for coding-agent CLIs

# TLDR

**Install** globally and wire agent handbacks

```npm install -g adrida/hud-mode && hud install```

**Start** with the default agent engine

```hud```

**Start with a prompt**

```hud "[fix the failing CI]"```

**Resume** the last session in this directory

```hud -r```

**Drive Claude Code** under the same deck

```hud claude "[fix the CI]"```

**Drive Codex** and resume the last session

```hud codex -r```

**Set** the default engine for bare `hud`

```hud default claude```

# SYNOPSIS

**hud** [_options_] [_prompt_]

**hud** **claude**|**codex**|**opencode** [_options_] [_prompt_]

**hud** **install** | **uninstall** | **default** _engine_

# DESCRIPTION

**hud** is a zero-dependency terminal front end for coding agents (**OpenCode**, **Claude Code**, and **Codex**). It drives each CLI headless through its JSON event stream and shows a compact instrument panel (model, tokens, status, activity) instead of a scrolling wall of tool calls. The prompt bar stays writable mid-turn so follow-ups queue; when the agent finishes, the full answer lands with rendered markdown.

`/hud` toggles between this deck and the engine's full TUI for the same session (hook / AGENTS.md rule / custom command, depending on the engine). Quitting a full TUI returns to the hud. Instruments and preferences persist under `~/.claude/hud/`.

Requires **Node.js ≥ 18** and at least one of `opencode`, `claude`, or `codex` on `PATH`.

# PARAMETERS

**-r** [_session-id_]
> Resume the last session in the current directory, or a specific session id.

**-m**, **--model** _model_
> Engine-specific model id.

**-e**, **--effort** _level_
> Engine-specific reasoning effort.

**--danger**
> Skip approvals / sandboxing where the engine supports it.

**claude**, **codex**, **opencode**
> Select which agent binary to drive for this run.

**install**
> Interactive setup: default agent, OpenCode echo, handback wiring into Claude/Codex/OpenCode configs.

**uninstall**
> Remove hooks, skills, prompts, and config blocks written by **install**.

**default** _engine_
> Persist which engine bare **hud** launches.

# CONFIGURATION

**~/.claude/hud/config.json**
> Default engine and instrument (`/gauges`) preferences.

**~/.claude/hud/links/**
> Per-session ledger of URLs the agent shared (OSC 8 hyperlinks in supporting terminals).

**~/.claude/hud/handoff.json**
> Sentinel file used when toggling to/from a full engine TUI.

**hud install** also writes engine-specific pieces under `~/.claude/skills/hud/`, `~/.claude/settings.json` (hook; backup `.hud-backup`), `~/.codex/prompts/hud.md`, a marked block in `~/.codex/AGENTS.md`, and `~/.config/opencode/commands/hud.md`.

# CAVEATS

Not a fork of the agent CLIs — behavior depends on each engine's headless JSON stream and resume APIs. Codex handback may use a plain `hud` AGENTS.md rule rather than a zero-token slash command. Permission approvals inside the hud itself remain on the roadmap.

# HISTORY

**hud** (package **hud-mode**) is an MIT-licensed terminal UI by the Tracer / adrida authors, aimed at making multi-turn agent sessions scannable without replacing Claude Code, Codex, or OpenCode.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1)

# RESOURCES

```[Source code](https://github.com/adrida/hud-mode)```

<!-- verified: 2026-08-06 -->
