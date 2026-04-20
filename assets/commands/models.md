# TAGLINE

CLI and TUI for browsing LLM models and coding agents

# TLDR

**Launch the interactive TUI**

```models```

**List all models**

```models list```

**Search for a model** across providers

```models search "[query]"```

**Show details** for a specific model

```models show [provider/model-id]```

**List providers**

```models providers```

**View coding agent status**

```agents status```

# SYNOPSIS

**models** [_subcommand_] [_options_]

**agents** [_subcommand_] [_options_]

# SUBCOMMANDS

**list**
> List available models.

**show** _MODEL_
> Show detailed information for a specific model.

**search** _QUERY_
> Search for models across all providers.

**providers**
> List model providers.

**benchmarks** _list_|_show_
> Browse published benchmark results.

**status** _list_|_show_|_sources_
> Inspect tracked data sources and their status.

**link**
> Create symlink aliases for models.

# DESCRIPTION

**models** is a fast CLI and TUI for browsing LLM models and tracking coding agents from the terminal. It aggregates data from models.dev and lets you browse and filter AI model providers, search across multiple providers, view context limits, pricing, and capabilities, copy model IDs, and export data as JSON.

A sibling **agents** command maintains a curated list of coding agents, detects installed versions, and tracks GitHub metrics like stars, releases, and update availability.

# CAVEATS

Requires an internet connection to fetch model data. Pricing and availability may change without notice.

# HISTORY

**models** was created by **arimxyer** and is written in **Rust**.

# SEE ALSO

[claude](/man/claude)(1), [ollama](/man/ollama)(1)
