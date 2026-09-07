# TAGLINE

list DigitalOcean 1-Click applications

# TLDR

**List all 1-Click applications**

```doctl 1-click list```

**List Droplet 1-Click applications**

```doctl 1-click list --type droplet```

**List Kubernetes 1-Click applications**

```doctl 1-click list --type kubernetes```

**Show only slugs**, without a header

```doctl 1-click list --format SLUG --no-header```

**Output as JSON**

```doctl 1-click list --output json```

# SYNOPSIS

**doctl 1-click** _command_ [_options_]

# PARAMETERS

**list**, **ls**
> Retrieve a list of 1-Click applications.

**--type** _TYPE_
> Filter by type. Valid values: `droplet`, `kubernetes`.

**--format** _COLUMNS_
> Columns to display. Possible values: `SLUG`, `TYPE`.

**--no-header**
> Return raw data with no headers.

**--output** _FORMAT_
> Output format: `text` or `json`.

**--help**, **-h**
> Display help for this command.

# DESCRIPTION

**doctl 1-click** lists DigitalOcean 1-Click applications. A 1-Click is a preconfigured image or Kubernetes app that you can install onto a Droplet or cluster instead of assembling the stack yourself.

The **list** subcommand (alias **ls**) returns each application's slug and type. Use **--type droplet** or **--type kubernetes** to narrow the catalog. The slug is the identifier you pass when creating a Droplet or installing a Kubernetes 1-Click.

This command only catalogs available 1-Clicks. Creating a Droplet from a 1-Click image uses **doctl compute droplet create**; installing a Kubernetes 1-Click uses the Kubernetes 1-Click commands.

# CAVEATS

Requires a DigitalOcean API token configured with **doctl auth init**. The catalog is account-independent, but creating resources from a 1-Click incurs the usual Droplet or Kubernetes charges. This command does not install or deploy a 1-Click by itself.

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-compute-droplet](/man/doctl-compute-droplet)(1), [doctl-kubernetes-cluster](/man/doctl-kubernetes-cluster)(1), [doctl-auth](/man/doctl-auth)(1)

# RESOURCES

```[Source code](https://github.com/digitalocean/doctl)```

```[Documentation](https://docs.digitalocean.com/reference/doctl/reference/1-click/)```

<!-- verified: 2026-09-07 -->
