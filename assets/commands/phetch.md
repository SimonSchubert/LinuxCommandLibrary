# TAGLINE

Quick terminal client for browsing the Gopher protocol

# TLDR

**Launch with the default Gopher page**

```phetch```

**Open a specific Gopher URL**

```phetch [gopher://example.com]```

**Use a custom media player for audio/video**

```phetch -m [mpv]```

# SYNOPSIS

**phetch** [_options_] [_url_]

# PARAMETERS

**-m** _PROGRAM_
> Set the media player for opening audio and video files.

# DESCRIPTION

**phetch** is a small, fast Gopher protocol client for the terminal written in Rust. It supports Gopher searches, text and menu pages, file downloads, opt-in history tracking, TLS encryption, and Tor support. Navigation is entirely keyboard-driven with both jump-to-link and incremental search options.

# HISTORY

**phetch** was created by **xvxx** and is written in **Rust**.

# SEE ALSO

[lynx](/man/lynx)(1), [curl](/man/curl)(1), [w3m](/man/w3m)(1)
