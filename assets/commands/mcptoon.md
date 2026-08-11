# TAGLINE

Token-efficient Model Context Protocol (MCP) CLI client

# TLDR

**Create** a sample config at **~/.mcptoon/config.json**

```mcptoon init```

**Add** an MCP server over stdio

```mcptoon add [fetch] --stdio npx -y [@modelcontextprotocol/server-fetch]```

**List tools** in compact TOON form

```mcptoon manifest --toon```

**Call a tool** with JSON arguments

```mcptoon call [fetch] [fetch] '{"url":"https://example.com"}' --toon```

**Pipe large arguments** via stdin

```echo '{"content":"..."}' | mcptoon call [server] [tool] --stdin --toon```

**Diagnose** Python, config, and server connectivity

```mcptoon doctor```

**Export** the tool manifest for OpenAI function calling

```mcptoon manifest --format openai > [functions.json]```

# SYNOPSIS

**mcptoon** [_output-flags_] _command_ [_args_]

# DESCRIPTION

**mcptoon** is a zero-dependency Python CLI that connects to MCP servers (stdio or HTTP) and returns tool lists and results in **TOON** (Token-Optimized Object Notation) or other compact formats instead of verbose JSON. Agents that shell out to **mcptoon** can discover and invoke tools with far fewer context tokens than raw MCP JSON envelopes.

Configure servers once with **mcptoon add** (stored in **~/.mcptoon/config.json**, optional project override **./.mcptoon.json**). **manifest** lists tools; **call** invokes them; **discover** and **doctor** check health. Dangerous-looking operations are blocked unless **--destructive** is passed. Optional tool-poisoning heuristics refuse results that look like prompt injection.

Global output flags select **--toon**, **--json**, **--compact**, **--raw**, truncation (**--head**, **--max-chars**), and export formats (**--format** openai|openapi|mcp). Setting **MCPTOON_AGENT_TYPE=claude** prefers TOON by default.

# PARAMETERS

**init**

> Write a sample config under **~/.mcptoon/**.

**add** _name_ **--stdio** _cmd_ [_args_...] | **--http** _url_ [**--header** _H_]

> Register an MCP server.

**remove** _name_

> Drop a configured server.

**list**

> Show configured servers and transports.

**manifest** [**--full**] [**--format** _fmt_]

> List tools (compact names, full schemas, or export formats). Alias **tools**.

**inspect** _server_ _tool_

> Show one tool's schema.

**call** _server_ _tool_ [_json-args_] [**--stdin**] [**--destructive**]

> Invoke a tool. Use **--stdin** for large JSON payloads.

**discover**

> Health-check configured servers.

**doctor**

> Self-diagnose runtime, config, and connectivity.

**usage**

> Local call statistics under **~/.cache/mcptoon/**.

**completion** _bash|zsh|fish|ps_

> Print shell completion script.

**--toon**, **--json**, **--compact**, **--raw**

> Output rendering mode.

**--format** _openai|openapi|mcp|json|human_

> Manifest export style.

**--head** _N_, **--max-chars** _N_, **--full**

> Truncate or disable the default size cap.

# CONFIGURATION

**~/.mcptoon/config.json**

> User-level server list (stdio commands or HTTP endpoints).

**./.mcptoon.json**

> Optional project-level override.

**MCPTOON_AGENT_TYPE**

> When set to **claude**, defaults output toward TOON.

# INSTALLATION

**pip** (Python 3.10+):

```
pip install mcptoon
```

Editable/dev install from the repository:

```
pip install -e . --no-build-isolation
```

# CAVEATS

Servers must be running or launchable (for example via **npx**). TOON is a compact interchange format for agents; some tools still need **--json** for scripts. Safety blocks and poisoning detection can false-positive; **--destructive** is required for blocked write/delete-style tools. Pure Python 3.10+ with no third-party deps; install via **pip install mcptoon**.

# HISTORY

**mcptoon** is a 2025–2026 Apache-2.0 project by **activeing123**, aimed at cutting MCP tool-discovery and result overhead for multi-agent shell workflows. v0.2.x added **--stdin**, **doctor**, fuzzy "did you mean", poisoning guard, and cross-agent manifest export.

# SEE ALSO

[mcp-probe](/man/mcp-probe)(1), [claude](/man/claude)(1), [codex](/man/codex)(1)

# RESOURCES

```[Source code](https://github.com/activeing123/mcptoon)```

```[Homepage](https://pypi.org/project/mcptoon/)```

<!-- verified: 2026-08-11 -->
