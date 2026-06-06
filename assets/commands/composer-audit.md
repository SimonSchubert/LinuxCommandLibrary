# TAGLINE

scan PHP dependencies for security vulnerabilities

# TLDR

**Audit dependencies** for security vulnerabilities

```composer audit```

**Audit in JSON format**

```composer audit --format=json```

**Audit only production dependencies**

```composer audit --no-dev```

**Audit the locked packages and report abandoned ones as failures**

```composer audit --locked --abandoned=fail```

# SYNOPSIS

**composer** **audit** [_options_]

# PARAMETERS

**--format** _format_
> Output format: `table` (default), `plain`, `json`, or `summary`.

**--locked**
> Audit the exact versions recorded in composer.lock instead of the installed packages.

**--no-dev**
> Ignore development (require-dev) dependencies.

**--abandoned** _mode_
> How to treat abandoned packages: `ignore`, `report`, or `fail` (Composer 2.8+).

**--ignore** _package_
> Ignore the advisories for the given package. Repeatable.

# DESCRIPTION

**composer audit** performs security vulnerability scanning for PHP dependencies by querying the official Packagist security advisories database. Introduced in Composer 2.4, it provides a built-in mechanism to identify packages with known security issues, eliminating the need for third-party security scanning tools.

The command analyzes both composer.json requirements and the locked versions in composer.lock, reporting any packages that have published Common Vulnerabilities and Exposures (CVE) entries or security advisories. Results include the vulnerability severity, affected versions, and recommended remediation steps.

This functionality mirrors npm audit for JavaScript and bundle audit for Ruby, providing PHP developers with a standardized way to maintain secure dependency chains. It's particularly valuable in CI/CD pipelines where automated security checks help prevent vulnerable code from reaching production.

# CAVEATS

Requires Composer 2.4 or later. Only detects known, published vulnerabilities.

# SEE ALSO

[composer](/man/composer)(1), [composer-require-checker](/man/composer-require-checker)(1)
