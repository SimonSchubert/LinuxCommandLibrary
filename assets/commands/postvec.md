# TAGLINE

Install and diagnose the postvec PostgreSQL extension

# TLDR

Set up **embedded** inference in a database

```sudo postvec setup --database [app] --embedded```

Point a database at a **remote** postvec server

```sudo postvec setup --database [app] --grpc [host:33333] --http [https://host:22222]```

**Preview** setup without changing the cluster

```postvec setup --database [app] --embedded --dry-run```

**Check** preload, heartbeat, and model versions

```postvec doctor --database [app]```

**List** and **pull** models

```postvec model ls --available```

```sudo postvec model pull [model]```

**Remove** the extension from a database

```sudo postvec uninstall --database [app]```

# SYNOPSIS

**postvec** _command_ [_options_]

# PARAMETERS

**setup**
> Create the database if needed, install the extension, write a conf.d snippet, restart when a setting changed, and check that the worker heartbeat advances. **--database** names the database. **--cluster** selects a PostgreSQL major and cluster name. **--embedded** runs the engine in the PostgreSQL process. **--path** is the install prefix for an embedded engine. **--grpc** and **--http** point at a remote postvec server. **--model** may be repeated to limit which models an embedded engine loads. **--dry-run** prints the plan.

**doctor**
> Read-only report of preload, mode, worker heartbeat, model inventory, and whether the library matches the catalog. **--deep** does a deeper check. **--format json** prints JSON. **--strict** treats warnings as failure.

**uninstall**
> Drop the extension from **--database** without CASCADE. **--drop-columns** removes the vector columns as well and requires **--acknowledge-data-loss** and **--yes**.

**model ls**
> List models. **--available** includes models that can be pulled.

**model pull** _name_
> Download a model. It is left disabled until **activate**.

**model activate** _name_
> Enable a model on disk and load it.

**model deactivate** _name_
> Stop serving a model.

**model upgrade --all**
> Upgrade installed models.

**model rm** _name_
> Delete a model from disk.

# DESCRIPTION

**postvec** configures the postvec PostgreSQL extension on a cluster that is already installed. The extension adds fused keyword and semantic search in SQL and can switch embedding models without re-embedding stored text. This command is the installer and diagnostic tool. The SQL functions (enable, search, migrate, and the rest) run inside PostgreSQL after setup.

The binary is **postvec**. It ships separately from the per-major PostgreSQL packages so one **postvec** on PATH can serve more than one major version. Embedded mode runs inference in the PostgreSQL process. Remote mode sends work to postvec-server.

Host configuration needs root. **setup** keeps root for the filesystem and drops to the cluster owner for database work.

# CAVEATS

Exit status 0 means the command finished and, for **doctor**, there was no failure (and no warning when **--strict** is set). Status 1 is an apply or check failure. Status 2 is a bad invocation. Status 3 means a target was left unchanged. Status 4 means changes were written but a requested restart was deferred.

**uninstall --drop-columns** deletes embedding data. A same-name package in a distro index may not be this project.

# SEE ALSO

[psql](/man/psql)(1), [postgres](/man/postgres)(1)

# RESOURCES

```[Source code](https://github.com/univec-ai/postvec)```

```[Homepage](https://postvec.dev)```

```[Documentation](https://postvec.dev/docs/reference/cli)```

<!-- verified: 2026-11-26 -->
