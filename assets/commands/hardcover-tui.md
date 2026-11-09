# TAGLINE

Terminal interface for Hardcover book tracking

# TLDR

**Launch hardcover-tui**

```hardcover-tui```

**Save an API key** to the system keyring

```hardcover-tui auth login -t [token]```

**Log in** interactively

```hardcover-tui auth login```

**Check** authentication status

```hardcover-tui auth status```

**Remove** the saved API key

```hardcover-tui auth logout```

# SYNOPSIS

**hardcover-tui** [**-v**]

**hardcover-tui** **auth** **login** [**-t** _token_] | **status** | **logout**

# PARAMETERS

**-t**, **--token** _token_
> With **auth login**: the API token to save

**-v**, **--version**
> Show the version

# KEYBINDINGS

**1**, **2**, **3**, **4**
> Switch to Home, Search, Lists, or Stats and Goals

**Tab**, **Shift+Tab**
> Cycle through tabs

**j**, **k** or arrow keys
> Move selection

**Enter**
> Open book details or confirm

**Esc**
> Go back or close

**s**
> Change reading status

**r**
> Rate or review a book

**p**
> Log reading progress

**?**
> Toggle the help overlay

**Ctrl+Q**
> Log out

**q**, **Ctrl+C**
> Quit

# DESCRIPTION

**hardcover-tui** is an unofficial terminal user interface client for **Hardcover.app**, a social book tracking platform. It provides a TUI for browsing your library and shelves, searching, working with lists, tracking reading progress, and viewing stats and goals directly from the terminal.

On first launch it prompts for a Hardcover API key, which is stored in the system keyring.

# CAVEATS

Requires a Hardcover.app account and API key. As an unofficial client, feature availability depends on the Hardcover API.

# HISTORY

**hardcover-tui** is a community project written in Go with Bubble Tea and licensed under the AGPL-3.0.

# SEE ALSO

[curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/NotMugil/hardcover-tui)```

<!-- verified: 2026-11-09 -->
