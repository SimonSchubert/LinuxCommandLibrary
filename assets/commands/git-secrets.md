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

**git-secrets** prevents committing secrets and credentials to Git repositories. It installs hooks that scan staged changes against configurable patterns before allowing commits.

The tool was created by AWS Labs to prevent accidental AWS credential commits. It supports custom patterns for other types of secrets.

# CONFIGURATION

```bash
# Global installation
git secrets --install ~/.git-templates/git-secrets
git config --global init.templateDir ~/.git-templates/git-secrets

# Add patterns
git secrets --add 'password\s*=\s*.+'
git secrets --add-allowed 'password = "example"'
```

# CAVEATS

Must be installed per-repo or via templates. Only catches patterns, not all secrets. History scanning is slow on large repos. Consider tools like gitleaks for comprehensive scanning.

# HISTORY

git-secrets was created by **AWS Labs** to prevent AWS credential leaks. It's one of several tools addressing the widespread problem of secrets accidentally committed to version control.

# SEE ALSO

[git](/man/git)(1), [gitleaks](/man/gitleaks)(1), [trufflehog](/man/trufflehog)(1), [detect-secrets](/man/detect-secrets)(1)
