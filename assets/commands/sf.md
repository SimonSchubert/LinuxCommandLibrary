# TLDR

**Log in to a Salesforce org** via web browser

```sf org login web```

**Create a scratch org** from a definition file

```sf org create scratch --definition-file [config/project-scratch-def.json] --alias [my-scratch]```

**Deploy source** to an org

```sf project deploy start --target-org [my-org]```

**Retrieve metadata** from an org

```sf project retrieve start --target-org [my-org]```

**Run Apex tests**

```sf apex run test --target-org [my-org] --code-coverage```

**Execute a SOQL query**

```sf data query --query "[SELECT Id, Name FROM Account LIMIT 10]" --target-org [my-org]```

**Install a package** by version ID

```sf package install --package [04t...] --target-org [my-org]```

**List all available commands**

```sf commands```

# SYNOPSIS

**sf** _command_ [_subcommand_] [_flags_]

# COMMANDS

**org login web**
> Authenticate to an org using OAuth via web browser

**org login jwt**
> Authenticate using JWT-based flow

**org create scratch**
> Create a scratch org for development

**org create sandbox**
> Create a sandbox org

**org list**
> List all authenticated orgs

**org display**
> Display details about an org

**project deploy start**
> Deploy source to an org

**project retrieve start**
> Retrieve metadata from an org

**project convert mdapi**
> Convert metadata API format to source format

**apex run**
> Execute anonymous Apex code

**apex run test**
> Run Apex tests

**data query**
> Execute a SOQL query

**data create record**
> Create a record in an org

**package create**
> Create a package

**package install**
> Install a package in an org

**config set**
> Set CLI configuration values

**alias set**
> Create aliases for orgs

# PARAMETERS

**--target-org**, **-o** _alias_
> Specify the target org by username or alias

**--json**
> Output results in JSON format

**--help**
> Display help for a command

**--version**
> Display CLI version

# DESCRIPTION

**sf** (Salesforce CLI) is the official command-line interface for Salesforce development. It manages Salesforce DX projects, creates and manages scratch orgs and sandboxes, deploys and retrieves source code, runs tests, and handles package development.

The CLI uses a hierarchical command structure where commands are grouped by topic (org, project, data, apex, package). Most commands accept a **--target-org** flag to specify which org to operate on, and **--json** for machine-readable output.

Configuration is stored in **~/.sf/** and project-specific settings in **sfdx-project.json**. Orgs can be aliased for convenience using **sf alias set**.

# CAVEATS

The older **sfdx** command is deprecated; migrate to **sf** commands. Some operations require specific org permissions or Salesforce editions. Scratch orgs have time limits (default 7 days) and namespace considerations for packaging.

# HISTORY

Salesforce CLI was introduced as **sfdx** (Salesforce DX CLI) in **2017** alongside the Salesforce DX development model. The **sf** command was introduced in **2022** as a unified, redesigned CLI with improved command structure. The sfdx-style commands were deprecated in **2024** with full transition to sf.

# SEE ALSO

[npm](/man/npm)(1), [git](/man/git)(1), [jq](/man/jq)(1)
