# TLDR

**Generate your command-line wrapped** summary

```cmd-wrapped```

**Generate wrapped for a specific shell**

```cmd-wrapped --shell [bash|zsh|fish]```

**Specify a custom history file**

```cmd-wrapped --history-file [path/to/.bash_history]```

**Generate wrapped for a specific year**

```cmd-wrapped --year [2024]```

**Output in JSON format**

```cmd-wrapped --json```

**Show detailed statistics**

```cmd-wrapped --verbose```

# SYNOPSIS

**cmd-wrapped** [_options_]

# PARAMETERS

**--shell** _SHELL_
> Specify which shell history to analyze (bash, zsh, fish).

**--history-file** _FILE_
> Path to a custom history file to analyze.

**--year** _YEAR_
> Generate statistics for a specific year only.

**--json**
> Output results in JSON format for scripting.

**--verbose**
> Show additional detailed statistics.

**--no-color**
> Disable colored output.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**cmd-wrapped** is a command-line tool that generates a "Spotify Wrapped" style summary of your terminal command history. It analyzes your shell history file to produce statistics about your most-used commands, busiest hours, and command patterns throughout the year.

The tool automatically detects your default shell and locates the appropriate history file. It presents colorful, formatted output showing top commands, total commands executed, unique commands used, and temporal usage patterns.

cmd-wrapped supports multiple shells including Bash, Zsh, and Fish, and can process custom history files for analysis. The JSON output option enables integration with other tools or custom visualizations of your command-line habits.

# CAVEATS

Accuracy depends on your shell's history configuration. Commands may be undercounted if history is limited in size, duplicates are ignored, or certain commands are excluded from history. Fish shell uses a different history format that requires specific parsing.

# HISTORY

cmd-wrapped was created as a fun end-of-year tool inspired by **Spotify Wrapped**, the popular annual music listening summary. It emerged from the developer community's interest in personal analytics and the trend of "wrapped" summaries across various platforms.

# SEE ALSO

[history](/man/history)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1)
