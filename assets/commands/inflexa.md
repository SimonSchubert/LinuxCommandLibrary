# TAGLINE

Local-first CLI for reproducible biological analysis

# TLDR

**Install** via Homebrew

```brew install inflexa-ai/tap/inflexa```

**One-time setup** (model provider, sandbox image, local services)

```inflexa setup```

**Launch** the TUI in a data directory

```inflexa```

**Change** configuration after setup

```inflexa config```

**Install** from the official install script

```curl -fsSL https://inflexa.ai/install.sh | bash```

**Run** without a global install (Node 18+)

```npx @inflexa-ai/inflexa```

# SYNOPSIS

**inflexa** [_command_] [_options_]

# DESCRIPTION

**inflexa** is a local-first agentic CLI for reproducible biological and bioinformatics data analysis. A plain-language request is turned into runnable code, executed in an isolated sandbox, and recorded with full provenance so results can be audited and replayed.

By default, data, code, and results stay on the machine. Analyses run in a resource-limited Docker sandbox with no network access by default. Model providers are bring-your-own: cloud APIs (Claude, OpenAI, Gemini, and others via a local proxy) or fully local models for offline use. Provenance and lineage are stored in a local SQLite database.

**inflexa setup** walks through model connection, Postgres/pgvector via Docker Compose, resource allowances, embeddings, and the sandbox image pull. After setup, running **inflexa** with no arguments launches the TUI/chat UI from the current working directory (typically your dataset path). **inflexa config** revisits settings later.

The open-source CLI is a complete Apache-2.0 product; a separate commercial hosted platform adds team features. Docker must be running for sandboxed analyses. Binaries are available for macOS and Linux x86_64 (Homebrew, install script, npm, or GitHub releases).

# PARAMETERS

**setup**
> Interactive first-time provisioning: model provider, database containers, resource limits, embeddings, sandbox image.

**config**
> Reconfigure provider and runtime settings after setup.

_(no command)_
> Launch the local TUI/CLI chat interface for analysis requests.

# CAVEATS

Requires a working **Docker** daemon for analysis execution. First setup pulls container images and may need substantial disk and CPU/memory headroom. Model quality and cost depend on the configured provider; fully offline use needs a local model endpoint. Windows is supported via a separate install script; Linux/macOS are the primary documented targets for Homebrew.

# HISTORY

Inflexa is developed by Inflexa, Inc. as open-source agentic orchestration for trusted, reproducible computational biology workflows with provenance by construction.

# SEE ALSO

[docker](/man/docker)(1), [curl](/man/curl)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/inflexa-ai/inflexa)```

```[Homepage](https://inflexa.ai)```

<!-- verified: 2026-07-22 -->
