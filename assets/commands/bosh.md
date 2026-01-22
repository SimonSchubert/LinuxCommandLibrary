# TLDR

**Deploy** release

```bosh -d [deployment] deploy [manifest.yml]```

**List** deployments

```bosh deployments```

**SSH** into instance

```bosh -d [deployment] ssh [instance]```

**View** logs

```bosh -d [deployment] logs [instance]```

**Update** cloud config

```bosh update-cloud-config [cloud-config.yml]```

# SYNOPSIS

**bosh** [_options_] _command_

# DESCRIPTION

**bosh** is the command-line interface for BOSH, a tool for release engineering, deployment, and lifecycle management of distributed systems. It's commonly used for deploying Cloud Foundry and other complex distributed applications.

The tool manages infrastructure provisioning, software deployment, and operational concerns across multiple cloud providers.

# PARAMETERS

**-d**, **--deployment** _name_
> Deployment name

**-e**, **--environment** _alias_
> Environment alias

**-n**, **--non-interactive**
> Non-interactive mode

**--json**
> JSON output

**--column** _header_
> Filter output columns

# COMMON COMMANDS

**deployments**
> List all deployments

**deploy** _manifest_
> Create or update deployment

**delete-deployment**
> Delete deployment

**ssh** _instance_
> SSH into VM

**logs** _instance_
> Fetch logs

**vms**
> List VMs

**tasks**
> List tasks

**cloud-config**
> Show cloud configuration

# WORKFLOW

```bash
# Target environment
bosh alias-env prod -e 10.0.0.6 --ca-cert cert.pem

# Log in
bosh -e prod login

# Upload stemcell
bosh -e prod upload-stemcell stemcell.tgz

# Upload release
bosh -e prod upload-release release.tgz

# Deploy
bosh -e prod -d myapp deploy manifest.yml

# Check VMs
bosh -e prod -d myapp vms

# SSH
bosh -e prod -d myapp ssh instance/0
```

# FEATURES

- Multi-cloud support (AWS, GCP, Azure, vSphere)
- Automated health monitoring
- Rolling updates
- Resurrection (automatic VM recovery)
- Snapshots and backups
- Configuration management
- Network isolation

# CAVEATS

Steep learning curve. Complex configuration. Requires dedicated infrastructure. Best suited for large deployments. Manifest syntax can be intricate. Debugging difficult without experience.

# HISTORY

**BOSH** was created by VMware around **2010** for Cloud Foundry deployment, becoming an open-source project for managing complex distributed systems.

# SEE ALSO

[cf](/man/cf)(1), [terraform](/man/terraform)(1), [kubectl](/man/kubectl)(1)
