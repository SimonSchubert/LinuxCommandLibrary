# TAGLINE

 hierarchical AWS CLI with templates and local infrastructure graph

# TLDR

**List** EC2 instances

```awless list instances```

**SSH** to an instance (smart SSH)

```awless ssh [instance-id-or-name]```

**Run** a create template

```awless run [template.awless]```

**Sync** local graph of the account

```awless sync```

# SYNOPSIS

**awless** *command* [*args*]

# DESCRIPTION

**awless** is an alternative AWS CLI focusing on a small hierarchical command set, infrastructure templating, local graph sync for offline exploration, and “smart SSH” into instances. It logs cloud-modifying actions for review/revert workflows. Install from GitHub releases or package managers.

# PARAMETERS

**list** *resources*

> List AWS resources of a type.

**create** / **delete** / **update**

> Mutating operations (confirm carefully).

**run** *template*

> Execute an awless template.

**ssh** *target*

> Connect using discovered connection details.

**sync**

> Refresh the local infrastructure graph.

Auth uses standard AWS credentials/regions.

# CAVEATS

Project activity may lag official **aws** CLI features—verify against current AWS APIs. Templates that create resources incur cost. Prefer least-privilege IAM credentials.

# SEE ALSO

[aws](/man/aws)(1), [saws](/man/saws)(1)

# RESOURCES

```[Source code](https://github.com/wallix/awless)```

<!-- verified: 2026-07-19 -->
