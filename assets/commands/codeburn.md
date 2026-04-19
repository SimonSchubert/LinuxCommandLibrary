# TAGLINE

Cost and token observability dashboard for AI coding assistants

# TLDR

**Launch the interactive dashboard** for the last 7 days

```codeburn```

**Show today's usage** at a glance

```codeburn today```

**Show this month's usage**

```codeburn month```

**Generate a rolling 30-day report**

```codeburn report -p 30days```

**Filter to a single provider** (claude, codex, cursor, copilot, …)

```codeburn report --provider [claude]```

**Export raw data** as JSON

```codeburn export --format [json] --from [2026-01-01] --to [2026-01-31]```

**Find waste patterns** and copy-paste fixes

```codeburn optimize```

**Run without installing** via npx

```npx codeburn today```

# SYNOPSIS

**codeburn** [_command_] [_options_]

# COMMANDS

**(default)**
> Launch the interactive TUI dashboard (last 7 days).

**today**
> Show today's token/cost/activity metrics.

**month**
> Show the current month's metrics.

**report**
> Detailed text report; accepts **-p** for period selection.

**status**
> One-line summary combining today and this month.

**export**
> Export data as CSV or JSON across one or more periods.

**optimize**
> Scan sessions for 11 known waste patterns and print fix suggestions.

**compare**
> Side-by-side performance/cost comparison across models.

**currency** [_CODE_]
> Set, show, or reset the display currency (ISO 4217).

**menubar**
> Install the native macOS menubar companion app.

# PARAMETERS

**--provider** _NAME_
> Filter by provider: _claude_, _codex_, _cursor_, _opencode_, _pi_, _copilot_.

**--project** _NAME_
> Include a project by substring match (repeatable).

**--exclude** _NAME_
> Exclude a project (repeatable).

**--format** _TYPE_
> Output format for non-interactive commands: _table_ or _json_.

**--from** _YYYY-MM-DD_
> Start date for a custom window.

**--to** _YYYY-MM-DD_
> End date for a custom window.

**--refresh** _SECONDS_
> Auto-refresh interval in the dashboard (default 30, use 0 to disable).

**-p** _PERIOD_
> Period for **report**/**optimize**: _today_, _week_, _30days_, _all_.

# DASHBOARD KEYS

**1–5**
> Switch between Today / 7 Days / 30 Days / Month / All Time.

**c**
> Open the model comparison view.

**p**
> Cycle through providers.

**o**
> Jump to the optimize findings.

**b**
> Back out of compare/optimize.

**q**
> Quit.

# DESCRIPTION

**codeburn** is a local analytics tool that reads the session files your AI coding assistant already writes to disk — **Claude Code**, **Codex**, **Cursor**, **OpenCode**, **Pi**, and **GitHub Copilot** — and turns them into cost, token, and activity breakdowns. Nothing is uploaded: pricing is taken from **LiteLLM**, exchange rates from **Frankfurter**, and all analysis happens against the files in _~/.claude/_, _~/.cursor/_, and friends.

Beyond raw numbers, **codeburn optimize** inspects your agent configuration for eleven common waste patterns (over-permissive hooks, unused MCP servers, duplicated system prompts, etc.) and prints copy-paste-ready fixes. The **menubar** subcommand installs a small native app on macOS that keeps the current day's spend visible at all times.

# CONFIGURATION

- **Currency** — stored globally and used for every output, e.g. _codeburn currency GBP_, _codeburn currency --reset_.
- **Provider detection** — automatic from on-disk session directories; override with **--provider** where needed.

# CAVEATS

Requires **Node.js 20+** and that you have actually used one of the supported tools locally, because the dashboard parses on-disk session data only. Cost figures depend on the LiteLLM pricing catalogue and may lag newly released models.

# HISTORY

**codeburn** was created by **AgentSeal** and released under the MIT license, inspired by the earlier **ccusage** tool. Pricing data is sourced from LiteLLM; exchange rates from Frankfurter.

# SEE ALSO

[ccusage](/man/ccusage)(1), [claude](/man/claude)(1), [codex](/man/codex)(1)
