# TAGLINE

Official GitLab CLI tool

# TLDR

**Authenticate with GitLab**

```glab auth login```

**Create a merge request**

```glab mr create```

**List merge requests**

```glab mr list```

**View a merge request**

```glab mr view [number]```

**Create an issue**

```glab issue create```

**Clone a repository**

```glab repo clone [owner/repo]```

**View CI/CD pipelines**

```glab ci list```

**Make a raw API request**

```glab api [/projects/:id/issues]```

# SYNOPSIS

**glab** _command_ [_options_]

# PARAMETERS

**mr** _subcommand_
> Merge request operations (create, list, view, merge, close, checkout, approve).

**issue** _subcommand_
> Issue operations (create, list, view, close, reopen, note).

**repo** _subcommand_
> Repository operations (clone, fork, view, archive).

**ci** _subcommand_
> CI/CD pipeline operations (list, view, run, trace, retry).

**auth** _subcommand_
> Authentication (login, status, logout).

**release** _subcommand_
> Manage releases (create, list, view, delete).

**config** _subcommand_
> Configuration management.

**api** _endpoint_
> Make authenticated API requests to GitLab.

**snippet** _subcommand_
> Create and manage code snippets.

**variable** _subcommand_
> Manage CI/CD variables.

**label** _subcommand_
> Manage project labels.

**-R** _repo_, **--repo** _repo_
> Target repository (owner/repo format).

# DESCRIPTION

**glab** is the official GitLab CLI tool. It provides command-line access to GitLab features including merge requests, issues, CI/CD pipelines, and repository management.

The tool mirrors the `gh` CLI's approach for GitHub, providing a familiar interface for GitLab users. It supports both GitLab.com and self-hosted instances.

# CONFIGURATION

**~/.config/glab-cli/config.yml**
> Configuration file storing authentication tokens, default settings, and host configurations.

# CAVEATS

Requires GitLab access token. Some features may require specific permissions. Self-hosted instances need hostname configuration. API rate limits apply.

# HISTORY

glab was created by **Clement Sam** and later became the official GitLab CLI. It was inspired by GitHub's gh CLI and provides similar functionality for GitLab users.

# SEE ALSO

[gh](/man/gh)(1), [git](/man/git)(1), [gitlab-runner](/man/gitlab-runner)(1)
