# TAGLINE

Offline-first command-line browser for Gemini, Gopher, and Web

# TLDR

**Launch the browser** interactively

```offpunk```

**Open a specific URL**

```offpunk [gemini://example.com]```

**Synchronize all bookmarked content** for offline reading

```offpunk --sync```

**Synchronize with a specific depth** of linked pages

```offpunk --sync [2]```

**Access the built-in tutorial**

```offpunk --tutorial```

# SYNOPSIS

**offpunk** [_options_] [_url_]

# PARAMETERS

**--sync** [_depth_]
> Synchronize bookmarked content for offline use. Optional depth controls how many levels of links to follow (default 0).

**--tutorial**
> Open the built-in tutorial page.

**--assume-yes**
> Automatically answer yes to prompts (useful for cron-based sync).

**--disable-http**
> Disable fetching of HTTP/HTTPS content.

**--version**
> Show version information.

# DESCRIPTION

**offpunk** is a command-line and offline-first browser and feed reader supporting Gemini, Gopher, Spartan, and Web protocols. It allows you to synchronize content once and then browse and organize it while disconnected.

Inside the interactive shell, enter URLs or link numbers to navigate. Use `ls` to list bookmarks, `add` to bookmark pages, and `help` for the full command list. Content is rendered in the terminal using ANSI formatting.

Offline content is cached in **~/.cache/offpunk/** as plain text files. The tool includes subcomponents: **netcache** for network caching, **ansicat** for terminal rendering, and **opnk** for file handling.

# CAVEATS

Web rendering is text-based and may not display complex pages accurately. Requires **python-readability** and **python-html2text** for proper web content rendering. Images require **chafa** or **timg** for terminal display.

# HISTORY

**offpunk** was created by **Ploum** (Lionel Dricot) as a fork of the **AV-98** Gemini browser, written in **Python**. It emphasizes offline-first browsing and digital minimalism.

# SEE ALSO

[lynx](/man/lynx)(1), [w3m](/man/w3m)(1), [bombadillo](/man/bombadillo)(1)
