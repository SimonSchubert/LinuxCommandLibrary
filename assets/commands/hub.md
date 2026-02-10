# TAGLINE

extends git with GitHub integration

# TLDR

**Clone repository**

```hub clone [user/repo]```

**Create pull request**

```hub pull-request```

**Fork repository**

```hub fork```

**Create issue**

```hub issue create```

**Browse repository**

```hub browse```

**Create release**

```hub release create [tag]```

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

**--help**
> Display help information.

# DESCRIPTION

**hub** extends git with GitHub integration. It adds commands for pull requests, forks, issues, and other GitHub operations.

The tool wraps git commands and adds GitHub-specific functionality. It can be aliased as git for seamless integration.

# CAVEATS

Superseded by GitHub CLI (gh). Requires authentication. Git wrapper.

# HISTORY

hub was created by **GitHub** as a command-line wrapper for git, later superseded by the official **gh** CLI.

# SEE ALSO

[gh](/man/gh)(1), [git](/man/git)(1), [gist](/man/gist)(1)
