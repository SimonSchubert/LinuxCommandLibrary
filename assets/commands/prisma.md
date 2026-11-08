# TAGLINE

Node.js ORM with type-safe database access

# TLDR

**Initialize Prisma**

```npx prisma init```

**Generate client**

```npx prisma generate```

**Run migrations**

```npx prisma migrate dev```

**Push schema to database**

```npx prisma db push```

**Open Prisma Studio**

```npx prisma studio```

# SYNOPSIS

**prisma** _command_ [_options_]

# PARAMETERS

**init**
> Initialize Prisma in project.

**generate**
> Generate Prisma Client.

**migrate dev**
> Create and apply migrations.

**migrate deploy**
> Apply pending migrations.

**db push**
> Push schema without migration.

**db pull**
> Introspect database.

**db seed**
> Run the configured seed script.

**db execute**
> Run a SQL script against the database.

**migrate status**
> Show the state of migrations.

**migrate resolve**
> Resolve migration history issues.

**migrate diff**
> Compare database schema sources.

**validate**
> Validate the schema file.

**dev**
> Run a local Prisma Postgres instance.

**studio**
> Open visual editor.

**format**
> Format schema file.

# DESCRIPTION

**Prisma** is a next-generation ORM for Node.js and TypeScript. It provides type-safe database access, automated migrations, and a visual database browser.

# EXAMPLES

```bash
# Initialize new project
npx prisma init

# After schema changes
npx prisma generate

# Development migration
npx prisma migrate dev --name add_users

# Production deployment
npx prisma migrate deploy

# Reset database
npx prisma migrate reset

# Introspect existing DB
npx prisma db pull
```

# SCHEMA EXAMPLE

```prisma
model User {
  id    Int     @id @default(autoincrement())
  email String  @unique
  name  String?
  posts Post[]
}
```

# CAVEATS

Requires Node.js. Schema in schema.prisma, connection settings in prisma.config.ts. Since Prisma ORM 7, **db push** no longer runs **generate** and **migrate reset** no longer runs seed scripts, so run those explicitly.

# HISTORY

Prisma was founded by **Johannes Schickling** and **Søren Bramer Schmidt** in 2016, evolving from Graphcool.

# SEE ALSO

[sequelize](/man/sequelize)(1), [typeorm](/man/typeorm)(1), [knex](/man/knex)(1)

# RESOURCES

```[Source code](https://github.com/prisma/orm)```

```[Homepage](https://www.prisma.io/)```

```[Documentation](https://www.prisma.io/docs/cli)```

<!-- verified: 2026-11-08 -->
