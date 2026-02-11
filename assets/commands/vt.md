# TAGLINE

VirusTotal command-line interface

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

**vt** is the official command-line interface for VirusTotal, the online service that analyzes files and URLs for malware using dozens of antivirus engines and security tools. It provides direct access to VirusTotal's scanning and intelligence capabilities from the terminal.

The tool can submit files and URLs for scanning, retrieve analysis reports by file hash or URL, search the VirusTotal database for known threats, and download samples for research. Results include detection verdicts from multiple antivirus engines, behavioral analysis data, and community reputation scores.

All operations require a VirusTotal API key, with rate limits depending on the account tier. The CLI supports both free and premium API features, making it useful for security analysts, incident responders, and automated threat detection workflows.

# CAVEATS

API key required. Rate limits apply. Premium for more.

# HISTORY

**vt** is the official CLI for **VirusTotal**, the online malware scanning service by Google.

# SEE ALSO

[curl](/man/curl)(1), [clamav](/man/clamav)(1)
