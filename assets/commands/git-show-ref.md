# TAGLINE

List references in the local repository

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

**git show-ref** [**--head**] [**-d** | **--dereference**] [**-s** | **--hash**[=_N_]] [**--abbrev**[=_N_]] [**--branches**] [**--tags**] [--] [_pattern_...]

**git show-ref** **--verify** [**-q** | **--quiet**] [**-d** | **--dereference**] [**-s** | **--hash**[=_N_]] [**--abbrev**[=_N_]] [--] [_ref_...]

**git show-ref** **--exists** _ref_

**git show-ref** **--exclude-existing**[=_pattern_]

# PARAMETERS

_PATTERN_
> Match refs whose end matches the pattern (matched in complete parts).

**--head**
> Include the HEAD reference, which is filtered out by default.

**--branches**
> Limit to local branches (refs/heads). Replaces the older **--heads**, which still works as an alias.

**--tags**
> Limit to local tags (refs/tags).

**--verify**
> Require the argument to be an exact ref path (e.g. refs/heads/main). Errors if the ref does not exist.

**--exists** _ref_
> Check whether a ref exists. Exit code 0 = exists, 2 = missing, 1 = error.

**--exclude-existing**[=_pattern_]
> Filter mode. Reads refs from stdin and prints those that do not exist locally, optionally limited to refs matching the pattern suffix.

**-q**, **--quiet**
> Suppress output. Use the exit code only.

**-s**, **--hash**[=_N_]
> Print only the object name (optionally abbreviated to _N_ hex digits), not the ref name.

**--abbrev**[=_N_]
> Abbreviate the printed object name to _N_ hex digits (default uses **core.abbrev**).

**-d**, **--dereference**
> For tag objects, also print the dereferenced commit, suffixed with **^{}**.

# DESCRIPTION

**git show-ref** lists references in the local repository, showing SHA-1 hashes and ref names for branches, tags, and other refs. It is a plumbing command commonly used in scripts.

The verify mode checks whether a specific ref exists without listing all refs, returning an appropriate exit code.

# CAVEATS

Plumbing command. Shows local refs only. Use git ls-remote for remote refs.

# HISTORY

git show-ref is a core **Git** plumbing command for reference inspection, commonly used in scripts.

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

[git-ls-remote](/man/git-ls-remote)(1), [git-for-each-ref](/man/git-for-each-ref)(1)
