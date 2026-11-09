# TAGLINE

Terminal-based client for Pinboard bookmarks

# TLDR

**Launch the Pinboard TUI client**

```tinboard```

**Start with a specific filter** applied

```tinboard -f [unread]```

**Quickly add a bookmark** with an inline editor

```tinboard add```

# SYNOPSIS

**tinboard** [_options_] [**add**]

# PARAMETERS

**add**
> Show an inline bookmark editor instead of the full application (experimental).

**-f**, **--filter** _FILTER_
> Default filter on startup: all, unread, read, public, private, tagged, or untagged.

**-v**, **--version**
> Show version information.

**-h**, **--help**
> Show the help message.

# DESCRIPTION

**tinboard** is a TUI client for the Pinboard.in bookmarking service. It allows you to manage, search, and browse your Pinboard bookmarks entirely from the terminal. Press **F1** inside the application for help.

# CONFIGURATION

On first run, tinboard asks for a Pinboard API token. It can instead be set in the **TINBOARD_API_TOKEN** environment variable.

# CAVEATS

Requires a Pinboard account. The author no longer uses Pinboard, so only simple bug fixes are expected.

# HISTORY

**tinboard** was created by **Dave Pearson** (davep) and is written in **Python** using the Textual framework. The author's later bookmarking client is **braindrop**, for Raindrop.

# SEE ALSO

[buku](/man/buku)(1), [nb](/man/nb)(1), [surfraw](/man/surfraw)(1), [braindrop](/man/braindrop)(1)

# RESOURCES

```[Source code](https://github.com/davep/tinboard)```

<!-- verified: 2026-11-09 -->
