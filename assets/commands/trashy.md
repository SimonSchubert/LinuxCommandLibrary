# TLDR

Move a specific **file** to the trash

```trash [path/to/file]```

Move **multiple files** to the trash

```trash [path/to/file1] [path/to/file2]```

**List** items in the trash

```trash list```

**Restore** a specific file from the trash

```trash restore [file]```

**Remove** a specific file from the trash

```trash empty [file]```

Restore **all files** from the trash

```trash restore --all```

Remove **all files** from the trash

```trash empty --all```

# SYNOPSIS

**trash** [_command_] [_options_] [_files_...]

# PARAMETERS

**put** _files_
> Move files to trash (default if no command given)

**list**
> List items in the trash

**restore** _files_
> Restore files from trash to original location

**empty** _files_
> Permanently delete files from trash

**--all**
> Apply to all items (with restore or empty)

**-f**, **--force**
> Skip confirmation prompts

**-r**, **--recursive**
> Include directories recursively

**-v**, **--verbose**
> Show verbose output

**-h**, **--help**
> Display help message

# DESCRIPTION

**trashy** is a Rust-based command-line trash utility that provides a safe alternative to rm by moving files to the XDG Trash specification-compliant trash can. It offers a modern, fast implementation with intuitive subcommands.

The main command **trash** moves files to trash by default. Files can be listed, restored to their original location, or permanently deleted using the respective subcommands. It integrates with desktop trash locations.

# CAVEATS

The **trash** command name may conflict with trash-cli if both are installed. Uses the same trash directory as desktop file managers. Disk space is not freed until files are removed from trash with **trash empty**.

# HISTORY

Written in **Rust** by oberblastmeister as a modern alternative to trash-cli. Designed for speed and ease of use with a simplified command interface compared to trash-cli's separate commands.

# SEE ALSO

[trash](/man/trash)(1), [rm](/man/rm)(1), [gio-trash](/man/gio-trash)(1)
