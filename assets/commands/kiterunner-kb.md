# TAGLINE

manages kiterunner knowledge bases

# TLDR

**List knowledge bases**

```kr kb list```

**Download knowledge base**

```kr kb download [kbname]```

**Use specific knowledge base**

```kr scan [url] -A [kbname]```

**Show knowledge base info**

```kr kb info [kbname]```

# SYNOPSIS

**kr kb** _command_ [_options_]

# PARAMETERS

**list**
> List available knowledge bases.

**download** _NAME_
> Download knowledge base.

**info** _NAME_
> Show knowledge base details.

**--help**
> Display help information.

# DESCRIPTION

**kr kb** manages kiterunner knowledge bases. Knowledge bases contain API route patterns for scanning.

The tool downloads pre-built wordlists from Assetnote. Different KBs target different API types.

# CAVEATS

Subcommand of kiterunner. Requires network for download. Disk space for KBs.

# HISTORY

kr kb is part of **kiterunner** by Assetnote, providing curated API endpoint wordlists for security testing.

# SEE ALSO

[kiterunner](/man/kiterunner)(1), [kiterunner-scan](/man/kiterunner-scan)(1)
