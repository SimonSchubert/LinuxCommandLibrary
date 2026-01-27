# TLDR

**Lint markdown files**

```textlint "[docs/**/*.md]"```

**Lint a directory**

```textlint [docs/]```

**Auto-fix problems**

```textlint --fix [README.md]```

**Dry run to preview fixes**

```textlint --fix --dry-run --format diff [README.md]```

**Use specific config file**

```textlint -c [.textlintrc.json] [file.md]```

**Lint stdin**

```cat [README.md] | textlint --stdin --stdin-filename "README.md"```

**Output in JSON format**

```textlint --format json [docs/]```

**Initialize configuration**

```textlint --init```

# SYNOPSIS

**textlint** [_options_] [_file_|_dir_|_glob_...]

# PARAMETERS

**-c**, **--config** _file_
> Configuration file path.

**--ignore-path** _file_
> File with patterns to ignore (default: .textlintignore).

**--init**
> Create configuration file if not exists.

**--fix**
> Automatically fix problems.

**--dry-run**
> Preview fixes without writing.

**--debug**
> Output debugging information.

**--print-config**
> Print resolved configuration.

**--stdin**
> Lint text from stdin.

**--stdin-filename** _name_
> Filename for stdin input.

**-f**, **--format** _format_
> Output format: stylish, json, checkstyle, compact, junit, tap, unix.

**-o**, **--output-file** _file_
> Write report to file.

**--no-color**
> Disable colored output.

**--quiet**
> Report errors only.

**--no-textlintrc**
> Disable .textlintrc loading.

**--rule** _rule_
> Rule package to use.

**--preset** _preset_
> Preset package to load.

**--plugin** _plugin_
> Plugin package to use.

**--cache**
> Only check changed files.

**-v**, **--version**
> Display version.

**-h**, **--help**
> Display help.

# DESCRIPTION

**textlint** is a pluggable linter for natural language text. It checks prose for style issues, grammar problems, and writing inconsistencies using configurable rules.

Rules are installed as npm packages and configured in .textlintrc. Available rules cover spelling, terminology, sentence length, redundant phrases, and writing style guidelines. Presets bundle commonly used rule sets.

The tool supports Markdown, plain text, and other formats through plugins. It integrates with editors and CI/CD pipelines for automated text quality checks.

Auto-fix mode can automatically correct many issues. Use dry-run with diff format to preview changes before applying.

Install via npm: `npm install textlint`

# CAVEATS

Requires Node.js and npm. Rules must be installed separately. Configuration complexity increases with multiple rules. Some rules may conflict with each other.

# HISTORY

**textlint** was created by azu as an ESLint-inspired linter for prose. It applies the pluggable architecture pattern to natural language checking, allowing the community to develop specialized rules for different writing styles and languages.

# SEE ALSO

[eslint](/man/eslint)(1), [markdownlint](/man/markdownlint)(1), [vale](/man/vale)(1), [proselint](/man/proselint)(1)
