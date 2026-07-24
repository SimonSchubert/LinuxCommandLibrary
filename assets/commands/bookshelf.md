# TAGLINE

Terminal book library and ambient quotes for coding-agent sessions

# TLDR

**Open** the interactive terminal library

```bookshelf```

**Show a quote** on demand

```bookshelf quote```

**Show a quote** tagged for an intent (e.g. refactor)

```bookshelf quote --intent [refactor]```

**Enable ambient quotes** every N completed agent turns

```bookshelf ambient enable --cadence [5] --intent [refactor]```

**Check ambient** status

```bookshelf ambient status```

**Disable ambient** mode

```bookshelf ambient disable```

**Send feedback** on the last quote

```bookshelf feedback [up|down]```

# SYNOPSIS

**bookshelf** [_subcommand_] [_options_]

# PARAMETERS

_(no subcommand)_
> Open the interactive TUI library (browse books, search, favorites, reading lists).

**quote**
> Print an on-demand quote. **--intent** _theme_ maps to local tags (e.g. refactor, debug) for relevance ranking.

**ambient** **enable** | **disable** | **status**
> Control ambient delivery for coding-agent Stop hooks. **enable --cadence** _N_ sets how many completed turns between quotes. **enable --intent** _theme_ stores the ambient theme.

**feedback** **up** | **down**
> Record local feedback on the last delivered quote.

# DESCRIPTION

**bookshelf** is a local-first Python CLI that surfaces book quotes inside coding-agent workflows (Codex, Claude Code, and related hosts) and provides a full terminal library for browsing. Ambient mode is optional and off by default: when enabled via host plugins/hooks, a short quote can appear every few completed turns. Quotes and relevance ranking stay on-device—no prompts, code, transcripts, or network calls for selection.

The interactive **bookshelf** TUI supports navigation (**j**/**k**, arrows), genre tabs, search (**/**), reading lists (**c**), random pick (**r**), favorites (**f**), read/want-to-read marks (**m**/**w**), help (**?**), and quit (**q**). Favorites, lists, statistics, and ambient settings live under the platform application-data directory named **bookshelf** (or **BOOKSHELF_DATA_HOME**).

Install with **pipx** from the GitHub repository (**Python 3.10+**, no runtime dependencies). Host integrations are available as Codex/Claude Code plugins and other agent marketplaces; those hooks can deliver ambient quotes without a global **bookshelf** binary. Package name on PyPI is planned as **ambient-bookshelf**.

# CONFIGURATION

**BOOKSHELF_AMBIENT_ENABLED**
> Override ambient on/off for the process (**1**/**0** or **true**/**false**). Wins over saved config.

**BOOKSHELF_AMBIENT_CADENCE**
> Positive integer: completed turns between ambient quotes.

**BOOKSHELF_DATA_HOME**
> Redirect config and ambient state to another directory.

# CAVEATS

Ambient delivery depends on host plugin/hook support and fails closed when no safe bounded quote is available. Ambient lines are capped (about **220** UTF-8 bytes / **32** words); on-demand **quote** allows a wider display budget. Catalog entries vary in verification status—see the project's **DATA.md**. Intent-based ranking is deterministic tag mapping, not a claim of deep semantic relevance.

# HISTORY

Created by **Amal David** as an MIT-licensed Python project combining a terminal library with optional ambient quotes for AI coding agents. Integrates with Codex, Claude Code, and similar hosts via plugins and hooks.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1)

# RESOURCES

```[Source code](https://github.com/Amal-David/bookshelf)```

```[Homepage](https://bookshelf-8dz.pages.dev/)```

```[Documentation](https://github.com/Amal-David/bookshelf#readme)```

<!-- verified: 2026-07-24 -->
