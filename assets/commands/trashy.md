# TAGLINE

Rust-based command-line trash utility

# TLDR

Move files to the trash

```trashy [path/to/file1] [path/to/file2]```

The same thing, **spelled out**

```trashy put [path/to/file]```

**List** what is currently in the trash

```trashy list```

**Restore** the entries matching a regular expression

```trashy restore [pattern]```

Restore by **exact name** rather than by pattern

```trashy restore --match=exact [filename]```

Restore **everything**

```trashy restore --all```

**Permanently delete** the entries matching a pattern

```trashy empty [pattern]```

Empty the whole trash **without prompting**

```trashy empty --all --force```

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

# INSTALL

```nix: nix profile install nixpkgs#trashy```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[trash](/man/trash)(1), [rm](/man/rm)(1), [gio-trash](/man/gio-trash)(1)
