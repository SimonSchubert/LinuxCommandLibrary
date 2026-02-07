# TAGLINE

manage Doppler projects and environments

# TLDR

**List projects**

```doppler projects```

**Create a project**

```doppler projects create [name]```

**Get project info**

```doppler projects get [name]```

**Delete a project**

```doppler projects delete [name]```

**Update project description**

```doppler projects update [name] --description "[description]"```

# SYNOPSIS

**doppler** **projects** [_command_] [_options_]

# SUBCOMMANDS

**list**
> List all projects.

**create**
> Create a project.

**get**
> Get project details.

**update**
> Update project.

**delete**
> Delete a project.

# DESCRIPTION

**doppler projects** manages Doppler projects, which are top-level organizational units containing environments and their associated secrets and configurations.

Projects group related environments together (development, staging, production), allowing teams to organize secrets logically by application or service. Each project contains multiple configs representing different deployment environments.

Operations include creating new projects, listing existing ones, viewing details, updating metadata like descriptions, and deleting projects when no longer needed. Project management is typically done during initial setup or when restructuring secret organization.

# SEE ALSO

[doppler](/man/doppler)(1), [doppler-secrets](/man/doppler-secrets)(1)

