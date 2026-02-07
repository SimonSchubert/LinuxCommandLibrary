# TAGLINE

Manage Azure Quantum workspaces and jobs

# TLDR

**List available quantum providers** in a location

```az quantum offerings list --location [eastus]```

**Create a quantum workspace**

```az quantum workspace create --name [MyWorkspace] --resource-group [MyResourceGroup] --location [eastus] --storage-account [MyStorageAccount]```

**List quantum workspaces**

```az quantum workspace list --resource-group [MyResourceGroup]```

**Set default workspace**

```az quantum workspace set --name [MyWorkspace] --resource-group [MyResourceGroup]```

**Submit a quantum job**

```az quantum job submit --target-id [ionq.simulator] --job-name [MyJob] --job-input-file [circuit.json]```

**List quantum jobs**

```az quantum job list```

**Show job status**

```az quantum job show --job-id [job-id]```

# SYNOPSIS

**az** **quantum** _subcommand_ [_options_]

# SUBCOMMANDS

**workspace create**
> Create a quantum workspace.

**workspace list**
> List quantum workspaces.

**workspace set**
> Set default quantum workspace.

**workspace show**
> Show workspace details.

**workspace delete**
> Delete a quantum workspace.

**offerings list**
> List available quantum providers.

**job submit**
> Submit a quantum job.

**job list**
> List quantum jobs.

**job show**
> Show job details.

**job output**
> Get job output.

**target list**
> List available quantum targets.

# DESCRIPTION

**az quantum** manages Azure Quantum resources, which provide access to quantum computing hardware and simulators from various providers. Azure Quantum supports multiple quantum hardware providers including IonQ, Quantinuum, and Microsoft's simulators.

Workspaces are the top-level resource for managing quantum jobs, targets, and provider access.

# CAVEATS

Requires the quantum CLI extension (**az extension add --name quantum**). Quantum computing services have specific regional availability. Job costs vary significantly by provider and target.

# SEE ALSO

[az](/man/az)(1), [az-cognitiveservices](/man/az-cognitiveservices)(1)
