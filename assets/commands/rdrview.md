# TAGLINE

Extract main article content from a webpage (reader mode)

# TLDR

**Extract** readable content from a URL

```rdrview "[url]"```

**Open** extracted HTML in a text browser

```rdrview -B [lynx] "[url]"```

**Disable sandbox** (unsupported platforms only; understand the risk)

```rdrview --disable-sandbox "[url]"```

# SYNOPSIS

**rdrview** [*options*] *URL*

# DESCRIPTION

**rdrview** extracts the primary article content from a web page, similar to the Reader View in modern browsers. The algorithm is adapted from Mozilla's Readability (itself based on Arc90's readability.js). Output is intended for terminal browsers such as **lynx** or for cleaner HTML archives, and is popular with terminal RSS workflows.

On Linux, HTML parsing runs in a sandboxed subprocess using **seccomp** (Pledge on OpenBSD, Capsicum on FreeBSD) to reduce risk from hostile HTML. Dependencies include libxml2, libcurl, and the platform sandbox library.

# PARAMETERS

*URL*

> Page to fetch and process.

**-B** *browser*

> Browser/command used to display result (needed when no mailcap default exists).

**--disable-sandbox**

> Run without the sandbox (not recommended; required on some platforms without sandbox support).

See **man rdrview** after install for the full option set of your build.

# CAVEATS

Extraction quality varies by site layout and heavy client-side rendering. The tool is relatively young C code—prefer the sandboxed build. macOS may lack a sandbox implementation. Always be careful feeding untrusted URLs into local tools.

# SEE ALSO

[lynx](/man/lynx)(1), [w3m](/man/w3m)(1), [curl](/man/curl)(1), [readable](/man/readable)(1)

# RESOURCES

```[Source code](https://github.com/eafer/rdrview)```

<!-- verified: 2026-07-19 -->
