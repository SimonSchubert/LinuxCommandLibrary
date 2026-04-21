# TAGLINE

Syntax-aware prose linter

# TLDR

**Lint files** in current directory

```vale [path/to/files]```

**Lint markdown files** recursively

```vale [docs/**/*.md]```

**Use a specific configuration file**

```vale --config [.vale.ini] [file.md]```

**Show only errors** (ignore warnings and suggestions)

```vale --minAlertLevel error [file.md]```

**Output in JSON format**

```vale --output JSON [file.md]```

**Lint content from stdin**

```echo "[text]" | vale --ext .md```

**List configured directories**

```vale ls-dirs```

**Sync styles** from configuration

```vale sync```

# SYNOPSIS

**vale** [_options_] [_files ..._]

# PARAMETERS

**--config** _file_
> Use specified configuration file (.vale.ini).

**--ext** _extension_
> Assign a file extension to stdin input (e.g., `.md`, `.rst`).

**--glob** _pattern_
> Only lint files matching the glob pattern.

**--filter** _expr_
> Filter rules by a CEL-style expression (e.g. `".Level == 'error'"`).

**--minAlertLevel** _level_
> Minimum alert level: `suggestion`, `warning`, or `error`.

**--output** _format_
> Output format: `CLI` (default), `JSON`, `line`, or path to a template file.

**--no-exit**
> Always exit with status 0 regardless of errors.

**--no-wrap**
> Do not wrap output lines.

**--no-global**
> Skip loading the global configuration.

**--relative**
> Report paths relative to the current directory.

**--sort**
> Sort output by file path and line number.

**--ignore-syntax**
> Treat all input as plain text (skip syntax-aware parsing).

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help message.

# SUBCOMMANDS

**sync**
> Download and install packages declared in the configuration.

**ls-config**
> Print the active configuration as JSON.

**ls-dirs**
> Print the location of Vale's configuration directories.

**ls-metrics** _file_
> Print readability and other metrics for the given file.

**ls-vars**
> Print the supported environment variables.

# DESCRIPTION

**Vale** is a syntax-aware prose linter that brings code-like linting to documentation and prose. It checks writing against customizable style rules for consistency, grammar, and corporate style guides.

Vale supports Markdown, AsciiDoc, reStructuredText, HTML, and other markup formats. It can use community style packages (Microsoft, Google, write-good) or custom rules defined in YAML.

Configuration is managed through **.vale.ini** files that specify which styles to use, file patterns to check, and vocabulary exceptions.

# CAVEATS

Vale requires style packages to be installed via **vale sync** before they can be used. Custom vocabulary (acceptable terms, spelling exceptions) must be configured in the vale configuration. Complex regex-based rules may have performance impact on large documents.

# HISTORY

Vale was created by **Joseph Kato** at Errata AI and first released in **2017**. It was designed to provide maintainable, extensible prose linting similar to how code linters work. Written in Go for performance and cross-platform support, Vale has been adopted by many technical documentation teams including GitLab, Grafana, and Linode.

# SEE ALSO

[proselint](/man/proselint)(1), [write-good](/man/write-good)(1), [textlint](/man/textlint)(1), [aspell](/man/aspell)(1)
