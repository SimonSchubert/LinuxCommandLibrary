# TAGLINE

TUI to filter JSON and JSON Lines with Python syntax

# TLDR

**Open a JSON file** in the interactive editor

```jellex [path/to/file.json]```

**Pipe JSON from stdin**

```cat [path/to/file.json] | jellex```

**Open JSON Lines data**

```jellex [path/to/file.jsonl]```

# SYNOPSIS

**jellex** [_file_]

# DESCRIPTION

**jellex** (Jello Explorer) is a TUI program for interactively processing JSON and JSON Lines data using **Python syntax**. It provides a split-pane interface with an **Editor** window on the left for writing Python queries and a **Viewer** window on the right that updates in real time as queries are modified. A toggleable **Schema** view shows the data structure.

In queries, **_** represents the loaded JSON as a Python dict or list. Both dot notation and bracket notation can be used to access key names. The Editor uses standard **Emacs** key bindings. jellex uses **jello** on the backend to execute queries.

# KEY BINDINGS

**CTRL-\\** — Toggle focus between Editor, Viewer, and Schema
**CTRL-S** — Toggle Schema window visibility
**CTRL-Q** or **CTRL-C** — Exit program

# CAVEATS

Requires Python and the jello library. Uses Python syntax rather than jq syntax, which may be unfamiliar to jq users but accessible to Python developers. Reserved Python keywords must use bracket notation (e.g., `_["get"]`).

# HISTORY

**jellex** was created by **Kelly Brazil** (kellyjonbrazil) and is written in **Python**. It builds on the author's **jello** CLI tool, adding an interactive TUI layer for exploration.

# SEE ALSO

[jq](/man/jq)(1), [jello](/man/jello)(1), [fx](/man/fx)(1), [jaq](/man/jaq)(1)
