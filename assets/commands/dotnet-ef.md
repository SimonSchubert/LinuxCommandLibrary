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

**Generate SQL script**

```dotnet ef migrations script -o [script.sql]```

**Rollback to migration**

```dotnet ef database update [MigrationName]```

**Scaffold DbContext** from database

```dotnet ef dbcontext scaffold "[connection_string]" [Microsoft.EntityFrameworkCore.SqlServer]```

# SYNOPSIS

**dotnet ef** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: migrations, database, dbcontext.

**migrations add** _NAME_
> Create new migration.

**migrations list**
> List available migrations.

**migrations remove**
> Remove last migration.

**database update** [_MIGRATION_]
> Apply migrations to database.

**dbcontext scaffold** _CONN_ _PROVIDER_
> Generate code from database.

**--context** _NAME_
> DbContext class to use.

**--project** _PATH_
> Project containing DbContext.

**--help**
> Display help information.

# DESCRIPTION

**dotnet ef** is the Entity Framework Core CLI tools for database migrations and scaffolding. It enables code-first database development and reverse engineering from existing databases.

The migrations system tracks schema changes in code, generating incremental updates that can be applied to databases. Each migration is a class describing schema modifications.

dbcontext scaffold reverse-engineers a DbContext and entity classes from an existing database, useful for database-first development or migrating legacy databases.

# CAVEATS

Requires Microsoft.EntityFrameworkCore.Tools package. EF Core version must match tooling. Large databases may scaffold slowly. Some database features may not scaffold perfectly.

# HISTORY

dotnet ef is part of **Entity Framework Core**, Microsoft's modern ORM for .NET. EF Core was released with .NET Core in **2016** as a cross-platform rewrite of Entity Framework.

# SEE ALSO

[dotnet](/man/dotnet)(1), [dotnet-build](/man/dotnet-build)(1)
