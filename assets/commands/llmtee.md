# TAGLINE

Proxy OpenAI and Anthropic calls and log tokens, cost, and latency

# TLDR

Run the proxy and set an **admin password**

```LLMTEE_ADMIN_PASSWORD=[change-me] llmtee```

**Create** a client key with daily and monthly budgets

```llmtee keys create [hermes-agent] --budget-day 5 --budget-month 60```

**List** keys

```llmtee keys list```

**Label** a provider key that clients already send

```llmtee keys label```

**Export** logged requests as CSV

```llmtee export --range 30d```

# SYNOPSIS

**llmtee** [_COMMAND_] [_OPTIONS_]

# DESCRIPTION

**llmtee** is a single Go binary that proxies the OpenAI and Anthropic APIs, and OpenAI-compatible upstreams such as OpenRouter, Ollama, vLLM, and Groq. The client keeps its normal SDK. Only the base URL changes. The response is passed through unchanged, and a copy is logged with tokens, cost, latency, and time to first token.

With no subcommand it serves the proxy and the web UI. Default listen port is 8080.

Client base URLs:

- **http://host:8080/openai/v1** forwards to the OpenAI API
- **http://host:8080/anthropic** forwards to the Anthropic API
- **http://host:8080/openrouter/v1** forwards to OpenRouter
- **http://host:8080/u/NAME/v1** forwards to an upstream named with this variable, for example a local Ollama:

```LLMTEE_UPSTREAM_OLLAMA```

Chat completions, responses, embeddings, and Anthropic messages are logged, streamed or not. Other paths are forwarded and not logged.

Two kinds of keys exist. A provider key is forwarded as the client sent it. llmtee stores only a SHA-256 hash, with an id that starts with **pt-**. A llmtee key (prefix **llmtee-**) is what the client sends. The proxy swaps in the real provider key. Create one with **keys create**. **keys label** attaches a name and a budget to a provider key the client still sends itself.

A key at its budget receives HTTP 429 and the request is not forwarded. The request that crosses the limit is allowed to finish, so a key can overshoot by that one call. Limits reset at the next UTC day or month.

Other commands and endpoints:

- **llmtee export --range 30d** writes CSV
- the UI is **/**
- Prometheus metrics are **/metrics** (bearer token is the admin password)
- **/healthz** returns 200 while the proxy runs
- **/mcp** is an MCP endpoint with the same bearer token

# CONFIGURATION

Settings come from the environment or a YAML file. Common variables, written here so the underscores are literal:

```DATABASE_URL```

Default **sqlite://llmtee.db**. Also accepts a **postgres://** URL.

```LLMTEE_ADMIN_PASSWORD```

UI login, and the bearer token for **/metrics** and **/mcp**. If unset, a random password is printed at startup.

```LLMTEE_PUBLIC_URL```

Base URL shown in the setup instructions.

```LLMTEE_LOG_BODIES```

Store request and response bodies. Default is on.

```LLMTEE_ALERT_WEBHOOK_URL```

POST JSON when a budget threshold is crossed.

```LLMTEE_REQUIRE_PROXY_KEY```

When **true**, reject requests that do not carry a valid llmtee key.

```LLMTEE_INJECT_STREAM_USAGE```

When not **false**, OpenAI chat streams gain a usage chunk if the client did not ask for one.

# CAVEATS

The current release is 0.x, so settings may change between minor versions. If llmtee is down, clients that point at it cannot reach the provider.

Body logging is on by default with 30-day retention. Prompts can contain private data. Set the body-logging variable above to **false**, or omit bodies per request, when that is not acceptable.

llmtee does not estimate tokens. A response with no usage is marked unknown. It is not a routing gateway: no fallbacks, caching, or multi-tenancy. Native Gemini, Azure OpenAI, and Bedrock APIs are not supported. Their OpenAI-compatible endpoints are.

The process should be reachable only by clients you trust. The admin password unlocks the UI, metrics, and MCP tools.

# SEE ALSO

[curl](/man/curl)(1), [sqlite3](/man/sqlite3)(1)

# RESOURCES

```[Source code](https://github.com/garritfra/llmtee)```

```[Documentation](https://github.com/garritfra/llmtee/blob/main/docs/configuration.md)```

<!-- verified: 2026-11-17 -->
