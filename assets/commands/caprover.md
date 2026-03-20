# TAGLINE

Deploy and manage applications on CapRover

# TLDR

**Login to CapRover machine**

```caprover login```

**Deploy application**

```caprover deploy```

**Deploy with specific options**

```caprover deploy -n [machine-name] -a [app-name] -b [branch]```

**Deploy Docker image**

```caprover deploy -i [image-name]```

**Deploy from tar file**

```caprover deploy -t [app.tar]```

**Set up a new CapRover server**

```caprover serversetup```

**List logged-in machines**

```caprover list```

**Logout from machine**

```caprover logout```

# SYNOPSIS

**caprover** _command_ [_options_]

# DESCRIPTION

**caprover** is the CLI for CapRover, a modern automated app deployment and web server manager. Use it to perform initial server setup and deploy applications via captain-definition files, Dockerfiles, tar files, or Docker images.

# COMMANDS

**serversetup**, **setup**
> Perform initial server setup (domain, SSL, password)

**login**
> Authenticate with a CapRover machine

**logout**
> Remove authentication for a machine

**deploy**
> Deploy application to CapRover

**list**, **ls**
> List all logged-in machines

**api**
> Call generic API on CapRover machine

# PARAMETERS

**-n**, **--caproverName** _name_
> Target CapRover machine name

**-a**, **--caproverApp** _app_
> Application name to deploy

**-b**, **--branch** _branch_
> Git branch to deploy

**-t**, **--tarFile** _file_
> Path to tar file for deployment

**-i**, **--imageName** _image_
> Docker image to deploy

**-d**, **--default**
> Use previously entered values

**-c**, **--configFile** _file_
> Deployment configuration file path

**-u**, **--caproverUrl** _url_
> CapRover machine URL

**-p**, **--caproverPassword** _password_
> CapRover password

**--appToken** _token_
> App-level authentication token

**-V**, **--version**
> Output version number

**-h**, **--help**
> Display help information

# CI/CD INTEGRATION

For automation, provide options directly:

```caprover deploy -n machine -a app -b main```

Requires prior login to the machine.

# CAVEATS

Requires Node.js and npm. Uncommitted and git-ignored files are not included when deploying branches. Install via npm install -g caprover.

# SEE ALSO

[docker](/man/docker)(1), [kubectl](/man/kubectl)(1), [heroku](/man/heroku)(1)
