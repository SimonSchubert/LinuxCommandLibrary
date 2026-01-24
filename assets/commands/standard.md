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

**standard** enforces JavaScript style. It's opinionated linting.

Zero configuration. No .eslintrc needed.

Automatic formatting. Fix with --fix.

Based on ESLint. Standard style rules.

Popular convention. Many projects use it.

# CAVEATS

Fixed style rules. No customization. Semicolon-free style.

# HISTORY

**standard** was created by **Feross Aboukhadijeh** as a zero-configuration JavaScript linter enforcing a single style.

# SEE ALSO

[eslint](/man/eslint)(1), [prettier](/man/prettier)(1), [jshint](/man/jshint)(1)
