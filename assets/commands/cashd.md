# TAGLINE

TUI personal finance manager for ledger, hledger and CSV data

# TLDR

**Launch** with a ledger or hledger journal

```cashd --ledger [path/to/journal.dat]```

**Launch** using the journal in LEDGER_FILE or HLEDGER_FILE

```cashd```

**Load transactions from CSV** with a parsing configuration

```cashd --csv [path/to/transactions.csv] --csv-config [path/to/config.json]```

**Load several CSV files** with a glob

```cashd --csv "[*.csv]" --csv-config [path/to/config.json]```

# SYNOPSIS

**cashd** [_options_]

# PARAMETERS

**--ledger** _file_
> Path to a Ledger or hledger journal file

**--csv** _file_
> CSV transaction file. Accepts comma-separated files, globs, or repeated flags

**--csv-config** _file_
> JSON file describing how to parse the CSV data

**--hide-help**
> Hide the in-app help panel

**--show-timer**
> Show a stopwatch on the loading screen

**--debug**
> Print a stack trace on panic

**-h**, **--help**
> Show help

**-v**, **--version**
> Show the version

# DESCRIPTION

**cashd** is a terminal user interface for browsing and analyzing personal finance data. It has views for transactions, accounts and categories, date range filtering (weekly, monthly, quarterly, annually) and time-series charts for accounts and categories.

Press **/** in the transactions view to search. Keywords can be limited to a field with the prefixes **d:** (date), **t:** (type), **a:** (account), **c:** (category), **m:** (amount) and **p:** (description). **d:** and **m:** support **>** and **<**, a leading **-** negates a keyword, and **OR** separates alternative groups, as in **c:food m:>10 OR c:groceries**.

# CONFIGURATION

**LEDGER_FILE**, **HLEDGER_FILE**
> Journal file to load when **--ledger** is not given

# CAVEATS

Journals are read by invoking **ledger print** or **hledger print**, so one of those tools must be installed. Only Income and Expense transactions, the account types Cash, Bank Account and Credit Card, the **$** currency, and ledger transactions with two postings are supported. Requires a terminal with a Nerd Font. Add new transactions with a text editor or your accounting tool.

# SEE ALSO

[ledger](/man/ledger)(1), [hledger](/man/hledger)(1), [puffin](/man/puffin)(1)

# RESOURCES

```[Source code](https://github.com/hzqtc/cashd)```

<!-- verified: 2026-11-09 -->
