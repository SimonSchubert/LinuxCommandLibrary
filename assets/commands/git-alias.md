# TAGLINE

List, search, and create git aliases

# TLDR

**List all aliases**

```git alias```

**Search aliases**

```git alias [pattern]```

**Create alias**

```git alias [name] "[command]"```

# SYNOPSIS

**git** **alias** [_pattern_]

**git** **alias** _name_ _command_

# DESCRIPTION

**git alias** is a convenience command from git-extras for managing git aliases. Aliases are shortcuts that let you define custom commands or abbreviations for frequently used git operations.

When invoked without arguments, it displays all currently defined aliases from your **.gitconfig**. With a single argument, it searches for aliases matching the provided pattern. With two arguments, it creates a new alias by adding an entry to your git configuration.

For example, **git alias co checkout** creates an alias so **git co** becomes equivalent to **git checkout**. Aliases can be simple command substitutions or complex shell commands. This tool provides a simpler interface than manually editing **.gitconfig** or using **git config --global alias.name 'command'**.

# CONFIGURATION

**~/.gitconfig**
> Git aliases are stored in the [alias] section of the git configuration file.

# SEE ALSO

[git-config](/man/git-config)(1), [git-extras](/man/git-extras)(1)
