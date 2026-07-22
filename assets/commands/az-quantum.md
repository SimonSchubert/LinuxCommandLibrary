# TAGLINE

Manage Azure Quantum workspaces and jobs

# TLDR

**List available quantum providers** in a location

```az quantum offerings list --location [eastus]```

**Create a quantum workspace**

```az quantum workspace create --name [MyWorkspace] --resource-group [MyResourceGroup] --location [eastus] --storage-account [MyStorageAccount]```

**List quantum workspaces**

```az quantum workspace list --resource-group [MyResourceGroup]```

**Set default workspace** for later commands

```az quantum workspace set --resource-group [MyResourceGroup] --workspace-name [MyWorkspace] --location [eastus]```

**Submit a quantum job**

```az quantum job submit --resource-group [MyResourceGroup] --workspace-name [MyWorkspace] --target-id [ionq.simulator] --job-name [MyJob] --job-input-file [circuit.json] --job-input-format [ionq.circuit.v1]```

**Submit a job and wait** for the result

```az quantum run --resource-group [MyResourceGroup] --workspace-name [MyWorkspace] --target-id [ionq.simulator] --job-input-file [circuit.json] --job-input-format [ionq.circuit.v1]```

**List quantum jobs**

```az quantum job list```

**Show job status**

```az quantum job show --job-id [job_id]```

# SYNOPSIS

**az** **quantum** _subcommand_ [_options_]

# SUBCOMMANDS

**workspace create**
> Create a new Azure Quantum workspace.

**workspace list**
> List the Azure Quantum workspaces available.

**workspace set**
> Select a default workspace for future commands.

**workspace show**
> Show details of the given (or current) workspace.

**workspace delete**
> Delete a quantum workspace.

**workspace quotas**
> List quotas for the workspace.

**workspace keys**
> List or regenerate workspace API keys.

**offerings list**
> List all provider offerings available in a location.

**offerings accept-terms**
> Accept the terms for a provider and SKU before using it.

**job submit**
> Submit a program or circuit to run on Azure Quantum.

**job list**
> List jobs in a workspace.

**job show**
> Get a job's status and details.

**job output**
> Get the results of a completed job.

**job wait**
> Wait until a job finishes running.

**run**, **execute**
> Submit a job and wait for the result (equivalent commands).

**target list**
> List providers and their targets in a workspace.

**target set**
> Select the default target for submitting jobs.

# PARAMETERS

**--resource-group**, **-g**
> Name of the resource group. Configure a default with **az configure --defaults group=NAME**.

**--workspace-name**, **-w**
> Name of the Quantum Workspace. Configure a default with **az quantum workspace set**.

**--target-id**, **-t**
> Execution engine (target) for the job, for example `ionq.simulator`. Configure a default with **az quantum target set**.

**--job-input-file**
> Path to the program or circuit file to submit.

**--job-input-format**
> Format of the input file, for example `ionq.circuit.v1` or `qir.v1`.

# DESCRIPTION

**az quantum** manages Azure Quantum resources, which provide access to quantum computing hardware and simulators from various providers. Azure Quantum supports multiple providers including IonQ, Quantinuum, Rigetti, and Microsoft's simulators.

Workspaces are the top-level resource for managing quantum jobs, targets, and provider access. Set a default workspace and target to avoid repeating **--workspace-name** and **--target-id** on every command.

# CAVEATS

This command group is in **preview**. Part of the **quantum** extension (Azure CLI 2.73.0 or higher); it installs automatically the first time an **az quantum** command runs, or install it manually with **az extension add --name quantum**. Quantum services have regional availability constraints, and job costs vary significantly by provider and target.

# INSTALL

```dnf: sudo dnf install azure-cli```

```pacman: sudo pacman -S azure-cli```

```zypper: sudo zypper install azure-cli```

```brew: brew install azure-cli```

```nix: nix profile install nixpkgs#azure-cli```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[azure-cli](/man/azure-cli)(1), [az](/man/az)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-cli)```

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/quantum)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

<!-- verified: 2026-06-19 -->
