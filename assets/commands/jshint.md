# TAGLINE

JavaScript code quality tool

# TLDR

**Lint JavaScript file**

```jshint [file.js]```

**Lint multiple files**

```jshint [file1.js] [file2.js]```

**Use config file**

```jshint --config [.jshintrc] [file.js]```

**Check all JS files**

```jshint [src/]```

**Verbose output**

```jshint --verbose [file.js]```

**Show specific warnings**

```jshint --show-non-errors [file.js]```

# SYNOPSIS

**jshint** [_options_] _file_...

# PARAMETERS

_FILE_
> JavaScript files to lint.

**--config** _FILE_
> Configuration file.

**--verbose**
> Show error codes.

**--reporter** _NAME_
> Output format reporter.

**--extract** _MODE_
> Extract JS from HTML.

**--help**
> Display help information.

# DESCRIPTION

**JSHint** is a JavaScript code quality tool. It detects errors and potential problems in JavaScript.

The tool is configurable to enforce coding standards. It integrates with editors and build systems.

# CAVEATS

Node.js-based. Consider ESLint for modern projects. Configuration important.

# HISTORY

JSHint was forked from **JSLint** by **Anton Kovalyov** in 2011 to provide a more configurable JavaScript linter.

# SEE ALSO

[eslint](/man/eslint)(1), [prettier](/man/prettier)(1), [tslint](/man/tslint)(1)
