# TAGLINE

Audit PHP dependencies for known vulnerabilities

# TLDR

**Check project**

```security-checker security:check```

**Check specific file**

```security-checker security:check [composer.lock]```

**Output as JSON**

```security-checker security:check --format=json```

**Use a custom vulnerability service**

```security-checker security:check --end-point=[url]```

# SYNOPSIS

**security-checker** security:check [_--format fmt_] [_options_] [_lockfile_]

# PARAMETERS

**security:check**
> Check for vulnerabilities.

**--format** _FMT_
> Output format (text, json, yaml).

**--end-point** _URL_
> Custom vulnerability DB.

**--timeout** _SEC_
> Request timeout.

**-v**
> Verbose output.

# DESCRIPTION

**Note:** this tool is obsolete. Its web service stopped at the end of January 2021 and the repository is archived; use **symfony check:security** or local-php-security-checker instead.

**security-checker** audited PHP project dependencies for known security vulnerabilities by analyzing the **composer.lock** file against the FriendsOfPHP security advisories database. It identifies installed packages with published CVEs or security issues.

The tool returns a non-zero exit code when vulnerabilities are found, making it suitable for CI/CD pipeline integration as a gate check. Output is available in text, JSON, and YAML formats for both human review and programmatic processing by other tools.

# CAVEATS

No longer works against the original service, which shut down in January 2021. PHP/Composer specific.

# HISTORY

**security-checker** was created by **SensioLabs** (Symfony) to check PHP project dependencies for known security vulnerabilities.

# SEE ALSO

[symfony](/man/symfony)(1), [composer](/man/composer)(1), [npm-audit](/man/npm-audit)(1), [snyk](/man/snyk)(1)

# RESOURCES

```[Source code](https://github.com/sensiolabs/security-checker)```

<!-- verified: 2026-11-08 -->
