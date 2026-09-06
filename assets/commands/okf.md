# TAGLINE

Git-native OKF knowledge bundles for AI agent memory

# TLDR

**Scaffold** agent memory into a project (`knowledge/`, skill, `AGENTS.md`, Makefile)

```okf bootstrap [path/to/project] --name "[My Project]"```

Initialize a **bare OKF v0.2 bundle** (`index.md` and `log.md`)

```okf init [path/to/knowledge]```

**Validate** a bundle (defaults to `./knowledge` if that directory exists)

```okf validate [knowledge]```

Treat broken links, orphans, and provenance gaps as **errors**, and check index drift

```okf validate [knowledge] --strict --drift```

**Search** concepts with in-memory BM25 ranking

```okf search "[architecture layers]" [knowledge]```

Limit search hits and print **JSON**

```okf search "[auth]" [knowledge] --limit [5] --json```

**Show** a concept (id is the path without `.md`)

```okf show [architecture/layers] [knowledge]```

Dump the **raw markdown** of a concept

```okf show [architecture/layers] [knowledge] --raw```

**Create** a concept and update `index.md` / `log.md`

```okf create [decisions/auth-flow] [knowledge] --type Decision --title "[OAuth2 Authorization Flow]" --desc "[Standardized on PKCE for client authentication.]"```

**Update** an existing concept

```okf update [decisions/auth-flow] [knowledge] --desc "[Updated PKCE token refresh interval.]"```

**Link** two concepts

```okf relate [architecture/tooling] [architecture/layers] [knowledge] --desc "[Tooling implements the five-layer architecture]"```

Run the **MCP server** on stdio for Claude Code, Cursor, and similar clients

```okf mcp [knowledge]```

Print the **CLI version**

```okf version```

# SYNOPSIS

**okf** _command_ [_arguments_] [_flags_]

**okf** {**version** | **-v** | **--version**}

**okf** {**help** | **-h** | **--help**}

# PARAMETERS

**--json**
> Emit machine-readable JSON instead of terminal text. Accepted by **validate**, **search**, **show**, **create**, **update**, and **relate**.

**--strict**
> On **validate**, treat connectivity warnings (orphans, broken relative links, provenance gaps) as a failed producer gate (exit 1).

**--drift**
> On **validate**, fail when a concept's frontmatter description does not match its listing in the parent **index.md**.

**--limit** _N_
> On **search**, maximum hits to return (default **10**).

**--raw**
> On **show**, print the concept file exactly as stored on disk.

These flags are parsed per subcommand (Go `flag`), not as a global option parser. Put them after the subcommand and its positional arguments.

# COMMANDS

**validate** [_bundle_]
> Audit an OKF bundle for structural conformance, graph health, and provenance. Default _bundle_ is **./knowledge** if that directory exists, otherwise **.**. Exit **0** if conformant (and the producer gate passed), **1** if non-conformant or the gate failed, **2** if the bundle could not be loaded.

**search** _query_ [_bundle_]
> Rank concepts with in-memory BM25 over titles, descriptions, tags, ids, and body text. _query_ is required.

**show** _concept-id_ [_bundle_]
> Print metadata, trust provenance, inbound/outbound links, and the markdown body. _concept-id_ is the bundle-relative path without **.md** (a trailing **.md** is stripped).

**create** _concept-id_ [_bundle_]
> Write a new concept file and, unless disabled, append **log.md** and update the parent **index.md**. **--type** _Type_ (default **Fact**; examples: **Decision**, **Architecture**, **Entity**, **Runbook**), **--title** _text_ (default: last path component of the id), **--desc** _sentence_, **--body** _markdown_, **--tags** _tag1,tag2_, **--actor** _who_ (default **agent/cli**), **--no-log**, **--no-index**.

**update** _concept-id_ [_bundle_]
> Change **--title**, **--desc**, and/or **--body** on an existing concept, refresh timestamps, and record the change in **log.md** unless **--no-log** is set. **--actor**, **--no-index**, and **--json** as on **create**.

**relate** _source-id_ _target-id_ [_bundle_]
> Add a relative markdown link from source to target. **--desc** _context_ explains the relationship. **--actor** and **--json** as on **create**.

**init** [_directory_]
> Create a bare OKF v0.2 bundle: **index.md** (declaring **okf_version: "0.2"**) and **log.md**. Default directory is **./knowledge** if present, otherwise **.**.

**bootstrap** [_target-dir_]
> Scaffold a full agent-memory stack into _target-dir_ (default **.**): **knowledge/**, **.agents/skills/okf-memory/**, **AGENTS.md**, and a convenience **Makefile**. **--name** _project_ (default: directory name). **--overwrite-agents-md** replaces an existing **AGENTS.md** instead of appending a delimited section. **--no-skill**, **--no-agents-md**, **--no-makefile**, and **--no-bundle** skip individual pieces.

**mcp** [_bundle_]
> Run an embedded Model Context Protocol server on **stdio**. Tools: **okf_search**, **okf_show**, **okf_create**, **okf_update**, **okf_relate**, **okf_validate**.

**version**
> Print `okf version … (OKF v0.2 specification)`. Also accepted as **-v** / **--version**.

**help**
> Print the command list. Also accepted as **-h** / **--help**. With no arguments, **okf** prints help and exits **1**.

# DESCRIPTION

**okf** is the command-line tool from **OKF Agent Memory**, a Git-native persistent memory layer for AI coding agents. It reads and writes **Open Knowledge Format (OKF) v0.2** bundles: a directory of Markdown files with YAML frontmatter, plus hierarchical **index.md** files and a dated **log.md**. The usual bundle root in a project is **knowledge/**.

The binary is a single Go program with no third-party Go modules. It parses the corpus, validates the concept graph, searches with in-memory BM25 (lexical ranking, not embeddings), creates and updates concepts with automatic index/log bookkeeping, and can expose the same operations over MCP stdio for clients such as Claude Code and Cursor.

Concept ids are paths relative to the bundle root without the **.md** suffix (for example **architecture/layers** for **architecture/layers.md**). When a command omits the bundle path, **okf** uses **./knowledge** if that directory exists, otherwise the current directory.

A companion **okf-benchmark** binary in the same repository measures progressive-disclosure token and latency effects against local LLM runtimes; it is not installed as **okf**.

# CONFIGURATION

**knowledge/**
> Default project bundle. **okf bootstrap** creates it; most subcommands default to it when present.

**knowledge/index.md**
> Root progressive-disclosure index. Declares **okf_version: "0.2"** and lists child concepts.

**knowledge/log.md**
> Dated change log (ISO 8601 **YYYY-MM-DD**). **create**, **update**, and **relate** append here unless **--no-log** is set.

**.agents/skills/okf-memory/**
> Agent skill files installed by **bootstrap** (unless **--no-skill**).

**AGENTS.md**
> Project instructions for coding agents. **bootstrap** creates the file or appends a delimited section unless **--overwrite-agents-md** or **--no-agents-md** is set.

**Makefile**
> Optional convenience targets (**validate**, **search**) written by **bootstrap** unless **--no-makefile**.

There is no global config file or environment-variable overlay. MCP clients point at the **okf** binary with arguments **mcp** and the bundle path.

# CAVEATS

Several unrelated projects ship a binary named **okf** (other OKF bundle CLIs and a Ruby gem). Confirm **okf version** mentions **OKF v0.2 specification** and **okf help** lists **bootstrap** / **mcp** before relying on a distro or `PATH` install.

Search is **lexical BM25**, not vector similarity. It does not call an embedding API.

**--json**, **--strict**, and **--drift** are not global flags: they must follow the subcommand that accepts them. Unknown flags on that subcommand cause the process to exit.

**mcp** speaks MCP only over **stdio**. It is meant to be launched by an editor or agent host, not as a network daemon.

The in-tree Homebrew formula targets **okf-memory/tap/okf** and GitHub release assets for **v0.1.0**. Distro packages may be missing or may refer to a different **okf**. Building from source needs a Go toolchain (**go.mod** requires **1.22**); **make build** writes **bin/okf**, **make install** uses **go install**.

# HISTORY

**Open Knowledge Format** is a vendor-neutral Markdown-plus-YAML spec from **Google Cloud** (Knowledge Catalog / open-knowledge-format), published in **June 2026** (v0.1, then v0.2). **okf** is a separate MIT-licensed Go implementation by **sknr** and the **OKF Memory** contributors. The **okf-agent-memory** repository was created on **5 September 2026**; the project announced **v0.1.0** on Hacker News the following day as a zero-dependency CLI and MCP server for Git-tracked agent memory.

# SEE ALSO

[git](/man/git)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1), [codeknow](/man/codeknow)(1)

# RESOURCES

```[Source code](https://github.com/okf-memory/okf-agent-memory)```

```[Documentation](https://github.com/okf-memory/okf-agent-memory/blob/main/docs/CLI.md)```

<!-- verified: 2026-09-06 -->
