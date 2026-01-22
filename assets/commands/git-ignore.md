# TLDR

**Add to gitignore**

```git ignore [pattern]```

**Add multiple patterns**

```git ignore "*.log" "*.tmp"```

**Show current ignores**

```git ignore```

**Add to global gitignore**

```git ignore --global [pattern]```

# SYNOPSIS

**git ignore** [_options_] [_patterns_]

# PARAMETERS

_PATTERNS_
> Patterns to add to .gitignore.

**--global**
> Add to global gitignore.

**--local**
> Add to local .gitignore (default).

**--help**
> Display help information.

# DESCRIPTION

**git ignore** manages .gitignore entries. It adds patterns to the repository's .gitignore or the global gitignore file, simplifying ignore rule management.

Without arguments, it displays the current .gitignore contents. The command handles proper formatting and avoids duplicates.

git ignore provides easy gitignore file editing.

# CAVEATS

Part of git-extras package. Creates .gitignore if missing. Already tracked files need manual untracking.

# HISTORY

git ignore is part of **git-extras**, providing a command-line interface for the common task of editing gitignore files.

# SEE ALSO

[git-check-ignore](/man/git-check-ignore)(1), [gibo](/man/gibo)(1), [gitignore](/man/gitignore)(5)
