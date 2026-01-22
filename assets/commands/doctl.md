# TLDR

**Authenticate with** DigitalOcean

```doctl auth init```

**List all droplets**

```doctl compute droplet list```

**Create a droplet**

```doctl compute droplet create [name] --size [s-1vcpu-1gb] --image [ubuntu-22-04-x64] --region [nyc1]```

**Delete a droplet**

```doctl compute droplet delete [droplet_id]```

**List Kubernetes clusters**

```doctl kubernetes cluster list```

**Get kubeconfig**

```doctl kubernetes cluster kubeconfig save [cluster_name]```

**List available regions**

```doctl compute region list```

# SYNOPSIS

**doctl** _command_ [_subcommand_] [_options_]

# PARAMETERS

_COMMAND_
> Resource type: compute, kubernetes, apps, databases, etc.

**auth** **init**
> Authenticate with API token.

**compute** **droplet** _ACTION_
> Manage droplets.

**kubernetes** **cluster** _ACTION_
> Manage Kubernetes clusters.

**apps** _ACTION_
> Manage App Platform applications.

**--output** _FORMAT_
> Output format: text, json.

**--context** _NAME_
> Use named authentication context.

**--help**
> Display help information.

# DESCRIPTION

**doctl** is the official command-line interface for DigitalOcean, providing access to all DigitalOcean services including Droplets, Kubernetes, App Platform, Databases, and more.

The tool enables infrastructure automation, CI/CD integration, and scriptable management of DigitalOcean resources. It supports multiple authentication contexts for managing different accounts or teams.

doctl mirrors the DigitalOcean API functionality, allowing complete control over cloud resources from the command line without using the web console.

# CAVEATS

Requires DigitalOcean account and API token. Actions may incur charges. Some operations are irreversible. Rate limits apply to API requests.

# HISTORY

doctl was developed by **DigitalOcean** as the official CLI for their cloud platform. It provides programmatic access to DigitalOcean services, supporting DevOps workflows and infrastructure as code practices.

# SEE ALSO

[kubectl](/man/kubectl)(1), [terraform](/man/terraform)(1), [aws](/man/aws)(1)
