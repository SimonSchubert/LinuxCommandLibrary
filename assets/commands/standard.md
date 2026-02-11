# TAGLINE

Zero-configuration JavaScript style linter

# TLDR

**Check code**

```standard```

**Fix automatically**

```standard --fix```

**Check specific files**

```standard [file1.js] [file2.js]```

**Use parser**

```standard --parser [babel-eslint]```

**Verbose output**

```standard --verbose```

**Global install run**

```standard --global [package-name]```

# SYNOPSIS

**standard** [_--fix_] [_--parser name_] [_options_] [_files_]

# PARAMETERS

**--fix**
> Auto-fix issues.

**--parser** _NAME_
> Custom parser.

**--verbose**
> Show rule names.

**--global** _PKG_
> Global packages.

**--env** _ENV_
> Environment globals.

**--stdin**
> Lint from stdin.

# DESCRIPTION

**standard** is a zero-configuration JavaScript linter and formatter that enforces a fixed set of style rules. Built on top of ESLint, it eliminates the need for project-specific .eslintrc files by providing a single, opinionated style guide that includes rules like no semicolons, 2-space indentation, and single quotes.

The **--fix** flag automatically corrects fixable issues in place. The tool can lint files passed as arguments or recursively scan the current directory. Custom parsers like babel-eslint can be specified for projects using experimental JavaScript syntax.

# CAVEATS

Fixed style rules. No customization. Semicolon-free style.

# HISTORY

**standard** was created by **Feross Aboukhadijeh** as a zero-configuration JavaScript linter enforcing a single style.

# SEE ALSO

[eslint](/man/eslint)(1), [prettier](/man/prettier)(1), [jshint](/man/jshint)(1)
