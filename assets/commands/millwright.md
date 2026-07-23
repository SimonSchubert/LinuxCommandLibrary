# TAGLINE

Self-hosted LLM router with policy and spend control

# TLDR

**Initialize** providers, model roles, and API keys

```millwright init```

**Start** the router gateway

```millwright serve```

**Show spend** summary and top teams

```millwright spend```

**Show** model and provider mix

```millwright models```

**Explain** a routing decision by trace id

```millwright trace [trace-id]```

**Live spend** and model activity in the terminal

```millwright top```

**Analyze** cost from a live gateway

```millwright analyze --url [http://127.0.0.1:8080] --key [$MILLWRIGHT_OPERATOR_KEY] --since [30d] --report [analysis.html]```

**Print** version and build metadata

```millwright version```

# SYNOPSIS

**millwright** _command_ [_options_]

# DESCRIPTION

**millwright** is a self-hosted LLM router that sits between AI applications and model providers. It accepts OpenAI Chat Completions and Anthropic Messages, then routes each request to an OpenAI-compatible API, Anthropic, or Amazon Bedrock.

You assign models to **cheap**, **mid**, and **frontier** roles. Millwright picks the lowest estimated-cost healthy route the resolved role allows. With a session ID it keeps independent role-scoped affinity lanes so concurrent cheap/mid/frontier traffic can reuse warm prompt caches without serializing agent work.

It is a router, not an agent orchestrator: it does not spawn agents, schedule work, inspect prompts, or rewrite context. Routing decisions are inspectable via response headers, traces, and an optional usage ledger (SQLite by default; PostgreSQL for production).

Ships as one Rust binary with Docker Compose support. Provider credentials stay in environment variables; separate workload and operator keys control inference and management access.

# PARAMETERS

**init**
> Interactive (or flag-driven) setup for providers, roles, pricing, and keys. Writes policy/models config and env references (not raw provider secrets). Common flags: **--non-interactive**, **--provider**, **--cheap**, **--mid**, **--frontier**, **--cache-ttl**, **--team**, **--force**.

**serve**
> Run the router HTTP gateway (default local URL **http://localhost:8080**).

**spend** [**--url** _url_] [**--key** _key_] [**--json**]
> Total spend, cache read rate, and per-team breakdown from the management API.

**models** [**--url** _url_] [**--key** _key_] [**--json**]
> Model and provider mix from the ledger.

**trace** _trace-id_ [**--url** _url_] [**--key** _key_] [**--json**]
> Explain one routing decision (including rejected alternatives). Trace ids appear in **x-millwright-trace-id**.

**top** [**--url** _url_] [**--key** _key_]
> Live terminal view of spend and model activity.

**analyze** [_options_]
> Analyze live ledger or local JSONL cost data. Produces HTML/Markdown reports and schema-versioned JSON. Key options: **--url**, **--key**, **--input**, **--input-format**, **--since**, **--until**, **--catalog**, **--candidates**, **--report**, **--json-out**.

**healthcheck**
> Probe the local gateway for container health checks.

**version**
> Print version and build metadata (also **--version** / **-v**).

Gateway client defaults: **--url** falls back to **MILLWRIGHT_URL** or **http://localhost:8080**; **--key** falls back to **MILLWRIGHT_OPERATOR_KEY**, then **MILLWRIGHT_API_KEY**.

# CAVEATS

Build from source requires a recent Rust toolchain (project pins **rustc** 1.97+). Provider API keys and operator keys must be configured before useful routing; `millwright init` stores env var *names* for secrets, not the secrets themselves. Cross-protocol translation supports a documented text-and-tools subset and rejects unsupported shapes rather than dropping data silently.

# HISTORY

**Millwright** is an Apache-2.0 open-source project by Northwood Systems. Version **0.1.0** focuses on deterministic role-based routing, cache-aware affinity, and local spend visibility for self-hosted LLM gateways.

# SEE ALSO

[curl](/man/curl)(1), [docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [ollama](/man/ollama)(1), [caddy](/man/caddy)(1)

# RESOURCES

```[Source code](https://github.com/Northwood-Systems/millwright)```

```[Homepage](https://northwoodsystems.ai/research/projects/millwright/docs)```

```[Documentation](https://github.com/Northwood-Systems/millwright/tree/main/docs)```

<!-- verified: 2026-07-23 -->
