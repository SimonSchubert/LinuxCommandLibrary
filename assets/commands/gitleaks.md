# TLDR

**Scan repository**

```gitleaks detect```

**Scan specific path**

```gitleaks detect --source [path]```

**Scan and report**

```gitleaks detect --report-format json --report-path [report.json]```

**Protect pre-commit**

```gitleaks protect```

**Use custom config**

```gitleaks detect --config [.gitleaks.toml]```

# SYNOPSIS

**gitleaks** _command_ [_options_]

# PARAMETERS

**detect**
> Scan for secrets.

**protect**
> Pre-commit hook mode.

**--source** _PATH_
> Repository path.

**--report-format** _FORMAT_
> Output format (json, csv, sarif).

**--report-path** _FILE_
> Output file path.

**--config** _FILE_
> Configuration file.

**--help**
> Display help information.

# DESCRIPTION

**gitleaks** detects secrets and sensitive data in git repositories. It scans commits for API keys, passwords, tokens, and other credentials that shouldn't be in version control.

The tool uses regex patterns to identify common secret formats. It can scan entire history or be used as a pre-commit hook to prevent accidental secret commits.

gitleaks helps maintain security by finding exposed credentials.

# CAVEATS

False positives possible. Custom rules may be needed. History scanning can be slow.

# HISTORY

gitleaks was created by **Zachary Rice** to address the security risk of secrets accidentally committed to git repositories.

# SEE ALSO

[git-secret](/man/git-secret)(1), [trufflehog](/man/trufflehog)(1)
