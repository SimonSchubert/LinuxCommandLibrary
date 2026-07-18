# TAGLINE

Scaleway cloud infrastructure CLI

# TLDR

**Login** / configure profile

```scw init```

**List** instances

```scw instance server list```

**Create** a small instance

```scw instance server create type=[DEV1-S] image=[ubuntu_noble] zone=[fr-par-1]```

**Kubernetes** cluster helper

```scw k8s cluster list```

# SYNOPSIS

**scw** *product* *resource* *command* [*args*]

# DESCRIPTION

**scw** is the official Scaleway CLI (v2) for managing cloud resources—instances, object storage, Kubernetes (Kapsule), networking, and more—from the terminal. Hierarchical commands mirror the Scaleway API. Docs: https://cli.scaleway.com/

# PARAMETERS

**init**

> Interactive configuration of access keys and default zone/region.

*product* *resource* *verb*

> e.g. **instance server list**, **object list**.

**-o** *json*|*yaml*|*human*

> Output format (common global flag).

**--help**

> Context-sensitive help at any command level.

# CAVEATS

Requires Scaleway API keys; store them securely. Resource names and SKUs change—check current product docs. Incurs cloud costs when creating paid resources.

# SEE ALSO

[aws](/man/aws)(1), [doctl](/man/doctl)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Source code](https://github.com/scaleway/scaleway-cli)```

```[Documentation](https://cli.scaleway.com/)```

<!-- verified: 2026-07-19 -->
