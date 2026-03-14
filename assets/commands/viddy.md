# TAGLINE

Modern watch command with time machine feature

# TLDR

**Watch a command with default interval**

```viddy '[ls -la]'```

**Watch with diff highlighting**

```viddy -d '[df -h]'```

**Watch with a custom interval**

```viddy -n [5] '[command]'```

# SYNOPSIS

**viddy** [_options_] _command_

# PARAMETERS

**-n**, **--interval** _SECONDS_
> Command execution interval (default: 2)

**-d**, **--differences**
> Highlight differences between updates

**-t**, **--no-title**
> Disable header display

**-b**, **--bell**
> Ring bell on command error

**-p**, **--precise**
> Precise timing mode

**-s**, **--skip-empty-diffs**
> Skip updates when output has not changed

# DESCRIPTION

**viddy** is a modern replacement for the Unix **watch** command. It executes commands periodically and displays results with colored output and diff highlighting. Its standout feature is time machine mode, which lets you rewind through past command outputs. Press **Space** to toggle time machine mode, then use arrow keys to navigate history. Includes vim-like keybindings and a pager.

# HISTORY

**viddy** was created by **sachaos**. Originally written in Go, it was rewritten in **Rust** starting with version 1.0.0.

# SEE ALSO

[watch](/man/watch)(1), [hwatch](/man/hwatch)(1), [entr](/man/entr)(1)
