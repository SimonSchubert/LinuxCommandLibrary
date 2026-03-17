# TAGLINE

retrieve DigitalOcean account billing balance

# TLDR

**Get current account balance**

```doctl balance get```

**Get balance in JSON format**

```doctl balance get --output json```

**Show only month-to-date usage**

```doctl balance get --format MonthToDateUsage```

# SYNOPSIS

**doctl balance** _command_ [_options_]

# PARAMETERS

**get**
> Retrieve current account balance, month-to-date usage, and balance as of last invoice.

**--format** _COLUMNS_
> Display specific columns (e.g., MonthToDateUsage, AccountBalance, MonthToDateBalance, GeneratedAt).

**--output** _FORMAT_
> Output format: text or json.

**--help**
> Display help information.

# DESCRIPTION

**doctl balance** retrieves billing balance information for your DigitalOcean account. It shows the current balance, month-to-date usage, and account balance as of the last invoice.

The command provides a quick way to check spending and remaining credits without accessing the web console. This is useful for monitoring costs in automated workflows or scripts.

The **get** subcommand (alias **g**) is the only available subcommand.

# CAVEATS

Balance updates may have a slight delay from real-time usage. Does not show detailed per-resource cost breakdowns. Requires a valid API token with billing access configured via **doctl auth init**.

# HISTORY

**doctl balance** is part of the **doctl** CLI tool, developed and maintained by **DigitalOcean** for programmatic access to their cloud platform services.

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-account](/man/doctl-account)(1), [doctl-auth](/man/doctl-auth)(1)
