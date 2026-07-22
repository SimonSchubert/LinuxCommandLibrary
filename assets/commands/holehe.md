# TAGLINE

checks if an email is registered on various websites

# TLDR

**Check email registration**

```holehe [email@example.com]```

**Output as CSV**

```holehe [email@example.com] --csv```

**Output only positive results**

```holehe --only-used [email@example.com]```

**Disable colored output**

```holehe --no-color [email@example.com]```

**Set request timeout**

```holehe --timeout [10] [email@example.com]```

# SYNOPSIS

**holehe** [_options_] _email_

# PARAMETERS

_EMAIL_
> Email address to check.

**--csv**
> Output as CSV.

**--only-used**
> Show only positive results.

**--no-color**
> Disable colored output.

**-t**, **--timeout** _SEC_
> Request timeout.

**--help**
> Display help information.

# DESCRIPTION

**holehe** checks if an email is registered on various websites. It uses password reset and registration functions to detect account existence.

The tool is useful for OSINT and security testing. It checks hundreds of websites for email registration status.

# CAVEATS

OSINT tool requiring authorization. Rate limits may apply. Results may have false positives.

# HISTORY

holehe was created as an OSINT tool for checking email registrations across many platforms.

# INSTALL

```nix: nix profile install nixpkgs#holehe```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[sherlock](/man/sherlock)(1), [theHarvester](/man/theHarvester)(1)
