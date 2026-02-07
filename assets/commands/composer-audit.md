# TAGLINE

scan PHP dependencies for security vulnerabilities

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

**composer audit** performs security vulnerability scanning for PHP dependencies by querying the official Packagist security advisories database. Introduced in Composer 2.4, it provides a built-in mechanism to identify packages with known security issues, eliminating the need for third-party security scanning tools.

The command analyzes both composer.json requirements and the locked versions in composer.lock, reporting any packages that have published Common Vulnerabilities and Exposures (CVE) entries or security advisories. Results include the vulnerability severity, affected versions, and recommended remediation steps.

This functionality mirrors npm audit for JavaScript and bundle audit for Ruby, providing PHP developers with a standardized way to maintain secure dependency chains. It's particularly valuable in CI/CD pipelines where automated security checks help prevent vulnerable code from reaching production.

# CAVEATS

Requires Composer 2.4 or later. Only detects known, published vulnerabilities.

# SEE ALSO

[composer](/man/composer)(1), [composer-require-checker](/man/composer-require-checker)(1)
