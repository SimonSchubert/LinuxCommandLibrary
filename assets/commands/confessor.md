# TAGLINE

local forensic report of what an AI coding agent accessed

# TLDR

**Scan** local Claude Code session logs and open an HTML report

```npx confessor```

Scan a **chat export** zip or directory

```npx confessor [~/Downloads/chatgpt-export.zip]
npx confessor [~/Downloads/claude-export.zip]```

Write report to a **path** and skip opening the browser

```npx confessor --out [report.html] --no-open```

Emit **JSON** and fail CI on high-severity findings

```npx confessor --json --fail-on [high]```

# SYNOPSIS

**confessor** [_options_] [_export-path_]

# DESCRIPTION

**confessor** reconstructs what an AI coding agent did from logs already on disk—primarily Claude Code session JSONL under **~/.claude/projects**—and builds an offline HTML report. It lists files read or written, secrets that entered tool results, network or MCP sinks, and **exposure paths**: sensitive reads followed by outbound activity in the same session.

The same engine can scan ChatGPT, Claude.ai, and Gemini Takeout exports for pasted secrets and sensitive topics. Detection uses rule patterns (no ML). Secrets are redacted before storage. The tool makes **zero network calls** itself and has **zero runtime dependencies** beyond Node.

# PARAMETERS

**--out** _file_
> Report output path (default HTML name)

**--no-open**
> Do not open the report in a browser

**--json**
> Machine-readable output

**--quiet**
> Reduce logging

**--fail-on** _critical_|_high_|_medium_
> Exit non-zero if findings meet or exceed severity (for CI)

# CAVEATS

Exposure paths are investigative leads, not proof of theft. Agent reconstruction currently targets Claude Code log format; other agents may not be fully supported. Retrospective only—does not intercept live sessions.

# SEE ALSO

[claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/ninjahawk/Confessor)```

```[Homepage](https://ninjahawk.github.io/Confessor/)```

<!-- verified: 2026-07-14 -->
