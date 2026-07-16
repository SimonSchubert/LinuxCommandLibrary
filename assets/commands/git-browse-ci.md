# TAGLINE

open the CI page of a repository in the browser

# TLDR

**Open** the CI page for the current branch's remote

```git browse-ci```

**Open** the CI page for a specific remote

```git browse-ci [upstream]```

# SYNOPSIS

**git browse-ci** [_remote_]

# PARAMETERS

_remote_
> The remote whose CI page to open. Defaults to the remote configured for the current branch, falling back to **origin**.

# DESCRIPTION

**git browse-ci** is a git-extras helper that opens the continuous integration page for your repository in a web browser, saving a trip through the hosting provider's web interface.

It works purely from the remote URL. The remote is normalized from either SSH (**git@host:owner/repo.git**) or HTTP form into a browsable URL, and a per-host suffix is appended to reach the CI section:

- **GitHub** hosts get **/actions**
- **GitLab** hosts get **/-/pipelines**
- **Bitbucket** hosts get **/addon/pipelines/home**

The resulting URL is handed to the platform's opener: **open** on macOS, **start** on Git-Bash, **powershell.exe start** under WSL, and **xdg-open** on Linux and the BSDs.

# CAVEATS

Only **GitHub**, **GitLab** and **Bitbucket** are recognized, and the match is a substring test against the remote URL. Self-hosted instances on a domain that does not contain one of those three words are not detected, and neither are standalone CI services such as CircleCI, Travis CI, Jenkins or Drone, regardless of what the repository actually uses.

When the host is not recognized the CI URL ends up empty, and rather than reporting the problem the command asks the browser to open nothing.

The URL is built by string manipulation on the remote, so it is a guess, not a lookup. It does not check whether CI is configured, or even whether the page exists.

SSH remotes are rewritten to **http://** rather than **https://**, relying on the host to redirect.

# HISTORY

**git browse-ci** is part of **git-extras**, the collection of git helper scripts started by **TJ Holowaychuk** in **2010** and now community-maintained.

# SEE ALSO

[git-browse](/man/git-browse)(1), [git-extras](/man/git-extras)(1), [git-remote](/man/git-remote)(1), [gh-run](/man/gh-run)(1), [xdg-open](/man/xdg-open)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-browse-ci)```

<!-- verified: 2026-07-16 -->
