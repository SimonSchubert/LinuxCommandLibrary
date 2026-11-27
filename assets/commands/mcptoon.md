# TAGLINE

Token-efficient Model Context Protocol (MCP) CLI client

# TLDR

**Set up** in one command (discover + configure + show tools)

```mcptoon quickstart```

**Create** a sample config at **~/.mcptoon/config.json**

```mcptoon init```

**Add** an MCP server over stdio

```mcptoon add [everything] --stdio npx -y [@modelcontextprotocol/server-everything]```

**List tools** in compact TOON form

```mcptoon manifest --toon```

**Call a tool** with JSON arguments

```mcptoon call [everything] [echo] '{"message":"hi"}' --toon```

**Pipe large arguments** via stdin

```echo '{"content":"..."}' | mcptoon call [server] [tool] --stdin --toon```

**Diagnose** Python, config, and server connectivity

```mcptoon doctor```

**Check** that every configured server answers

```mcptoon health```

**Export** the tool manifest for OpenAI function calling

```mcptoon manifest --format openai > [functions.json]```

# SYNOPSIS

**mcptoon** [_output-flags_] _command_ [_args_]

# DESCRIPTION

**mcptoon** is a zero-dependency Python CLI that connects to MCP servers (stdio or HTTP) and returns tool lists and results in **TOON** (Token-Optimized Object Notation) or other compact formats instead of verbose JSON. Agents that shell out to **mcptoon** can discover and invoke tools with far fewer context tokens than raw MCP JSON envelopes.

Configure servers once with **mcptoon add** (stored in **~/.mcptoon/config.json**, optional project override **./.mcptoon.json**). **manifest** lists tools; **call** invokes them; **discover** finds servers already configured elsewhere on the machine; **health** checks that each one answers; **doctor** self-diagnoses the runtime. Dangerous-looking operations are blocked unless **--destructive** is passed. Optional tool-poisoning heuristics refuse results that look like prompt injection.

Global output flags select **--toon**, **--json**, **--compact**, **--raw**, truncation (**--head**, **--max-chars**), and export formats (**--format** openai|openapi|mcp|json|human). Setting **MCPTOON_AGENT_TYPE=claude** prefers TOON by default.

# PARAMETERS

**quickstart** | **qs**

> One-command onboarding: discover servers, write the config, and show the tool list.

**init** [**--auto**] [**--force**]

> Write a sample config under **~/.mcptoon/**. **--auto** discovers instead of writing the sample.

**add** _name_ **--stdio** _cmd_ [_args_...] | **--http** _url_ [**--header** _H_] [**--force**]

> Register an MCP server. Everything after **--stdio** belongs to the child command.

**remove** _name_

> Drop a configured server.

**list** | **servers**

> Show configured servers and transports.

**manifest** [**--full**] [**--format** _fmt_] [**--sort** _default|alpha|usage|recent_] [**--top** _N_] | **tools**

> List tools (compact names, full schemas, or export formats).

**inspect** _server_ _tool_

> Show one tool's schema.

**search** _query_

> Search tool names and descriptions across every configured server.

**select** _task_ [**--top** _N_]

> Rank the few tools worth showing an agent for one task.

**call** _server_ _tool_ [_json-args_] [**--stdin**] [**--destructive**] [**--auto**]

> Invoke a tool. Use **--stdin** for large JSON payloads.

**discover** [**--write**] [**--http** _url_] [**--health**]

> Find MCP servers already configured in other clients and probe them. **--write** merges them into the config; **--health** runs the legacy health check.

**health** [**--timeout** _s_] [**--json**]

> Check every configured server and report which answer. Exits 1 if any is unreachable.

**doctor**

> Self-diagnose runtime, config, and connectivity.

**status** | **brief**

> One screen: what is configured, what it saves, and how to undo it.

**usage**

> Local call statistics under **~/.cache/mcptoon/**.

**activity** [**--since** _when_] [**--tool** _name_] [**--failures**] [**--summary**]

> The activity ledger: which tools were called, by which host, and what failed.

**import** [**--from** _client_] [**--file** _path_] [**--write**]

> Bring servers over from Claude Desktop, Cursor, Cline, Windsurf or VS Code.

**sync** [**--agent** _name_] [**--dry**] [**--self**] [**--takeover**]

> Write the gateway entry into the AI agent configs on this machine.

**install** [**--search** _query_] [**--npm**|**--pip**|**--url**] [**--list**] [**--dry**]

> Install, list or remove MCP servers with automatic config registration.

**serve** [**--listen** _addr_] [**--http**] [**--auth**] [**--background**] [**--status**] [**--stop**]

> Run mcptoon itself as an MCP server, so a host can reach every configured server through one entry. **--listen** sets an HTTP address; the default is stdio.

**exec** _lang_ _code_ | **--file** _path_ | **--langs**

> Run code so only its stdout reaches the context.

**completion** _bash|zsh|fish|ps_ [**--install**] [**--uninstall**] [**--dry**]

> Print a shell completion script, or wire it into the shell's rc file.

**--toon**, **--json**, **--compact**, **--raw**

> Output rendering mode. **--raw** is the unparsed response body, which matters for **call** results; commands that print their own report ignore it.

**--format** _openai|openapi|mcp|json|human_

> Manifest export style. Any other value is an error, not a silent fallback.

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

**mcptoon** is a 2025–2026 Apache-2.0 project by **activeing123**, aimed at cutting MCP tool-discovery and result overhead for multi-agent shell workflows. v0.2.x added **--stdin**, **doctor**, fuzzy "did you mean", poisoning guard, and cross-agent manifest export. Later releases grew the surface well past the handful of verbs this page covers: **0.8.x** added **skills**, **serve**, **plugin**, **activity** and **statusline**, and the per-command option table that makes a flag belonging to another command an error instead of a silent no-op.

# SEE ALSO

[mcp-probe](/man/mcp-probe)(1), [claude](/man/claude)(1), [codex](/man/codex)(1)

# RESOURCES

```[Source code](https://github.com/activeing123/mcptoon)```

```[Homepage](https://pypi.org/project/mcptoon/)```

<!-- verified: 2026-11-13 -->
