# TAGLINE

Official GitLab CLI tool

# TLDR

**Create merge request**

```glab mr create```

**List merge requests**

```glab mr list```

**View merge request**

```glab mr view [number]```

**Create issue**

```glab issue create```

**List issues**

```glab issue list```

**Clone repository**

```glab repo clone [owner/repo]```

**View CI/CD pipelines**

```glab ci list```

# SYNOPSIS

**glab** _command_ [_options_]

# PARAMETERS

**mr** _subcommand_
> Merge request operations (create, list, view, merge, close).

**issue** _subcommand_
> Issue operations (create, list, view, close).

**repo** _subcommand_
> Repository operations (clone, fork, view).

**ci** _subcommand_
> CI/CD operations (list, view, run, trace).

**auth** _subcommand_
> Authentication (login, status, logout).

**config** _subcommand_
> Configuration management.

**api** _endpoint_
> Raw API access.

**--repo**, **-R** _repo_
> Target repository.

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
