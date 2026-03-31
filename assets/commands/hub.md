# TAGLINE

extends git with GitHub integration

# TLDR

**Clone repository**

```hub clone [user/repo]```

**Create pull request**

```hub pull-request```

**Fork repository**

```hub fork```

**Create issue with title and message**

```hub issue create -m "[title]"```

**Browse repository in browser**

```hub browse```

**Create release with tag**

```hub release create -m "[Release title]" [tag]```

**Open a pull request with a message**

```hub pull-request -m "[title]"```

# SYNOPSIS

**hub** _command_ [_options_]

# PARAMETERS

_COMMAND_
> GitHub command.

**clone**
> Clone repository.

**pull-request**
> Create pull request.

**fork**
> Fork repository.

**issue**
> Issue operations.

**browse**
> Open in browser.

**release**
> Release management.

**create**
> Create repository on GitHub.

**ci-status**
> Show CI status of the current commit.

**api**
> Make GitHub API requests directly.

**--help**
> Display help information.

# DESCRIPTION

**hub** extends git with GitHub integration. It adds commands for pull requests, forks, issues, and other GitHub operations.

The tool wraps git commands and adds GitHub-specific functionality. It can be aliased as git for seamless integration.

# CAVEATS

Hub is no longer actively maintained and has been superseded by the official GitHub CLI (**gh**). Requires GitHub authentication via **GITHUB_TOKEN** or OAuth. When aliased as **git**, hub transparently wraps all standard git commands.

# HISTORY

hub was created by **GitHub** as a command-line wrapper for git, later superseded by the official **gh** CLI.

# SEE ALSO

[gh](/man/gh)(1), [git](/man/git)(1), [gist](/man/gist)(1)
