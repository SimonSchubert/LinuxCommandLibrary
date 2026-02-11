# TAGLINE

Supabase local development and deployment CLI

# TLDR

**Initialize project**

```supabase init```

**Start local development**

```supabase start```

**Stop local services**

```supabase stop```

**Generate types**

```supabase gen types typescript --local```

**Create migration**

```supabase migration new [migration_name]```

**Apply migrations**

```supabase db push```

**Link to project**

```supabase link --project-ref [project-id]```

**View status**

```supabase status```

# SYNOPSIS

**supabase** _command_ [_options_]

# PARAMETERS

**init**
> Initialize project.

**start**
> Start local stack.

**stop**
> Stop local stack.

**link**
> Link to remote project.

**db push**
> Push migrations.

**gen types**
> Generate types.

**migration new** _NAME_
> Create migration.

**status**
> Show status.

**--project-ref** _ID_
> Project reference.

# DESCRIPTION

**supabase** is the command-line interface for managing Supabase projects, an open-source Firebase alternative built on PostgreSQL. It provides tools for local development, database migration management, type generation, and deployment to hosted Supabase projects.

The local development environment runs a complete Supabase stack using Docker, including PostgreSQL, authentication services, object storage, realtime subscriptions, and Edge Functions. This allows developing and testing against a production-equivalent environment without needing a remote project.

Database migrations track schema changes in version control. The CLI can generate TypeScript types from the database schema for type-safe client code. Linking connects the local project to a hosted Supabase instance for deploying migrations and Edge Functions to production.

# CAVEATS

Docker required for local dev. Project must exist on Supabase. Free tier limits apply.

# HISTORY

**Supabase** is an open-source Firebase alternative launched in **2020**. The CLI enables local development and self-hosting.

# SEE ALSO

[docker](/man/docker)(1), [psql](/man/psql)(1), [firebase](/man/firebase)(1)
