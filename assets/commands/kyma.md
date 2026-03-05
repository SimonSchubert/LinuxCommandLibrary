# TAGLINE

CLI tool for managing Kyma Kubernetes modules

# TLDR

**List available modules**

```kyma modules list```

**Add a module** to the cluster

```kyma modules add [module_name]```

**Delete a module**

```kyma modules delete [module_name]```

**Deploy an application**

```kyma deploy [path/to/app]```

# SYNOPSIS

**kyma** _command_ [_options_]

# DESCRIPTION

**kyma** is a command-line interface for managing Kyma, an opinionated set of Kubernetes-based modular building blocks for enterprise-grade cloud-native applications. It simplifies module management, deployment, and configuration of Kyma resources on Kubernetes clusters.

The CLI provides commands to list, add, and delete Kyma modules, deploy applications, and interact with Kyma's custom resources directly from the command line.

# CAVEATS

Requires access to a Kubernetes cluster with Kyma installed. Module availability depends on the cluster configuration and Kyma version.

# HISTORY

**kyma** CLI is developed by the **Kyma project** (part of the SAP ecosystem) and is written in **Go**. The v3 release refocused the tool toward application developers using Kyma as their Kubernetes-based runtime.

# SEE ALSO

[kubectl](/man/kubectl)(1), [helm](/man/helm)(1)
