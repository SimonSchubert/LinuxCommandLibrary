# TAGLINE

display available database configuration options

# TLDR

**List engine options**

```doctl databases options engines```

**List available regions**

```doctl databases options regions```

**List available sizes**

```doctl databases options slugs```

**List available versions**

```doctl databases options versions [engine]```

# SYNOPSIS

**doctl** **databases** **options** _command_

# SUBCOMMANDS

**engines**
> List available database engines.

**regions**
> List available regions.

**slugs**
> List available sizes.

**versions**
> List available versions for engine.

# DESCRIPTION

**doctl databases options** displays available configuration options for DigitalOcean managed databases including supported engines, regions, and sizes. This command helps users determine valid values when creating or modifying database clusters.

The tool queries DigitalOcean's API to provide current information about supported database engines (PostgreSQL, MySQL, Redis, MongoDB), geographic regions where databases can be deployed, and available instance sizes (slugs) with their specifications. Version information helps users select appropriate engine versions for compatibility requirements.

This information is essential for planning database deployments and ensuring configurations align with DigitalOcean's current offerings. Options may vary by region and change as DigitalOcean updates their managed database service.

# SEE ALSO

[doctl-databases](/man/doctl-databases)(1), [doctl-databases-create](/man/doctl-databases-create)(1)
