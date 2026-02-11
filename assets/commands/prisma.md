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

Requires Node.js. Schema in schema.prisma. Generate after schema changes.

# HISTORY

Prisma was founded by **Johannes Schickling** and **Søren Bramer Schmidt** in 2016, evolving from Graphcool.

# SEE ALSO

[sequelize](/man/sequelize)(1), [typeorm](/man/typeorm)(1), [knex](/man/knex)(1)
