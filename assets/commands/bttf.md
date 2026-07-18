# TAGLINE

Date/time arithmetic, parsing, and formatting CLI

# TLDR

**Show** current time helpers / default output

```bttf```

**Get help** for subcommands

```bttf --help```

**Subcommand help**

```bttf [command] --help```

# SYNOPSIS

**bttf** [*command*] [*options*]

# DESCRIPTION

**bttf** (formerly **biff**) is BurntSushi’s command-line toolkit for datetime parsing, formatting, arithmetic, and timezone-aware calculations. Designed as a script-friendly companion when **date** alone is awkward. See the upstream user guide for locale configuration tips.

# PARAMETERS

Commands cover parse/format/add/duration-style operations—the surface is intentionally broad. Use **bttf --help** and per-subcommand help as the source of truth for your version.

# CAVEATS

Locale support may need explicit configuration for some environments. Previously named **biff**; update scripts after the rename.

# SEE ALSO

[date](/man/date)(1), [timedatectl](/man/timedatectl)(1)

# RESOURCES

```[Source code](https://github.com/BurntSushi/bttf)```

<!-- verified: 2026-07-19 -->
