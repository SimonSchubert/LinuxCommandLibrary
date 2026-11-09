# TAGLINE

TUI expense and budget tracker

# TLDR

**Launch the budget tracker**

```moneyterm```

# SYNOPSIS

**moneyterm**

# DESCRIPTION

**moneyterm** is a TUI-based expense and budget tracker with tabs for Overview, Transactions, Labeler, Trends, Budget and Config.

Features include importing transactions from QFX/OFX bank export files (with automatic duplicate detection), creating budgets per label with monthly amounts, viewing transaction details in interactive datatables, splitting transactions across multiple labels, and trend analysis.

To import, set an import directory and file extension in the Config tab; any files found there are imported automatically. In the transaction table, press **I** for details, **c** to add a label quickly and **/** to split a transaction.

# CAVEATS

Transaction import supports QFX/OFX format only. Data is stored locally.

# HISTORY

**moneyterm** was created by **ChrisBuilds** and is written in **Python** using the Textual and Rich frameworks.

# SEE ALSO

[ledger](/man/ledger)(1), [hledger](/man/hledger)(1)

# RESOURCES

```[Source code](https://github.com/ChrisBuilds/moneyterm)```

<!-- verified: 2026-11-09 -->
