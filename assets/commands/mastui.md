# TAGLINE

Modern Mastodon TUI client for the terminal

# TLDR

**Launch the Mastodon client**

```mastui```

**Add another account**

```mastui --add-account```

**Run in the browser** as a local web application

```mastui --web```

**Serve the web interface** on a custom address with an access token

```mastui --web --web-host [0.0.0.0] --web-port [8080] --web-token [secret] --no-browser```

**Enable debug logging**

```mastui --debug```

# SYNOPSIS

**mastui** [_options_]

# PARAMETERS

**--add-account**
> Add a new account.

**--debug**
> Enable debug logging.

**--no-ssl-verify**
> Disable SSL verification.

**--web**
> Run Mastui in web browser / WebView mode.

**--web-host** _HOST_
> Host address for the web interface (default: 127.0.0.1).

**--web-port** _PORT_
> Port for the web interface (default: 8000).

**--web-token** _TOKEN_
> Secret token required to access the web terminal session.

**--no-browser**
> Do not automatically open a web browser.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**mastui** is a fast, modern TUI client for Mastodon built with Python and Textual. It displays multi-column timelines (Home, Local, Federated, Mentions, DMs) with a persistent SQLite cache for smooth scrolling and offline reading.

Features include in-terminal image viewing (ANSI/Sixel/TGP), multiple light and dark themes, configurable per-timeline refresh intervals, a full-screen post composer with content warnings and language selection, and poll creation and management.

Login and theme selection happen inside the application: the onboarding flow signs in to an instance, **o** opens the options screen, **d** toggles dark and light mode, **u** switches profile and **?** shows all key bindings. Each profile keeps its data under **~/.config/mastui/_profile_**.

# CAVEATS

Requires a Mastodon account; the onboarding flow can create the API access token. Protect the web interface with **--web-token** when binding to anything other than localhost. Image display capabilities depend on terminal emulator support.

# HISTORY

**mastui** was created by **kimusan** and is written in **Python** using the Textual framework.

# SEE ALSO

[toot](/man/toot)(1)

# RESOURCES

```[Source code](https://github.com/kimusan/mastui)```

<!-- verified: 2026-11-09 -->
