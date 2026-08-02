# TAGLINE

File-based memory, skills, and nightly routines for Claude Code and Codex CLI

# TLDR

**Initialize** Wienerdog (preview first with dry-run)

```npx wienerdog@latest init --dry-run```

```npx wienerdog@latest init```

```npx wienerdog@latest init --yes```

**Check** install health and safety gates

```wienerdog doctor```

```wienerdog safety```

**Sync** session digest from identity notes

```wienerdog sync```

**Run** a dream consolidation now

```wienerdog dream```

**Approve** proposed identity-note edits

```wienerdog memory approve```

**Remove** everything Wienerdog installed

```wienerdog uninstall```

# SYNOPSIS

**wienerdog** _command_ [_options_]

# DESCRIPTION

**wienerdog** installs a plain-file “memory vault” and related skills/hooks so coding agents (**Claude Code** and **Codex CLI**) share one profile and long-term notes. It does not run a daemon or phone home: layout is markdown and config under **~/.wienerdog**, interpreted by the AI tools you already use.

**init** creates the core, detects agents, and can drive an interview that fills **CLAUDE.md** / **AGENTS.md** from the same vault (Obsidian-style PARA). A scheduled **dream** job consolidates recent sessions into memory (at most one git commit per night) and can propose identity-note edits that only apply after **wienerdog memory approve**. Optional Google Workspace access and catalog routines use the OS scheduler (launchd / systemd / Task Scheduler) with verification before each run.

Requires **Node.js ≥ 18**. Typical install: **npx wienerdog@latest init**, or the upstream **install.sh** bootstrap, or **npm i -g wienerdog**. Status is **0.x**; file formats may still evolve until 1.0.

# PARAMETERS

**init** [**--dry-run**] [**--yes**]
> Create **~/.wienerdog**, detect AI tools, and set up skills/hooks. **--dry-run** prints the plan without writing.

**adopt**
> Point Wienerdog at an existing vault directory instead of creating a new one.

**sync**
> Re-render the session digest from the vault's identity notes (also the fix after manual **config.yaml** edits that must re-authorize scheduled jobs).

**update**
> Update Wienerdog to the latest published version without requiring a separate npm workflow.

**dream**
> Consolidate recent sessions into vault memory (same work as the nightly job).

**schedule**
> Add, remove, or list scheduled jobs (dream and optional routines).

**run-job**
> Run a scheduled job immediately (used by the OS scheduler).

**doctor**
> Check an existing install for problems.

**alerts**
> List job alerts; silence seen ones with typed confirmation.

**uninstall**
> Remove files Wienerdog created (reverses the install).

**gws**
> Google Workspace helpers (read Gmail/Calendar/Drive; draft mail) via a local capability broker.

**grant**
> Authorize a routine to send email (typed confirmation).

**memory**
> Approve identity-note changes so they inject into the next session (typed confirmation).

**safety**
> Show which sensitive actions are allowed or blocked.

**--dry-run**
> Global: show what would happen; make no changes (where supported).

**--yes**
> Global: skip confirmation prompts (where supported).

# CONFIGURATION

**~/.wienerdog**
> Core install root: vault, skills, hooks, and config. **uninstall** removes what Wienerdog wrote.

**config.yaml** (under the install tree)
> Runtime/schedule configuration. Edits outside **wienerdog sync** can fail closed for scheduled jobs until re-authorized.

**CLAUDE.md** / **AGENTS.md**
> Agent identity digests generated from the shared vault interview and memory notes.

# CAVEATS

Depends on Claude Code and/or Codex CLI being installed and restarted after setup so skills load. Secret scrubbing is best-effort. Scheduled integrity checks detect drift between syncs; they are not OS-level malware defense. Project is pre-1.0; treat the installed file layout as the public API.

# HISTORY

**Wienerdog** is an open-source (MIT) npm package that treats agent memory and routines as versioned files rather than a personal-AI daemon. Upstream: **github.com/wienerdog-ai/wienerdog**.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [npx](/man/npx)(1), [npm](/man/npm)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/wienerdog-ai/wienerdog)```

```[Homepage](https://www.npmjs.com/package/wienerdog)```

<!-- verified: 2026-08-02 -->
