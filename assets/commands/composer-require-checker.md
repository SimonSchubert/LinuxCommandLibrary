# TAGLINE

verify all PHP dependencies are declared

# TLDR

**Check for missing composer requirements**

```composer-require-checker check```

**Check specific composer.json**

```composer-require-checker check [/path/to/composer.json]```

**Output in JSON format**

```composer-require-checker check --output=json```

# SYNOPSIS

**composer-require-checker** **check** [_options_] [_composer-json_]

# PARAMETERS

**--output** _format_
> Output format: text, json.

**--config-file** _file_
> Path to configuration file.

# DESCRIPTION

**composer-require-checker** is a static analysis tool that scans PHP codebases to identify symbols (classes, functions, constants) that are used in the code but not explicitly declared as dependencies in composer.json. It helps prevent the common problem of transitive dependencies where Package A requires Package B, and your code uses Package B without explicitly declaring it, creating a fragile dependency graph.

The tool performs symbol table analysis across the entire codebase, cross-referencing discovered symbols against the declared require and require-dev sections in composer.json. When undeclared dependencies are found, it reports which symbols are missing and from which packages they originate, allowing developers to add proper dependency declarations.

This is particularly important for library maintainers who need to ensure their packages can be installed independently without relying on implicit dependencies. It prevents "works on my machine" scenarios where a dependency happens to be available through another package locally but fails in different environments or when dependency versions change.

# CAVEATS

Requires static analysis of PHP code. May report false positives for dynamically loaded classes.

# SEE ALSO

[composer](/man/composer)(1), [composer-audit](/man/composer-audit)(1), [phpstan](/man/phpstan)(1)
