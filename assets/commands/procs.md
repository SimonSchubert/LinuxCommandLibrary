# TLDR

**List all processes**

```procs```

**Search for process by name**

```procs [nginx]```

**Watch processes** (auto-refresh)

```procs --watch```

**Show tree view**

```procs --tree```

**Sort by CPU usage**

```procs --sortd cpu```

**Sort by memory usage**

```procs --sortd mem```

**Show specific columns**

```procs --insert [read,write]```

**Show processes by user**

```procs --or "user eq [username]"```

# SYNOPSIS

**procs** [_--tree_] [_--watch_] [_--sortd column_] [_--insert columns_] [_keyword_]

# PARAMETERS

**--tree**, **-t**
> Tree view showing parent-child relationships.

**--watch**, **-w**
> Watch mode with auto-refresh.

**--watch-interval** _SEC_
> Refresh interval in seconds.

**--sortd** _COLUMN_
> Sort descending by column.

**--sorta** _COLUMN_
> Sort ascending by column.

**--insert** _COLUMNS_
> Add columns to display.

**--only** _COLUMNS_
> Show only specified columns.

**--or** _FILTER_
> Filter with OR logic.

**--and** _FILTER_
> Filter with AND logic.

**--color** _MODE_
> Color mode: auto, always, disable.

**--pager** _MODE_
> Pager: auto, always, disable.

**--config** _FILE_
> Use specific config file.

**--theme** _THEME_
> Color theme.

**--no-header**
> Hide column headers.

# DESCRIPTION

**procs** is a modern replacement for ps, written in Rust with enhanced output formatting. It displays process information with syntax highlighting, making output more readable.

The default view shows more useful information than ps: command name, PID, user, CPU%, memory, and a truncated command line. Colors distinguish types of processes and highlight keywords.

Tree view (-t) shows process hierarchy with visual indentation. This makes it easy to see parent-child relationships without piping through pstree.

Watch mode (-w) provides top-like real-time updates. Combined with sorting, it helps identify resource-heavy processes. The interval is configurable.

Search works by keyword matching against multiple fields: process name, command line, user. Filters provide more precise control using expressions like "cpu gt 10" or "user eq root".

Configuration file (~/.config/procs/config.toml) allows customizing columns, colors, and default options.

# CAVEATS

Some ps options don't have direct equivalents. Filter syntax differs from ps. Config file format may change between versions. Large process lists can be slow to render. Terminal must support colors for best experience.

# HISTORY

**procs** was created by **dalance** around **2019** as part of the wave of Rust-based Unix tool rewrites. It aimed to improve on ps's dated output format while maintaining familiarity. The tool emphasizes visual clarity and modern terminal features.

# SEE ALSO

[ps](/man/ps)(1), [top](/man/top)(1), [htop](/man/htop)(1), [pgrep](/man/pgrep)(1)
