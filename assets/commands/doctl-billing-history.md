# TAGLINE

retrieve DigitalOcean account billing history

# TLDR

**List billing history events**

```doctl billing-history list```

**Show only date and description**

```doctl billing-history list --format Date,Description```

**Output as JSON**

```doctl billing-history list --output json```

**Use the short alias**

```doctl bh list```

# SYNOPSIS

**doctl billing-history** _command_ [_options_]

# PARAMETERS

**list**, **ls**
> Retrieve a paginated billing history for the authenticated account.

**--format** _COLUMNS_
> Columns to display. Possible values: `Date`, `Type`, `Description`, `Amount`, `InvoiceID`, `InvoiceUUID`.

**--no-header**
> Return raw data with no headers.

**--output** _FORMAT_
> Output format: `text` or `json`.

**--help**, **-h**
> Display help for this command.

# DESCRIPTION

**doctl billing-history** (alias **bh**) retrieves billing events for your DigitalOcean account. Each event includes the date, event type, a description, the amount in USD, and, when applicable, the related invoice ID and UUID.

The **list** subcommand (alias **ls**) is the only action. Use it to audit charges, credits, and invoice-related events without opening the control panel. Pair **InvoiceUUID** with **doctl invoice get** or **doctl invoice summary** to inspect a specific invoice.

# CAVEATS

Requires a DigitalOcean API token with billing access. History is paginated through the API; very large accounts may need to page through results. Amounts and dates can lag slightly behind real-time usage. This command does not download invoice PDFs or CSVs; use **doctl invoice** for that.

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-balance](/man/doctl-balance)(1), [doctl-invoice](/man/doctl-invoice)(1), [doctl-account](/man/doctl-account)(1)

# RESOURCES

```[Source code](https://github.com/digitalocean/doctl)```

```[Documentation](https://docs.digitalocean.com/reference/doctl/reference/billing-history/)```

<!-- verified: 2026-09-07 -->
