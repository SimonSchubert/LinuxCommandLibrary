# TAGLINE

list, search, and create git aliases

# TLDR

**List** all aliases

```git alias```

**Search** aliases matching a pattern

```git alias [pattern]```

**Create** an alias

```git alias [co] "[checkout]"```

**Create** an alias in the global config

```git alias --global [st] "[status -sb]"```

**Create** an alias only for this repository

```git alias --local [dc] "[diff --cached]"```

**Create** an alias that runs a shell command

```git alias [amend] "[!git commit --amend --no-edit]"```

# SYNOPSIS

**git alias** [_options_]

**git alias** [_options_] _search-pattern_

**git alias** [_options_] _alias-name_ _command_

# PARAMETERS

**--global**
> Show or create the alias in the global (user) config.

**--local**
> Show or create the alias in the repository config.

_search-pattern_
> Show only aliases matching this pattern. It is passed to **grep**, so it is a regular expression, not a glob.

_alias-name_ _command_
> Create an alias mapping _alias-name_ to _command_.

# DESCRIPTION

**git alias** is a git-extras helper for managing the **[alias]** section of your git config. It is a thin wrapper around **git config**, but with a syntax short enough to use casually.

With no arguments it lists every alias git can see, formatted as **name = command** and sorted. With one argument it filters that list. With two it creates an alias: **git alias co checkout** makes **git co** run **git checkout**.

An alias whose command starts with **!** is run as a shell command rather than a git subcommand, which is how aliases that chain commands or take arguments are written.

Without **--global** or **--local**, listing shows the merged view of all config levels, and creating writes wherever plain **git config** would, which is normally the repository's **.git/config** when you are inside a repository.

# CONFIGURATION

**~/.gitconfig**
> Global aliases, written by **--global**, in the **[alias]** section.

**.git/config**
> Repository-local aliases, written by **--local**.

# CAVEATS

The **--global** option writes to your user config (**~/.gitconfig**), despite the built-in help describing it as "the system config". True system-wide config is **git config --system**, which this wrapper does not expose.

Creating an alias silently overwrites an existing one of the same name; there is no confirmation and no way to undo it other than rewriting the value.

The search pattern goes to **grep** unquoted, so characters like **.** and ***** are regex metacharacters and match more than you might expect.

Aliases cannot shadow built-in git commands. **git alias status "log"** is accepted by the config but git will keep running the real **status**.

Passing more than two arguments is an error, so a multi-word command must be quoted as a single argument.

# HISTORY

**git alias** is part of **git-extras**, created by **TJ Holowaychuk** in **2010** and now community-maintained. Git's own alias mechanism, which this wraps, has existed in **git config** since the early days of git.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-config](/man/git-config)(1), [git-extras](/man/git-extras)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-alias)```

<!-- verified: 2026-07-16 -->
