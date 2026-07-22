# TAGLINE

Entity Framework Core database migration tools

# TLDR

**Add migration**

```dotnet ef migrations add [MigrationName]```

**Update database**

```dotnet ef database update```

**List migrations**

```dotnet ef migrations list```

**Remove last migration**

```dotnet ef migrations remove```

**Generate an idempotent SQL script** for a DBA to run

```dotnet ef migrations script --idempotent -o [script.sql]```

**Roll back to an earlier migration** (0 reverts everything)

```dotnet ef database update [MigrationName]```

**Scaffold a DbContext** from an existing database

```dotnet ef dbcontext scaffold "[connection_string]" [Microsoft.EntityFrameworkCore.SqlServer] -o [Models]```

**Check for model changes** not yet captured in a migration

```dotnet ef migrations has-pending-model-changes```

**Bundle migrations** into a standalone executable for deployment

```dotnet ef migrations bundle --self-contained -r [linux-x64]```

# SYNOPSIS

**dotnet ef** _area_ _command_ [_arguments_] [_options_]

Install it first, as a global tool, and add the design package to the project:

```dotnet tool install --global dotnet-ef```

```dotnet add package Microsoft.EntityFrameworkCore.Design```

# COMMANDS

**migrations add** _NAME_
> Add a new migration. **-o** sets the output directory (defaults to `Migrations`).

**migrations list**
> List available migrations. **--no-connect** avoids touching the database.

**migrations remove**
> Remove the last migration. **-f**, **--force** also reverts it in the database.

**migrations script** [_FROM_] [_TO_]
> Generate SQL from migrations. **-i**, **--idempotent** produces a script safe to run against a database at any migration; **--no-transactions** omits transaction statements.

**migrations bundle**
> Build a self-contained executable that applies the migrations, for use in a deployment pipeline.

**migrations has-pending-model-changes**
> Exit non-zero if the model has changed since the last migration. Added in EF Core 8.

**database update** [_MIGRATION_]
> Apply migrations up to _MIGRATION_, or to the latest if omitted. The special value **0** reverts every migration.

**database drop**
> Delete the database. **-f** skips the prompt, **--dry-run** only reports what would go.

**dbcontext scaffold** _CONNECTION_ _PROVIDER_
> Reverse-engineer a DbContext and entity types from an existing database.

**dbcontext list** / **dbcontext info**
> List the DbContext types in the project, or describe one.

**dbcontext optimize**
> Generate a compiled model, and optionally precompiled queries, to cut startup time.

**dbcontext script**
> Generate a SQL script from the model, bypassing migrations entirely.

# PARAMETERS

**-c**, **--context** _DBCONTEXT_
> Which DbContext to use. Required when the project has more than one.

**-p**, **--project** _PATH_
> The *target* project, where files are written. Defaults to the current directory.

**-s**, **--startup-project** _PATH_
> The *startup* project, which the tools build and run to read configuration and connection strings. Defaults to the current directory.

**--connection** _STRING_
> Override the connection string from `AddDbContext` or `OnConfiguring`.

**--framework** _TFM_ / **--configuration** _CONFIG_ / **--runtime** _RID_
> Select the target framework, build configuration, and runtime when the project offers a choice.

**--no-build**
> Do not build the project first. Only safe when the build is already up to date.

**-d**, **--data-annotations**
> Configure the scaffolded model with attributes where possible instead of the fluent API.

**-t**, **--table** _NAME_ / **--schema** _NAME_
> Restrict scaffolding to specific tables or schemas. Repeat the option for each one.

**--use-database-names**
> Keep table and column names exactly as they are, rather than reshaping them to C# conventions.

**--json** / **-v**, **--verbose**
> Emit JSON output, or verbose diagnostics.

# DESCRIPTION

**dotnet ef** is the design-time tooling for Entity Framework Core. It is not part of the SDK: it installs separately as a .NET tool, and the project it operates on must reference `Microsoft.EntityFrameworkCore.Design`.

Its central job is **migrations**. When the C# model changes, `migrations add` diffs the model against a snapshot of the previous one and writes a migration class describing the difference as `Up` and `Down` operations. `database update` then applies pending migrations, recording each in an `__EFMigrationsHistory` table so the same command is safe to re-run.

The tools work against two projects, which trips people up. The **target project** is where files are written, and the **startup project** is the one the tools actually build and execute, because EF has to run your application's configuration code to discover the DbContext and its connection string. They are usually the same, but they diverge when the model lives in a class library referenced by a web or console app.

**dbcontext scaffold** goes the other direction, generating a DbContext and entity classes from a database that already exists. Every table needs a primary key for an entity type to be produced from it.

# CAVEATS

Migration scripts, not `database update`, are what belong in a production deployment. `--idempotent` scripts, or a `migrations bundle` executable, can be reviewed by a DBA and run without the SDK or your source code present on the server.

Scaffolding is a one-shot generator, not a sync: re-running it with **--force** overwrites the generated files and discards any edits you made, so treat the output as a starting point and keep customisations in partial classes or a separate configuration.

The tool version and the EF Core runtime version should match; a `dotnet-ef` older than the packages in the project will fail with confusing errors. `database drop` deletes the database outright. Finally, a migration's `Down` method is generated automatically and is often the weakest part of a migration: verify it before relying on a rollback, particularly for anything that drops a column.

# HISTORY

**Entity Framework Core** was released with .NET Core in **2016** as a ground-up rewrite of Entity Framework, cross-platform and considerably leaner. The CLI tooling has been reworked more than once: EF Core 1.x drove it through a `dotnet-ef` package referenced by each project, which proved awkward, and it was later reshaped into the global tool used today. `migrations bundle` and `has-pending-model-changes` are recent additions aimed squarely at CI/CD pipelines, where applying migrations from a developer's machine was never a good idea.

# INSTALL

```nix: nix profile install nixpkgs#dotnet-ef```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dotnet](/man/dotnet)(1), [dotnet-build](/man/dotnet-build)(1), [dotnet-publish](/man/dotnet-publish)(1), [sqlcmd](/man/sqlcmd)(1)

# RESOURCES

```[Source code](https://github.com/dotnet/efcore)```

```[Documentation](https://learn.microsoft.com/en-us/ef/core/cli/dotnet)```

<!-- verified: 2026-07-14 -->

