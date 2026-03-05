# TAGLINE

Code snippet manager for the terminal

# TLDR

**Launch the snippet TUI**

```nap```

**Create a new snippet**

```nap "[snippet_name]"```

**List all snippets**

```nap list```

**Fuzzy find and copy a snippet**

```nap [query]```

# SYNOPSIS

**nap** [_options_] [_query_]

# DESCRIPTION

**nap** is a code snippet manager with both a CLI and TUI interface. The TUI lets you browse, manage, and organize code snippets directly in your terminal, while the CLI provides quick access with fuzzy searching.

Snippets can be created from files or stdin, organized into folders, and copied to the clipboard. The tool is configured through **$XDG_CONFIG_HOME/nap/config.yaml**.

# CONFIGURATION

**$XDG_CONFIG_HOME/nap/config.yaml**
> Configuration file for snippet storage location and behavior.

# CAVEATS

Snippets are stored locally. No built-in sync across devices.

# HISTORY

**nap** was created by **maaslalani** and is written in **Go** using the Charm framework.

# SEE ALSO

[pet](/man/pet)(1)
