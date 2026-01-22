# TLDR

**Show repository info**

```git info```

**Show remote info**

```git info --remote```

# SYNOPSIS

**git info** [_options_]

# PARAMETERS

**--remote**
> Include remote information.

**--help**
> Display help information.

# DESCRIPTION

**git info** displays comprehensive repository information. It shows configuration, remotes, branch status, and recent commits in a single formatted view.

The output includes repository name, remote URLs, branch information, last commit details, and file statistics. It provides a quick overview of repository state.

git info gives a snapshot of the current repository status.

# CAVEATS

Part of git-extras package. Information varies by repository state. Some info requires network.

# HISTORY

git info is part of **git-extras**, created by **TJ Holowaychuk** to provide a single command for repository overview.

# SEE ALSO

[git-status](/man/git-status)(1), [git-remote](/man/git-remote)(1), [git-log](/man/git-log)(1)
