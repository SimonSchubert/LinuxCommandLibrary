# TAGLINE

Local-first AI memory layer with a knowledge graph and CLI

# TLDR

**Store** a memory chunk for later retrieval

```mnemo ingest "I prefer Neovim with dark mode"```

**Search** for relevant context to inject into a prompt

```mnemo search "what editor do I use?"```

**List** extracted entities

```mnemo entities```

**Show** one entity and its graph neighbors

```mnemo entity <uuid> --neighbors```

**Check** server and database health

```mnemo health```

**Wipe** all stored memory (with confirmation)

```mnemo wipe --yes```

# SYNOPSIS

**mnemo** _subcommand_ [_arguments_] [_options_]

# DESCRIPTION

**mnemo** is the command-line client for a local AI memory service. It talks to **mnemo-api** (default `http://localhost:8080`), which ingests text, uses an OpenAI-compatible LLM to extract entities and relationships, stores them in SQLite, and maintains an in-memory **petgraph** knowledge graph for multi-hop retrieval.

Typical workflow: run **mnemo-api** (or `docker compose up` from the project), ingest conversations or notes with **mnemo ingest**, then call **mnemo search** to obtain a ranked **context_prompt** string suitable for injection into any LLM application. Backends include **Ollama** (fully local), OpenAI, Anthropic, or any OpenAI-compatible API.

The server exposes REST endpoints (`/ingest`, `/retrieve`, `/entities`, `/chunks`, `/search`, `/stats`, `/wipe`). The CLI is a thin wrapper around those endpoints using blocking HTTP.

# PARAMETERS

**ingest** _text_
> POST text to `/ingest` for entity extraction and graph storage.

**search** _query_
> Retrieve ranked memory context for a natural-language query.

**entities**
> List stored entities (paginated on the server).

**entity** _uuid_ [**--neighbors**]
> Show one entity; optional graph neighbor traversal.

**chunks**
> List raw memory chunks.

**health**
> Report API, database, and LLM connectivity.

**stats**
> Print entity, chunk, and graph counts plus uptime.

**wipe** [**--yes**]
> Delete all memory; skips the confirmation prompt when **--yes** is set.

**--server** _url_
> Use a non-default API base URL (default `http://localhost:8080`).

# CONFIGURATION

The API reads environment variables (or `mnemo.example.toml` via **--config**):

| Variable | Default | Purpose |
|----------|---------|---------|
| **MNEMO_DB_PATH** | `mnemo.db` | SQLite database file |
| **MNEMO_PORT** | `8080` | API listen port |
| **MNEMO_LLM_BASE_URL** | `http://localhost:11434/v1` | OpenAI-compatible LLM endpoint |
| **MNEMO_LLM_MODEL** | `llama3` | Model for extraction |
| **MNEMO_LLM_API_KEY** | `ollama` | API key (any value works for Ollama) |
| **MNEMO_LLM_PROVIDER** | `ollama` | `ollama`, `openai`, `anthropic`, or `custom` |

Environment variables override TOML values.

# CAVEATS

**mnemo** requires **mnemo-api** to be running. Entity extraction quality depends on the configured LLM. **mnemo wipe** is irreversible. Install the CLI with `cargo install --path crates/mnemo-cli` from the upstream repository.

# SEE ALSO

[ollama](/man/ollama)(1), [curl](/man/curl)(1), [docker](/man/docker)(1)