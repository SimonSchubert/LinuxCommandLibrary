# TAGLINE

Fast domain name availability research tool

# TLDR

**Check domain availability across TLDs**

```tldx [myapp] --tlds com,io,dev```

**Show only available domains with prefixes/suffixes**

```tldx [cloud] --prefixes get,my --suffixes hub,ly --available```

**JSON output with max length filter**

```tldx [startup] --format json --max-length 15```

# SYNOPSIS

**tldx** _keywords_ [_flags_] [_options_]

# PARAMETERS

**--tlds** _LIST_
> Comma-separated list of TLDs to check.

**--prefixes** _LIST_
> Comma-separated prefixes to prepend.

**--suffixes** _LIST_
> Comma-separated suffixes to append.

**--available**
> Show only available domains.

**--format** _FORMAT_
> Output format: text, json, csv, or grouped.

**--max-length** _N_
> Maximum domain name length.

# DESCRIPTION

**tldx** generates domain name combinations from keywords, prefixes, and suffixes, then checks their availability via WHOIS lookups using concurrent goroutines. It supports multiple output formats and TLD presets for quick searches.

# HISTORY

**tldx** was created by **Brandon Young** (brandonyoungdev) and is written in **Go**.

# SEE ALSO

[whois](/man/whois)(1), [dog](/man/dog)(1), [dig](/man/dig)(1)
