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

**Ignore rules**

```htmlhint --ignore [attr-lowercase] [file.html]```

# SYNOPSIS

**htmlhint** [_options_] [_files_]

# PARAMETERS

_FILES_
> HTML files to lint.

**-c**, **--config** _FILE_
> Config file path.

**-f**, **--format** _FORMAT_
> Output format (default, json).

**--ignore** _RULES_
> Rules to ignore.

**-r**, **--rules** _RULES_
> Rules to enable.

**--help**
> Display help information.

# DESCRIPTION

**HTMLHint** is a static code analysis tool for HTML. It checks for common mistakes, deprecated elements, and best practices.

The tool enforces consistent HTML style and catches potential issues. It supports custom rules and configuration files.

# CAVEATS

Node.js required. Rule set configurable. May conflict with framework patterns.

# HISTORY

HTMLHint was created to provide ESLint-style static analysis for HTML documents.

# SEE ALSO

[eslint](/man/eslint)(1), [prettier](/man/prettier)(1), [tidy](/man/tidy)(1)
