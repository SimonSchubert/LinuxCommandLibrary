# TAGLINE

Persistent cognitive backend that learns your judgment

# TLDR

**Initialize Patina** and its local store

```patina init```

**Show items needing action**, new content and pending items

```patina catch-up```

**Start an interactive conversation** in the learned voice

```patina chat```

**Run a background daemon** that ingests and decays on an interval

```patina heartbeat start --interval [30]```

**Start the HTTP server** for gateway integration

```patina serve --port [8321]```

# SYNOPSIS

**patina** _command_ [_options_]

# DESCRIPTION

**patina** is a local-first **AI backend** that builds a model of the user over time: a SQLite **belief graph** with context retention and graduated autonomy that needs less instruction the more it is used. It ingests messages (for example from Slack exports), extracts beliefs, tracks priorities and can draft messages in a learned communication style.

It is organized in three tiers feeding the belief graph: deterministic logic for scoring, decay and queries (Tier 1, usable with no model at all); a local model such as Qwen through **Ollama** for extraction and classification (Tier 2); and a frontier model such as Claude for synthesis and drafting (Tier 3). All data is kept locally under **~/.patina**. patina can also run as an MCP server for hosts such as Claude Code.

# COMMANDS

**init**
> Initialize Patina and its local store.

**ingest** [**--from-export** _file_]
> Import data from Slack exports or configured adapters.

**catch-up**
> Show a unified view of items needing action, new content and pending items.

**priorities**
> List items ranked by priority quadrant (Q1-Q4).

**draft** [**--to** _name_] [**--context** _text_]
> Generate a message in the learned voice.

**extract**
> Extract beliefs from observations using an LLM.

**beliefs** [**--type** _entity_type_]
> List tracked entities with confidence counts.

**autonomy status**
> Show the current autonomy level and accuracy metrics.

**autonomy set-level** _N_
> Manually set the autonomy level (0 to 6).

**heartbeat start** [**--interval** _minutes_]
> Start a background daemon that runs ingest, decay and escalation cycles.

**chat**
> Start an interactive conversation (via the Claude Agent SDK).

**serve** [**--port** _port_]
> Start an HTTP server for gateway integration.

# CONFIGURATION

State is stored locally in **~/.patina/store.db** (the SQLite belief graph) and **~/.patina/config.yaml**. Tier 2 uses a local model through Ollama; Tier 3 uses a frontier model, configured through the config file and environment.

# CAVEAT

Tier 1 works with no model, but belief extraction and drafting (Tiers 2 and 3) need a local and/or frontier LLM configured. patina is early-stage software that manages personal data, so review what an adapter ingests before connecting it.

# HISTORY

**patina** is an open-source project written in **Python** by **Sanctum Origo Systems** and installed with **uv tool install patina**. It is distributed under the **Apache-2.0** license.

# SEE ALSO

[claude](/man/claude)(1), [ollama](/man/ollama)(1), [uv](/man/uv)(1)
