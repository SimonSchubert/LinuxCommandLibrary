# TAGLINE

Read-only inventory of AI agents, MCP servers, and plugins on a machine

# TLDR

**Scan** the current machine and print a terminal report

```npx geiger-scan```

Write a **self-contained HTML** report with remediation notes

```npx geiger-scan --html [report.html]```

Write **machine-readable JSON** findings

```npx geiger-scan --json [out.json]```

Also scan extra **project directories** for local agent and MCP configs

```npx geiger-scan --path [path/to/repo1] --path [path/to/repo2]```

Scan a **different home directory** (another user or a mounted image)

```npx geiger-scan --home [path/to/home]```

**Fail** if anything can execute code or holds secrets

```npx geiger-scan --strict```

Compare against an earlier JSON **baseline** (drift alarm)

```npx geiger-scan --strict --diff [baseline.json]```

Print **usage**

```npx geiger-scan --help```

# SYNOPSIS

**npx geiger-scan** [_--html file_] [_--json file_] [_--path dir_] [_--home dir_] [_--strict_] [_--diff file_]

# PARAMETERS

**--html** _file_
> Write a self-contained HTML report with per-finding "what to do" remediation.

**--json** _file_
> Write machine-readable findings (schemaVersion 1). This is the only write the tool performs, and only when you name a file.

**--path** _dir_
> Also scan this project directory for project-level agent and MCP configs. Repeatable.

**--home** _dir_
> Scan a different home root (another user profile or a mounted image). Sets **GEIGER_HOME**.

**--strict**
> Exit 2 if any finding can execute code or holds secrets. Combined with **--diff**, exit 2 only when **new** hot findings appeared or escalated.

**--diff** _file_
> Compare the current scan against an earlier **--json** snapshot. Reports what appeared, disappeared, or escalated.

**-h**, **--help**
> Print usage.

# DESCRIPTION

**geiger-scan** (npm package **geiger-scan**, binary **geiger**) is a read-only scanner that inventories AI agents, harnesses, MCP servers, plugins, editor extensions, and related CLIs on a machine, then reports in plain language what each one can touch.

It reads known config locations and directories. It does not execute the tools it finds, does not send telemetry, and writes nothing unless you pass **--json** or **--html** with an explicit path. Credential-shaped values are reported by key name, file, and secret kind — never by value. A redaction pass runs on all output.

Findings are grouped by ecosystem. Each finding includes origin (registry, store, git, local script, remote server, or **UNKNOWN-ORIGIN**), exposure labels (**EXECUTES**, **HOLDS-SECRETS**, **BROAD-FILESYSTEM**, **BROAD-WEB**, **NETWORK**), and an evidence path. Policy wrappers that sit in front of MCP servers are reported as both layers.

Typical zero-install run is **npx geiger-scan**. After **npm install -g geiger-scan**, the same CLI is on **PATH** as **geiger**. Set **NO_COLOR=1** to disable color. Requires Node.js 18 or newer. Zero runtime dependencies.

# DETECTORS

**Claude Code**
> Global and per-project MCP servers, hooks, plugins, skills, subagents, and **apiKeyHelper**.

**MCP hosts**
> Claude Desktop, Cursor, Windsurf, VS Code (user and project), Cline, Roo Code, Continue, and Zed.

**Other agents**
> Codex CLI, Gemini CLI, Kilo CLI, Grok Build, Aider, OpenCode, Qwen Code, DeepSeek Harness, GitHub Copilot CLI, Goose, JetBrains Junie, Open Interpreter, LM Studio, and Ollama.

**Editor and browser extensions**
> AI extensions in VS Code / Insiders / Cursor, JetBrains AI Assistant / MCP settings presence, global npm agent packages (npm is never executed), and AI extensions in Chrome / Edge / Brave / Firefox profiles with granted permissions.

# CAVEATS

Reads **known config locations** only. Agents in nonstandard paths, other user accounts, containers, or WSL (from the Windows side) are not seen. It reads configuration, not runtime behavior, and cannot tell whether a package is malicious — only where it came from and what it can reach. Partially parseable formats (TOML) are scanned by shape with reduced confidence. The ecosystem changes quickly; detectors are data-driven and will lag new tools.

# HISTORY

**geiger** is a dependency-free Node.js scanner published on npm as **geiger-scan** by **Atomburst**. Releases are published from GitHub Actions with npm provenance.

# SEE ALSO

[npx](/man/npx)(1), [npm](/man/npm)(1), [claude](/man/claude)(1), [aider](/man/aider)(1), [copilot](/man/copilot)(1), [opencode](/man/opencode)(1)

# RESOURCES

```[Source code](https://github.com/Atomburstofficial/geiger)```

```[Homepage](https://atomburst.io/geiger)```

<!-- verified: 2026-09-09 -->
