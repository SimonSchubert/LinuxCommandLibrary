# TAGLINE

Track authorship changes between commits

# TLDR

**Show blame for currently unstaged changes**

```git guilt```

**Show blame delta between two commits**

```git guilt [HEAD~3] [HEAD]```

**Blame delta from origin/main to HEAD**

```git guilt [origin/main]```

**Show emails instead of author names**

```git guilt -e [HEAD~3] [HEAD]```

**Blame delta over the last three weeks**

```git guilt @{3.weeks.ago}```

# SYNOPSIS

**git guilt** [_options_]

**git guilt** [_options_] _since_ [_until_]

# PARAMETERS

_SINCE_
> Starting commit.

_UNTIL_
> Ending commit (default: HEAD).

**-e**, **--email**
> Display author emails instead of names.

**-w**, **--ignore-whitespace**
> Ignore whitespace-only changes when attributing blame.

**-d**, **--debug**
> Output debug information.

**-h**
> Display usage information.

# DESCRIPTION

**git guilt** shows the delta in blame between two commits, calculating which authors gained or lost lines of code between the specified revisions. The output shows net line changes per author as a bar of pluses or minuses, with positive lengths indicating a net gain in attributed lines and negative indicating a net loss. Run with no arguments, it shows the blame count for currently unstaged modified files instead of comparing two revisions.

Part of the git-extras suite, this tool reveals who is actively modifying which areas of the codebase, useful for understanding recent code ownership changes.

# CAVEATS

Part of git-extras package. Blame-based analysis can be slow on large histories. Measures lines, not complexity. Does not support limiting to a specific path.

# HISTORY

git guilt is part of **git-extras**, providing blame-based change tracking named for the act of assigning "guilt" for code; the technique was originally popularized by Tim Pettersen at Atlassian.

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

[git-blame](/man/git-blame)(1), [git-effort](/man/git-effort)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/man/git-guilt.md)```

<!-- verified: 2026-07-17 -->
