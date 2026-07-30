# TAGLINE

Read-only AWS cost waste and hygiene scanner

# TLDR

**Install** and launch the interactive wizard

```npm install -g @cloudrift/cli && cloudrift```

**Analyze** waste in one or more regions

```cloudrift analyze -r us-east-1 eu-west-1```

**Export** a PDF report

```cloudrift analyze -r us-east-1 --pdf```

**Scan** dead/unused resources (often $0 cost hygiene)

```cloudrift dead-resources -r us-east-1```

**Scan** security misconfigurations

```cloudrift resource-security -r us-east-1```

**Compare** monthly spend or chart trends (Cost Explorer — billed)

```cloudrift cost```

```cloudrift trend --months 12```

# SYNOPSIS

**cloudrift** [_command_] [_options_]

# DESCRIPTION

**cloudrift** is an open-source, read-only AWS cost optimization CLI. It discovers idle, orphaned, and overprovisioned resources, estimates monthly waste, and never deletes, modifies, or stops anything — reports only. With no subcommand in an interactive terminal it starts a guided wizard.

Core domains:

- **analyze** — cost waste and optimization opportunities (EBS, EIPs, idle NAT, underutilized EC2/RDS, and many more scanners).
- **dead-resources** — abandoned assets that may cost $0 but clutter the account (unused key pairs, empty S3, inactive IAM, ...).
- **resource-security** — configuration risks (open security groups, public S3, missing MFA, unencrypted volumes, ...).
- **cost** / **trend** — Cost Explorer spend comparison and monthly charts (**$0.01 per CE request**; confirmation required unless **-y**).
- **history** — local SQLite snapshots under **~/.cloudrift/trends/**.
- **mcp** — stdio MCP server for agent integrations.

Requires Node.js 20+ and AWS credentials with the documented read-only IAM policy. Also installable via Homebrew (**elleVas/cloudrift/cloudrift**).

# COMMANDS

**analyze** [**-r** _region_...] [**--pdf**] [other flags]

> Run waste/optimization scanners. Default region often **us-east-1**.

**dead-resources** [**-r** _region_...] [**--scanners** _id_]

> Hygiene scan for dead or unused resources.

**resource-security** [**-r** _region_...] [**--scanners** _id_]

> Security posture checks.

**cost** / **trend**

> Bill comparison and multi-month trend (Cost Explorer charges apply).

**history** [**--domain** _name_] [**--limit** _n_]

> Read local prior scan snapshots.

**mcp**

> Run as a local Model Context Protocol server over stdio.

# CAVEATS

Findings are estimates — validate before acting. Rightsizing heuristics (e.g. CPU-only underutilization) are not a substitute for AWS Compute Optimizer. **cost**/**trend** are the only commands that intentionally incur AWS API charges. Exclusion tag **cloudrift:ignore** is a trust boundary, not a security control.

# SEE ALSO

[aws](/man/aws)(1), [aws-cli](/man/aws-cli)(1)

# RESOURCES

```[Source code](https://github.com/elleVas/cloudrift)```

```[Homepage](https://www.npmjs.com/package/@cloudrift/cli)```

```[Documentation](https://github.com/elleVas/cloudrift/tree/main/docs/en)```

<!-- verified: 2026-07-30 -->
