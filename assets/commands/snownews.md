# TAGLINE

Lightweight terminal RSS feed reader

# TLDR

**Start Snownews** RSS reader

```snownews```

**Import feeds** from an OPML file

```snownews --import [path/to/feeds.opml]```

**Start with a custom URL file**

```snownews --url [path/to/urls]```

**Force update** of all feeds on startup

```snownews --update```

# SYNOPSIS

**snownews** [_options_]

# PARAMETERS

**--import** _file_
> Import feed subscriptions from an OPML file.

**--url** _file_
> Use a custom URL file for feed list.

**--update**
> Update all feeds on startup.

**--help**
> Display help information.

**--version**
> Display version information.

# KEYBINDINGS

**a**
> Add a new feed URL.

**D**
> Delete the highlighted feed.

**r**
> Reload the highlighted feed.

**R**
> Reload all feeds.

**T**
> Force refresh ignoring cache.

**n**, **Down**
> Move to next item.

**p**, **Up**
> Move to previous item.

**Enter**
> Open/read the highlighted item.

**o**
> Open URL in browser.

**q**
> Quit or go back.

**h**
> Display context-sensitive help.

# DESCRIPTION

**Snownews** is a lightweight command-line RSS feed reader designed for text terminals. It supports RSS 0.91, 1.0 (RDF), and 2.0 formats. The interface is simple and keyboard-driven, with feeds displayed in a list format.

Snownews maintains a local cache to minimize network traffic and supports HTTP proxies, HTTP authentication (basic and digest), and cookies. Feed URLs can be imported from OPML files for easy migration from other readers.

By default, URLs in feeds are opened with a text-mode browser like Lynx, but this can be configured to use any browser. Configuration files are stored in **~/.snownews/** including the URL list and settings.

# CONFIGURATION

**~/.snownews/urls**
> List of subscribed feed URLs, one per line.

**~/.snownews/browser**
> Script or command used to open URLs from feed items.

# CAVEATS

Snownews is text-mode only and does not display images or complex formatting from feeds. The default browser is Lynx; configure the browser setting to use graphical browsers. RSS 1.0 feeds must comply with W3C RDF specification for proper parsing.

# HISTORY

**Snownews** was developed as a lightweight RSS reader for the command line. It was designed to integrate well with Unix tools and philosophy, supporting piping and filtering. The project is released under the GNU General Public License version 3 and supports multiple platforms including Linux, BSD, macOS, and Windows (via Cygwin).

# SEE ALSO

[newsboat](/man/newsboat)(1), [lynx](/man/lynx)(1), [rss2email](/man/rss2email)(1)
