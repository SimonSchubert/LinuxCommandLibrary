# TAGLINE

Offline-first command-line browser for Gemini, Gopher, and Web

# TLDR

**Launch the browser**

```offpunk```

**Start with a URL**

```offpunk [url]```

**Access the built-in tutorial**

```offpunk -e "tutorial"```

# SYNOPSIS

**offpunk** [_options_] [_url_]

# DESCRIPTION

**offpunk** is a command-line and offline-first browser and feed reader supporting Gemini, Gopher, Spartan, and Web protocols. It allows you to synchronize content once and then browse and organize it while disconnected.

Offline content is cached in **~/.cache/offpunk/** as plain .gmi/.html files. The tool includes components for network caching (netcache), terminal rendering (ansicat), and file handling (openk).

# CAVEATS

Web rendering is text-based and may not display complex pages accurately. Some features require optional dependencies like python-readability for web content.

# HISTORY

**offpunk** was created by **Ploum** (lioploum) and is written in **Python**.

# SEE ALSO

[lynx](/man/lynx)(1), [w3m](/man/w3m)(1), [amfora](/man/amfora)(1)
