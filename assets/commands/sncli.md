# TAGLINE

Terminal client for Simplenote

# TLDR

**Launch the interactive console GUI**

```sncli```

**Synchronize notes with Simplenote**

```sncli sync```

**List all notes**

```sncli list```

**Search notes with a regex pattern**

```sncli -r list "[pattern]"```

**Create a note with a title**

```sncli -t "[My Note Title]" create```

**Edit a note by key**

```sncli -k [note_key] edit```

**Dump a note to stdout**

```sncli -k [note_key] dump```

**Export a note as JSON**

```sncli -k [note_key] export```

# SYNOPSIS

**sncli** [_options_] [_command_] [_args_]

# PARAMETERS

**-n**, **--nosync**
> Do not perform a server sync on startup.

**-r**, **--regex**
> Treat search string as a regular expression.

**-k** _KEY_, **--key** _KEY_
> Specify note key for commands that operate on a single note.

**-t** _TITLE_, **--title** _TITLE_
> Title of note for create command.

**-c** _FILE_, **--config** _FILE_
> Specify configuration file.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**sncli** provides both a console GUI with Vi-like keybindings and a scriptable CLI for accessing your Simplenote account. It performs full two-way sync in the background and supports offline editing with automatic re-sync. Features include Google-style and regex search, note pinning, tagging, and fully customizable colors and keybindings.

Available commands include: **sync**, **list**, **dump**, **create**, **edit**, **export**, **import**, **trash**, **untrash**, **pin**, **unpin**, **markdown**, **unmarkdown**, and **tag** (get/set/add/rm).

# HISTORY

**sncli** was created by **insanum** and is written in **Python**.

# SEE ALSO

[nb](/man/nb)(1), [joplin](/man/joplin)(1), [rucola](/man/rucola)(1)
