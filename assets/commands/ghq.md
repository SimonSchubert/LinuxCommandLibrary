# TLDR

**Clone a repository**

```ghq get [https://github.com/owner/repo]```

**List managed repositories**

```ghq list```

**List with full paths**

```ghq list -p```

**Get repository root**

```ghq root```

**Create new repository**

```ghq create [owner]/[repo]```

# SYNOPSIS

**ghq** _command_ [_options_] [_arguments_]

# PARAMETERS

**get** _URL_
> Clone or sync a repository.

**list**
> List local repositories.

**root**
> Show repository root path.

**create** _NAME_
> Create a new repository.

**-p**
> Show full paths (list).

**--update**
> Update existing repository.

**--shallow**
> Shallow clone.

**--help**
> Display help information.

# DESCRIPTION

**ghq** manages remote repository clones in a structured directory hierarchy. It clones repositories into organized paths based on their URLs, enabling consistent repository organization across projects.

The tool integrates with shell workflows and fuzzy finders like fzf for quick repository navigation. It supports GitHub, GitLab, Bitbucket, and custom Git hosts.

ghq simplifies managing many repositories with predictable paths.

# CAVEATS

Requires git. Default root is ~/ghq or configurable. URL parsing determines directory structure.

# HISTORY

ghq was created by **motemen** as a tool for organizing Git repositories, inspired by go get's directory structure conventions.

# SEE ALSO

[git](/man/git)(1), [fzf](/man/fzf)(1), [gh](/man/gh)(1)
