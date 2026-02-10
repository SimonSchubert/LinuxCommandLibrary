# TAGLINE

plain text accounting tool

# TLDR

**Show balance**

```ledger -f [journal.ledger] balance```

**Show register**

```ledger -f [journal.ledger] register```

**Balance for account**

```ledger -f [journal.ledger] balance [Expenses]```

**Monthly summary**

```ledger -f [journal.ledger] register --monthly```

**Print transactions**

```ledger -f [journal.ledger] print```

**Budget report**

```ledger -f [journal.ledger] budget```

# SYNOPSIS

**ledger** [_options_] _command_ [_args_]

# PARAMETERS

**-f** _FILE_
> Journal file.

**balance**
> Show account balances.

**register**
> Show transaction register.

**print**
> Print transactions.

**--monthly**
> Group by month.

**--period** _PERIOD_
> Time period filter.

**--help**
> Display help information.

# DESCRIPTION

**ledger** is a plain text accounting tool. It processes double-entry accounting journals.

The tool generates reports from simple text files. It supports multiple currencies and commodities.

# CAVEATS

Text file format specific. Learning curve. Powerful query language.

# HISTORY

Ledger was created by **John Wiegley** as a powerful plain text accounting system for command-line users.

# SEE ALSO

[hledger](/man/hledger)(1), [beancount](/man/beancount)(1)
