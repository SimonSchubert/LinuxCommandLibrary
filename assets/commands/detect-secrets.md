# TAGLINE

detect secrets accidentally committed to repositories

# TLDR

**Scan a directory for secrets**

```detect-secrets scan [path/to/directory]```

**Scan and create baseline file**

```detect-secrets scan > [.secrets.baseline]```

**Audit baseline file**

```detect-secrets audit [.secrets.baseline]```

**Scan specific files**

```detect-secrets scan [file1] [file2]```

**Scan with all plugins**

```detect-secrets scan --all-files [path]```

**Update existing baseline**

```detect-secrets scan --baseline [.secrets.baseline]```

**Run as pre-commit hook**

```detect-secrets-hook --baseline [.secrets.baseline]```

# SYNOPSIS

**detect-secrets** _command_ [_options_] [_path_]

# PARAMETERS

**scan**
> Scan files for potential secrets.

**audit**
> Interactively audit detected secrets.

**--baseline** _file_
> Use existing baseline for comparison.

**--all-files**
> Scan all files, not just tracked by git.

**--exclude-files** _regex_
> Regex pattern for files to exclude.

**--exclude-lines** _regex_
> Regex pattern for lines to exclude.

**--exclude-secrets** _regex_
> Regex pattern for secret values to exclude.

**--list-all-plugins**
> List available detection plugins.

**--no-verify**
> Disable verification of detected secrets.

**-f**, **--force-use-all-plugins**
> Enable all detection plugins.

# DESCRIPTION

**detect-secrets** is a tool for detecting secrets (passwords, API keys, tokens) accidentally committed to code repositories. It scans files for patterns matching known secret formats and flags potential exposures.

The tool uses multiple detection plugins: high-entropy strings, keyword patterns (password, api_key), and format-specific detectors (AWS keys, private keys, etc.). A baseline file tracks known secrets to avoid repeated alerts on intentional entries.

The audit workflow allows reviewing detected secrets interactively, marking them as true positives, false positives, or skipped. Pre-commit hook integration prevents new secrets from being committed.

# PLUGINS

**ArtifactoryDetector**: Artifactory tokens
**AWSKeyDetector**: AWS access keys
**Base64HighEntropyString**: High-entropy base64
**BasicAuthDetector**: Basic auth credentials
**HexHighEntropyString**: High-entropy hex strings
**JwtTokenDetector**: JWT tokens
**KeywordDetector**: Secret keywords
**PrivateKeyDetector**: Private key headers
**SlackDetector**: Slack tokens

# CONFIGURATION

**.secrets.baseline**
> Baseline file tracking known secrets and audit decisions.

# CAVEATS

High-entropy detectors may produce false positives on random strings, UUIDs, or hashes. Baseline must be maintained as code changes. Some detection relies on patterns that may not catch obfuscated secrets. Does not scan git history by default.

# HISTORY

detect-secrets was developed at **Yelp** and open-sourced in **2018**. It was created to prevent secret leakage in their large codebase. The plugin architecture allows extending detection capabilities. The tool has been adopted widely as part of secure development practices and CI/CD pipelines.

# SEE ALSO

[git-secrets](/man/git-secrets)(1), [trufflehog](/man/trufflehog)(1), [gitleaks](/man/gitleaks)(1)
