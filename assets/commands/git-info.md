# TAGLINE

Display comprehensive repository information

# TLDR

**Show repository info**

```git info```

**Show repository info with colored titles**

```git info --color```

**Show repository info without configuration details**

```git info --no-config```

# SYNOPSIS

**git info** [_options_]

# PARAMETERS

**-c**, **--color**
> Use color for information titles.

**--no-config**
> Do not display configuration info section.

**--help**
> Display help information.

# DESCRIPTION

**git info** displays comprehensive repository information in a single formatted view, including remote URLs, remote branches, local branches, submodules (if any), most recent commit, and configuration settings.

Part of the **git-extras** suite, this command gives a snapshot of the current repository state without needing to run multiple separate git commands. The output format for the most recent commit and configuration info can be customized via `git config --global --add git-extras.info.log "<log-command>"` and `git config --global --add git-extras.info.config-grep "<config-grep-command>"`.

# CAVEATS

Requires the **git-extras** package to be installed. Must be run inside a git repository. All information is gathered from the local repository; no network access is required.

# HISTORY

git info is part of **git-extras**, created by **TJ Holowaychuk** to provide a single command for repository overview.

# SEE ALSO

[git-status](/man/git-status)(1), [git-remote](/man/git-remote)(1), [git-log](/man/git-log)(1)
