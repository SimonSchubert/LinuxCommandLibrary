# TAGLINE

command-line interface for Exoscale cloud services

# TLDR

**List accounts**

```exo iam list```

**Create instance**

```exo compute instance create [name] --zone [ch-gva-2]```

**List instances**

```exo compute instance list```

**SSH to instance**

```exo compute ssh [instance_name]```

**Configure CLI**

```exo config```

# SYNOPSIS

**exo** _command_ [_subcommand_] [_options_]

# PARAMETERS

_COMMAND_
> Service: compute, iam, storage, dns, etc.

**compute** **instance** _ACTION_
> Manage compute instances.

**iam** _ACTION_
> Identity and access management.

**storage** _ACTION_
> Object storage operations.

**dns** _ACTION_
> DNS zone management.

**config**
> Configure CLI credentials.

**--help**
> Display help information.

# CONFIGURATION

**~/.config/exoscale/exoscale.toml**
> Stores API credentials and default zone/account settings.

# DESCRIPTION

**exo** is the command-line interface for Exoscale, a European cloud computing provider. It manages compute instances, storage, DNS, and other cloud resources.

The tool provides commands for all Exoscale services including SKS (Kubernetes), DBaaS, and networking. Configuration stores API credentials for authentication.

exo enables infrastructure automation and management without the web console.

# CAVEATS

Requires Exoscale account and API keys. Actions may incur costs. Zone availability varies. Some features require specific subscriptions.

# HISTORY

exo is the official CLI for **Exoscale**, a Swiss cloud provider founded in **2011** offering GDPR-compliant cloud infrastructure with a focus on European data sovereignty.

# SEE ALSO

[aws](/man/aws)(1), [gcloud](/man/gcloud)(1), [doctl](/man/doctl)(1)
