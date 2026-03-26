# TAGLINE

Lightweight static analysis for code security and quality

# TLDR

**Scan with auto-detected recommended rules**

```semgrep scan --config auto```

**Scan a specific directory**

```semgrep scan --config auto [path/to/src/]```

**Scan with a specific rule pack from the registry**

```semgrep scan --config p/[security-audit]```

**Scan with a local rules file**

```semgrep scan --config [path/to/rules.yaml] [path/to/src/]```

**Scan with an inline pattern**

```semgrep scan -e '[pattern]' --lang [python]```

**Output results as JSON**

```semgrep scan --json --config auto```

**Scan and auto-apply fixes**

```semgrep scan --config auto --autofix```

# SYNOPSIS

**semgrep** [_options_] [_targets_...]

# DESCRIPTION

**semgrep** is a fast, lightweight static analysis tool for finding bugs, detecting security vulnerabilities, and enforcing code standards across 30+ programming languages. Unlike traditional grep, it understands code structure and uses pattern-matching with syntax that resembles the target language, making rules intuitive to write and read.

Rules can be sourced from the Semgrep registry using **--config auto** for recommended checks, from curated rule packs like **p/security-audit** for specific categories, or from local YAML files for custom project rules. Inline patterns with **-e** allow quick one-off searches without writing rule files.

Output formats include text, JSON, SARIF, GitLab SAST, JUnit XML, Emacs, and Vim. The tool integrates naturally into CI/CD pipelines for continuous code quality enforcement.

# PARAMETERS

**--config** _config_
> Rules configuration: auto, p/ruleset-name, or path to YAML file.

**-e**, **--pattern** _pattern_
> Inline pattern for ephemeral rules (requires --lang).

**--lang** _language_
> Target language for inline pattern matching.

**--json**
> Output results in JSON format.

**--sarif**
> Output results in SARIF format (for GitHub Advanced Security, etc.).

**--autofix**
> Apply automatic fixes for findings that have suggested fixes.

**--exclude** _pattern_
> Exclude files or directories matching pattern. Can be specified multiple times.

**--include** _pattern_
> Only scan files matching pattern. Can be specified multiple times.

**--exclude-rule** _id_
> Skip rules with the given ID. Can be specified multiple times.

**-o**, **--output** _file_
> Save results to file or post to URL.

**--severity** _level_
> Filter by minimum severity (INFO, WARNING, ERROR).

**--error**
> Exit with code 1 if any findings (default: exit 0).

**-j**, **--jobs** _N_
> Number of parallel scanning jobs (default: 3).

**--timeout** _seconds_
> Maximum time per file (default: 5 seconds).

**-v**, **--verbose**
> Show more details about rules and parsing.

**--debug**
> All verbose output plus debugging information.

# CAVEATS

Rule quality varies across registries; false positives require tuning with `--exclude-rule` or nosemgrep comments. Custom rules have a learning curve. Very large codebases may be slow without `--include` filters. The `--autofix` option modifies files in place, so review changes before committing.

# HISTORY

**semgrep** was developed by **r2c** (now Semgrep Inc.) and released around **2019**. It built on academic research to create a practical, language-aware grep for code analysis.

# SEE ALSO

[grep](/man/grep)(1), [ast-grep](/man/ast-grep)(1), [eslint](/man/eslint)(1), [pylint](/man/pylint)(1)
