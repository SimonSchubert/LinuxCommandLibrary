# TAGLINE

plain text accounting tool

# TLDR

**Show balance**

```hledger balance```

**Register of transactions**

```hledger register```

**Show income statement**

```hledger incomestatement```

**Show balance sheet**

```hledger balancesheet```

**Add transaction**

```hledger add```

**Use specific journal**

```hledger -f [ledger.journal] balance```

# SYNOPSIS

**hledger** [_options_] _command_ [_args_]

# PARAMETERS

_COMMAND_
> Subcommand to run.

**balance**, **bal**
> Show account balances.

**register**, **reg**
> Show transactions.

**print**
> Print transactions.

**add**
> Add transaction interactively.

**-f** _FILE_
> Journal file.

**-b** _DATE_
> Begin date.

**-e** _DATE_
> End date.

**--help**
> Display help information.

# DESCRIPTION

**hledger** is a plain text accounting tool. It reads journal files in ledger format and provides reports on personal or business finances.

The tool supports double-entry accounting, multiple currencies, and various reports. It's cross-platform and highly scriptable.

# CAVEATS

Learning curve for accounting. Journal format matters. Haskell-based.

# HISTORY

hledger was created by **Simon Michael** as a Haskell implementation inspired by John Wiegley's Ledger.

# SEE ALSO

[ledger](/man/ledger)(1), [beancount](/man/beancount)(1), [hledger-ui](/man/hledger-ui)(1)
