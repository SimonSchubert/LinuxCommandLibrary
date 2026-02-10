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
> Serve without browser.

**--capabilities** _CAPS_
> Allowed actions (view, add, manage).

**--base-url** _URL_
> Base URL for links.

**--help**
> Display help information.

# DESCRIPTION

**hledger-web** provides a web interface for hledger. It offers a browser-based way to view reports, add transactions, and manage journals.

The interface includes charts, reports, and transaction entry forms. It can run locally or be served on a network.

# CAVEATS

Not for public internet exposure. Authentication limited. Part of hledger suite.

# HISTORY

hledger-web was developed as the web interface for **hledger** to provide browser-based plain text accounting.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-ui](/man/hledger-ui)(1), [ledger](/man/ledger)(1)
