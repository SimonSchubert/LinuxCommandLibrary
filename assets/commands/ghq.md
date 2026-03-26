# TAGLINE

Manage remote repository clones in a structured directory hierarchy

# TLDR

**Clone a repository**

```ghq get [https://github.com/owner/repo]```

**Clone a repository via SSH**

```ghq get -p [owner/repo]```

**List managed repositories**

```ghq list```

**List with full paths**

```ghq list -p```

**Get repository root**

```ghq root```

**Create new repository**

```ghq create [owner]/[repo]```

**Remove a local repository**

```ghq rm [owner/repo]```

**Update an already cloned repository**

```ghq get -u [owner/repo]```

# SYNOPSIS

**ghq** _command_ [_options_] [_arguments_]

# PARAMETERS

**get** _URL_
> Clone a repository. Alias: clone.

**list** [_query_]
> List local repositories, optionally filtered by query.

**root**
> Show repository root path.

**create** _NAME_
> Create a new repository locally.

**rm** _NAME_
> Remove a local repository clone.

**-p**
> Clone via SSH (get) or show full paths (list).

**-u**, **--update**
> Update existing repository (pull --ff-only).

**--shallow**
> Shallow clone (depth 1, Git only).

**--branch** _BRANCH_
> Clone a specific branch.

**--bare**
> Perform a bare clone (Git only).

**--no-recursive**
> Do not clone git submodules.

**-e**, **--exact**
> Require exact query match (list).

**--dry-run**
> Show path without deleting (rm).

**--vcs** _VCS_
> Specify VCS backend: git, svn, hg, darcs, fossil, bzr.

**--help**
> Display help information.

# DESCRIPTION

**ghq** manages remote repository clones in a structured directory hierarchy. It clones repositories into organized paths based on their URLs, enabling consistent repository organization across projects.

The tool integrates with shell workflows and fuzzy finders like **fzf** for quick repository navigation. It supports GitHub, GitLab, Bitbucket, and custom Git hosts.

# CONFIGURATION

**~/.gitconfig**
> Configure repository root path with `ghq.root` setting, default user with `ghq.user`, and per-URL VCS with `ghq.<url>.vcs`.

**GHQ_ROOT**
> Environment variable to override all ghq.root settings.

# CAVEATS

Requires git. Default root is ~/ghq or configurable via ghq.root in gitconfig or GHQ_ROOT env var. URL parsing determines directory structure. Supports multiple VCS backends beyond Git.

# HISTORY

ghq was created by **motemen** as a tool for organizing Git repositories, inspired by go get's directory structure conventions.

# SEE ALSO

[git](/man/git)(1), [fzf](/man/fzf)(1), [gh](/man/gh)(1)
