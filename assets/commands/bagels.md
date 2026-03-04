# TAGLINE

terminal-based expense tracker with budgeting and insights

# TLDR

**Start the application**

```bagels```

**Start with data stored** in a specific directory

```bagels --at [path/to/directory]```

**Locate the database** file

```bagels locate database```

**Locate the configuration** file

```bagels locate config```

**Migrate data** from Actual Budget

```bagels --migrate actualbudget --source [path/to/source.db]```

# SYNOPSIS

**bagels** [**--at** _path_] [**--migrate** _type_ **--source** _path_]

**bagels** **locate** {**config** | **database**}

# PARAMETERS

**--at** _path_
> Specify a custom directory for storing the database and configuration files. Defaults to XDG base directories.

**--migrate** _type_
> Run a data migration from another application. Currently supports **actualbudget**.

**--source** _path_
> Path to the source database file when using **--migrate**.

**locate config**
> Display the path to the configuration YAML file.

**locate database**
> Display the path to the SQLite database file.

# CONTROLS

**a**
> Add a new record, account, or category (context-dependent)

**e**
> Edit selected item

**d**
> Delete selected item

**v**
> Toggle jump mode for quick navigation between UI panels

**c**
> Cycle between Home and Manager tabs

**t**
> Create a new transfer between accounts

**b**
> Open budgets view

**s**
> Toggle transaction splits display

**q** / **w**
> Display records by date / by person

**f**
> Open advanced filter

**.**
> Cycle time offset type (day, week, month, year)

**/**
> Toggle between income and expense mode

**[** / **]**
> Select previous / next account

**\\**
> Toggle account-based record filtering

**Left** / **Right**
> Navigate to previous / next time period

**1-9**
> Quick-apply a transaction template by its number

**ctrl+a**
> Add a new split to a record (in record modal)

**ctrl+d**
> Delete the last split (in record modal)

**ctrl+t**
> Submit and save as template (in record modal)

**ctrl+q**
> Quit the application

# DESCRIPTION

**bagels** is a terminal user interface (TUI) application for tracking personal expenses and income. It stores all financial data locally in a SQLite database and presents an interactive interface built on the Textual framework.

The application is organized into two main views: Home and Manager. The Home view displays transaction records, account balances, spending insights with graphs, income/expense mode toggles, and quick-access templates. The Manager view provides tools for configuring accounts, categories with subcategories, budgets, and people for split tracking.

Key features include split transactions across multiple categories, transfers between tracked accounts and external accounts, recurring transaction templates accessible via number keys, and a jump mode system for keyboard-driven navigation between UI panels. The insights module provides spending analysis with visual graphs, estimated projections, and budget tracking against configurable limits.

Bagels supports budgeting with configurable income assessment policies, savings percentage targets, and wants-versus-needs spending ratios. Records can be filtered by label, amount, category, and time period (day, week, month, or year).

All data remains local on the user's machine, following XDG base directory conventions for file storage. The database and configuration can optionally be placed in a custom directory using the **--at** flag.

# CONFIGURATION

Configuration is stored in a **config.yaml** file at the XDG config directory (typically **~/.config/bagels/config.yaml**). The file is auto-generated on first run and uses YAML format.

**defaults.period**
> Default time period for the home view. Options: **day**, **week**, **month**, **year**. Default: **week**.

**defaults.first_day_of_week**
> First day of the week (0 = Monday, 6 = Sunday). Default: **6**.

**defaults.date_format**
> Date display format string. Default: **%d/%m**.

**defaults.round_decimals**
> Number of decimal places for amounts. Default: **2**.

**defaults.plot_marker**
> Graph plot marker style. Options: **braille**, **fhd**, **hd**, **dot**. Default: **braille**.

**state.theme**
> Color theme. Available themes include **tokyo-night**, **nord**, **gruvbox**, **catppuccin-mocha**, **dracula**, **galaxy**, **alpine**, **cobalt**, **hacker**, **flexoki**, and **dark**. Default: **tokyo-night**.

**state.check_for_updates**
> Check PyPI for new versions on startup. Default: **true**.

**state.budgeting**
> Budgeting parameters including income assessment policy, savings percentage, and wants spending ratio.

**hotkeys**
> All keyboard shortcuts are fully configurable under the **hotkeys** section.

**symbols**
> Customizable display symbols for lines, split indicators, category markers, and amount signs.

# CAVEATS

Requires Python 3.13 or later. For best rendering, use a modern terminal emulator; macOS users should consider Ghostty, and Windows users should use Windows Terminal.

The **--migrate** option currently only supports importing from Actual Budget. The **--source** flag is required when using migration.

All data is stored locally with no cloud synchronization. Backup the database file (located via **bagels locate database**) to prevent data loss.

# HISTORY

**Bagels** was created by **Jax (EnhancedJax)** and first released in **2024** as an open-source terminal expense tracker. The project is built on the **Textual** TUI framework and was inspired by the **Posting** terminal application. It gained popularity in the terminal tooling community, accumulating over 2,700 GitHub stars. The project is licensed under **GPL-3.0**.

# SEE ALSO

[ledger](/man/ledger)(1), [hledger](/man/hledger)(1), [awk](/man/awk)(1)
