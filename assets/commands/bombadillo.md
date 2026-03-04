# TAGLINE

Terminal browser for Gopher, Gemini, and Finger protocols

# TLDR

**Launch** Bombadillo

```bombadillo```

**Open** a specific Gopher URL

```bombadillo [gopher://example.com]```

**Open** a Gemini URL

```bombadillo [gemini://example.com]```

# SYNOPSIS

**bombadillo** [_url_]

# DESCRIPTION

**bombadillo** is a non-web browser designed for the terminal. It supports the **Gopher**, **Gemini**, and **Finger** protocols, as well as local file browsing. It provides a vim-like modal interface with command-line navigation for exploring the "small internet" — alternative protocols to the modern web.

The browser renders text content directly in the terminal, supports bookmarks, history navigation, and configurable settings. It can handle TLS connections for Gemini and provides a distraction-free reading experience.

# CONFIGURATION

Configuration is stored in **~/.config/bombadillo/config.ini**. Settings include default protocol, home URL, certificate handling, and display preferences. Settings can also be changed at runtime using the **:set** command.

# CAVEATS

Does not support HTTP/HTTPS — it is specifically designed for alternative protocols. Gemini TLS certificate handling uses trust-on-first-use (TOFU). Media files are passed to external handlers.

# HISTORY

**Bombadillo** was created by **slstrg** (asdf on tildegit) and first released around **2019**. Written in **Go**, it was developed as part of the growing interest in the Gemini protocol and the small-internet movement. The name references the character Tom Bombadil from Tolkien's works.

# SEE ALSO

[lynx](/man/lynx)(1), [w3m](/man/w3m)(1), [amfora](/man/amfora)(1)
