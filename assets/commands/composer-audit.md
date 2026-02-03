# TLDR

**Audit dependencies** for security vulnerabilities

```composer audit```

**Audit in JSON format**

```composer audit --format=json```

**Audit and exit with error** on vulnerabilities

```composer audit --locked```

# SYNOPSIS

**composer** **audit** [_options_]

# PARAMETERS

**--format** _format_
> Output format: table, plain, json, summary.

**--locked**
> Audit packages from composer.lock.

**--no-dev**
> Ignore development dependencies.

# DESCRIPTION

**composer audit** checks installed PHP packages for known security vulnerabilities. It queries the Packagist security advisories database and reports any vulnerable packages.

This is similar to **npm audit** for PHP/Composer projects.

# CAVEATS

Requires Composer 2.4 or later. Only detects known, published vulnerabilities.

# SEE ALSO

[composer](/man/composer)(1), [composer-require-checker](/man/composer-require-checker)(1)
