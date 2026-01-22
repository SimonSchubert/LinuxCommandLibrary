# TLDR

**Check links in file**

```lychee [README.md]```

**Check entire directory**

```lychee [docs/]```

**Check website**

```lychee [https://example.com]```

**Exclude patterns**

```lychee --exclude [example.com] [file.md]```

**Output formats**

```lychee --format json [file.md]```

**Skip offline check**

```lychee --offline [file.md]```

# SYNOPSIS

**lychee** [_options_] _inputs_

# PARAMETERS

_INPUTS_
> Files, directories, or URLs.

**--exclude** _PATTERN_
> Exclude matching URLs.

**--format** _FMT_
> Output format (plain, json, markdown).

**--offline**
> Skip network checks.

**--cache**
> Use cache for results.

**--help**
> Display help information.

# DESCRIPTION

**lychee** is a fast link checker. It validates links in markdown, HTML, and plain text.

The tool is written in Rust for speed. It checks both local and remote links concurrently.

lychee validates links quickly.

# CAVEATS

Network checks may be rate-limited. Some sites block automated requests. Rust-based.

# HISTORY

lychee was created as a fast, modern **Rust-based** link checker for documentation and websites.

# SEE ALSO

[linkchecker](/man/linkchecker)(1), [wget](/man/wget)(1), [curl](/man/curl)(1)

