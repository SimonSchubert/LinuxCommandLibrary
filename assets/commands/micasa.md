# TAGLINE

Terminal UI for home management and maintenance tracking

# TLDR

**Launch micasa** with your house database

```micasa```

**Explore with sample data** in demo mode

```micasa --demo```

**Use a specific database file**

```micasa [path/to/house.db]```

**Persist demo data** to a file instead of memory

```micasa --demo [path/to/demo.db]```

**Print the resolved database path** for scripting

```micasa --print-path```

# SYNOPSIS

**micasa** [**--demo**] [**--print-path**] [**--version**] [_db-path_]

# PARAMETERS

**--demo**
> Launch with fictitious sample data: a house profile, projects, maintenance items, appliances, service log entries, and quotes. When combined with a _db-path_, demo data persists to disk instead of staying in-memory.

**--print-path**
> Print the resolved database path to stdout and exit. Useful for scripting and backup.

**--version**
> Show version and exit.

**-h**, **--help**
> Display help information.

**_db-path_**
> Optional positional argument specifying the SQLite database file location.

# DESCRIPTION

**micasa** is a keyboard-driven terminal UI application for managing everything about your home. It tracks maintenance schedules, projects, incidents, vendor quotes, appliances, warranties, service history, and file attachments. All data is stored in a single local SQLite file — no cloud, no account, no subscriptions.

The application features an integrated LLM assistant that can help generate maintenance suggestions and project plans when connected to a local Ollama instance or any OpenAI-compatible API.

# CONFIGURATION

Configuration is stored in a platform-specific directory:

```
Linux:   ~/.config/micasa/config.toml
macOS:   ~/Library/Application Support/micasa/config.toml
Windows: %APPDATA%\micasa\config.toml
```

The **[llm]** section controls the optional LLM integration:

**base_url**
> OpenAI-compatible API endpoint (default: **http://localhost:11434/v1**)

**model**
> Model identifier (default: **qwen3**)

**extra_context**
> Custom text appended to all system prompts

**timeout**
> Max wait time for LLM operations (default: **"5s"**)

Environment variables can override configuration values:

**MICASA_DB_PATH** — sets default database path when no argument is provided
**OLLAMA_HOST** — overrides the LLM API base URL
**MICASA_LLM_MODEL** — overrides the LLM model name
**MICASA_LLM_TIMEOUT** — overrides the LLM timeout using Go duration syntax

# CAVEATS

micasa requires a terminal with mouse and keyboard support. The optional LLM features depend on a running Ollama instance or compatible API endpoint. The database is a single SQLite file, so concurrent access from multiple instances is not supported.

# HISTORY

**micasa** (Spanish for "my house") was created by **Phillip Cloud** as an open-source Go project hosted on GitHub. It was designed as a privacy-first alternative to cloud-based home management apps, keeping all data local in a single SQLite database.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [ollama](/man/ollama)(1)
