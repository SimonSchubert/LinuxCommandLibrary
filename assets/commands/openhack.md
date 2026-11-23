# TAGLINE

Local AI security scanner for source code

# TLDR

**Open** the local dashboard (starts it in the background if needed)

```openhack```

**Scan** the current directory from the terminal

```openhack scan```

**Scan** a project with a specific provider and model

```openhack scan [path/to/repo] --anthropic --model [model_id]```

**Scan using an existing Claude Code or Codex login**

```openhack scan [path/to/repo] --claude-code```

**Fail a CI job** on high-severity findings and print a JSON report

```openhack scan . --json --fail-on high```

**List open high-severity findings** for the current project

```openhack findings --severity high --state open```

**Resume** an interrupted scan

```openhack resume [scan_id]```

**Stop** the background dashboard

```openhack dashboard stop```

# SYNOPSIS

**openhack** [**--port** _port_] [**--no-open**]

**openhack** **scan** [_directory_] [_options_]

**openhack** **scans** | **findings** [_directory_] [**--all**] [**--json**]

**openhack** **show** | **resume** _scan-id_

**openhack** **status** _scan-id:finding-id_ **open**|**resolved**|**dismissed**

**openhack** **note** _scan-id:finding-id_ _text_

**openhack** **dashboard** [**start**|**stop**|**status**]

**openhack** **providers** | **config** [**set** _key_ _value_] | **version** | **help** [_command_]

# COMMANDS

**scan** [_directory_]
> Scan the current directory or the given project path.

**scans** [_directory_]
> Show scan history for the project (alias **history**).

**findings** [_directory_]
> List current findings (alias **list**). Filter with **--severity** critical|high|medium|low and **--state** open|resolved|dismissed.

**show** _scan-id_
> Show a saved scan from any project.

**resume** _scan-id_
> Resume unfinished work with the scan's original provider, model and settings. The source must be unchanged.

**status** _scan-id:finding-id_ _state_
> Set a finding's triage state to open, resolved or dismissed.

**note** _scan-id:finding-id_ _text_
> Save a note on a finding; an empty string clears it.

**dashboard** [**start**|**stop**|**status**]
> Manage the dashboard server. Without an action it runs in the foreground until Ctrl+C; **stop** checkpoints running scans first.

**providers**
> Check API-key configuration and Codex/Claude Code logins (alias **doctor**).

**config** [**set** _key_ _value_]
> Show or change settings: provider, model, workers, steps, reasoning, context or port (alias **settings**).

# PARAMETERS

**--codex**, **--claude-code**, **--openai**, **--anthropic**, **--provider** _ID_
> Provider to use for this scan only; saved settings are not changed.

**--model** _ID_
> Model to use for this scan.

**--workers** _N_
> Number of parallel review workers (1 to 32).

**--steps** _N_
> Tool rounds per review task (1 to 30).

**--reasoning** _LEVEL_
> Reasoning effort for the model.

**--context** _TEXT_
> Extra project context for reviewers, e.g. the security boundary to verify.

**--fail-on** _SEVERITY_
> Exit with code 2 when an open validated finding meets this severity.

**--json**
> Write machine-readable output to stdout.

**--all**
> Include all projects (scans, findings).

**--port** _PORT_
> Dashboard port (default 6969).

**--no-open**
> Start the dashboard without opening a browser.

**--home** _DIRECTORY_
> Use a different workspace instead of ~/.openhack.

**-h**, **--help** / **-v**, **--version**
> Show help or the version.

# DESCRIPTION

**openhack** is an open-source agentic security scanner that reviews a codebase with an AI model. Its v2 harness maps the project, assigns focused source reviews, challenges candidate findings and judges the evidence, producing findings with severity, source evidence and remediation guidance.

Running **openhack** without a command opens a local web dashboard at **http://127.0.0.1:6969** with onboarding, live scan progress, findings triage and settings. The dashboard keeps running in the background after the browser is closed. All scan functionality is also available from the terminal for scripts and CI: progress goes to stderr, and **--json** writes the final report to stdout.

A provider is required: an OpenAI or Anthropic API key (saved in settings or via **OPENAI_API_KEY** / **ANTHROPIC_API_KEY**), or an existing **Codex** or **Claude Code** CLI login. Source excerpts needed for each review are sent to the selected provider; project code is read but never executed.

Scan exit codes are 0 for complete, 1 for failed/partial or invalid input, 2 when **--fail-on** is triggered and 130 for cancellation. Ctrl+C saves a checkpoint that **resume** can continue from.

# CONFIGURATION

**~/.openhack/**
> Workspace holding settings.json, credentials.json (saved API keys, owner-only permissions), dashboard logs, and per-project scan reports and triage state.

**OPENHACK_HOME**
> Alternative workspace directory (same as **--home**).

**.openhackignore**
> Paths to exclude from scanning, in addition to **.gitignore**.

# CAVEATS

Scanning is not offline: source excerpts are sent to a remote AI provider, so add sensitive paths to **.openhackignore** first. Findings are AI source reviews, not proven runtime exploits, and a **Partial** scan does not mean the code is clean. Standalone builds target macOS and glibc-based Linux (no musl/Alpine). There is no automatic updater. Licensed AGPL-3.0-only; v2.0.0 and earlier revisions were MIT.

# HISTORY

Earlier releases used a terminal TUI with an OpenHack-hosted inference API and account login. **v2.0.0** replaced this with a local browser dashboard, a new scanning harness and bring-your-own provider support. Written in TypeScript and shipped as a single executable bundling the Bun runtime.

# SEE ALSO

[semgrep](/man/semgrep)(1), [trivy](/man/trivy)(1), [grype](/man/grype)(1)

# RESOURCES

```[Source code](https://github.com/openhackai/OpenHack)```

```[Homepage](https://openhack.com)```

<!-- verified: 2026-11-23 -->
