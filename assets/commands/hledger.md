# TAGLINE

plain text accounting tool

# TLDR

**Show account balances**

```hledger balance```

**Show a register of transactions**

```hledger register```

**Show income statement**

```hledger incomestatement```

**Show balance sheet**

```hledger balancesheet```

**Add a transaction interactively**

```hledger add```

**Use a specific journal file**

```hledger -f [ledger.journal] balance```

**Show balances for a date range**

```hledger balance -b [2024-01-01] -e [2024-12-31]```

**Show monthly balance changes**

```hledger balance --monthly```

**Show cash flow report**

```hledger cashflow```

# SYNOPSIS

**hledger** [_options_] _command_ [_args_]

# PARAMETERS

**balance**, **bal**
> Show account balances.

**register**, **reg**
> Show transaction register with running total.

**print**
> Print journal entries in standard format.

**add**
> Add a transaction interactively.

**incomestatement**, **is**
> Show income statement (revenues and expenses).

**balancesheet**, **bs**
> Show balance sheet (assets, liabilities, equity).

**cashflow**, **cf**
> Show cash flow statement.

**accounts**
> List account names.

**stats**
> Show journal statistics.

**import**
> Import new transactions from CSV or other files.

**-f** _FILE_
> Read this journal file instead of the default ($LEDGER_FILE or ~/.hledger.journal).

**-b** _DATE_
> Begin date (include transactions on or after this date).

**-e** _DATE_
> End date (include transactions before this date).

**-p** _PERIOD_
> Period expression (e.g., "monthly", "quarterly", "2024").

**--monthly**, **--quarterly**, **--yearly**
> Show amounts per time period.

**--depth** _N_
> Limit account display depth.

**--cost**, **-B**
> Convert to cost using transaction prices.

**--market**, **-V**
> Convert to market value using market prices.

**--output-format** _FMT_
> Output format: txt, csv, json, html.

**--help**
> Display help information.

# DESCRIPTION

**hledger** is a plain text accounting tool that reads journal files and produces financial reports. It implements double-entry accounting, where every transaction must balance (debits equal credits).

The default journal file is **~/.hledger.journal** or the file specified by the **LEDGER_FILE** environment variable. Journal entries consist of a date, description, and two or more postings (account name and amount). The tool supports multiple currencies, commodity prices, periodic transactions, and CSV import rules.

Reports can be filtered by date range, account name patterns, and description queries. Multi-period reports (**--monthly**, **--quarterly**) show changes over time for trend analysis.

# CAVEATS

Double-entry accounting requires every transaction to balance, which can be confusing for beginners. Journal file syntax is whitespace-sensitive: account names and amounts must be separated by at least two spaces. The default journal file must exist or be specified with **-f** or **LEDGER_FILE**.

# HISTORY

**hledger** was created by **Simon Michael** in **2007** as a Haskell reimplementation inspired by John Wiegley's Ledger. It aims to be a reliable, portable plain text accounting tool with a focus on usability and documentation.

# SEE ALSO

[ledger](/man/ledger)(1), [hledger-ui](/man/hledger-ui)(1), [hledger-web](/man/hledger-web)(1)
