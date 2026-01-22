# TLDR

**List all refs**

```git show-ref```

**Show heads only**

```git show-ref --heads```

**Show tags only**

```git show-ref --tags```

**Verify ref exists**

```git show-ref --verify refs/heads/main```

**Quiet mode**

```git show-ref -q --verify refs/heads/main```

# SYNOPSIS

**git show-ref** [_options_] [_pattern_]

# PARAMETERS

_PATTERN_
> Filter refs by pattern.

**--heads**
> Show only heads.

**--tags**
> Show only tags.

**--verify**
> Verify ref exists.

**-q**, **--quiet**
> No output, exit code only.

**--hash**
> Show hash only.

**-d**, **--dereference**
> Dereference tags.

**--help**
> Display help information.

# DESCRIPTION

**git show-ref** lists references in the repository. It shows SHA-1 hashes and ref names for branches, tags, and other refs.

The command is useful for scripting and ref verification. Verify mode checks if a specific ref exists without listing all refs.

git show-ref provides ref enumeration and verification.

# CAVEATS

Plumbing command. Shows local refs only. Use git ls-remote for remote refs.

# HISTORY

git show-ref is a core **Git** plumbing command for reference inspection, commonly used in scripts.

# SEE ALSO

[git-ls-remote](/man/git-ls-remote)(1), [git-for-each-ref](/man/git-for-each-ref)(1)
