# TAGLINE

provides a web interface for hledger

# TLDR

**Start web interface**

```hledger-web```

**Specify port**

```hledger-web --port [5001]```

**Open specific journal**

```hledger-web -f [ledger.journal]```

**Serve externally**

```hledger-web --serve --host [0.0.0.0]```

**Read-only mode**

```hledger-web --capabilities=view```

**Allow full access including editing and deleting**

```hledger-web --capabilities=view,add,manage```

# SYNOPSIS

**hledger-web** [_options_]

# PARAMETERS

**-f** _FILE_
> Journal file.

**--port** _PORT_
> Server port (default 5000).

**--host** _HOST_
> Listen address.

**--serve**
> Serve without opening a web browser.

**--serve-api**
> Serve only the JSON API, without the web UI.

**--capabilities** _CAPS_
> Allowed actions: view, add, manage (default: view,add).

**--cors** _ORIGIN_
> Allow cross-origin requests from the specified origin.

**--base-url** _URL_
> Base URL for links (useful behind a reverse proxy).

**--help**
> Display help information.

# DESCRIPTION

**hledger-web** provides a web interface for hledger. It offers a browser-based way to view reports, add transactions, and manage journal entries.

The interface includes account registers, balance reports, and transaction entry forms. It can run locally or be served on a network. By default it listens on 127.0.0.1 port 5000 and opens a browser automatically.

# CAVEATS

Not recommended for public internet exposure without a reverse proxy and proper authentication. Built-in access control is limited to the **--capabilities** flag. Part of the hledger suite.

# HISTORY

hledger-web was developed as the web interface for **hledger** to provide browser-based plain text accounting.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-ui](/man/hledger-ui)(1), [ledger](/man/ledger)(1)
