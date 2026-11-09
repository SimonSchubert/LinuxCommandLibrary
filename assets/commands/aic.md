# TAGLINE

Fetch changelogs for AI coding assistants

# TLDR

**Show the latest Claude Code changelog**

```aic claude```

**List all available versions** for a tool

```aic codex --list```

**Show a specific version** changelog

```aic gemini --version [0.1.0]```

**Output changelog in JSON format**

```aic claude --json```

**Show all releases from the last 24 hours**

```aic latest```

**Show status overview** of all tracked tools

```aic status```

**Choose which tools to show** interactively

```aic config```

**List all available sources**

```aic list-sources```

# SYNOPSIS

**aic** _source_ [_options_]

**aic** **latest** | **status** [**-j**] [**-w**]

**aic** **config** | **list-sources**

# PARAMETERS

_source_
> Tool to show: **claude**, **codex**, **opencode**, **gemini**, **copilot**, **openclaw**, **kimi**, **qwen** or **goose**

**-j**, **--json**
> Output in JSON format

**-m**, **--md**
> Output in Markdown format

**-l**, **--list**
> List all available versions

**-p**, **--pick**
> Interactive version selector

**--version** _ver_
> After a source: fetch a specific version. Without a source: show the aic version

**-w**, **--web**
> Open changelog in browser

**-v**, **--version**
> Show the aic version

**-h**, **--help**
> Show help documentation

# DESCRIPTION

**aic** is a CLI tool that fetches and displays release notes and changelogs for popular AI coding assistants. It aggregates changelog information from multiple sources into a single unified interface, supporting tools like Claude Code, Codex CLI, OpenCode, Gemini CLI, Copilot CLI, OpenClaw, Kimi CLI, Qwen Code, and Goose.

Written in Go, aic supports multiple output formats (text, JSON, Markdown), interactive version selection, browser integration, installed version detection, and a comprehensive status dashboard showing release frequency across all tracked tools.

# CAVEATS

Requires internet access to fetch changelogs from upstream sources. Available tools and their changelog formats depend on what each project publishes.

# SEE ALSO

[gh](/man/gh)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1)

# RESOURCES

```[Source code](https://github.com/reyamira/aic)```

<!-- verified: 2026-11-09 -->
