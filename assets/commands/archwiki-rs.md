# TAGLINE

Browse the Arch Linux Wiki from the terminal

# TLDR

**Search** Arch Wiki

```archwiki-rs search [query]```

**Read** an article

```archwiki-rs read "[Installation guide]"```

**List** recent articles

```archwiki-rs recent```

Open article in **browser**

```archwiki-rs open "[Pacman]"```

# SYNOPSIS

**archwiki-rs** _command_ [_options_] [_query_]

# DESCRIPTION

**archwiki-rs** is a command-line tool for browsing the Arch Linux Wiki from the terminal. It can search articles, display content, and open pages in a browser.

The tool provides offline-capable access to Arch Wiki documentation, useful for system administration and troubleshooting.

# PARAMETERS

**search** _query_
> Search for articles

**read** _title_
> Display article content

**open** _title_
> Open in web browser

**recent**
> Show recent articles

**random**
> Show random article

**--lang** _code_
> Language code (en, de, etc.)

**--offline**
> Use cached content only

# CAVEATS

Content may be outdated if used offline. Formatting may differ from web version. Some wiki features not available in terminal.

# HISTORY

**archwiki-rs** was created as a Rust-based tool for Arch Linux users who prefer terminal-based documentation access.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [curl](/man/curl)(1)
