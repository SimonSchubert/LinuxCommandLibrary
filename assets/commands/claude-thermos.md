# TAGLINE

Keep Claude Code prompt cache warm during long subagent waits

# TLDR

**Run Claude Code** through the warmer (interactive)

```uvx claude-thermos```

**Pass a one-off prompt** through to Claude

```uvx claude-thermos -p "[fix the bug]"```

**Tune idle threshold** before warming starts (seconds)

```uvx claude-thermos --idle [270]```

**Change interval** between warm cycles (seconds)

```uvx claude-thermos --interval [270]```

**Cap warm cycles** per idle episode (or use auto for unlimited)

```uvx claude-thermos --max-cycles [4]```

**Disable warming** for one run via environment

```CLAUDE_WARMER_DISABLE=1 uvx claude-thermos```

# SYNOPSIS

**claude-thermos** [**--idle** _SECONDS_] [**--interval** _SECONDS_] [**-n** | **--max-cycles** _N_|**auto**] [**--subagent-window** _SECONDS_] [_claude_args_ ...]

# PARAMETERS

**--idle** _SECONDS_
> Seconds the main agent must be idle before a warming cycle runs. Default: **270**. Environment: **CLAUDE_WARMER_IDLE_THRESHOLD_SEC**.

**--interval** _SECONDS_
> Seconds between warming cycles. Default: **270**. Environment: **CLAUDE_WARMER_WARM_INTERVAL_SEC**.

**-n** _N_|**auto**, **--max-cycles** _N_|**auto**
> Maximum number of warm requests per idle episode, or **auto** for unlimited. Default: **4**. Environment: **CLAUDE_WARMER_WARM_MAX_CYCLES**.

**--subagent-window** _SECONDS_
> How long a subagent still counts as active after its last traffic. Default: **540**. Environment: **CLAUDE_WARMER_SUBAGENT_ACTIVE_WINDOW_SEC**.

**-V**, **--version**
> Print version and exit.

**-h**, **--help**
> Show help.

_claude_args_ ...
> Remaining arguments are passed through unchanged to the **claude** CLI.

# DESCRIPTION

**claude-thermos** launches Anthropic's **Claude Code** CLI behind a small local reverse proxy that keeps the main agent's prompt cache alive while subagents run. Claude Code's prompt cache has a roughly **5-minute TTL**. When the main agent waits on a subagent longer than that, the main conversation prefix expires and the next turn re-encodes the full history at the more expensive cache-write rate. Warming sends cheap refresh requests (identical cacheable prefix, **max_tokens: 1**) so resume pays a cache read instead of a full rewrite.

The wrapper points **ANTHROPIC_BASE_URL** at a loopback proxy that observes **/v1/messages** traffic. Lineages (cache prefixes) are keyed by model, tool set, and system text: the first tool-bearing lineage is treated as the main agent; others as subagents. When the main lineage is idle and a subagent is still active, the warmer fires on an interval under the TTL. Warm requests go **directly** to the Anthropic API (not through the proxy) so they do not interfere with real session traffic.

Session telemetry is written under **~/.claude-thermos/logs/**_session_id_**/`events.jsonl`** and **summary.json**, including warm counts and estimated rewrite tokens avoided. Requires **Python 3.11+** and the **claude** binary on **PATH**. Typical invocation is via **uvx** so the package need not be installed permanently.

# CONFIGURATION

**CLAUDE_WARMER_DISABLE**
> Set to **1** to run Claude without warming for that process.

**CLAUDE_WARMER_IDLE_THRESHOLD_SEC**, **CLAUDE_WARMER_WARM_INTERVAL_SEC**, **CLAUDE_WARMER_WARM_MAX_CYCLES**, **CLAUDE_WARMER_SUBAGENT_ACTIVE_WINDOW_SEC**
> Environment overrides for the matching CLI flags.

**~/.claude-thermos/logs/**_session_id_**/
> Per-session **events.jsonl** (request usage and warm decisions) and **summary.json** (rollup savings estimates).

# CAVEATS

Does not replace **claude**; it wraps it. Warming still incurs small cache-read cost and network traffic to Anthropic. Savings estimates in **summary.json** are in base-input-token units, not dollars—multiply by your model's input price. Behavior depends on Claude Code's request shape and Anthropic's cache TTL remaining about five minutes. Requires a working Claude Code install and valid Anthropic authentication.

# HISTORY

Created by **Iaroslav Zeigerman** as a Python package (**claude-thermos** on PyPI) that uses a local reverse proxy (via **mitmproxy**) to refresh Claude Code prompt-cache prefixes during long subagent waits. Released under the MIT license.

# SEE ALSO

[claude](/man/claude)(1), [uvx](/man/uvx)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/izeigerman/claude-thermos)```

<!-- verified: 2026-07-23 -->
