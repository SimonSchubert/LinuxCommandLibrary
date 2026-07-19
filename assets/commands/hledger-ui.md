# TAGLINE

terminal interface for hledger

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

**Start on the balance sheet screen**

```hledger-ui --bs```

**Use a specific display theme**

```hledger-ui --theme [dark]```

# SYNOPSIS

**hledger-ui** [_options_] [_patterns_]

# PARAMETERS

_PATTERNS_
> Account patterns to show.

**-f**, **--file** _[FMT:]FILE_
> Journal file(s) to use. Defaults to $LEDGER_FILE or ~/.hledger.journal.

**-w**, **--watch**
> Auto-reload and update the display when the journal file(s) change.

**-b**, **--begin** _DATE_
> Show only postings/transactions on or after this date.

**-e**, **--end** _DATE_
> Show only postings/transactions before this date.

**-t**, **--tree**
> Show accounts as a hierarchical tree.

**-l**, **--flat**
> Show accounts as a flat list (default).

**--theme** _THEME_
> Display theme to use: light, dark, terminal, or greenterm.

**--cash**, **--bs**, **--is**, **--all**
> Start on the cash accounts, balance sheet, income statement, or all-accounts screen instead of the default accounts screen.

**--register** _ACCTREGEX_
> Start in the register screen for the first matched account.

**--change**
> Show period balance changes at startup instead of historical (ending) balances.

**--help**
> Display help information.

# DESCRIPTION

**hledger-ui** is hledger's terminal (curses-based) interface. It provides an efficient full-window way to browse accounts, transactions and reports interactively, with some limited data entry capability.

The TUI supports keyboard and mouse navigation, drilling down from an accounts screen into a register and individual transactions, filtering by a query typed at any time, and switching between accounts/register/transaction screens. With **-w/--watch**, it reloads automatically whenever the underlying journal file(s) change on disk.

# KEY BINDINGS

**?**
> Show the help dialog, listing all keys for the current screen.

**arrows**, **j**/**k**/**h**/**l**, **CTRL-n**/**p**/**f**/**b**
> Navigate up/down/left/right (vi- and emacs-style equivalents both work).

**/**
> Open the query filter editor.

**a**
> Run hledger's **add** command to record a new transaction.

**g**
> Reload the journal file(s) from disk.

**t**
> Toggle tree/flat account display.

**B** / **V**
> Toggle cost / market value conversion.

**H**
> Toggle between period and historical balances.

**F**
> Toggle forecast mode, revealing future-dated transactions.

**E**
> Open the journal file in $EDITOR.

**q**, **ESCAPE**
> Quit, or back out to the previous/top screen.

# CAVEATS

Requires a terminal that supports at least basic colors for a good experience. Some screens and keys assume the journal is in journal format; other formats have limited support. Part of the hledger suite.

# HISTORY

hledger-ui was developed as the terminal interface complement to hledger's command-line and web (**hledger-web**) interfaces, built with the **brick** TUI library.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-web](/man/hledger-web)(1), [ledger](/man/ledger)(1)
