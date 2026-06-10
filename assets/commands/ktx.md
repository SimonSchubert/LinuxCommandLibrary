# TAGLINE

Context layer CLI for data and analytics agents

# TLDR

**Initialize or resume a local ktx project**

```ktx setup```

**Check project readiness**

```ktx status```

**Build context from configured sources**

```ktx ingest```

**Search semantic-layer metrics**

```ktx sl "revenue"```

**Search local wiki pages**

```ktx wiki "refund policy"```

**Start the MCP server for agent clients**

```ktx mcp start```

# SYNOPSIS

**ktx** _subcommand_ [_options_]

# DESCRIPTION

**ktx** is the command-line interface for the ktx context layer, a local tool that teaches AI agents how to query a data warehouse accurately. It ingests warehouse metadata, dbt or MetricFlow definitions, BI tool exports, and wiki content, then exposes approved metrics, join paths, and business knowledge through CLI and MCP tools.

**ktx setup** creates or resumes a project directory containing **ktx.yaml**, a **semantic-layer/** tree, **wiki/** pages, and a git-ignored **.ktx/** state directory. **ktx ingest** rebuilds context from every configured connection. **ktx sl** and **ktx wiki** search the semantic layer and wiki respectively. **ktx mcp start** launches the MCP daemon that agent clients (Claude Code, Codex, Cursor, OpenCode) call at query time.

Connections are read-only; ktx never writes to the warehouse. Supported databases include PostgreSQL, Snowflake, BigQuery, ClickHouse, MySQL, SQL Server, and SQLite. LLM backends include Anthropic API, Google Vertex AI, AI Gateway, Claude Code session, and local Codex authentication.

Install globally with **npm install -g @kaelio/ktx**. Project resolution defaults to **KTX_PROJECT_DIR**, then the nearest **ktx.yaml**, then the current directory.

# PARAMETERS

**--project-dir** _path_
> Override project directory for scripting.

**ktx sl** _query_
> Full-text and semantic search over semantic-layer entities.

**ktx wiki** _query_
> Search local wiki pages.

**ktx mcp start**
> Start the local MCP server; use the path printed by **ktx status** if needed.

# CONFIGURATION

Project layout after setup:

```
my-project/
├── ktx.yaml
├── semantic-layer/<connection-id>/
├── wiki/global/
├── wiki/user/<user-id>/
├── raw-sources/<connection-id>/
└── .ktx/          # local state and secrets (git-ignored)
```

Commit **ktx.yaml**, **semantic-layer/**, and **wiki/**; keep **.ktx/** local. See the official docs for LLM provider and connector configuration.

# CAVEATS

Requires a SQL warehouse; ktx sits on top of one rather than replacing it. Remote LLM calls send prompts built locally, not raw warehouse rows. The MCP daemon must be running before opening an agent client when **ktx status** indicates it is required.

# HISTORY

**ktx** is built and maintained by Kaelio (Y Combinator P25). It combines automatic warehouse introspection, semantic-layer ingestion, and wiki reconciliation into a single agent-facing context layer.

# SEE ALSO

[dbt](/man/dbt)(1), [codex](/man/codex)(1)

# RESOURCES

```[Source code](https://github.com/Kaelio/ktx)```

```[Homepage](https://docs.kaelio.com/ktx)```

```[Documentation](https://docs.kaelio.com/ktx/docs/)```

<!-- verified: 2026-06-11 -->