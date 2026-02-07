# TAGLINE

List remote repository references

# TLDR

**List remote refs**

```git ls-remote [origin]```

**Show only tags**

```git ls-remote --tags [origin]```

**Show only heads**

```git ls-remote --heads [origin]```

**Show specific ref**

```git ls-remote [origin] [refs/heads/main]```

**List refs for URL**

```git ls-remote [https://github.com/owner/repo.git]```

# SYNOPSIS

**git ls-remote** [_options_] [_repository_] [_refs_]

# PARAMETERS

_REPOSITORY_
> Remote name or URL.

_REFS_
> Specific refs to show.

**--heads**
> Show only heads (branches).

**--tags**
> Show only tags.

**--refs**
> Show refs only, no peeled tags.

**--get-url**
> Show remote URL.

**--exit-code**
> Exit with error if no refs found.

**--help**
> Display help information.

# DESCRIPTION

**git ls-remote** lists references in a remote repository without downloading any objects. It shows branches, tags, and their commit hashes, useful for checking remote state before fetching.

The command queries the remote directly, showing current refs at query time. This enables checking tag existence, verifying branch status, or scripting against remote repository state. It works with both named remotes and direct URLs.

# CAVEATS

Requires network access. Shows refs at query time. Large repos may have many refs.

# HISTORY

git ls-remote is a core **Git** command for inspecting remote references, useful for automation and verification.

# SEE ALSO

[git-remote](/man/git-remote)(1), [git-fetch](/man/git-fetch)(1), [git-ls-tree](/man/git-ls-tree)(1)
