# TAGLINE

display help for Jujutsu or a specific subcommand

# TLDR

**Show** top-level help for `jj`

```jj help```

**Show help** for a subcommand

```jj help [log]```

**Show help** for a nested subcommand

```jj help [git] [push]```

**List** available help keywords

```jj help --help```

**Show** the revsets language

```jj help -k revsets```

**Show** how and where to set configuration

```jj help -k config```

**Open** the getting-started tutorial

```jj help -k tutorial```

# SYNOPSIS

**jj help** [**-k** _KEYWORD_] [_COMMAND_...]

# PARAMETERS

_COMMAND_
> Print help for this subcommand. Repeat for nested commands (`jj help bookmark list`).

**-k**, **--keyword** _KEYWORD_
> Show help for a conceptual topic instead of a command. Values: `bookmarks`, `config`, `filesets`, `glossary`, `revsets`, `templates`, `tutorial`.

# DESCRIPTION

**jj help** prints the help text for **jj** itself or for the given subcommand(s). It is the same information as `jj [command] --help`, with extra pages for language topics that are not commands.

`jj help --help` lists the keyword names. `jj help -k` then shows one of those topics: bookmarks (named pointers similar to Git branches), configuration files and options, filesets, the glossary, revsets, templates, and a tutorial. The CLI reference at docs.jj-vcs.dev is generated from the same help text but is not guaranteed to match `jj help` exactly; the local command is authoritative.

# CAVEATS

Subcommand of **jj**. Keyword help is not a man page and is not opened in a browser. Nested command names must match the CLI (`jj help git remote add`, not a slash path). The published CLI reference is experimental and can differ from this command's output.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-16 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-config](/man/jj-config)(1), [git-help](/man/git-help)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-help)```

<!-- verified: 2026-09-16 -->
