# TAGLINE

Fork GitHub repository and clone locally

# TLDR

**Fork and clone repository**

```git fork [https://github.com/owner/repo]```

**Fork current repo's upstream**

```git fork```

# SYNOPSIS

**git fork** [_url_]

# PARAMETERS

_URL_
> Repository URL to fork.

**--help**
> Display help information.

# DESCRIPTION

**git fork** forks a GitHub repository and clones it locally, automating the common workflow of forking a project for contribution. It uses the GitHub API to create the fork, then clones your fork and configures the original as upstream, setting up the standard contribution workflow.

Part of the git-extras suite, this command streamlines the fork-and-clone pattern that is fundamental to open-source collaboration on GitHub.

# CAVEATS

Part of git-extras package. Requires GitHub authentication. GitHub-specific functionality.

# HISTORY

git fork is part of **git-extras**, created to automate the common GitHub fork workflow for contributing to projects.

# SEE ALSO

[git-clone](/man/git-clone)(1), [gh-repo](/man/gh-repo)(1), [git-remote](/man/git-remote)(1)
