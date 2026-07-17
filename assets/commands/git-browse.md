# TAGLINE

Open repository in web browser

# TLDR

**Open the current repository** in the browser, using its current commit/branch

```git browse```

**Open a specific remote's repository**

```git browse [upstream]```

**Open a specific file** on a remote

```git browse [upstream] [path/to/file]```

**Jump to a specific line** in a file

```git browse [upstream] [path/to/file] [42]```

**Jump to a range of lines** in a file

```git browse [upstream] [path/to/file] [1] [42]```

# SYNOPSIS

**git** **browse** [_remote-name_] [_filename_] [_line1_] [_line2_]

# PARAMETERS

_REMOTE-NAME_
> Remote to browse; defaults to the current branch's tracked remote, or **origin**.

_FILENAME_
> Path (relative to repo root) of a file to open on the remote.

_LINE1_
> Starting line number to highlight (requires _filename_).

_LINE2_
> Ending line number, to highlight a range (requires _line1_).

# DESCRIPTION

**git browse** is a git-extras command that detects the current repository's remote URL and opens it in the default web browser. It recognizes GitHub, GitLab, and Bitbucket remotes and builds the correct web URL format for each, including deep links to a specific file and line (or line range) at the current commit or branch.

SSH remotes (**git@host:user/repo.git**) are converted to HTTPS automatically. Without a filename, it just opens the repository's landing page for the current commit/branch.

# CAVEATS

Only recognizes GitHub, GitLab, and Bitbucket remote URL formats. Requires a browser opener (**open**, **xdg-open**, or **start**) available on the system.

# SEE ALSO

[gh-browse](/man/gh-browse)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-browse)```

<!-- verified: 2026-07-17 -->

