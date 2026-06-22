# TAGLINE

shell history year-in-review summary generator

# TLDR

**Generate your command-line wrapped summary** (current stats)

```cmd-wrapped```

**Show statistics for a specific year**

```cmd-wrapped [2024]```

**Analyze a specific shell's history**

```cmd-wrapped -s [zsh|bash|fish|nu|atuin]```

# SYNOPSIS

**cmd-wrapped** [**-s** _shell_] [_year_]

# PARAMETERS

**-s** _shell_
> Specify which shell history to analyze: zsh, bash, fish, nu (nushell), or atuin.

_year_
> Positional argument selecting a specific year (e.g., 2024). Without it, current statistics are shown.

# DESCRIPTION

**cmd-wrapped** is a command-line tool that generates a "Spotify Wrapped" style summary of your terminal command history. It analyzes your shell history to produce statistics about your most-used commands, busiest hours, and command patterns over time.

The tool reads the history of the detected (or specified) shell and presents colorful, formatted output showing top commands, total commands executed, unique commands used, and temporal usage patterns.

cmd-wrapped supports Zsh, Bash, Fish, Nushell, and Atuin. Pass a year as a positional argument to scope the report to that year, or `-s` to choose which shell's history to analyze.

# CAVEATS

Accuracy depends on your shell's history configuration. Commands may be undercounted if history is limited in size, duplicates are ignored, or certain commands are excluded from history. Fish shell uses a different history format that requires specific parsing.

# HISTORY

cmd-wrapped was created as a fun end-of-year tool inspired by **Spotify Wrapped**, the popular annual music listening summary. It emerged from the developer community's interest in personal analytics and the trend of "wrapped" summaries across various platforms.

# SEE ALSO

[history](/man/history)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1)

# RESOURCES

```[Source code](https://github.com/YiNNx/cmd-wrapped)```

<!-- verified: 2026-06-22 -->
