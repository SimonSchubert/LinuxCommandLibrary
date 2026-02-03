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

**composer-require-checker** analyzes PHP code to detect classes, functions, and constants used but not declared in composer.json requirements. It helps ensure all dependencies are properly declared.

This prevents "works on my machine" issues where implicit dependencies exist through other packages.

# CAVEATS

Requires static analysis of PHP code. May report false positives for dynamically loaded classes.

# SEE ALSO

[composer](/man/composer)(1), [composer-audit](/man/composer-audit)(1), [phpstan](/man/phpstan)(1)
