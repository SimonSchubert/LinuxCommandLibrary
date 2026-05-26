# TAGLINE

Local-first personal finance app in the terminal

# TLDR

**Launch** the main app

```fungible```

**Run the first-time** setup wizard

```fungible --setup```

**Start a demo instance** pre-loaded with fake data

```fungible --demo```

**Install** via Homebrew

```brew install fungible```

**Print the version**

```fungible --version```

# SYNOPSIS

**fungible** [_--setup_ | _--demo_ | _--version_ | _--help_]

# DESCRIPTION

**fungible** is a keyboard-driven personal finance application that runs entirely inside the terminal. It manages bank accounts, transactions, budgets, categories, and net-worth tracking from a single TUI, with all data stored locally under **~/.fungible/**.

Accounts are populated either by linking real institutions through **Plaid** (transactions refresh roughly every 15 minutes) or by importing CSV statements. Manual asset entries cover holdings that have no bank feed, such as property or vehicles. Transactions can be categorised manually or via substring and regular-expression rules, and arbitrary tags can be applied across accounts for cross-cutting analysis.

The reporting views break spending down by category, by flexibility tier (fixed / flexible / discretionary), and over time, and surface higher-level metrics such as net worth, cash runway, projected FIRE number, and estimated years to retirement under adjustable assumptions.

# PARAMETERS

**--setup**
> Run the first-time configuration wizard: pick a base currency, set up the encryption key, and optionally link a Plaid item.

**--demo**
> Launch a pre-populated demo instance with fake accounts, transactions, categories, tags, and rules. The demo profile is isolated from real data.

**--version**
> Print the **fungible** version and exit.

**--help**
> Show CLI help.

# CONFIGURATION

All state lives under **~/.fungible/**:

**~/.fungible/db.sqlite**
> SQLite database with accounts, transactions, categories, rules, and tags.

**~/.fungible/key**
> Encryption key protecting Plaid access tokens. Back this up: losing it requires re-linking every Plaid account.

**~/.fungible/config.json**
> User preferences (default views, tier definitions, currency, etc.).

# CAVEATS

**Plaid** integration requires a Plaid developer account and an API key configured during **--setup**; without it, only CSV import and manual asset tracking are available.

The encryption key in **~/.fungible/key** is the only thing that protects stored Plaid access tokens. Treat it as a secret: include it in encrypted backups, never commit it to a repository.

**fungible** is a single-user, single-machine app. It does not sync between devices, although the SQLite database can be copied if the key file is copied alongside it.

# HISTORY

**fungible** is an MIT-licensed project published by **tomfunk** on GitHub in **2026**, written in **TypeScript** on **Node.js 22+**. It bundles a TUI, an embedded API server, and an MCP (Model Context Protocol) server so AI assistants can read and categorise transactions on request.

# SEE ALSO

[ledger](/man/ledger)(1), [hledger](/man/hledger)(1), [beancount](/man/beancount)(1), [gnucash-cli](/man/gnucash-cli)(1)
