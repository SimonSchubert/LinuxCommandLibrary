# TAGLINE

Rust-based TLDR pages client

# TLDR

**Show page**

```tldrl [command]```

**Update cache**

```tldrl --update```

**List all pages**

```tldrl --list```

**Show platform-specific**

```tldrl --platform [linux] [command]```

**Search pages**

```tldrl --search "[keyword]"```

# SYNOPSIS

**tldrl** [_--update_] [_--platform os_] [_options_] [_command_]

# PARAMETERS

**--update**
> Update cache.

**--list**
> List pages.

**--platform** _OS_
> Platform filter.

**--search** _TERM_
> Search pages.

**--help**
> Show help.

# DESCRIPTION

**tldrl** is a fast, Rust-based client for accessing TLDR pages, the community-maintained collection of simplified command-line documentation focused on practical examples. It caches pages locally for offline access and quick lookups.

The client supports platform-specific pages for Linux, macOS, and Windows, and provides search functionality to find relevant commands by keyword. The cache can be updated with **--update** to fetch the latest pages from the TLDR repository.

# CAVEATS

Internet for updates. Cache needs refresh. Not official tldr client.

# HISTORY

**tldrl** is a Rust implementation of a TLDR client for accessing community-maintained simplified man pages.

# SEE ALSO

[tldr](/man/tldr)(1), [man](/man/man)(1), [cheat](/man/cheat)(1)
