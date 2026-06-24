# TAGLINE

Type-safe SQL code generator for Bun

# TLDR

**Add** bun-sqlgen to a project

```bun add @ilbertt/bun-sqlgen```

**Generate** type definitions for tagged SQL queries found in a set of files

```bun bun-sqlgen generate '[src/**/*.ts]' --migrations [db/migrations]```

**Point** at the database used to validate queries via an environment variable

```DATABASE_URL=[postgres://localhost/app] bun bun-sqlgen generate '[src/**/*.ts]' --migrations [db/migrations]```

# SYNOPSIS

**bun bun-sqlgen generate** _GLOB_ **--migrations** _DIR_

# DESCRIPTION

**bun-sqlgen** is a code generation tool for **Bun**'s native SQL client (**Bun.sql**, the **bun:sql** module). It lets you write raw SQL with full type safety and without an ORM.

The **generate** subcommand scans the TypeScript source files matching the supplied glob pattern, extracts the tagged SQL template literals it finds, and validates each query against a real **PostgreSQL** or **SQLite** database whose schema is defined by your migration files. It then writes a **src/queries.gen.d.ts** file containing precise parameter and result types for every query, so that mistakes in column names, types, or query shape become compile-time errors.

Because checking happens against a live database rather than a parsed model, the generated types stay accurate to the actual schema. No Docker or separate type-definition language is required.

# PARAMETERS

**generate** _GLOB_

> Process the source files matching the quoted glob pattern (for example **'src/\*\*/\*.ts'**), emitting type definitions for the SQL queries they contain. Quote the glob so the shell does not expand it.

**--migrations** _DIR_

> Directory holding the SQL migration files that act as the schema source of truth. The migrations are applied to derive the schema the queries are checked against.

# CONFIGURATION

**DATABASE_URL**

> Connection string for the PostgreSQL or SQLite database used to validate queries during generation. Code generation runs against this real database instance.

# CAVEATS

Requires the **Bun** runtime and a reachable PostgreSQL or SQLite database at generation time; it is not a standalone binary. It targets only **Bun.sql**, so it is not useful with other database clients or runtimes.

# HISTORY

Created by **ilbertt** and first released in **2026** as part of the growing Bun ecosystem, offering a no-ORM alternative to schema-aware query builders. It is distributed on npm as **@ilbertt/bun-sqlgen** under the Unlicense.

# SEE ALSO

[bun](/man/bun)(1), [psql](/man/psql)(1), [sqlite3](/man/sqlite3)(1), [protoc](/man/protoc)(1)

# RESOURCES

```[Source code](https://github.com/ilbertt/bun-sqlgen)```

<!-- verified: 2026-06-24 -->
