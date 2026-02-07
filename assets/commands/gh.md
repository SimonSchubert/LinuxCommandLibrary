# TAGLINE

GitHub official command line interface

# TLDR

**Clone a repository**

```gh repo clone [owner]/[repo]```

**Create a pull request**

```gh pr create --title "[title]" --body "[description]"```

**List open issues**

```gh issue list```

**View pull request status**

```gh pr status```

**Create a new repo**

```gh repo create [name] --public```

**Open repo in browser**

```gh browse```

# SYNOPSIS

**gh** _command_ [_subcommand_] [_flags_]

# PARAMETERS

**repo**
> Manage repositories.

**pr**
> Manage pull requests.

**issue**
> Manage issues.

**auth**
> Authenticate with GitHub.

**browse**
> Open repository in browser.

**gist**
> Manage gists.

**workflow**
> Manage GitHub Actions workflows.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**gh** is GitHub's official command line tool. It brings GitHub features to the terminal, allowing you to manage repositories, issues, pull requests, and more without leaving your development environment.

The tool integrates deeply with git workflows, enabling seamless transitions between local development and GitHub collaboration. It supports interactive prompts for complex operations and scripted automation for CI/CD pipelines.

gh provides a unified interface for GitHub's REST and GraphQL APIs with built-in authentication and configuration management.

# CONFIGURATION

**~/.config/gh/config.yml**
> User configuration including default settings, authentication tokens, and preferences.

**~/.config/gh/hosts.yml**
> Authentication credentials for GitHub.com and GitHub Enterprise instances.

# CAVEATS

Requires authentication via **gh auth login**. Some features need appropriate repository permissions. API rate limits apply.

# HISTORY

gh was released by **GitHub** in **2020** as the successor to hub. It's written in Go and designed to be the official CLI companion to GitHub, supporting both github.com and GitHub Enterprise.

# SEE ALSO

[git](/man/git)(1), [hub](/man/hub)(1), [gh-auth](/man/gh-auth)(1), [gh-pr](/man/gh-pr)(1)
