# TAGLINE

Cloud Foundry CLI for application deployment

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

**cf** is the Cloud Foundry CLI for managing applications and services on Cloud Foundry platforms. It handles the full application lifecycle including deployment, scaling, logging, and service binding across multiple cloud providers.

Cloud Foundry uses a push-based deployment model where developers run `cf push` to upload application code, which is then built, containerized, and deployed automatically. Applications are organized into organizations and spaces, providing multi-tenant isolation. The CLI manages the interaction between developers and the Cloud Foundry API.

Services such as databases, message queues, and caches are provisioned from a marketplace and bound to applications, with connection credentials injected via environment variables.

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

# CONFIGURATION

**~/.cf/config.json**
> CLI configuration including API endpoint, access tokens, and current org/space target.

**manifest.yml**
> Application deployment manifest defining memory, instances, routes, and service bindings.

# CAVEATS

Use cf v8 (current supported version). Run `cf help -a` for all commands. Interactive password prompts have issues in Cygwin/Git Bash.

# SEE ALSO

[kubectl](/man/kubectl)(1), [heroku](/man/heroku)(1), [docker](/man/docker)(1)
