# TAGLINE

Fork GitHub repository and clone locally

# TLDR

**Fork and clone repository by URL**

```git fork [https://github.com/owner/repo]```

**Fork and clone repository by slug**

```git fork [owner/repo]```

**Fork the current repo (run inside an existing clone)**

```git fork```

# SYNOPSIS

**git fork** [_url_]

# PARAMETERS

_URL_
> Repository URL to fork.

**--help**
> Display help information.

# DESCRIPTION

**git fork** forks a GitHub repository and clones it locally, automating the common workflow of forking a project for contribution. Given a URL or `owner/repo` slug, it forks the repo via the GitHub API, clones the new fork into the current directory, and adds the original as a remote named **upstream**. Run with no argument inside an existing clone of a GitHub repo, it forks that repo, renames the existing **origin** remote to **upstream**, and adds the fork as the new **origin**. Remotes use SSH if configured, otherwise HTTPS.

Part of the git-extras suite, this command streamlines the fork-and-clone pattern that is fundamental to open-source collaboration on GitHub.

# CONFIGURATION

**git-extras.github-personal-access-token**
> Personal access token used to call the GitHub API; set globally with **git config --global --add git-extras.github-personal-access-token \<token\>**, or per-repo to override for a different account.

# CAVEATS

Part of git-extras package. Requires a GitHub personal access token with the appropriate OAuth scopes. GitHub-specific functionality only.

# HISTORY

git fork is part of **git-extras**, created to automate the common GitHub fork workflow for contributing to projects.

# INSTALL

```nix: nix profile install nixpkgs#git-fork```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-clone](/man/git-clone)(1), [gh-repo](/man/gh-repo)(1), [git-remote](/man/git-remote)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/man/git-fork.md)```

<!-- verified: 2026-07-17 -->
