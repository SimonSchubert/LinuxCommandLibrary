# TAGLINE

manage Doppler projects and environments

# TLDR

**List projects** (the bare command lists them; there is no `list` subcommand)

```doppler projects```

**Create a project** with a description

```doppler projects create [name] --description "[description]"```

**Get project info**

```doppler projects get [project_id]```

**Rename a project** or change its description

```doppler projects update [project_id] --name [new_name] --description "[description]"```

**Delete a project** without a confirmation prompt

```doppler projects delete [project_id] --yes```

**Page through** a long project list

```doppler projects --number [50] --page [2]```

# SYNOPSIS

**doppler projects** [_subcommand_] [_project_id_] [_flags_]

# SUBCOMMANDS

(none)
> Listing is the default action: running **doppler projects** with no subcommand prints the projects you can see.

**get** [_project_id_]
> Show the details of one project.

**create** [_name_]
> Create a project. **--name** and **--description** may be given as flags instead of positionally.

**update** [_project_id_]
> Change a project's **--name** or **--description**.

**delete** [_project_id_]
> Delete a project and everything in it.

# PARAMETERS

**-p**, **--project** _NAME_
> Project to act on, overriding the one configured for this directory.

**--name** _NAME_ / **--description** _TEXT_
> Metadata to set on **create** and **update**.

**-n**, **--number** _N_
> Maximum number of projects to display. Defaults to 100.

**--page** _N_
> Page of results to display. Defaults to 1.

**-y**, **--yes**
> Proceed without an interactive confirmation prompt.

**--json**
> Print the result as JSON.

# DESCRIPTION

**doppler projects** manages Doppler projects, the top-level container in the Doppler model. A project holds *environments* (development, staging, production), each of which holds one or more *configs*, and it is the configs that actually store secrets.

Projects normally map one-to-one onto an application or service. Because a project is the unit that access control and audit logging hang off, splitting services into separate projects is what lets you grant a team access to one service's secrets without exposing another's.

Most day-to-day work happens in `doppler secrets` and `doppler run`; the project subcommands are mainly used at setup time, when onboarding a new service, or from scripts that provision environments automatically.

# CAVEATS

**delete** removes the project along with every config and secret inside it, and the CLI will only prompt once. Passing **--yes** removes even that prompt, which makes it easy to destroy a production project from a script. Project names are used as identifiers throughout the CLI and API, so renaming one with **update --name** can break service tokens, CI configuration, and `doppler setup` state that referred to the old name.

# SEE ALSO

[doppler](/man/doppler)(1), [doppler-secrets](/man/doppler-secrets)(1)

# RESOURCES

```[Source code](https://github.com/DopplerHQ/cli)```

```[Homepage](https://www.doppler.com)```

```[Documentation](https://docs.doppler.com/docs/cli)```

<!-- verified: 2026-07-14 -->

