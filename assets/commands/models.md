# TAGLINE

CLI and TUI for browsing LLM models and coding agents

# TLDR

**Browse available LLM models**

```models```

**Search for a specific model**

```models search "[query]"```

**List coding agents**

```models agents```

# SYNOPSIS

**models** [_command_] [_options_]

# DESCRIPTION

**models** is a fast CLI and TUI for browsing LLM models and tracking coding agents from the terminal. It aggregates data from models.dev and lets you browse and filter AI model providers, search across multiple providers, view context limits, pricing, and capabilities, copy model IDs, and export data as JSON.

For coding agents, it maintains a curated list, detects installed versions, and tracks GitHub metrics like stars, releases, and update availability.

# CAVEATS

Requires an internet connection to fetch model data. Pricing and availability may change without notice.

# HISTORY

**models** was created by **arimxyer** and is written in **Rust**.

# SEE ALSO

[claude](/man/claude)(1), [ollama](/man/ollama)(1)
