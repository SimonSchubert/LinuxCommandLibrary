# TAGLINE

TUI personal finance manager for ledger journals

# TLDR

**Launch** with a ledger file

```cashd [path/to/journal.ledger]```

**Launch** with default journal

```cashd```

# SYNOPSIS

**cashd** [_options_] [_file_]

# DESCRIPTION

**cashd** is a terminal user interface for personal finance management that works with **ledger**-format plain-text accounting journals. It provides an interactive interface for viewing accounts, balances, and transactions stored in double-entry bookkeeping format.

The TUI displays account hierarchies, transaction lists, and balance summaries. Users can navigate through accounts and time periods to analyze their financial data. The underlying data format is compatible with **ledger**, **hledger**, and other plain-text accounting tools.

# CAVEATS

Expects journal files in ledger-compatible format. Does not provide transaction entry — use a text editor or ledger CLI to add new transactions. Complex ledger features like automated transactions or commodity conversions may not be fully supported in the TUI view.

# SEE ALSO

[ledger](/man/ledger)(1), [hledger](/man/hledger)(1)
