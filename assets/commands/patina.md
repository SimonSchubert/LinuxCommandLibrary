# TAGLINE

Persistent cognitive backend that learns your judgment

# TLDR

**Initialize Patina** and its local store

```patina init```

**Show items needing action**, new content and pending items

```patina catch-up```

**Import a Slack export** into the belief graph

```patina ingest --from-export [path/to/slack-export.zip]```

**Draft a message** in your learned communication style

```patina draft --to [name] --context "[follow up on the timeline]"```

**List conflicting claims** in the belief graph

```patina contradictions```

**Start an interactive conversation** with the agent

```patina chat```

**Run a background daemon** that ingests and decays on an interval

```patina heartbeat start --interval [30]```

**Start the HTTP server** for gateway integration

```patina serve --port [8321]```

# SYNOPSIS

**patina** _command_ [_options_]

# DESCRIPTION

**patina** is a local-first **AI backend** that builds a model of the user over time: a SQLite **belief graph** with context retention and graduated autonomy that needs less instruction the more it is used. It ingests messages (for example from Slack exports), extracts beliefs, tracks priorities and can draft messages in a learned communication style.

It is organized in three tiers feeding the belief graph: deterministic logic for scoring, decay and queries (Tier 1, usable with no model at all); a local model such as Qwen through **Ollama** for extraction and classification (Tier 2); and a frontier model such as Claude for synthesis and drafting (Tier 3). All data is kept locally under **~/.patina**. patina can also run as an MCP server (**patina-mcp**) that exposes its belief graph as tools to hosts such as Claude Code or Cursor.

# COMMANDS

**init**
> Initialize Patina and its local store.

**ingest** [**--from-export** _file_] [**--dry-run**]
> Import data from Slack exports or fetch from configured adapters.

**connect** **slack**|**email** [_options_]
> Configure a live adapter, e.g. **--token** for Slack or **--host**, **--username**, **--password** for IMAP.

**catch-up**
> Show a unified view of items needing action, new content and pending items.

**priorities**
> List items ranked by priority quadrant (Q1-Q4).

**dismiss** _id_
> Dismiss an item as noise, which trains the model.

**objectives** **add**|**update**|**list**|**remove**
> Manage active objectives used for prioritization.

**style build**, **style show** _name_
> Build communication profiles from sent messages, or show one person's patterns.

**draft** [**--to** _name_] [**--context** _text_]
> Generate a message in the learned voice.

**extract**
> Extract beliefs from observations using an LLM.

**beliefs** [**--type** _entity_type_]
> List tracked entities with claim counts.

**stale**
> Show decayed beliefs below the confidence threshold.

**contradictions**
> Show conflicting claims.

**relationships** [**--top** _N_]
> Show trust level and activity per relationship.

**autonomy status**
> Show the per-domain autonomy level, accuracy and anti-patterns.

**autonomy pending**
> List proposed actions awaiting approval.

**approve** _id_, **reject** _id_
> Approve or reject a proposed action; rejecting freezes advancement and stores an anti-pattern.

**autonomy set-level** _N_
> Manually set the autonomy level (0 to 6).

**heartbeat once**
> Run a single ingest, decay and escalation cycle.

**heartbeat start** [**--interval** _minutes_]
> Start a background daemon that runs ingest, decay and escalation cycles.

**status**, **doctor**
> Show database status, or check for dangling references and ingestion outcomes.

**chat**
> Start an interactive conversation (via the Claude Agent SDK).

**serve** [**--port** _port_]
> Start an HTTP server for gateway integration.

**gateway**
> Start the Telegram gateway to talk to the agent from a phone.

# CONFIGURATION

State is stored locally in **~/.patina/store.db** (the SQLite belief graph) and **~/.patina/config.yaml** (owner identity, adapter credentials, heartbeat interval and ingest filters). Tier 2 uses a local model through Ollama; Tier 3 uses a frontier model, configured through the config file and environment.

# CAVEAT

Tier 1 works with no model, but belief extraction and drafting (Tiers 2 and 3) need a local and/or frontier LLM configured. patina is early-stage software that manages personal data, so review what an adapter ingests before connecting it. Destructive maintenance commands (**entity dedup**, repairs) only preview changes unless **--confirm** is given.

The **patina** package on PyPI is an unrelated project; install from the GitHub repository instead.

# HISTORY

**patina** is an open-source project written in **Python** by **Sanctum Origo Systems** and installed with **uv tool install git+https://github.com/Sanctum-Origo-Systems/patina.git**. It is distributed under the **Apache-2.0** license.

# SEE ALSO

[claude](/man/claude)(1), [ollama](/man/ollama)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/Sanctum-Origo-Systems/patina)```

```[Homepage](https://andywidjaja.com/patina)```

<!-- verified: 2026-11-23 -->
