# TAGLINE

Reset pueue daemon to clean state

# TLDR

**Reset pueue state**

```pueue reset```

**Reset specific groups** only

```pueue reset --groups [group1] [group2]```

# SYNOPSIS

**pueue** **reset** [_options_]

# PARAMETERS

**--groups** _group_...
> Only reset specific groups instead of everything

# DESCRIPTION

**pueue reset** kills all running tasks, removes all tasks, and resets the task ID counter. It returns the daemon to a clean state. A confirmation prompt is shown if there are running tasks.

# CAVEATS

This command permanently removes all task history and kills running tasks. The operation cannot be undone.

# INSTALL

```pacman: sudo pacman -S pueue```

```apk: sudo apk add pueue```

```zypper: sudo zypper install pueue```

```brew: brew install pueue```

```nix: nix profile install nixpkgs#pueue```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-clean](/man/pueue-clean)(1), [pueue-kill](/man/pueue-kill)(1), [pueue-remove](/man/pueue-remove)(1)

