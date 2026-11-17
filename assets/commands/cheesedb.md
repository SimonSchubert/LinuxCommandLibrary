# TAGLINE

Agent memory where deleting a source deletes what it taught

# TLDR

The project calls this a **preview**, not a production store.

**Create** an agent

```cheesedb agent create [alice]```

**Add** a source and print its id

```cheesedb lot [alice] [note] "[text]"```

**Add** a memory that depends on source ids

```cheesedb remember [alice] "[text]" "[1 2]"```

**List** every record

```cheesedb show [alice]```

List **live** memories

```cheesedb active [alice]```

**Search** raw files for text

```cheesedb find [alice] "[text]"```

Search by **meaning** (needs an embedding model)

```cheesedb search [alice] "[question]" [10]```

Ask a **language model** using those memories

```cheesedb ask [alice] "[question]"```

**Remove** what a source taught

```cheesedb recall [alice] [id] fair erase```

**Check** the log

```cheesedb verify [alice]```

# SYNOPSIS

**cheesedb** _COMMAND_ [_ARGS_]

# DESCRIPTION

**cheesedb** is a local memory store for agents. Data lives under `~/.cheesedb` unless this variable points somewhere else:

```CHEESEDB_DIR```

The directory is created mode 0700, with `data/`, `tokens/`, and `demo/`. The Go module path is `github.com/govinargo-labs/cheesedb/cmd/cheesedb`. Go 1.26.5 or newer is required. Linux is tested. Windows is not supported.

Commands from the program's usage text:

- `agent create` / `agent delete` — an agent and its files. The token is stored under `tokens/`
- `lot AGENT TYPE TEXT` — add a source and print its id
- `remember AGENT TEXT LEGS` — add a memory. A leg is ids joined by commas (`4,5` means both). A space-separated list (`1 2`) means either
- `show` — every lot and memory
- `active` — live memories
- `get AGENT ID` — one record
- `find AGENT TEXT` — search the files on disk
- `search AGENT QUESTION [K]` — K nearest memories by embedding. Default 10
- `embed AGENT` — make live memories searchable. Later `remember` calls do this themselves
- `index AGENT` — list indexes. `index AGENT drop NAME` drops one
- `recall AGENT ID fair|strict untrusted|erase` — drop a lot or memory and what depends on it
- `forget AGENT TEXT` — find the closest memory, show what would go with it, erase after a yes
- `compact AGENT` — erase the text of dead records
- `verify AGENT` — check the log and print the head fingerprint
- `version` — print the version
- `learn AGENT` — turn live sources into memories with a chat model
- `ask AGENT QUESTION [K]` — answer from the K closest live memories only
- `demo` — a scripted comparison with a naive store
- `mcp AGENT` — serve that agent's memory as MCP tools

Embedding and chat use `llm.conf` in the home directory. The keys are:

```embed_base_url```

```embed_model```

```embed_api_key```

```base_url```

```api_key```

# CAVEATS

The author marks the tool as a preview. `forget` and `recall ... erase` delete text. `agent delete` removes that agent's files. An embedding server and a chat server are optional until you use `search`, `embed`, `learn`, `ask`, or `forget`.

# SEE ALSO

[jq](/man/jq)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/govinargo-labs/cheesedb)```

```[Homepage](https://cheesedb.dev)```

```[Documentation](https://github.com/govinargo-labs/cheesedb#cheesedb)```

<!-- verified: 2026-11-17 -->
