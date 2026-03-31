# TAGLINE

Display a markdown reference of all GitHub CLI commands

# TLDR

**Display the full command reference**

```gh reference```

**Pipe the reference to a pager** for easier reading

```gh reference | less```

# SYNOPSIS

**gh reference**

# DESCRIPTION

**gh reference** outputs a comprehensive markdown-formatted reference of all GitHub CLI commands. It provides a complete listing of every command, subcommand, and their flags in a single document.

The reference is useful for discovering available commands and getting an overview of gh's capabilities. Unlike individual help pages (`gh <command> --help`), it shows all commands together for easier exploration.

# CAVEATS

Output is lengthy; consider piping to a pager such as `less`. The locally generated reference reflects the installed version of gh.

# HISTORY

gh reference was added to the **GitHub CLI** to provide a comprehensive command reference, complementing the per-command help system.

# SEE ALSO

[gh](/man/gh)(1), [gh-help](/man/gh-help)(1)
