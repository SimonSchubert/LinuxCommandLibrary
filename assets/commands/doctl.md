# TAGLINE

official DigitalOcean command-line interface

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

**List all databases**

```doctl databases list```

**List Spaces** (object storage buckets)

```doctl spaces list```

**Create a container registry**

```doctl registry create [name]```

**List SSH keys**

```doctl compute ssh-key list```

**Output as JSON**

```doctl compute droplet list --output json```

# SYNOPSIS

**doctl** _command_ [_subcommand_] [_options_]

# PARAMETERS

_COMMAND_
> Resource type: account, auth, compute, apps, databases, kubernetes, monitoring, projects, registry, serverless, spaces, vpcs, etc.

**auth** **init**
> Authenticate with API token.

**auth** **list**
> List available authentication contexts.

**compute** **droplet** _ACTION_
> Manage Droplets (create, list, delete, get, etc.).

**compute** **volume** _ACTION_
> Manage block storage volumes.

**compute** **domain** _ACTION_
> Manage DNS domains and records.

**compute** **firewall** _ACTION_
> Manage cloud firewalls.

**compute** **load-balancer** _ACTION_
> Manage load balancers.

**kubernetes** **cluster** _ACTION_
> Manage Kubernetes clusters.

**apps** _ACTION_
> Manage App Platform applications.

**databases** _ACTION_
> Manage managed database clusters.

**spaces** _ACTION_
> Manage Spaces object storage.

**registry** _ACTION_
> Manage container registries.

**serverless** _ACTION_
> Manage serverless functions.

**monitoring** _ACTION_
> Manage monitoring alert policies and uptime checks.

**projects** _ACTION_
> Organize and assign resources to projects.

**--access-token** _TOKEN_
> DigitalOcean API token. Overrides config and DIGITALOCEAN_ACCESS_TOKEN.

**--output** _FORMAT_
> Output format: text, json.

**--format** _COLUMNS_
> Comma-separated list of columns to display in table output.

**--context** _NAME_
> Use named authentication context.

**--trace**
> Show a log of network activity while performing a command.

**--verbose**
> Enable verbose output.

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

[kubectl](/man/kubectl)(1), [terraform](/man/terraform)(1), [aws](/man/aws)(1), [gcloud](/man/gcloud)(1)
