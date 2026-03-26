# TAGLINE

Quick terminal client for browsing the Gopher protocol

# TLDR

**Launch with the default Gopher page**

```phetch```

**Open a specific Gopher URL**

```phetch [gopher://example.com]```

**Use a custom media player for audio/video**

```phetch -m [mpv]```

**Open a URL with TLS encryption**

```phetch -s [gopher://example.com]```

**Open a URL through Tor**

```phetch -o [gopher://example.com]```

**Print raw Gopher response without interactive mode**

```phetch -r [gopher://example.com]```

**Connect to local Gopher server**

```phetch -l```

# SYNOPSIS

**phetch** [_options_] [_url_]

# PARAMETERS

**-s**, **--tls**
> Try to open Gopher URLs securely with TLS.

**-o**, **--tor**
> Use local Tor proxy to open all pages.

**-S**, **-O**
> Disable TLS or Tor.

**-w**, **--wrap** _COLUMN_
> Wrap long lines in text views at COLUMN.

**-m**, **--media** _PROGRAM_
> Set the media player for opening audio and video files.

**-M**, **--no-media**
> Just download media files, don't play them.

**-a**, **--autoplay**
> Autoplay media files without prompting.

**-A**, **--no-autoplay**
> Prompt before playing media files.

**-r**, **--raw**
> Print raw Gopher response only.

**-p**, **--print**
> Print rendered Gopher response only.

**-l**, **--local**
> Connect to 127.0.0.1:7070.

**-e**, **--encoding** _ENCODING_
> Render text documents in CP437 or UTF8.

**-c**, **--config** _FILE_
> Use FILE instead of ~/.config/phetch/phetch.conf.

**-C**, **--no-config**
> Don't use any config file.

**-t**, **--theme** _FILE_
> Use FILE for color theme or print current theme.

**-h**, **--help**
> Show help screen.

**-v**, **--version**
> Show version.

# DESCRIPTION

**phetch** is a small, fast Gopher protocol client for the terminal written in Rust. It supports Gopher searches, text and menu pages, file downloads, opt-in history tracking, TLS encryption, and Tor support. Navigation is entirely keyboard-driven with both jump-to-link and incremental search options.

# HISTORY

**phetch** was created by **xvxx** and is written in **Rust**.

# SEE ALSO

[lynx](/man/lynx)(1), [curl](/man/curl)(1), [w3m](/man/w3m)(1)
