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

**supabase** CLI manages Supabase projects. It provides local development and deployment tools.

Local development runs full stack. PostgreSQL, Auth, Storage, and Edge Functions.

Migrations version database schema. Track changes in git.

Type generation creates TypeScript types. Database schema to code types.

Linking connects to hosted project. Deploy local changes to production.

# CAVEATS

Docker required for local dev. Project must exist on Supabase. Free tier limits apply.

# HISTORY

**Supabase** is an open-source Firebase alternative launched in **2020**. The CLI enables local development and self-hosting.

# SEE ALSO

[docker](/man/docker)(1), [psql](/man/psql)(1), [firebase](/man/firebase)(1)
