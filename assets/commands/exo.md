# TAGLINE

command-line interface for Exoscale cloud services

# TLDR

**Configure CLI credentials**

```exo config add```

**List compute instances**

```exo compute instance list```

**Create a compute instance in a specific zone**

```exo compute instance create [name] --zone [ch-gva-2]```

**SSH to an instance**

```exo compute instance ssh [instance_name]```

**List IAM API keys**

```exo iam api-key list```

**List object storage buckets**

```exo storage list```

**Show current account limits**

```exo limits```

# SYNOPSIS

**exo** _command_ [_subcommand_] [_options_]

# PARAMETERS

_COMMAND_
> Service: compute, iam, storage, dns, etc.

**compute** _SUBCOMMAND_
> Manage compute resources (instances, security groups, load balancers, SKS clusters, etc.).

**dbaas** _SUBCOMMAND_
> Manage Database as a Service instances.

**dns** _SUBCOMMAND_
> Manage DNS zones and records.

**iam** _SUBCOMMAND_
> Identity and access management (API keys, roles, org policy).

**storage** _SUBCOMMAND_
> Object storage operations (buckets, upload, download).

**config** _SUBCOMMAND_
> Manage CLI configuration and credentials.

**zone**
> List available zones.

**limits**
> Show current account resource limits.

**status**
> Show Exoscale platform status.

**version**
> Print CLI version.

**--help**
> Display help information.

# CONFIGURATION

**~/.config/exoscale/exoscale.toml**
> Stores API credentials and default zone/account settings.

# DESCRIPTION

**exo** is the command-line interface for Exoscale, a European cloud computing provider. It manages compute instances, storage, DNS, and other cloud resources.

The tool provides commands for all Exoscale services including SKS (Kubernetes), DBaaS, dedicated inference, and networking. Configuration stores API credentials for authentication.

exo enables infrastructure automation and management without the web console.

# CAVEATS

Requires Exoscale account and API keys. Actions may incur costs. Zone availability varies. Some features require specific subscriptions.

# HISTORY

exo is the official CLI for **Exoscale**, a Swiss cloud provider founded in **2011** offering GDPR-compliant cloud infrastructure with a focus on European data sovereignty.

# SEE ALSO

[aws](/man/aws)(1), [gcloud](/man/gcloud)(1), [az](/man/az)(1), [doctl](/man/doctl)(1)
