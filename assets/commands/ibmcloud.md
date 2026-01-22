# TLDR

**Login to IBM Cloud**

```ibmcloud login```

**Login with SSO**

```ibmcloud login --sso```

**Set target region**

```ibmcloud target -r [us-south]```

**List resources**

```ibmcloud resource service-instances```

**Get account info**

```ibmcloud account show```

**List available plugins**

```ibmcloud plugin repo-plugins```

# SYNOPSIS

**ibmcloud** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to execute.

**login**
> Authenticate.

**target**
> Set target region/org.

**account**
> Account operations.

**resource**
> Resource management.

**plugin**
> Plugin management.

**--help**
> Display help information.

# DESCRIPTION

**ibmcloud** is the CLI for IBM Cloud. It manages cloud resources, services, and infrastructure across IBM Cloud platform.

The tool provides access to compute, storage, AI services, and Kubernetes. It supports plugins for extended functionality.

ibmcloud manages IBM Cloud resources.

# CAVEATS

Requires IBM Cloud account. Plugins for services. Region-specific operations.

# HISTORY

ibmcloud is the official CLI for **IBM Cloud** (formerly Bluemix), IBM's cloud computing platform.

# SEE ALSO

[aws](/man/aws)(1), [gcloud](/man/gcloud)(1), [az](/man/az)(1)
