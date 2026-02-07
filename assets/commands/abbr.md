# TAGLINE

fish shell abbreviation manager

# TLDR

**Add** a new abbreviation

```abbr --add [abbreviation_name] [command] [arguments]```

**Rename** an existing abbreviation

```abbr --rename [old_name] [new_name]```

**Erase** an existing abbreviation

```abbr --erase [abbreviation_name]```

**List** all abbreviation names

```abbr --list```

**Show** all abbreviations in exportable format

```abbr --show```

Import abbreviations from another host over **SSH**

```ssh [hostname] abbr --show | source```

# SYNOPSIS

**abbr** [_--add_] [_--erase_] [_--rename_] [_--show_] [_--list_] [_--query_] [_NAME_] [_EXPANSION_]

# DESCRIPTION

**abbr** manages abbreviations for the fish shell. Abbreviations are user-defined words that expand into longer phrases when entered at the command line and confirmed with space or enter. Unlike aliases, which are simple command substitutions, abbreviations allow the user to see and edit the expanded text before execution.

Abbreviations only apply to interactively typed commands and are not expanded in scripts or functions. They can be scoped to trigger only at command position or anywhere on the line, and support regex patterns and dynamic expansions through shell functions.

# PARAMETERS

**--add NAME EXPANSION**
> Create a new abbreviation that expands NAME to EXPANSION

**--erase NAME**
> Remove one or more abbreviations

**--rename OLD_WORD NEW_WORD**
> Rename an existing abbreviation

**--show**
> Display all abbreviations in a format suitable for export

**--list**
> Print only the abbreviation names

**--query NAME**
> Check if NAME is a defined abbreviation

**--position command|anywhere**
> Where the abbreviation expands; default is command position only

**--regex PATTERN**
> Match using PCRE2 regular expression pattern instead of literal text

**--set-cursor[=MARKER]**
> Position cursor at marker location after expansion; default marker is %

**--function FUNCTION**
> Use function output for dynamic expansion instead of static text

**--command COMMAND**
> Expand only when used as argument to the specified command

# CAVEATS

Abbreviations only expand for interactively typed commands, not in scripts or functions. Fish shell specific; not available in other shells.

# HISTORY

Part of the **fish shell** (friendly interactive shell), a modern command-line shell focused on usability.

# SEE ALSO

[fish](/man/fish)(1), [alias](/man/alias)(1)
