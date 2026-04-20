# TAGLINE

Terminal dashboard for personal finance management with hledger

# TLDR

**Launch the finance dashboard** using the journal from **$LEDGER_FILE**

```puffin```

**Launch the v3 UI**

```puffin -v3```

# SYNOPSIS

**puffin** [_-v3_]

# DESCRIPTION

**puffin** is a terminal dashboard for personal finance management that integrates hledger reports into a TUI. It displays income statements, balance sheets, and register data with filtering by account, date, period, and depth. Multi-commodity tracking is supported.

Puffin does not accept its own **--file**/**--config** flags; it picks up the journal via **hledger**'s own configuration (the **$LEDGER_FILE** environment variable or **~/.hledger.journal**). An optional **puffin.json** file configures custom report tabs (with **name**, **cmd**, and **locked** fields); the v3 UI reads a simpler config containing only a **journalFile** field. Press **?** inside the TUI to display the keybinding help.

# CAVEATS

Requires **hledger** to be installed and configured with journal files. All filtering flags passed on custom report commands must be valid **hledger** arguments.

# HISTORY

**puffin** was created by **siddhantac** and is written in **Go**.

# SEE ALSO

[hledger](/man/hledger)(1), [ledger](/man/ledger)(1)
