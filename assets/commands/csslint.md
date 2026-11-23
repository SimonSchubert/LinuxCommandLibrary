# TAGLINE

CSS code quality checker

# TLDR

**Lint a CSS file**

```csslint [file.css]```

Lint **all CSS files in a directory**

```csslint [path/to/dir]```

**List all available rules**

```csslint --list-rules```

Treat specific **rules as errors** (non-zero exit code)

```csslint --errors=[errors,universal-selector,imports] [file.css]```

Treat specific **rules as warnings**

```csslint --warnings=[rule1,rule2] [file.css]```

**Output in specific format**

```csslint --format=[compact|json|checkstyle-xml] [file.css]```

**Ignore specific rules**

```csslint --ignore=[rule1,rule2] [file.css]```

**Exclude** files or directories from linting

```csslint --exclude-list=[vendor/,legacy.css] [path/to/dir]```

# SYNOPSIS

**csslint** [_options_] _file_|_dir_ [...]

# PARAMETERS

**--errors** _rules_
> Comma-separated list of rules to treat as errors; any error makes csslint exit with a non-zero status.

**--warnings** _rules_
> Comma-separated list of rules to treat as warnings.

**--ignore** _rules_
> Comma-separated list of rules to ignore.

**--format** _format_
> Output format: text (default), compact, json, checkstyle-xml, csslint-xml, lint-xml, junit-xml.

**--exclude-list** _paths_
> Comma-separated list of files or directories to exclude from linting.

**--config** _file_
> Read options from the given file instead of **.csslintrc**.

**--list-rules**
> Show all available rules.

**--quiet**
> Only produce output when problems are found.

**--version**
> Print the csslint version and exit.

**--help**
> Show usage information.

# DESCRIPTION

**csslint** is a tool for checking CSS code quality. It identifies potential problems like inefficient selectors, browser compatibility issues, and stylistic errors. The tool checks for patterns that may cause cross-browser issues, performance problems, or maintenance difficulties.

Rules are categorized by severity and cover topics like selector performance, box model compatibility, known browser bugs, and best practices. csslint can be integrated into build processes and continuous integration workflows.

# CONFIGURATION

**.csslintrc**
> Options file in the current directory, read automatically. Contains either command line options (e.g. --errors=ids --ignore=important) or a JSON object mapping option names to values. Command line arguments override it.

# CAVEATS

CSSLint is effectively unmaintained: the last npm release (**1.0.5**) dates from **2016**, and its parser does not understand many modern CSS features. **stylelint** is the commonly used modern alternative.

# HISTORY

CSSLint was written by **Nicholas C. Zakas** and **Nicole Sullivan** and released in **June 2011** at the Velocity conference.

# SEE ALSO

[sass](/man/sass)(1), [prettier](/man/prettier)(1), [postcss](/man/postcss)(1), [eslint](/man/eslint)(1)

# RESOURCES

```[Source code](https://github.com/CSSLint/csslint)```

```[Homepage](https://csslint.net/)```

```[Documentation](https://github.com/CSSLint/csslint/wiki/Command-line-interface)```

<!-- verified: 2026-11-23 -->
