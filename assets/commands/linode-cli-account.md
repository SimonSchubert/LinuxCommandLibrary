# TAGLINE

Manage Linode (Akamai) account information and billing

# TLDR

**Show account info**

```linode-cli account view```

**Show account settings**

```linode-cli account settings```

**List recent events**

```linode-cli account events-list```

**List invoices**

```linode-cli account invoices-list```

**View a specific invoice**

```linode-cli account invoice-view [invoice_id]```

**List payments**

```linode-cli account payments-list```

**View network transfer pool usage**

```linode-cli account transfer```

# SYNOPSIS

**linode-cli account** _command_ [_options_]

# COMMANDS

**view**
> View account contact information, balance, and active promotions.

**settings**
> View account settings including network helper and backup defaults.

**events-list**
> List account events (Linode creation, reboots, etc.).

**invoices-list**
> List billing invoices.

**invoice-view** _ID_
> View details of a specific invoice.

**invoice-items** _ID_
> List line items for a specific invoice.

**payments-list**
> List payments made on the account.

**transfer**
> View network transfer pool usage for the current month.

**logins-list**
> List recent account logins.

**users-list**
> List users on the account.

# PARAMETERS

**--json**
> Output in JSON format.

**--text**
> Output in plain text format.

**--pretty**
> Pretty-print JSON output.

# DESCRIPTION

**linode-cli account** manages Linode (Akamai Cloud) account information including billing, invoices, payments, events, and user management. It provides read access to account details and financial history through the Linode API.

# CAVEATS

Requires a configured Linode CLI with valid API token. Some account operations require read_write scope on the token. The account view shows the balance and any outstanding credits or promotions.

# SEE ALSO

[linode-cli](/man/linode-cli)(1)

