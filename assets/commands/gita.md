# TAGLINE

Manage multiple Git repositories side by side

# TLDR

Display **status of all registered** repositories

```gita ll```

**Register repositories** to be tracked

```gita add [path/to/repo1] [path/to/repo2]```

**Recursively discover and add** all repos under a directory

```gita add -a [path/to/parent]```

**Run a git command** across all registered repos

```gita fetch```

Run an **arbitrary git command** across specific repos

```gita super [repo1] [repo2] -c "git [command]"```

Run a **shell command** across all repos

```gita shell -c "[command]"```

**List** all registered repository names

```gita ls```

**Remove** a repository from tracking

```gita rm [repo_name]```

# SYNOPSIS

**gita** [_subcommand_] [_options_] [_repos_]

# PARAMETERS

**add** _path(s)_
> Register repositories to track. Use **-a** to recursively discover repos under a directory, **-b** for bare repos.

**rm** _repo(s)_
> Unregister repositories from tracking.

**ls**
> List names of all registered repositories.

**ll**
> Display detailed status of all repos including branch, sync state, and modifications.

**fetch**
> Run git fetch across all registered repos.

**pull**
> Run git pull across all registered repos.

**super** [_repos_] **-c** _"git command"_
> Delegate any arbitrary git command to specified repos (or all if none specified).

**shell** [_repos_] **-c** _"command"_
> Run any shell command in each repo's directory.

**freeze**
> Export repository paths and URLs for backup or sharing.

**clone** _url_
> Clone a repository and register it.

**group add** _repos_ **-n** _name_
> Create a named group of repositories.

**group ll**
> List all groups and their contents.

**group rm** _name_
> Delete a named group.

**context** _group_
> Limit subsequent commands to a specific group. Use **none** to clear.

**info**
> Configure which information items are displayed in **ll** output.

**color**
> Manage color schemes for branch status display.

**flags set** _repo_ _flags_
> Set custom git flags for a specific repository.

# DESCRIPTION

**gita** is a command-line tool for managing multiple Git repositories simultaneously. It provides a unified view of repository statuses and allows batch execution of git commands across all tracked repos from any working directory, without needing to cd into each one individually.

Repositories are registered with **gita add** and their paths are stored in **$XDG_CONFIG_HOME/gita/repos.csv**. Once registered, **gita ll** displays a color-coded summary of each repo's branch, sync state (ahead/behind remote), and working tree modifications. Git commands like **fetch** and **pull** can be delegated to all repos at once, and arbitrary git or shell commands can be run via **super** and **shell** subcommands.

Repos can be organized into named **groups** and scoped with **context** to limit operations to a subset. Configuration files for groups, colors, display info, and custom commands are stored in **$XDG_CONFIG_HOME/gita/**.

# CAVEATS

Requires **Python 3.6+**. Batch operations run asynchronously across repos, but commands requiring user interaction (such as **log**, **difftool**, **mergetool**) run synchronously to avoid garbled output. By default only **fetch** and **pull** are allowed to run across all repos without specifying targets; other commands require explicit repo names unless custom configuration overrides this. On Windows, ANSI color output must be enabled manually.

# HISTORY

**gita** was created by **nosarthur** and first released in **January 2018**. Written in **Python**, it is distributed via PyPI and installable with pip, pipx, or uv. The name is a play on "git" with an added "a" suggesting management of multiple repos. The project is MIT-licensed and actively maintained.

# SEE ALSO

[git](/man/git)(1), [mr](/man/mr)(1), [ghq](/man/ghq)(1)
