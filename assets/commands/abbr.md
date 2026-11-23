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

**Add** an abbreviation that expands anywhere on the line, with the cursor placed at **%**

```abbr --add [L] --position anywhere --set-cursor "% | less"```

**Add** an abbreviation that only expands after a specific command

```abbr --add --command [git] [co] [checkout]```

**Save** all abbreviations to a config file

```abbr > ~/.config/fish/conf.d/myabbrs.fish```

Import abbreviations from another host over **SSH**

```ssh [hostname] abbr --show | source```

# SYNOPSIS

**abbr** **--add** _NAME_ [**--position** **command**|**anywhere**] [**-r** _PATTERN_] [**-c** _COMMAND_] [**--set-cursor**[=_MARKER_]] (**-f** _FUNCTION_ | _EXPANSION_)

**abbr** **--erase**|**--query** _NAME_ ...

**abbr** **--rename** _OLD_NAME_ _NEW_NAME_

**abbr** [**--show**] [**--color** _WHEN_]

**abbr** **-l**, **--list**

# DESCRIPTION

**abbr** manages abbreviations for the fish shell. Abbreviations are user-defined words that expand into longer phrases when entered at the command line and confirmed with space or enter. Unlike aliases, which are simple command substitutions, abbreviations allow the user to see and edit the expanded text before execution.

Abbreviations only apply to interactively typed commands and are not expanded in scripts or functions. They can be scoped to trigger only at command position, anywhere on the line, or only as arguments of a given command, and support regex patterns and dynamic expansions through shell functions. Since fish 3.6, abbreviations are no longer stored in universal variables; add **abbr --add** lines to **config.fish** or a file in **conf.d/** instead.

# PARAMETERS

**-a**, **--add** _NAME_ _EXPANSION_
> Create a new abbreviation that expands NAME to EXPANSION

**-e**, **--erase** _NAME_ ...
> Remove one or more abbreviations

**--rename** _OLD_NAME_ _NEW_NAME_
> Rename an existing abbreviation

**-s**, **--show**
> Display all abbreviations in a format suitable for export

**-l**, **--list**
> Print only the abbreviation names

**-q**, **--query** _NAME_ ...
> Return 0 if any NAME is a defined abbreviation

**--position** **command**|**anywhere**
> Where the abbreviation expands; default is command position only

**-r**, **--regex** _PATTERN_
> Match tokens using a PCRE2 regular expression (must match the whole token) instead of the literal NAME

**--set-cursor**[=_MARKER_]
> Position cursor at marker location after expansion; default marker is %

**-f**, **--function** _FUNCTION_
> Use the output of a fish function, called with the matched token, as the expansion

**-c**, **--command** _COMMAND_
> Expand only when used as an argument to COMMAND; can be repeated and implies **--position anywhere**

**--description** _TEXT_
> Description shown in the completion pager

**--color** _WHEN_
> Colorize **--show** output: **auto**, **always** or **never**

# CAVEATS

Abbreviations only expand for interactively typed commands, not in scripts or functions. Press **Ctrl+Space** to insert a space without expanding. Fish shell specific; not available in other shells.

# HISTORY

Part of the **fish shell** (friendly interactive shell), a modern command-line shell focused on usability.

# SEE ALSO

[fish](/man/fish)(1), [alias](/man/alias)(1)

# RESOURCES

```[Source code](https://github.com/fish-shell/fish-shell)```

```[Homepage](https://fishshell.com)```

```[Documentation](https://fishshell.com/docs/current/cmds/abbr.html)```

<!-- verified: 2026-11-23 -->
