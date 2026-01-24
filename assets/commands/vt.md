# TLDR

**Scan file**

```vt scan file [file]```

**Get file report**

```vt file [hash]```

**Scan URL**

```vt scan url [https://example.com]```

**Get URL report**

```vt url [url]```

**Search**

```vt search "[query]"```

**Download file**

```vt download [hash]```

# SYNOPSIS

**vt** _command_ [_subcommand_] [_options_] [_args_]

# PARAMETERS

**scan**
> Submit for scanning.

**file**
> File operations.

**url**
> URL operations.

**search**
> Search VT.

**download**
> Download file.

**--apikey** _KEY_
> API key.

# DESCRIPTION

**vt** queries VirusTotal. It's the official CLI.

Malware scanning. Multiple engines.

URL checking. Website reputation.

Hash lookups. Known malware.

API access. Full VirusTotal features.

# CAVEATS

API key required. Rate limits apply. Premium for more.

# HISTORY

**vt** is the official CLI for **VirusTotal**, the online malware scanning service by Google.

# SEE ALSO

[curl](/man/curl)(1), [clamav](/man/clamav)(1)
