# TAGLINE

Context window profiler for LLM agents

# TLDR

**Start** the proxy and dashboard

```contextspy start```

**Run** an agent through the proxy

```contextspy run [claude] [path]```

**Install** the proxy's HTTPS certificate

```contextspy install-cert```

**Reset** the local request database

```contextspy reset-db```

# SYNOPSIS

**contextspy** _command_ [_options_]

# DESCRIPTION

**contextspy** is a context profiler for large language model (LLM) agents. It sits between an agent and the model provider as an HTTPS forward proxy (or a reverse proxy for locally hosted models), intercepts each request, and breaks the prompt down into categories so you can see what is consuming the context window.

Tokens are attributed to eight buckets: system prompt, tool definitions, tool results, file contents, conversation history, the user message, assistant prefill, and an uncategorized remainder. A live dashboard charts this composition per request and lets you group requests into sessions to compare tasks over time. It can detect popular agents such as Copilot, Claude Desktop, Claude Code, opencode, and Cursor.

All data is stored locally in SQLite and nothing is sent to the cloud, which makes contextspy useful for understanding and reducing token usage and cost during agent development.

# PARAMETERS

**start**

> Start the proxy and the web dashboard (served by default at http://127.0.0.1:5173).

**run** _agent_ [_path_]

> Launch a detected agent routed through the proxy.

**install-cert**

> Install the proxy's root certificate so HTTPS traffic can be inspected.

**reset-db**

> Clear the local SQLite database of captured requests.

# CAVEATS

Inspecting HTTPS traffic requires installing the proxy's certificate, which means trusting a man-in-the-middle on the intercepted connections; use it only on machines you control. contextspy is a young, third-party tool and not affiliated with any model provider.

# SEE ALSO

[mitmproxy](/man/mitmproxy)(1), [claude](/man/claude)(1), [ollama](/man/ollama)(1)

# RESOURCES

```[Source code](https://github.com/RimantasZ/contextspy)```

<!-- verified: 2026-06-16 -->
