# TAGLINE

static code analysis tool for HTML

# TLDR

**Lint HTML file**

```htmlhint [file.html]```

**Lint multiple files**

```htmlhint [*.html]```

**Use config file**

```htmlhint -c [.htmlhintrc] [file.html]```

**Output as JSON**

```htmlhint --format json [file.html]```

**Ignore specific patterns**

```htmlhint --ignore [**/vendor/**] [file.html]```

**List all available rules**

```htmlhint --list```

**Initialize config file**

```htmlhint --init```

# SYNOPSIS

**htmlhint** [_options_] [_files_]

# PARAMETERS

_FILES_
> HTML files to lint.

**-c**, **--config** _FILE_
> Config file path.

**-f**, **--format** _FORMAT_
> Output format: default, json, unix, sarif, markdown, junit, html, compact, checkstyle.

**-i**, **--ignore** _PATTERN_
> Glob patterns of files or folders to ignore.

**-r**, **--rules** _RULES_
> Rules to enable (comma-separated, e.g., tag-pair,attr-lowercase=true).

**-R**, **--rulesdir** _PATH_
> Load custom rules from file or folder.

**-l**, **--list**
> Show all available rules.

**--init**
> Create a new .htmlhintrc config file with default rules.

**--nocolor**
> Disable colored output.

**--warn**
> Warn only, exit with code 0.

**-V**, **--version**
> Output the version number.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**HTMLHint** is a static code analysis tool for HTML. It checks for common mistakes, deprecated elements, and best practices.

The tool enforces consistent HTML style and catches potential issues. It supports custom rules and configuration files.

# CAVEATS

Requires Node.js. Rule set is configurable via .htmlhintrc or CLI flags. Some rules may conflict with framework-specific HTML patterns (e.g., Angular, Vue).

# HISTORY

HTMLHint was created to provide ESLint-style static analysis for HTML documents.

# SEE ALSO

[eslint](/man/eslint)(1), [prettier](/man/prettier)(1), [tidy](/man/tidy)(1)
