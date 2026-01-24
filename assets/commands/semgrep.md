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

**semgrep** is a fast, static analysis tool for finding bugs, detecting security issues, and enforcing code standards. It uses pattern-matching with a syntax similar to the target language.

The tool supports 30+ languages and has community rules for common security issues and code quality checks.

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
