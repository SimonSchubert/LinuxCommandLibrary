# TAGLINE

Markdown browser for the terminal

# TLDR

**Start hike** to browse markdown files

```hike```

**Open a specific markdown file**

```hike [path/to/file.md]```

**Open a file** from a URL

```hike [https://example.com/README.md]```

**View a README** on GitHub

```hike gh [owner/repo]```

**Start with the navigation panel** hidden

```hike --no-navigation [path/to/file.md]```

**List** available themes

```hike --theme ?```

# SYNOPSIS

**hike** [_options_] [_command_ ...]

# PARAMETERS

_command_
> Initial input for Hike's command line: a file, directory, URL or any Hike command

**-t**, **--theme** _theme_
> Set the theme; use **?** to list available themes

**--navigation**, **--no-navigation**
> Show or hide the navigation panel on startup

**-b**, **--bindings**
> List commands that can have their key bindings changed

**--license**, **--licence**
> Show license information

**-v**, **--version**
> Show version information

**-h**, **--help**
> Show help

# DESCRIPTION

**hike** is a terminal-based Markdown browser that provides the ability to browse and view local Markdown files, as well as Markdown files downloaded from the web. It includes shortcuts for quickly accessing Markdown files on popular git forges: **github** (**gh**), **gitlab** (**gl**), **codeberg** (**cb**) and **bitbucket** (**bb**).

Central to the interface is a command line with history and auto-completion, which accepts file names, URLs, directories and commands. Hike also has bookmarks, a browsing history and a local file browser.

Hike supports editing Markdown documents from the local filesystem with a built-in editor, or with the editor named in **$VISUAL** or **$EDITOR**. Commands can be discovered via the command palette (**Ctrl+P**), and **F1** shows full help.

# CONFIGURATION

**~/.config/hike/configuration.json**
> Configuration file, including key bindings. Follows **$XDG_CONFIG_HOME**.

Other data is stored in a **hike** directory under **$XDG_DATA_HOME**.

# CAVEATS

Requires Python 3.10 or later. Web-hosted Markdown files require an internet connection for fetching.

# HISTORY

**hike** was created by **Dave Pearson** (davep) and is written in **Python** using the **Textual** TUI framework. It was designed to provide a native terminal experience for browsing documentation and README files.

# SEE ALSO

[glow](/man/glow)(1), [mdcat](/man/mdcat)(1), [bat](/man/bat)(1)

# RESOURCES

```[Homepage](https://hike.davep.dev/)```

```[Source code](https://github.com/davep/hike)```

<!-- verified: 2026-11-09 -->
