# TLDR

**Scan a local directory** for secrets

```noseyparker scan --datastore [db.np] [path/to/directory]```

**Scan a Git repository** by URL

```noseyparker scan --datastore [db.np] --git-url [https://github.com/user/repo]```

**Report findings** from a datastore

```noseyparker report --datastore [db.np]```

**Report in JSON format**

```noseyparker report --datastore [db.np] --format json```

**Scan with specific rules** only

```noseyparker scan --datastore [db.np] --rules [path/to/rules.yml] [path/to/directory]```

**List available built-in rules**

```noseyparker rules list```

**Summarize datastore contents**

```noseyparker summarize --datastore [db.np]```

# SYNOPSIS

**noseyparker** _command_ [_options_]

# PARAMETERS

**scan**
> Scan inputs for secrets and store findings in a datastore.

**report**
> Report findings from a datastore.

**summarize**
> Summarize datastore contents without detailed findings.

**rules**
> Manage and inspect detection rules.

**github**
> Interact with GitHub for scanning repositories.

**--datastore** _PATH_
> Path to the datastore (required for scan/report/summarize).

**--git-url** _URL_
> Clone and scan a Git repository from URL.

**--format** _FORMAT_
> Output format for report (human, json, jsonl, sarif).

**--rules** _PATH_
> Path to custom rules file (YAML format).

**--max-file-size** _BYTES_
> Skip files larger than specified size.

**--jobs** _N_
> Number of parallel scanning jobs.

**--ignore** _PATTERN_
> Glob patterns for paths to ignore.

**--blob-metadata**
> Include blob metadata in findings.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**Nosey Parker** is a command-line tool for detecting secrets and sensitive information in textual data and Git repositories. It scans source code, configuration files, and commit history to find accidentally committed credentials, API keys, private keys, and other sensitive data.

The tool uses a datastore model where scan results are persisted to a local database, allowing incremental scanning and deduplication of findings. Multiple scans can feed into the same datastore, and reports can be generated at any time from the accumulated data.

Nosey Parker includes over 150 built-in detection rules covering common secret patterns like AWS keys, GitHub tokens, private SSH keys, database connection strings, and more. Custom rules can be defined in YAML format for organization-specific patterns.

The scanner is written in Rust for high performance and can process large codebases quickly. It performs content-aware scanning that understands Git history, examining all commits and branches rather than just the current state.

# CAVEATS

Scan results may include false positives that require manual review. The datastore must be specified for most operations and grows with accumulated findings. Scanning large repositories with full Git history can be memory-intensive. Some detection rules may not catch obfuscated or encoded secrets.

# HISTORY

Nosey Parker was created by **Praetorian** and released as open source in **2023**. It was designed as a modern alternative to tools like truffleHog and git-secrets, emphasizing performance and accuracy. The Rust implementation provides significant speed improvements over Python-based alternatives. Development continues actively with regular rule updates and feature additions.

# SEE ALSO

[git-secrets](/man/git-secrets)(1), [trufflehog](/man/trufflehog)(1), [gitleaks](/man/gitleaks)(1), [detect-secrets](/man/detect-secrets)(1)
