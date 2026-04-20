# TAGLINE

Detect secrets and sensitive data in Git repositories

# TLDR

**Scan a Git repository's history**

```gitleaks git [path/to/repo]```

**Scan a directory on disk** (no git history)

```gitleaks dir [path]```

**Scan piped input**

```cat [file] | gitleaks stdin```

**Write a JSON report**

```gitleaks git --report-format json --report-path [report.json]```

**Use a custom config and ignore a baseline**

```gitleaks git --config [.gitleaks.toml] --baseline-path [baseline.json]```

**Deprecated form still accepted**

```gitleaks detect --source [path]```

# SYNOPSIS

**gitleaks** _command_ [_options_]

# COMMANDS

**git** [_path_]
> Scan a Git repository's commit log. This is the replacement for the old `detect` command.

**dir** [_path_] (aliases: **files**, **directory**)
> Scan a directory tree on disk without consulting git.

**stdin**
> Read raw text from standard input and scan it. Useful for pre-commit hooks or piping diff output.

**version**
> Print the gitleaks version.

**completion** _shell_
> Emit shell completion for bash, zsh, fish or powershell.

**detect**, **protect**
> Deprecated since v8.19.0 but still functional; hidden from `--help`. Prefer **git** or **stdin** instead.

# PARAMETERS

**-c**, **--config** _FILE_
> Path to a gitleaks TOML configuration.

**-f**, **--report-format** _FORMAT_
> Output format: `json`, `csv`, `junit`, `sarif`, `template`.

**-r**, **--report-path** _FILE_
> Output file path. Without it, findings only print to the terminal.

**-b**, **--baseline-path** _FILE_
> Ignore any finding already present in an earlier report (noise reduction).

**-v**, **--verbose**
> Print each finding as it is discovered.

**-l**, **--log-level** _LEVEL_
> Logger verbosity (debug, info, warn, error).

**--exit-code** _N_
> Exit code to emit when at least one leak is detected (default `1`).

**--max-decode-depth** _N_
> Recursively decode base64/hex payloads up to this depth.

**--max-archive-depth** _N_
> Descend into archives (zip, tar, …) up to this depth.

**--help**
> Display help information.

# DESCRIPTION

**gitleaks** scans text for secrets such as API keys, tokens and passwords. It can inspect the entire commit log of a Git repository, arbitrary directories on disk, or a stream arriving on stdin.

Rules are regular expressions defined in the bundled default config or a user-supplied `.gitleaks.toml`. Each rule can carry an allowlist (paths, regexes, stopwords) to suppress known-false positives. Findings can be exported as JSON, CSV, JUnit or SARIF for CI ingestion.

A typical pre-commit hook runs `git diff --cached | gitleaks stdin --no-banner`; CI jobs use `gitleaks git --exit-code 2 --report-format sarif --report-path leaks.sarif`.

# CONFIGURATION

**.gitleaks.toml**
> Custom rules configuration file defining regex patterns, allowlists, and scanning behavior. An `extend.useDefault = true` key inherits the shipped ruleset.

# CAVEATS

False positives are common — refine rules or add an allowlist. History scanning over large repos is slow; use **--baseline-path** to track only new findings. The legacy `protect` command has been superseded by `git`/`stdin`.

# HISTORY

gitleaks was created by **Zachary Rice** to address the security risk of secrets accidentally committed to git repositories. Version 8.19.0 reorganized the CLI around **git**, **dir** and **stdin**, deprecating the earlier `detect`/`protect` commands.

# SEE ALSO

[trufflehog](/man/trufflehog)(1), [git-secret](/man/git-secret)(1), [detect-secrets](/man/detect-secrets)(1)
