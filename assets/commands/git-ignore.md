# TAGLINE

Manage gitignore entries

# TLDR

**Add to gitignore**

```git ignore [pattern]```

**Add multiple patterns**

```git ignore "*.log" "*.tmp"```

**Show current ignores**

```git ignore```

**Add to global gitignore**

```git ignore --global [pattern]```

**Add to private exclude file**

```git ignore --private [pattern]```

# SYNOPSIS

**git ignore** [_options_] [_patterns_]

# PARAMETERS

_PATTERNS_
> Patterns to add to .gitignore.

**-l**, **--local**
> Add to local .gitignore (default).

**-g**, **--global**
> Add to global gitignore.

**-p**, **--private**
> Add to private exclude file (.git/info/exclude).

**--help**
> Display help information.

# DESCRIPTION

**git ignore** manages .gitignore entries, adding patterns to the repository's .gitignore or the global gitignore file. Without arguments, it displays the current .gitignore contents.

Part of the git-extras suite, the command handles proper formatting and avoids duplicates. It creates .gitignore if the file does not exist.

# CONFIGURATION

**.gitignore**
> Repository-level ignore patterns managed by this command.

**.git/info/exclude**
> Private exclude patterns for the repository when using --private.

**~/.gitignore_global**
> Global ignore patterns applied to all repositories when using --global.

# CAVEATS

Part of git-extras package. Creates .gitignore if missing. Already tracked files need manual untracking.

# HISTORY

git ignore is part of **git-extras**, providing a command-line interface for the common task of editing gitignore files.

# SEE ALSO

[git-check-ignore](/man/git-check-ignore)(1), [git-extras](/man/git-extras)(1), [gibo](/man/gibo)(1)
