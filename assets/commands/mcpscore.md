# TAGLINE

Audit and score Model Context Protocol (MCP) servers

# TLDR

**Audit a remote** MCP server URL

```mcpscore https://[example.com]/mcp```

**Audit a local** Python or Node MCP server (stdio)

```mcpscore [path/to/server.py]```

```mcpscore [path/to/server.js]```

**Audit any language** via an arbitrary stdio command

```mcpscore --stdio ./[my-server]```

```mcpscore --stdio java -jar [server.jar]```

Pass **env vars** to a stdio server (value-less form copies secrets from the environment)

```API_KEY=... mcpscore --env API_KEY --stdio ./[my-server]```

Emit a **JSON report** for CI

```mcpscore https://[example.com]/mcp --json > report.json```

Audit behind **auth** with a bearer token

```mcpscore https://[example.com]/mcp --token [$MY_TOKEN]```

# SYNOPSIS

**mcpscore** [_target_] [**--stdio** _command_ ...] [**--env** _NAME_[=_VALUE_]] [**--json**] [**--token** _TOKEN_] [**--header** '_Name: Value_'] [**--oauth**] [**--client-id** _ID_] [**--callback-port** _PORT_] [**--version**]

# PARAMETERS

**_target_**
> Path to a local MCP server script (**.py**, **.js**) or **http(s)** URL of a remote server. Omit when using **--stdio**.

**--stdio** _COMMAND_ ...
> Launch a local MCP server as an arbitrary stdio process (any language). Consumes the rest of the command line, so put every mcpscore option before it. Replaces the positional target.

**--env** _NAME_[=_VALUE_]
> Extra environment variable for the **--stdio** child. Repeatable. **NAME=VALUE** sets inline; bare **NAME** copies from mcpscore's own environment (prefer that form for secrets). Only valid with **--stdio**.

**--json**
> Write a machine-readable report to stdout (human logs go to stderr).

**--token** _TOKEN_
> Send **Authorization: Bearer** _TOKEN_. Defaults to the **MCPSCORE_TOKEN** environment variable when unset.

**--header** '_Name: Value_'
> Extra HTTP header for remote targets. Repeatable. Values are never logged or written into the report.

**--oauth**
> Obtain a token interactively (authorization code + PKCE in the browser). Requires an HTTP(S) target. Conflicts with an existing Authorization credential.

**--client-id** _ID_
> Pre-registered OAuth client ID for **--oauth** when the authorization server lacks dynamic client registration.

**--callback-port** _PORT_
> Fixed loopback port for the **--oauth** redirect URI (1–65535).

**--version**
> Print the installed mcpscore version and exit.

# DESCRIPTION

**mcpscore** audits any Model Context Protocol (MCP) server and produces a severity-weighted quality score. It connects with a real **initialize** handshake, then grades protocol conformance, tool/prompt/resource catalog quality, security and auth posture, and readiness for the next MCP spec revision. Scoring is deterministic and needs no API key.

Transports: local servers over **stdio** (direct **.py**/**.js** paths or **--stdio** for other languages), remote servers over Streamable HTTP or SSE (auto-detected). Auth-gated HTTP servers can be scored partially without credentials (TLS, challenges, protected-resource metadata) or fully with **--token**, **--header**, **MCPSCORE_TOKEN**, or **--oauth**.

Exit codes (CLI contract): **0** success, **1** usage errors, **2** connection failure when the target is not a usable MCP endpoint.

# CAVEATS

Requires **Python 3.11+**. Local audits need the server's runtime on **PATH** (Python for **.py**, Node for **.js**, or whatever **--stdio** invokes). Never pass secrets on the command line when using **--stdio** — they appear in process listings and as the report target; use **--env NAME** after exporting the variable. Partial auth-only scores are not comparable to full audits.

# HISTORY

**mcpscore** is developed by **mcp-box** (author Alex Akimov) under the MIT license. It is published on PyPI as **mcpscore** and documented at **docs.mcpscore.dev**, with a hosted audit surface at **mcpscore.dev**.

# SEE ALSO

[mcp-probe](/man/mcp-probe)(1), [mcpsnoop](/man/mcpsnoop)(1), [pip](/man/pip)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/mcp-box/mcpscore)```

```[Homepage](https://mcpscore.dev)```

```[Documentation](https://docs.mcpscore.dev)```

<!-- verified: 2026-08-05 -->
