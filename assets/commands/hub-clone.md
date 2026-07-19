# TAGLINE

clones GitHub repositories using shorthand notation

# TLDR

**Clone with shorthand**

```hub clone [user/repo]```

**Clone to directory**

```hub clone [user/repo] [directory]```

**Clone with depth**

```hub clone --depth [1] [user/repo]```

**Clone own repository**

```hub clone [repo-name]```

# SYNOPSIS

**hub clone** [_options_] _repository_ [_directory_]

# PARAMETERS

_[USER/]REPOSITORY_
> Repository to clone. _USER_ defaults to your own GitHub username when omitted.

_DIRECTORY_
> Target directory to clone into (default: the repository name).

**-p**
> (Deprecated) Clone a private repository over SSH.

**--depth** _N_
> Create a shallow clone with the given commit history depth. Passed straight through to git clone.

**-b**, **--branch** _BRANCH_
> Checkout _BRANCH_ instead of the remote's default branch. Passed straight through to git clone.

**--help**
> Display help information.

# DESCRIPTION

**hub clone** expands GitHub shorthand (`user/repo`, or just `repo` for your own repositories) into a full clone URL and then hands off to a normal **git clone**, so any git-clone option (**--depth**, **-b**, **--recurse-submodules**, etc.) works as-is. Without a `user/` prefix, hub assumes the repository belongs to the authenticated GitHub user.

By default hub clones over HTTPS; set `git config --global hub.protocol ssh` to have it generate SSH URLs instead for **clone**, **fork**, and related commands.

# CAVEATS

Hub is no longer actively maintained and has been superseded by the official GitHub CLI (**gh**, via **gh repo clone**). GitHub authentication is only needed for private repositories or to resolve `repo` (no user) shorthand against your own account; cloning a public `user/repo` works without it.

# HISTORY

hub clone is part of **hub**, GitHub's original command-line tool that predates the official **gh** CLI.

# SEE ALSO

[hub](/man/hub)(1), [git-clone](/man/git-clone)(1), [gh](/man/gh)(1)

# RESOURCES

```[Source code](https://github.com/mislav/hub)```

<!-- verified: 2026-07-19 -->
