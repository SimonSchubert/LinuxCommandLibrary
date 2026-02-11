# TAGLINE

Lightweight static analysis for code security and quality

# TLDR

**Scan with rules**

```semgrep --config auto```

**Scan specific directory**

```semgrep --config auto [src/]```

**Use specific rule pack**

```semgrep --config p/[security-audit]```

**Use local rules**

```semgrep --config [rules.yaml] [src/]```

**Output as JSON**

```semgrep --json --config auto```

**Scan specific language**

```semgrep --config auto --lang [python]```

# SYNOPSIS

**semgrep** [_options_] [_targets_...]

# DESCRIPTION

**semgrep** is a fast, lightweight static analysis tool for finding bugs, detecting security vulnerabilities, and enforcing code standards across 30+ programming languages. Unlike traditional grep, it understands code structure and uses pattern-matching with syntax that resembles the target language, making rules intuitive to write and read.

Rules can be sourced from the Semgrep registry using **--config auto** for recommended checks, from curated rule packs like **p/security-audit** for specific categories, or from local YAML files for custom project rules. The **--autofix** option can automatically apply suggested fixes for certain findings.

Output formats include human-readable text, JSON for tooling integration, and SARIF for compatibility with code scanning platforms like GitHub Advanced Security. The tool integrates naturally into CI/CD pipelines for continuous code quality enforcement.

# PARAMETERS

**--config** _config_
> Rules configuration.

**--lang** _language_
> Target language.

**--json**
> JSON output.

**--sarif**
> SARIF output.

**--autofix**
> Apply automatic fixes.

**--exclude** _pattern_
> Exclude paths.

**--include** _pattern_
> Include paths.

**-o** _file_
> Output to file.

**--severity** _level_
> Minimum severity.

**--verbose**
> Verbose output.

# CAVEATS

Rule quality varies. False positives require tuning. Custom rules need learning. Large codebases may be slow.

# HISTORY

**semgrep** was developed by **r2c** (now Semgrep Inc.) and released around **2019**. It built on academic research to create a practical, language-aware grep for code analysis.

# SEE ALSO

[grep](/man/grep)(1), [ast-grep](/man/ast-grep)(1), [eslint](/man/eslint)(1), [pylint](/man/pylint)(1)
