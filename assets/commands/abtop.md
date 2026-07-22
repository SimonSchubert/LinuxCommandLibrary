# TAGLINE

htop-style monitor for AI coding agent sessions

# TLDR

**Monitor** agent sessions

```abtop```

**Install** via cargo or install script

```cargo install abtop```

# SYNOPSIS

**abtop** [*options*]

# DESCRIPTION

**abtop** watches local AI coding agent processes (e.g. Claude Code, Codex CLI): sessions, token/context usage, rate limits, and related ports—in a live TUI similar in spirit to **htop**. Useful when juggling multiple agent terminals.

# PARAMETERS

Interactive TUI after launch. Optional flags select refresh intervals and filters—**abtop --help**.

# CAVEATS

Depends on how agents expose metrics; not all tools report tokens the same way. Process introspection may need permissions on locked-down systems.

# INSTALL

```aur: yay -S abtop```

```nix: nix profile install nixpkgs#abtop```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[htop](/man/htop)(1), [btop](/man/btop)(1), [ps](/man/ps)(1)

# RESOURCES

```[Source code](https://github.com/graykode/abtop)```

<!-- verified: 2026-07-19 -->
