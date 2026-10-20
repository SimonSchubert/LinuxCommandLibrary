# TAGLINE

Audit and govern AI coding-agent setups from the shell

# TLDR

Install **hooks and rules** into the current project (Claude Code and Codex)

```yana-ai install```

Install for **one harness** only, without writing files yet

```yana-ai install --engine [claude] --dry-run```

Check that **Python, git, keys, and hooks** are wired

```yana-ai doctor .```

**Scan** the agent setup for risk patterns

```yana-ai audit .```

Fail CI when findings are **high or worse**

```yana-ai audit . --fail-on high --sarif [yana-ai.sarif]```

Open an **interactive chat** (auto-detects Anthropic, OpenAI, or Ollama)

```yana-ai chat```

Force **local Ollama**, no API key

```yana-ai chat --provider ollama```

Create a **task** with a filesystem scope

```yana-ai task create "[Fix auth bug]" --scope [src/auth/]```

Show the **Giám Thị** supervisor status

```yana-ai giamthi status .```

Print the **package version**

```yana-ai version```

# SYNOPSIS

**yana-ai** [_command_] [_target_] [_flags_]

**yana-ai** **help** | **-h** | **--help**

**yana-ai** **version** | **-v** | **--version**

# DESCRIPTION

**yana-ai** is the Python CLI for **Yana AI**, a local control plane between a coding model and real power. A model proposes an action; Yana checks authority, capability, and policy (including a human gate) before anything runs. The installed command is **yana-ai** (`pip install yana-ai`). The script is also named **yana**; the PyPI entry point is **yana-ai**.

The wrapper (`bin/yana`) dispatches to Python helpers under `core/scripts/` or to the native runtime **yana-rt**. Commands such as **audit**, **chat**, **task**, **graph**, and **hunt** need **yana-rt** on PATH (install with `cargo install yana-rt`). **verify**, **init**, **policy**, **guard**, **install**, **giamthi**, **router**, **watch**, and several report commands run in Python without it.

**install** writes `.yana-aiignore`, gitignore entries, an MCP template, an example GitHub Actions workflow, and harness files for Claude Code and/or Codex. **doctor** checks Python, git, ignore rules, Claude/MCP config, API keys, and whether Yana hooks are wired. **audit** is **yana-rt scan**: it scores the agent setup and can emit Markdown or SARIF. **giamthi** installs an opt-in OS supervisor (systemd timer on Linux, launchd on macOS, Task Scheduler on Windows) that compares enforcement files against a human-approved baseline every 6 hours and writes `GIAMTHI_HALT.lock` on drift; a hook then denies later tool calls until a person deletes the lock.

Yana Studio, Yana Desktop, and Yana Web are separate GUI apps. This command is the shell interface. The product is not published to npm. Apache-2.0.

# COMMANDS

**install** [_target_] [**--engine** **all**|**claude**|**codex**] [**--guards**] [**--supervisor** **ask**|**install**|**skip**] [**--no-audit**] [**--dry-run**]
> One-command project setup. Default **--engine** is **all** (Claude + Codex). **--guards** also runs **guard install all**. **--supervisor** controls Giám Thị. Default _target_ is `.`

**doctor** [_target_] [**--json**]
> Environment health. Exit **0** if healthy, **1** on warnings, **2** on failures. **doctor dispatch** cross-checks `src/main.rs` against this wrapper's dispatch table

**audit** [_target_] [**--json**] [**--markdown** _file_] [**--sarif** _file_] [**--diff** _base_] [**--fail-on** _level_] [**--only** _category_] [**--ignore** _id_] [**--no-color**] [**--quiet**] [**--watch**] [**--include-skills**]
> Scan the AI-agent setup. Forwards to **yana-rt scan**. **--fail-on** is `low`, `medium`, `high`, or `critical`. **--watch** re-runs on file change. Reads `.yana-aiignore`

**init** [_target_]
> Interactive wizard (engine, profile, guards). The canonical implementation is Python; **yana-rt init** is a simpler flag-driven alternative

**verify** [_target_]
> Check that safety hooks are wired and active

**chat** [**--provider** _p_] [**--model** _name_] [**--system** _text_] [**--resume** _id_] [**--verbose**] [**--no-sandbox**]
> Interactive REPL through **yana-rt**. With no **--provider**, uses `ANTHROPIC_API_KEY`, else `OPENAI_API_KEY`, else local Ollama. A missing cloud key exits; it does not silently switch providers. **run_command** still needs interactive approval

**giamthi** **install**|**status**|**repair**|**uninstall**|**run** [_target_] [**--dry-run**] [**--json**] [**--allow-protected-path**]
> OS-level Giám Thị supervisor. **run** is a single pass. Uninstall keeps `GIAMTHI_HALT.lock` and audit evidence

**guard** **list**|**install**|**status** ...
> Install runtime enforcement hooks into the project (Python). Distinct from **yana-rt guard**, which is the in-process PreToolUse fast path

**policy** **list**|**show**|**apply**|**fixes**|**check** ...
> Safe-config templates for audit findings. Needs **python3**

**task** **create**|**list**|**status**|**done**|**drop**|**depend** ...
> Task store in **yana-rt**. **done** requires **--evidence**

**eval** **run**|**judge**|**schema**
> Check recorded task evidence

**map** [_target_] [**--json**]
> Blast-radius map: settings, MCP, workflows the agent can reach

**score** [_target_] [**--explain**] [**--json**]
> Audit score and risk level

**hunt** [_target_]
> Secrets, code, dependency, and supply-chain scan

**graph** **build**|**show**|**search**|**onboard**|**diff**
> Knowledge graph over the target tree

**fix** _rule-id_ [**--dry-run**]
> Apply a known safe fix

**upgrade**
> Self-update the Python package to the latest release

**help** / **banner** / **version**
> Full command list, welcome banner, or version string

# PARAMETERS

**--json**
> Machine-readable output on **doctor**, **audit**, **map**, **score**, **hunt**, and other read commands

**--fail-on** _level_
> With **audit** / **hunt**, exit non-zero on findings at _level_ or above (`low`, `medium`, `high`, `critical`)

**--diff** _base_
> With **audit**, scan only files changed since _base_ (for example `origin/main`)

**--engine** **all**|**claude**|**codex**
> With **install**, which harness files to write. Default **all**

**--dry-run**
> With **install**, **giamthi**, **fix**, and others: print what would change

**--provider** _id_
> With **chat**: `anthropic`, `openai`, `kimi`, `ollama`, or another catalog id

**-h**, **--help**
> Print the built-in command list

**-v**, **--version**
> Print `yana-ai` and the package version

# CONFIGURATION

**.yana-ai/config.yml**
> Per-project CLI settings. **yana-ai config show** / **set** / **init**

**.yana-aiignore**
> Finding IDs to suppress, gitignore syntax. **install** creates a default file

**.yana-ai/cost-policy.json**
> Daily and monthly spend ceilings for **cost set-policy** / **cost guard**

**.yana-ai/leases.json**
> Capability leases granted with **lease grant**

**.yana-ai/web-search.json**, **.yana-ai/mcp-servers.json**, **.yana-ai/lsp-servers.json**
> Repo-supplied integration config. Unused until a person runs **yana-rt trust allow** (not reachable through this wrapper)

# ENVIRONMENT

**YANA_RT_BIN**
> Absolute path to a compiled **yana-rt** binary. Do not point this at the pip shim named `yana-rt`

**YANA_ROOT**
> Set by the wrapper to the installed package tree so `bin/yana` finds `core/`

**ANTHROPIC_API_KEY**, **OPENAI_API_KEY**, **MOONSHOT_API_KEY**
> Cloud providers for **chat**. Kimi uses **MOONSHOT_API_KEY**

**VT_API_KEY**
> VirusTotal hash lookup for **filescan check**. File contents are not uploaded

**YANA_COMPACT**, **YANA_COMPACT_BYPASS**
> Opt-in Bash-output compaction in **yana-rt compact** (hook path, not this wrapper)

# CAVEATS

Needs **Python 3.11** or newer, **git**, and a supported harness for the install/audit path. Many subcommands fail with exit **3** if **yana-rt** is missing. The pip command **yana-rt** is a wrapper that looks up a native binary; install the runtime with Cargo (or set **YANA_RT_BIN**). Destructive-command guards match command strings, not a full shell parse. Giám Thị is opt-in and can take up to 6 hours to notice drift. Cursor hooks screen shell commands, not MCP calls; Antigravity rules are advisory. Chat runs as its own process, outside Claude Code's PreToolUse hooks. Not distributed on npm.

# HISTORY

Yana AI was started on **17 May 2026** by **Vũ Văn Tâm** in Vietnam (Apache-2.0). The Python package **yana-ai** is published on PyPI; the Rust runtime **yana-rt** is a separate crates.io crate. npm publishing of the product axis was dropped in **July 2026**.

# SEE ALSO

[yana-rt](/man/yana-rt)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [aider](/man/aider)(1), [aichat](/man/aichat)(1), [ollama](/man/ollama)(1), [pip](/man/pip)(1), [cargo](/man/cargo)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/yanacuti1121/Yana-AI)```

```[Homepage](https://yana.vutam.link)```

```[Documentation](https://github.com/yanacuti1121/Yana-AI/blob/main/COMMANDS.md)```

<!-- verified: 2026-10-21 -->
