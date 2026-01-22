# TLDR

**Check Internet-Draft**

```idnits [draft.txt]```

**Verbose output**

```idnits --verbose [draft.txt]```

**Check for submission**

```idnits --submitcheck [draft.txt]```

**Show year warnings**

```idnits --year [2024] [draft.txt]```

# SYNOPSIS

**idnits** [_options_] _file_

# PARAMETERS

_FILE_
> Internet-Draft file to check.

**--verbose**
> Detailed output.

**--submitcheck**
> Strict submission checks.

**--year** _YEAR_
> Set copyright year.

**--nowarn** _WARN_
> Disable specific warning.

**--help**
> Display help information.

# DESCRIPTION

**idnits** checks Internet-Drafts for formatting issues. It validates IETF document format requirements before submission.

The tool checks RFC formatting, boilerplate text, references, and common errors. It helps authors prepare drafts for IETF submission.

idnits validates IETF Internet-Drafts.

# CAVEATS

IETF-specific tool. Formatting rules change. Text format required.

# HISTORY

idnits was developed by the **IETF** to help authors validate Internet-Draft formatting.

# SEE ALSO

[xml2rfc](/man/xml2rfc)(1), [rfcdiff](/man/rfcdiff)(1)
