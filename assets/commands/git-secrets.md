# TAGLINE

Prevent committing secrets and credentials to Git

# TLDR

**Install hooks in repository**

```git secrets --install```

**Add AWS patterns**

```git secrets --register-aws```

**Add custom pattern**

```git secrets --add '[pattern]'```

**Scan repository**

```git secrets --scan```

**Scan specific file**

```git secrets --scan [file.txt]```

**List patterns**

```git secrets --list```

# SYNOPSIS

**git secrets** _command_ [_options_]

# PARAMETERS

**--install**
> Install hooks in current repo.

**--register-aws**
> Add AWS secret patterns.

**--add** _pattern_
> Add forbidden pattern.

**--add-allowed** _pattern_
> Add allowed pattern (exception).

**--scan**
> Scan repository for secrets.

**--scan-history**
> Scan entire commit history.

**--list**
> List registered patterns.

**--add-provider** _cmd_
> Add secret provider command.

# DESCRIPTION

**git-secrets** prevents committing secrets and credentials to Git repositories. It installs pre-commit hooks that scan staged changes against configurable patterns, blocking commits that match known secret formats.

Created by AWS Labs, it includes built-in patterns for AWS credentials and supports custom patterns for other types of secrets.

# CONFIGURATION

**~/.git-templates/git-secrets/**
> Global git template directory for automatic hook installation in new repositories.

# CAVEATS

Must be installed per-repo or via templates. Only catches patterns, not all secrets. History scanning is slow on large repos. Consider tools like gitleaks for comprehensive scanning.

# HISTORY

git-secrets was created by **AWS Labs** to prevent AWS credential leaks. It's one of several tools addressing the widespread problem of secrets accidentally committed to version control.

# SEE ALSO

[git](/man/git)(1), [gitleaks](/man/gitleaks)(1), [trufflehog](/man/trufflehog)(1), [detect-secrets](/man/detect-secrets)(1)
