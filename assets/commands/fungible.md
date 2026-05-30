# TAGLINE

Terminal UI for personal finance with Plaid sync, categorization, tags and FIRE tracking

# TLDR

Launch the TUI (starts MCP and REST API in background)

```fungible```

Run the demo with fake data (no setup required)

```fungible --demo```

Link a new bank account via Plaid

```fungible --setup```

Import a CSV statement

```fungible import-csv /path/to/statement.csv```

Run only the MCP server for Claude Desktop

```fungible mcp```

# SYNOPSIS

**fungible** [_options_] [_command_]

# DESCRIPTION

**fungible** is a keyboard-driven terminal application for managing personal finances. It syncs transactions from Plaid, imports CSVs, lets you write powerful categorization and renaming rules, tag transactions, track net worth over time, and calculate financial health metrics including FIRE progress.

All data lives locally in `~/.fungible/`. Plaid tokens are encrypted at rest. The TUI, an MCP server (for Claude and other agents), and a REST API all share the same database so changes made from any interface are immediately visible everywhere.

Key concepts:

- **Rules** — substring or regex rules (with optional amount filters) that automatically categorize or rename transactions on import/sync.
- **Flexibility tiers** — tag categories as fixed, flexible, or discretionary to understand spending behavior.
- **Tags** — cross-cutting labels (trips, projects, clients) independent of categories.
- **Net worth history** — periodic snapshots of assets and liabilities.
- **Financial health** — runway, FIRE number, Coast FIRE, and adjustable assumptions.

# PARAMETERS

**--demo**  
> Start with a pre-populated demo database (safe, isolated)

**--setup**  
> Run the first-time Plaid + configuration wizard

Subcommands:

**mcp**  
> Run only the stdio MCP server (for Claude Desktop etc.)

**api**  
> Run only the REST API server

# KEY BINDINGS (TUI)

From the main screen:

`1` Dashboard, `2` Transactions, `3` Trends, `4` Net Worth, `5` Tags, `6` Financial Health, `7` Rules, `8` Accounts, `q` Quit.

In **Transactions**: `e` edit, `g` tag, `i` ignore, `/` regex search.

Full keybindings are shown in-app with `?`.

# SEE ALSO

[ledger](/man/ledger)(1), [hledger](/man/hledger)(1), [beancount](/man/beancount)
