# TLDR

**Check project**

```security-checker security:check```

**Check specific file**

```security-checker security:check [composer.lock]```

**Output as JSON**

```security-checker security:check --format=json```

**Check with end-of-life**

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

**security-checker** audits PHP dependencies. It finds known vulnerabilities.

Checks composer.lock file. Analyzes installed packages.

Uses FriendsOfPHP database. Known vulnerability list.

CI/CD integration ready. Exit codes for automation.

Multiple output formats. JSON for parsing.

# CAVEATS

PHP/Composer specific. Database may lag. Network required.

# HISTORY

**security-checker** was created by **SensioLabs** (Symfony) to check PHP project dependencies for known security vulnerabilities.

# SEE ALSO

[composer](/man/composer)(1), [npm-audit](/man/npm-audit)(1), [snyk](/man/snyk)(1)
