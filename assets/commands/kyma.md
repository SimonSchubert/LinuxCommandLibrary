# TAGLINE

CLI tool for managing Kyma Kubernetes modules and applications

# TLDR

**List installed modules**

```kyma module list```

**View available modules in the catalog**

```kyma module catalog```

**Add a module to the cluster**

```kyma module add [module_name]```

**Delete a module from the cluster**

```kyma module delete [module_name]```

**Push an application to the cluster**

```kyma app push --name [my-app] --image [image:tag] --container-port [8080]```

**Push and expose an application**

```kyma app push --name [my-app] --image [image:tag] --expose --container-port [80]```

# SYNOPSIS

**kyma** _command_ [_options_]

# SUBCOMMANDS

**module list**
> Display installed Kyma modules.

**module catalog**
> View available modules for installation.

**module add** _name_
> Add a module to the cluster.

**module delete** _name_
> Remove a module from the cluster.

**module manage** _name_
> Set a module to managed state.

**module unmanage** _name_
> Set a module to unmanaged state.

**app push**
> Build and deploy an application to the cluster.

**completion** _shell_
> Generate shell completion scripts (bash, zsh, fish, powershell).

**version**
> Show CLI version information.

# DESCRIPTION

**kyma** is a command-line interface for managing Kyma, an opinionated set of Kubernetes-based modular building blocks for enterprise-grade cloud-native applications. It simplifies module management, deployment, and configuration of Kyma resources on Kubernetes clusters.

The CLI provides commands to discover, install, and remove Kyma modules, deploy applications using **app push**, and interact with Kyma's custom resources directly from the command line.

# CAVEATS

Requires access to a Kubernetes cluster with Kyma installed. Module availability depends on the cluster configuration and Kyma version. The v2 CLI commands are deprecated; use v3 commands instead.

# HISTORY

**kyma** CLI is developed by the **Kyma project** (part of the SAP ecosystem) and is written in **Go**. The v3 release refocused the tool toward application developers using Kyma as their Kubernetes-based runtime.

# SEE ALSO

[kubectl](/man/kubectl)(1), [helm](/man/helm)(1)
