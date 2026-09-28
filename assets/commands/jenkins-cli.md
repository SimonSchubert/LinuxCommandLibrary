# TAGLINE

Command-line client for a Jenkins controller

# TLDR

**Download the client** from the controller you will talk to

```curl -fsSL -o jenkins-cli.jar [http://localhost:8080/jnlpJars/jenkins-cli.jar]```

**List commands** the controller accepts

```java -jar jenkins-cli.jar -s [http://localhost:8080/] help```

**Show who you are** using an API token file

```java -jar jenkins-cli.jar -s [http://localhost:8080/] -auth @[/home/user/.jenkins-cli] who-am-i```

**List jobs** with the URL and token taken from the environment

```JENKINS_URL=[http://localhost:8080/] JENKINS_USER_ID=[user] JENKINS_API_TOKEN=[token] java -jar jenkins-cli.jar list-jobs```

**Start a build**, wait for it, and print the log

```java -jar jenkins-cli.jar -s [http://localhost:8080/] -auth @[/home/user/.jenkins-cli] build [job-name] -s -v```

Pass **one parameter**

```java -jar jenkins-cli.jar -s [http://localhost:8080/] -auth @[/home/user/.jenkins-cli] build [job-name] -p [BRANCH]=[main]```

**Follow the console** of the latest build

```java -jar jenkins-cli.jar -s [http://localhost:8080/] -auth @[/home/user/.jenkins-cli] console [job-name] -f```

**Safe-restart** the controller after it finishes current builds

```java -jar jenkins-cli.jar -s [http://localhost:8080/] -auth @[/home/user/.jenkins-cli] safe-restart```

Talk to the same commands **over SSH** once an admin has opened the SSH port

```ssh -l [user] -p [53801] [jenkins.example] help```

Print the **client jar version** without contacting a server

```java -jar jenkins-cli.jar -version```

# SYNOPSIS

**java -jar jenkins-cli.jar** [**-s** _URL_] [_options_] _command_ [_arguments_]

# PARAMETERS

**-s** _URL_

> Jenkins controller URL. Falls back to **JENKINS_URL**, then the legacy **HUDSON_URL**. A missing trailing slash is added.

**-webSocket**

> Use the WebSocket transport. This is the default since Jenkins 2.391. Both client and controller need 2.217 or newer.

**-http**

> Use a pair of plain HTTP(S) connections instead of WebSocket. Some reverse proxies break this mode by buffering the body.

**-ssh**

> Use the controller SSH service instead of WebSocket. Requires **-user**. The SSH port must be open.

**-user** _USER_

> Jenkins user id for **-ssh**. That user must have a matching SSH public key registered. Ignored unless **-ssh** is set. Mutually exclusive with **-auth**.

**-i** _KEY_

> SSH private key file for **-ssh**. If omitted, the client tries the usual default key locations.

**-noKeyAuth**

> Do not load an SSH private key. Conflicts with **-i**. Meaningful only with **-ssh**.

**-strictHostKey**

> Require strict SSH host-key checking. Meaningful only with **-ssh**.

**-auth** _USER:SECRET_ | **@**_FILE_

> Username and password or API token for the HTTP and WebSocket transports. **@**_FILE_ reads `username:secret` from a file, which is the recommended form. Mutually exclusive with **-bearer**.

**-bearer** _TOKEN_ | **@**_FILE_

> Bearer token for the HTTP and WebSocket transports. **@**_FILE_ reads the token from a file. Mutually exclusive with **-auth**.

**-noCertificateCheck**

> Skip HTTPS certificate verification. Insecure.

**-logger** _LEVEL_

> Java log level for the client, for example **FINE**.

**-version**

> Print the client jar version and exit. Does not contact the controller.

With no command, the client runs **help**.

# COMMANDS

The command set depends on the controller and its plugins. **help** prints the live list. **help** _command_ prints one command. These ship with current Jenkins core:

**help** [_command_]

> List commands, or show one command's usage.

**who-am-i**

> Print the authenticated user and granted authorities.

**version**

> Print the controller's Jenkins version.

**list-jobs** [_view_]

> Print job names. An optional view or item-group name limits the list.

**build** _JOB_ [**-c**] [**-f**] [**-p** _KEY=VALUE_] [**-s**] [**-v**] [**-w**]

> Schedule a build. **-c** skips the build when SCM has no change. **-w** waits until it starts. **-s** waits until it finishes and passes interrupts through to the build (exit status follows the build). **-f** follows progress but does not pass interrupts through (interrupt exits 125). **-v** prints the console and is used with **-s**. **-p** may be repeated.

**console** _JOB_ [_BUILD_] [**-f**] [**-n** _N_]

> Print a build log. _BUILD_ is a number or permalink. The default is the last build. **-f** follows a build still in progress. **-n** prints the last _N_ lines.

**quiet-down** [**-block**] [**-timeout** _MS_] [**-reason** _TEXT_]

> Stop taking new builds. **-block** waits until running builds finish. **-timeout** caps that wait, in milliseconds.

**cancel-quiet-down**

> Leave quiet-down mode.

**safe-restart** [**-message** _TEXT_]

> Quiet down, then restart. Present since Jenkins 2.414. The message is shown to users.

**reload-configuration**

> Reload configuration from disk. Discards changes that were not saved.

**install-plugin** _SOURCE_ [**-deploy**] [**-restart**]

> Install a plugin. _SOURCE_ is an update-center short name (`git`, or `git:5.0` for a minimum version), a URL, or **=** to read a plugin file from standard input. **-deploy** loads it without waiting for a reboot. **-restart** restarts Jenkins after a successful install.

**list-plugins** [_name_]

> List installed plugins, or one plugin.

**create-job** _NAME_

> Create a job from config XML on standard input. _NAME_ may be a folder path such as `folder/job`.

**delete-job** _NAME_ ...

> Delete one or more jobs.

**groovy** **=** [_arguments_]

> Run a Groovy script read from standard input on the controller. Requires Overall/Administer. Only **=** is accepted as the script argument.

# DESCRIPTION

**jenkins-cli** is the client half of the Jenkins command-line interface. It is not a native binary. You download `jenkins-cli.jar` from a running controller at `/jnlpJars/jenkins-cli.jar` and run it with **java -jar**. The same commands are available over SSH when the controller's built-in SSH server is enabled.

The client sends the command name and arguments to the controller, which runs them. Plugins can add commands, so two controllers rarely have the same **help** output. A user needs the Overall/Read permission to use the CLI, plus whatever permission the specific command checks (Job/Build for **build**, Overall/Administer for **groovy**, **install-plugin**, and **safe-restart**).

WebSocket is the default transport. **-http** is the older full-duplex HTTP mode. **-ssh** makes the jar behave like an SSH client against the controller's own SSH port. You can skip the jar entirely and use OpenSSH: read the `X-SSH-Endpoint` response header (for example with **curl -sI** against `/login`) to learn the port, which is closed until an administrator turns the SSH server on.

# CONFIGURATION

**JENKINS_URL**

> Controller URL used when **-s** is omitted.

**HUDSON_URL**

> Legacy fallback used only when **JENKINS_URL** is unset.

**JENKINS_USER_ID** and **JENKINS_API_TOKEN**

> Used together when **-auth** and **-bearer** are omitted. Set both or neither. **-auth** overrides them. Generate the token under the user security page (`/me/security` or `/user/<id>/security`).

There is no fixed auth-file path. Pass whatever path you choose to **-auth @**_FILE_. The file contents are `username:api-token`.

# CAVEATS

Requires Java. Prefer a jar downloaded from the controller you are calling. A jar from another Jenkins line can fail in confusing ways.

Clients older than Jenkins 2.54 are treated as insecure. **-remoting** is rejected. Do not keep using a remoting-era jar.

**-noCertificateCheck** disables TLS verification. **-auth user:token** puts a secret in the process list. Prefer **-auth @file** or the environment variables.

**-http** fails behind reverse proxies that buffer request or response bodies. Stay on the WebSocket default unless you have a reason to switch.

**-ssh** connects to the host in the controller URL, which is wrong when Jenkins sits behind an HTTP reverse proxy. The controller then needs `-Dorg.jenkinsci.main.modules.sshd.SSHD.hostName` set to the real SSH host. A host-key change shows up as "Server key did not validate". Remove the stale line from `~/.ssh/known_hosts` only when you know the key change is legitimate.

**groovy** runs inside the controller JVM. **install-plugin -restart** and **safe-restart** take the controller down. Current core does not ship the old immediate **restart** or **shutdown** commands.

# HISTORY

The client dates from Hudson, written by **Kohsuke Kawaguchi**, and stayed with Jenkins after the **2011** fork. The Remoting transport was later removed as unsafe. WebSocket support arrived in Jenkins **2.217** and became the default in **2.391**. **safe-restart** has been a core command since **2.414**.

# INSTALL

```brew: brew install jenkins```

```nix: nix profile install nixpkgs#jenkins```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[jenkins](/man/jenkins)(1), [java](/man/java)(1), [ssh](/man/ssh)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/jenkinsci/jenkins)```

```[Homepage](https://www.jenkins.io/)```

```[Documentation](https://www.jenkins.io/doc/book/managing/cli/)```

<!-- verified: 2026-09-28 -->
