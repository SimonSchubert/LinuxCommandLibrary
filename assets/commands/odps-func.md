# TAGLINE

Manage MaxCompute user-defined functions from odpscmd

# TLDR

**List functions** in the current project

```list functions;```

**Describe a function**

```desc function [name];```

**Create a function** from an uploaded resource

```create function [name] as '[package.ClassName]' using '[resource.jar]';```

**Drop a function**

```drop function [name];```

**Show built-in functions**

```show builtin functions;```

# SYNOPSIS

Executed inside the **odpscmd** client as SQL-like statements:

**list** **functions** [**-p** _project_]**;**
**desc** **function** _name_**;**
**create** **function** _name_ **as** '_class_' **using** '_resources_'**;**
**drop** **function** _name_**;**

# PARAMETERS

**list functions**
> List user-defined functions (alias: **show functions**).

**desc function** _name_
> Show a function's owner, creation time, class, and resources.

**create function** _name_ **as** '_class_' **using** '_resources_'
> Register a new UDF. _class_ is the fully-qualified Java class or Python module; _resources_ is a comma-separated list of already-uploaded resources.

**drop function** _name_
> Remove a UDF (requires delete permission).

**show builtin functions** [_name_]
> List or describe MaxCompute built-in functions (client v0.43.0+).

**-p** _project_
> Operate on a specific project (list functions only).

# DESCRIPTION

MaxCompute UDFs are managed through SQL-style statements issued from the **odpscmd** command-line client. The resource (jar, py file, archive) must be uploaded first with `add jar` / `add py` / `add archive` before a function can reference it.

Function names are unique per project. Users need write permission on the project to create functions and delete permission to drop them.

# CAVEATS

Requires a configured odpscmd client with project access. UDFs registered via odpscmd or MaxCompute Studio are not automatically surfaced in DataWorks. For Python UDFs, ensure the Python runtime is supported by the project.

# HISTORY

Part of the **Alibaba Cloud MaxCompute** (ODPS) CLI toolchain. UDF support has been a core MaxCompute feature since its first public release.

# SEE ALSO

[odps](/man/odps)(1), [odps-resource](/man/odps-resource)(1)
