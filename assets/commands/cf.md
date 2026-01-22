# TLDR

**Login to Cloud Foundry**

```cf login -a [api.example.com]```

**Push application**

```cf push [app-name]```

**List applications**

```cf apps```

**View application logs**

```cf logs [app-name]```

**Scale application**

```cf scale [app-name] -i [3]```

**Create service instance**

```cf create-service [service] [plan] [name]```

**Bind service to app**

```cf bind-service [app-name] [service-name]```

# SYNOPSIS

**cf** [_global_options_] _command_ [_arguments_] [_command_options_]

# DESCRIPTION

**cf** is the Cloud Foundry CLI for managing applications and services on Cloud Foundry platforms. Deploys, scales, and manages cloud-native applications across multiple cloud providers.

# COMMANDS

**login**
> Authenticate with Cloud Foundry

**push**
> Deploy application

**apps**
> List applications in space

**logs**
> View application logs

**scale**
> Scale application instances

**start**, **stop**, **restart**
> Manage application state

**delete**
> Delete application

**services**
> List service instances

**create-service**
> Create service instance

**bind-service**
> Bind service to application

**env**
> Show environment variables

**ssh**
> SSH into application container

**orgs**, **spaces**
> List organizations/spaces

# PARAMETERS

**-a** _URL_
> API endpoint URL

**-u** _user_
> Username

**-p** _pass_
> Password

**-o** _org_
> Organization

**-s** _space_
> Space

**-i** _num_
> Number of instances

**-m** _memory_
> Memory limit (e.g., 256M)

**-f** _manifest_
> Path to manifest file

**--skip-ssl-validation**
> Skip SSL certificate verification

# CAVEATS

Use cf v8 (current supported version). Run `cf help -a` for all commands. Interactive password prompts have issues in Cygwin/Git Bash.

# SEE ALSO

[kubectl](/man/kubectl)(1), [heroku](/man/heroku)(1), [docker](/man/docker)(1)
