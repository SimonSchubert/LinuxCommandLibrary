# TLDR

**Get account balance**

```doctl balance get```

**Get balance in** JSON format

```doctl balance get --output json```

# SYNOPSIS

**doctl balance** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: get.

**get**
> Retrieve current account balance.

**--output** _FORMAT_
> Output format: text, json.

**--help**
> Display help information.

# DESCRIPTION

**doctl balance** retrieves billing balance information for your DigitalOcean account. It shows the current balance, month-to-date usage, and account balance as of the last invoice.

The command provides a quick way to check spending and remaining credits without accessing the web console. This is useful for monitoring costs in automated workflows or scripts.

Balance information includes prepaid credits, current usage, and any outstanding charges.

# CAVEATS

Balance updates may have slight delay. Does not show detailed cost breakdown. Requires account with billing access.

# HISTORY

doctl balance is part of the **doctl** CLI, providing programmatic access to DigitalOcean billing information for account monitoring and cost management.

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-auth](/man/doctl-auth)(1)
