# TLDR

**Start TUI**

```hledger-ui```

**Open specific journal**

```hledger-ui -f [ledger.journal]```

**Start at date**

```hledger-ui --begin [2024-01-01]```

**Show specific account**

```hledger-ui [assets:bank]```

**Watch for changes**

```hledger-ui --watch```

# SYNOPSIS

**hledger-ui** [_options_] [_patterns_]

# PARAMETERS

_PATTERNS_
> Account patterns to show.

**-f** _FILE_
> Journal file.

**--watch**
> Auto-reload on changes.

**-b**, **--begin** _DATE_
> Start date.

**-e**, **--end** _DATE_
> End date.

**--tree**
> Hierarchical view.

**--flat**
> Flat list view.

**--help**
> Display help information.

# DESCRIPTION

**hledger-ui** is a terminal interface for hledger. It provides an interactive way to explore accounts, transactions, and reports.

The TUI supports navigation, drilling down into accounts, and switching between different views. It watches files for live updates.

hledger-ui provides terminal accounting interface.

# CAVEATS

Requires terminal with color. Curses-based interface. Part of hledger suite.

# HISTORY

hledger-ui was developed as the terminal interface complement to **hledger** command-line and web interfaces.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-web](/man/hledger-web)(1), [ledger](/man/ledger)(1)
